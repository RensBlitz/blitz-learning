# Database Design

Welcome to Database Design! This guide will help you understand how to design efficient and scalable databases. We'll cover everything from basic concepts to advanced patterns, with practical examples.

## 1. Foundational Concepts

### What is Database Design?
Database design is the process of structuring your data in a way that's efficient, maintainable, and supports your application's needs. Think of it like architecting a building - you need a solid foundation and careful planning before you start building.

### Key Terms
- **Entity**: A distinct object in your system (e.g., User, Order)
- **Attribute**: A property of an entity (e.g., username, email)
- **Relationship**: How entities connect to each other
- **Cardinality**: The type of relationship between entities (one-to-one, one-to-many, etc.)
- **Primary Key**: Unique identifier for each record
- **Foreign Key**: Reference to another table's primary key

## 2. Entity-Relationship Diagrams (ERD)

### What is an ERD?
An Entity-Relationship Diagram (ERD) is like a blueprint for your database. It's a visual representation that shows:
- What things (entities) you're storing data about
- How these things are related to each other
- What properties (attributes) each thing has

Think of it like drawing a map of relationships between different objects in your system. For example, in an e-commerce system, you need to show how customers connect to their orders, and how orders connect to products.

### Basic ERD Symbols
```
[Entity]     ----<    One-to-Many    >---- [Entity]
            (One department has many employees)

[Entity]     ----||   One-to-One     ||---- [Entity]
            (One user has one profile)

[Entity]     ----<    Many-to-Many   >---- [Entity]
            (Many students take many courses)
```

### Example E-commerce ERD Explained
```
[User]       ----<    Places         >---- [Order]
(One user can place many orders, but each order belongs to one user)

[Order]      ----<    Contains       >---- [Product]
(One order can contain many products, and products can be in many orders)

[Product]    ----<    Belongs to     >---- [Category]
(One category can have many products, but each product belongs to one category)
```

Let's break down this e-commerce example:
1. **User-Order Relationship**:
   - A user can place multiple orders over time
   - Each order must belong to exactly one user
   - Example: John (user) has placed Order #1234 and Order #1235

2. **Order-Product Relationship**:
   - An order typically contains multiple products
   - A product can be part of many different orders
   - Example: Order #1234 contains iPhone, AirPods, and a charger

3. **Product-Category Relationship**:
   - Each product belongs to one category
   - A category can contain many products
   - Example: The "Electronics" category contains iPhones, laptops, and tablets

## 3. Schema Design Patterns

### 1. One-to-One Relationship
```sql
CREATE TABLE users (
    user_id INT PRIMARY KEY,
    username VARCHAR(50),
    email VARCHAR(100)
);

CREATE TABLE user_profiles (
    user_id INT PRIMARY KEY,
    address TEXT,
    phone VARCHAR(20),
    FOREIGN KEY (user_id) REFERENCES users(user_id)
);
```

### 2. One-to-Many Relationship
```sql
CREATE TABLE departments (
    dept_id INT PRIMARY KEY,
    name VARCHAR(100)
);

CREATE TABLE employees (
    emp_id INT PRIMARY KEY,
    name VARCHAR(100),
    dept_id INT,
    FOREIGN KEY (dept_id) REFERENCES departments(dept_id)
);
```

### 3. Many-to-Many Relationship
```sql
CREATE TABLE students (
    student_id INT PRIMARY KEY,
    name VARCHAR(100)
);

CREATE TABLE courses (
    course_id INT PRIMARY KEY,
    title VARCHAR(200)
);

CREATE TABLE enrollments (
    student_id INT,
    course_id INT,
    enrollment_date DATE,
    PRIMARY KEY (student_id, course_id),
    FOREIGN KEY (student_id) REFERENCES students(student_id),
    FOREIGN KEY (course_id) REFERENCES courses(course_id)
);
```

## 4. Implementation Patterns

### 1. Handling Hierarchical Data
Hierarchical data is like a family tree or an organization chart - items that have parent-child relationships. Think of a file system with folders and subfolders, or a company's department structure.

#### Example: Company Organization Structure
```sql
-- Using Adjacency List (storing direct parent)
CREATE TABLE departments (
    dept_id INT PRIMARY KEY,
    name VARCHAR(100),
    parent_id INT,
    FOREIGN KEY (parent_id) REFERENCES departments(dept_id)
);

-- Example data:
INSERT INTO departments VALUES
(1, 'CEO Office', NULL),
(2, 'Engineering', 1),    -- Engineering reports to CEO
(3, 'Frontend', 2),       -- Frontend reports to Engineering
(4, 'Backend', 2);        -- Backend reports to Engineering
```

#### Different Ways to Handle Hierarchies:

1. **Adjacency List** (shown above):
   - Simple to understand and maintain
   - Harder to query entire hierarchies
   - Good for simple parent-child relationships

2. **Path Enumeration**:
```sql
CREATE TABLE departments (
    dept_id INT PRIMARY KEY,
    name VARCHAR(100),
    path VARCHAR(255)  -- Stores full path like "1/2/3"
);

-- Example data:
INSERT INTO departments VALUES
(1, 'CEO Office', '1'),
(2, 'Engineering', '1/2'),
(3, 'Frontend', '1/2/3');
```

### 2. Temporal Data Pattern
Temporal data is about tracking changes over time. It's like keeping a history book of your data. Common uses:
- Employee salary history
- Product price changes
- Customer address changes

