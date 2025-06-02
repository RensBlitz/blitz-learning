# NoSQL Databases

Welcome to NoSQL Databases! This guide will help you understand the world of non-relational databases, their different types, and when to use them. We'll focus on practical examples and real-world use cases.

## 1. Foundational Concepts

### What is NoSQL?
NoSQL ("Not Only SQL") databases are designed to handle diverse data types and structures that don't fit well in traditional relational tables. Think of them as flexible containers that can store data in various formats, from simple key-value pairs to complex documents.

### Key Characteristics
- **Schema-less**: No fixed structure required
- **Horizontal Scalability**: Easy to distribute across servers
- **Eventual Consistency**: Data will be consistent, but maybe not immediately
- **BASE Properties** (instead of ACID):
  - **B**asically **A**vailable
  - **S**oft state
  - **E**ventual consistency

## 2. Types of NoSQL Databases

### 1. Document Stores (e.g., MongoDB)
Perfect for: Complex data structures, nested information

```javascript
// Example MongoDB document
{
  "_id": "123",
  "username": "john_doe",
  "profile": {
    "name": "John Doe",
    "age": 30,
    "interests": ["coding", "reading"]
  },
  "orders": [
    {
      "orderId": "ord_1",
      "items": ["book", "laptop"],
      "total": 1299.99
    }
  ]
}

// Basic operations
db.users.insertOne({...})  // Create
db.users.findOne({username: "john_doe"})  // Read
db.users.updateOne({username: "john_doe"}, {$set: {...}})  // Update
db.users.deleteOne({username: "john_doe"})  // Delete
```

### 2. Key-Value Stores (e.g., Redis)
Perfect for: Caching, session management, real-time data

```bash
# Redis examples
SET user:123 "John Doe"  # Store value
GET user:123            # Retrieve value
EXPIRE user:123 3600    # Set expiration (1 hour)
DEL user:123           # Delete value

# Common patterns
SET session:token123 "{userData}"
SETEX cache:homepage 300 "{content}"  # Set with expiration
```

### 3. Column-Family Stores (e.g., Cassandra)
Perfect for: Time-series data, large-scale data with known query patterns

```sql
-- Cassandra CQL example
CREATE TABLE user_activity (
  user_id uuid,
  timestamp timestamp,
  action text,
  details map<text, text>,
  PRIMARY KEY (user_id, timestamp)
) WITH CLUSTERING ORDER BY (timestamp DESC);

-- Basic operations
INSERT INTO user_activity (user_id, timestamp, action)
VALUES (123, '2024-03-20 10:00:00', 'login');

SELECT * FROM user_activity 
WHERE user_id = 123 
AND timestamp > '2024-03-20';
```

### 4. Graph Databases (e.g., Neo4j)
Perfect for: Connected data, social networks, recommendation engines

```cypher
// Neo4j example
// Create nodes and relationships
CREATE (john:Person {name: 'John'})
CREATE (mary:Person {name: 'Mary'})
CREATE (john)-[:FOLLOWS]->(mary)

// Query relationships
MATCH (p1:Person)-[:FOLLOWS]->(p2:Person)
WHERE p1.name = 'John'
RETURN p2.name
```

## 3. Implementation Patterns

### Document Store Patterns (MongoDB)

#### 1. Embedding vs. Referencing
```javascript
// Embedding (for frequently accessed related data)
{
  "order_id": "ord_123",
  "customer": {
    "name": "John Doe",
    "email": "john@example.com"
  },
  "items": [...]
}

// Referencing (for large, rarely accessed data)
{
  "order_id": "ord_123",
  "customer_id": "cust_456",
  "items": ["item_1", "item_2"]
}
```

#### 2. Indexing Strategies
```javascript
// Create indexes for frequent queries
db.users.createIndex({ "email": 1 });
db.orders.createIndex({ "customer_id": 1, "date": -1 });
```

### Key-Value Store Patterns (Redis)

#### 1. Caching
```bash
# Cache with automatic expiration
SETEX "cache:user:123" 3600 "{userData}"

# Cache invalidation
DEL "cache:user:123"
```

#### 2. Rate Limiting
```bash
# Increment counter and set expiration
INCR "rate:ip:1.2.3.4"
EXPIRE "rate:ip:1.2.3.4" 3600
```

## 4. Best Practices

### 1. Data Modeling
- Model around query patterns
- Consider data access patterns
- Plan for scalability
- Denormalize when necessary

### 2. Performance Optimization
```javascript
// MongoDB: Use proper indexes
db.collection.createIndex({ "field": 1 });

// Redis: Use pipelining for bulk operations
MULTI
SET key1 value1
SET key2 value2
EXEC
```

### 3. Security Best Practices
- Enable authentication
- Use encryption at rest
- Implement proper access controls
- Regular security audits

### 4. When to Use Each Type

#### Use Document Stores When:
- Working with complex, nested data
- Need flexible schema
- Building content management systems
- Handling catalog data

#### Use Key-Value Stores When:
- Need fast access to simple data
- Implementing caching
- Managing sessions
- Building leaderboards

#### Use Column-Family Stores When:
- Handling time-series data
- Need high write throughput
- Working with large-scale data
- Have predictable query patterns

#### Use Graph Databases When:
- Working with highly connected data
- Building recommendation engines
- Implementing social networks
- Need complex relationship queries

### 5. Common Anti-Patterns to Avoid
1. Using NoSQL just because it's trendy
2. Ignoring consistency requirements
3. Not planning for scale
4. Treating NoSQL like a relational database
5. Not considering data access patterns

Remember: Choose your NoSQL database based on your specific use case, data structure, and access patterns. There's no one-size-fits-all solution! 