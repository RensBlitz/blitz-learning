# Relational Databases

Welcome to Relational Databases! This guide will help you understand how to work with relational databases effectively, starting from the basics and moving to more advanced concepts.

## 1. Foundational Concepts

### What is a Relational Database?
A relational database organizes data into tables (relations) with rows and columns, where each table can be linked to others through relationships. Think of it like multiple Excel sheets that are connected to each other in a structured way.

### Key Components
- **Tables**: Collections of related data (e.g., Users, Orders)
- **Columns**: Individual data fields (e.g., username, email)
- **Rows**: Individual records in a table
- **Primary Keys**: Unique identifiers for each row
- **Foreign Keys**: References to primary keys in other tables

### SQL Basics
```sql
-- Basic SQL syntax examples
SELECT column1, column2 FROM table_name;
WHERE condition;
ORDER BY column_name;
GROUP BY column_name;
```

## 2. Database Design & Normalization

### Database Normalization
Normalization helps eliminate data redundancy and maintain data integrity. Here are the main forms:

1. **First Normal Form (1NF)**
   - Each cell contains a single value
   - No repeating groups
   ```sql
   -- Bad (not 1NF)
   CREATE TABLE Students (
       id INT PRIMARY KEY,
       name VARCHAR(100),
       phones VARCHAR(255) -- storing "123,456,789"
   );

   -- Good (1NF)
   CREATE TABLE StudentPhones (
       student_id INT,
       phone VARCHAR(20)
   );
   ```

2. **Second Normal Form (2NF)**
   - Must be in 1NF
   - No partial dependencies on primary key

3. **Third Normal Form (3NF)**
   - Must be in 2NF
   - No transitive dependencies

### Relationships
1. **One-to-One**
```sql
CREATE TABLE User (
    user_id INT PRIMARY KEY,
    username VARCHAR(50)
);

CREATE TABLE UserProfile (
    user_id INT PRIMARY KEY,
    address VARCHAR(200),
    FOREIGN KEY (user_id) REFERENCES User(user_id)
);
```

2. **One-to-Many**
```sql
CREATE TABLE Author (
    author_id INT PRIMARY KEY,
    name VARCHAR(100)
);

CREATE TABLE Book (
    book_id INT PRIMARY KEY,
    title VARCHAR(200),
    author_id INT,
    FOREIGN KEY (author_id) REFERENCES Author(author_id)
);
```

3. **Many-to-Many**
```sql
CREATE TABLE Student (
    student_id INT PRIMARY KEY,
    name VARCHAR(100)
);

CREATE TABLE Course (
    course_id INT PRIMARY KEY,
    title VARCHAR(200)
);

CREATE TABLE StudentCourse (
    student_id INT,
    course_id INT,
    PRIMARY KEY (student_id, course_id),
    FOREIGN KEY (student_id) REFERENCES Student(student_id),
    FOREIGN KEY (course_id) REFERENCES Course(course_id)
);
```

## 3. Implementation Patterns

### Common SQL Operations

#### CRUD Operations
```sql
-- Create
INSERT INTO Users (name, email) VALUES ('John', 'john@example.com');

-- Read
SELECT * FROM Users WHERE id = 1;

-- Update
UPDATE Users SET email = 'new@example.com' WHERE id = 1;

-- Delete
DELETE FROM Users WHERE id = 1;
```

#### Joins
```sql
-- Inner Join
SELECT Orders.order_id, Users.name
FROM Orders
INNER JOIN Users ON Orders.user_id = Users.id;

-- Left Join
SELECT Users.name, Orders.order_id
FROM Users
LEFT JOIN Orders ON Users.id = Orders.user_id;
```

#### Aggregations
```sql
-- Common aggregation functions
SELECT 
    COUNT(*) as total_orders,
    SUM(amount) as total_amount,
    AVG(amount) as average_amount,
    MAX(amount) as highest_amount
FROM Orders
GROUP BY user_id;
```

## 4. Best Practices

### 1. Database Design
- Use appropriate data types
- Implement proper constraints
- Follow naming conventions
- Design with scalability in mind

### 2. Query Optimization
- Use indexes wisely
```sql
-- Create index for frequently searched columns
CREATE INDEX idx_user_email ON Users(email);
```
- Write efficient queries
  - Avoid SELECT *
  - Use specific WHERE clauses
  - Limit result sets when possible

### 3. Performance Tips
- Use prepared statements
- Implement connection pooling
- Regular maintenance
  - Update statistics
  - Rebuild indexes
  - Clean up unused indexes

### 4. Security Best Practices
- Use parameterized queries
```sql
-- Bad (vulnerable to SQL injection)
"SELECT * FROM Users WHERE username = '" + username + "'";

-- Good (using prepared statement)
"SELECT * FROM Users WHERE username = ?";
```
- Implement proper access controls
- Regular security audits
- Encrypt sensitive data

### 5. Common Anti-Patterns to Avoid
1. Not using indexes properly
2. Over-normalizing or under-normalizing
3. Using ORMs without understanding SQL
4. Not planning for scale
5. Ignoring database maintenance

Remember: A well-designed database is crucial for application performance and maintainability. Take time to plan your schema and relationships carefully! 