```sql
-- Example: Track employee position and salary changes
CREATE TABLE employees (
    emp_id INT PRIMARY KEY,
    name VARCHAR(100)
);

CREATE TABLE employee_history (
    emp_id INT,
    effective_from DATE,
    effective_to DATE,
    salary DECIMAL(10,2),
    position VARCHAR(100),
    PRIMARY KEY (emp_id, effective_from),
    FOREIGN KEY (emp_id) REFERENCES employees(emp_id)
);

-- Example data: Track an employee's career progression
INSERT INTO employees VALUES (1, 'John Doe');

INSERT INTO employee_history VALUES
(1, '2022-01-01', '2022-06-30', 50000, 'Junior Developer'),
(1, '2022-07-01', '2023-06-30', 65000, 'Developer'),
(1, '2023-07-01', NULL, 80000, 'Senior Developer');
```

### 3. Soft Delete Pattern
Soft delete means marking records as deleted instead of actually removing them. It's like putting files in a recycle bin instead of permanently deleting them.

Benefits:
- Can recover accidentally deleted data
- Maintain historical records
- Preserve data relationships

```sql
CREATE TABLE products (
    product_id INT PRIMARY KEY,
    name VARCHAR(100),
    price DECIMAL(10,2),
    deleted_at TIMESTAMP NULL  -- NULL means active, timestamp means deleted
);

-- Instead of DELETE FROM products
UPDATE products 
SET deleted_at = CURRENT_TIMESTAMP 
WHERE product_id = 123;

-- To query only active products
SELECT * FROM products WHERE deleted_at IS NULL;

-- To restore a product
UPDATE products 
SET deleted_at = NULL 
WHERE product_id = 123;
```

## 5. Best Practices

### 1. Naming Conventions
- Use clear, consistent names
- Avoid reserved words
- Use singular for table names
- Use lowercase with underscores
```sql
-- Good
CREATE TABLE user_profile
CREATE TABLE order_item

-- Avoid
CREATE TABLE Users
CREATE TABLE ORDER_ITEMS
```

### 2. Data Integrity
```sql
CREATE TABLE orders (
    order_id INT PRIMARY KEY,
    user_id INT NOT NULL,
    total DECIMAL(10,2) CHECK (total >= 0),
    status VARCHAR(20) DEFAULT 'pending',
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (user_id) REFERENCES users(user_id)
);
```

### 3. Indexing Strategy
Indexes are like the table of contents in a book - they help you find data quickly without scanning every page.

#### What is an Index?
- It's a data structure that improves the speed of data retrieval
- Think of it like an alphabetical index in a phone book
- Without an index, databases must scan every row (like reading every page to find something)

#### Types of Indexes:

1. **Single Column Index**
```sql
-- Good for searching by email
CREATE INDEX idx_user_email ON users(email);

-- Example query that will use this index
SELECT * FROM users WHERE email = 'john@example.com';
```

2. **Composite Index** (Multiple Columns)
```sql
-- Good for queries that filter by both user_id and order_date
CREATE INDEX idx_order_user_date ON orders(user_id, order_date);

-- Example query that will use this index
SELECT * FROM orders 
WHERE user_id = 123 
AND order_date > '2024-01-01';
```

#### When to Use Indexes:
- On columns used in WHERE clauses
- On columns used in JOIN conditions
- On columns used in ORDER BY
- On columns with high selectivity (many unique values)

#### When Not to Use Indexes:
- On small tables
- On columns rarely used in queries
- On columns with low selectivity
- On frequently updated columns

```sql
-- Example of strategic indexing
CREATE TABLE orders (
    order_id INT PRIMARY KEY,  -- Automatically indexed
    user_id INT,
    status VARCHAR(20),
    order_date DATE,
    total DECIMAL(10,2)
);

-- Index for finding user's orders
CREATE INDEX idx_user_orders ON orders(user_id, order_date);

-- Index for status queries (if frequently used)
CREATE INDEX idx_order_status ON orders(status);

-- Query that uses both indexes
SELECT * FROM orders 
WHERE user_id = 123 
AND status = 'pending' 
ORDER BY order_date DESC;
```

### 4. Performance Considerations
- Use appropriate data types
- Normalize to reduce redundancy
- Denormalize when necessary for performance
- Plan for scalability

## 6. Common Anti-Patterns to Avoid

1. **Over-normalization**
```sql
-- Too normalized (separate tables for every attribute)
CREATE TABLE user_names (user_id INT, name VARCHAR(100));
CREATE TABLE user_emails (user_id INT, email VARCHAR(100));

-- Better approach
CREATE TABLE users (
    user_id INT,
    name VARCHAR(100),
    email VARCHAR(100)
);
```

2. **Using GUID/UUID as Primary Key Without Consideration**
```sql
-- Consider performance implications
CREATE TABLE orders (
    order_id UUID PRIMARY KEY,  -- Can lead to index fragmentation
    -- other fields...
);
```

3. **Not Using Constraints**
```sql
-- Bad: No constraints
CREATE TABLE users (
    email VARCHAR(100)
);

-- Good: With constraints
CREATE TABLE users (
    email VARCHAR(100) NOT NULL UNIQUE CHECK (email LIKE '%@%.%')
);
```

## 7. Design Process Steps

1. **Requirements Analysis**
   - Identify entities and relationships
   - Define business rules
   - Document use cases

2. **Conceptual Design**
   - Create ERD
   - Define entity relationships
   - Identify attributes

3. **Logical Design**
   - Transform conceptual model to logical model
   - Apply normalization rules
   - Define keys and constraints

4. **Physical Design**
   - Choose data types
   - Plan indexes
   - Consider partitioning
   - Plan for performance

Remember: Good database design is crucial for application performance and maintainability. Take time to plan and consider future needs, but don't over-engineer. Start simple and evolve as needed! 