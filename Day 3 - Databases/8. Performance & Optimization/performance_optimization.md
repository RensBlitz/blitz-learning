# Database Performance & Optimization: A Practical Guide

Think of database optimization like tuning a car - small adjustments can lead to big improvements in performance. This guide will help you understand how to make your database run faster and more efficiently.

## 1. Understanding Database Performance

### Key Performance Metrics
- **Response Time**: How long queries take to complete
- **Throughput**: How many queries can be processed per second
- **Resource Usage**: CPU, memory, disk I/O, and network usage

### Common Performance Problems
1. **Slow Queries**: Queries taking too long to execute
2. **High Resource Usage**: Database using too much CPU or memory
3. **Connection Problems**: Too many connections or connection timeouts
4. **Disk I/O Issues**: Slow read/write operations

## 2. Indexing: Your First Performance Tool

### What is an Index?
Think of an index like a book's table of contents:
- Helps find data quickly without checking every page
- Makes searches faster
- But takes extra storage space

### Basic Index Examples
```sql
-- Simple index
CREATE INDEX idx_users_email ON users(email);

-- Compound index (multiple columns)
CREATE INDEX idx_orders_user_date ON orders(user_id, order_date);

-- Unique index
CREATE UNIQUE INDEX idx_users_username ON users(username);
```

### When to Use Indexes
✅ Do Create Indexes:
- On columns used in WHERE clauses
- On columns used for joining tables
- On columns used for sorting (ORDER BY)

❌ Don't Create Indexes:
- On small tables
- On columns that change frequently
- On columns with low selectivity (like boolean fields)

## 3. Query Optimization

### Basic Query Optimization

#### ❌ Bad Query
```sql
-- Bad: Selecting all columns when you don't need them
SELECT * FROM users 
WHERE last_login > '2023-01-01';

-- Bad: Using functions on indexed columns
SELECT * FROM users 
WHERE LOWER(email) = 'john@example.com';
```

#### ✅ Good Query
```sql
-- Good: Select only needed columns
SELECT id, email, last_login 
FROM users 
WHERE last_login > '2023-01-01';

-- Good: Keep indexed columns unchanged
SELECT * FROM users 
WHERE email = 'john@example.com';
```

### JOIN Optimization

#### ❌ Bad JOIN
```sql
-- Bad: Cartesian product (missing JOIN condition)
SELECT * FROM orders, users;

-- Bad: Not using indexes in JOIN
SELECT * FROM orders o, users u 
WHERE o.user_id = u.id;
```

#### ✅ Good JOIN
```sql
-- Good: Proper JOIN syntax with indexes
SELECT o.id, o.order_date, u.email
FROM orders o
INNER JOIN users u ON o.user_id = u.id
WHERE o.order_date > '2023-01-01';
```

## 4. Database Configuration Optimization

### Memory Settings
```yaml
# PostgreSQL example (postgresql.conf)
shared_buffers = 2GB        # 25% of RAM for dedicated DB server
work_mem = 50MB            # For complex sorts
maintenance_work_mem = 256MB # For maintenance operations
```

### Connection Settings
```yaml
max_connections = 100
effective_cache_size = 6GB  # 50-75% of RAM
```

## 5. Table Optimization

### Table Design
```sql
-- Good: Proper data types
CREATE TABLE users (
    id SERIAL PRIMARY KEY,
    email VARCHAR(255),
    age SMALLINT,  -- Not INTEGER for age
    is_active BOOLEAN
);

-- Bad: Inefficient data types
CREATE TABLE users (
    id BIGINT,  -- SERIAL would be better
    email TEXT, -- VARCHAR more efficient for limited strings
    age INTEGER, -- SMALLINT sufficient for age
    is_active INTEGER -- BOOLEAN more appropriate
);
```

### Partitioning Large Tables
```sql
-- Example of table partitioning by date
CREATE TABLE orders (
    id SERIAL,
    order_date DATE,
    amount DECIMAL(10,2)
) PARTITION BY RANGE (order_date);

-- Create partitions
CREATE TABLE orders_2023 PARTITION OF orders
    FOR VALUES FROM ('2023-01-01') TO ('2024-01-01');

CREATE TABLE orders_2024 PARTITION OF orders
    FOR VALUES FROM ('2024-01-01') TO ('2025-01-01');
```

## 6. Monitoring and Analysis Tools

### EXPLAIN ANALYZE
Use this to understand how your queries are executed:

```sql
-- See how a query is executed
EXPLAIN ANALYZE
SELECT * FROM orders 
WHERE order_date > '2023-01-01';

-- Look for:
-- 1. Seq Scan (might need an index)
-- 2. High cost operations
-- 3. Number of rows processed
```

### Common Query Problems and Solutions

1. **Full Table Scans**
```sql
-- Problem: Full table scan
SELECT * FROM orders WHERE status = 'PENDING';

-- Solution: Add index
CREATE INDEX idx_orders_status ON orders(status);
```

2. **Inefficient JOINs**
```sql
-- Problem: Missing indexes on JOIN columns
SELECT * FROM orders o 
JOIN users u ON o.user_id = u.id;

-- Solution: Ensure indexes on JOIN columns
CREATE INDEX idx_orders_user_id ON orders(user_id);
```

## 7. Performance Checklist

### Daily Monitoring
✅ Check for:
- Slow running queries (over 1 second)
- High CPU usage
- Increasing disk I/O
- Growing table sizes

### Weekly Optimization
✅ Review:
- Table statistics
- Index usage
- Cache hit ratios
- Connection counts

### Monthly Maintenance
✅ Perform:
- Index maintenance (rebuild/reorganize)
- Statistics updates
- Query plan analysis
- Storage optimization

## 8. Quick Performance Tips

1. **Use LIMIT for Large Results**
```sql
-- Good: Limiting large result sets
SELECT * FROM logs 
ORDER BY created_at DESC 
LIMIT 1000;
```

2. **Avoid SELECT ***
```sql
-- Good: Select specific columns
SELECT id, email, created_at 
FROM users;
```

3. **Use Appropriate WHERE Clauses**
```sql
-- Good: Selective WHERE clause
SELECT * FROM orders 
WHERE order_date >= CURRENT_DATE - INTERVAL '30 days';
```

## Remember!
- Start with simple optimizations first
- Measure before and after changes
- Don't optimize prematurely
- Keep statistics up to date
- Regular maintenance is key
- Document all optimization changes 