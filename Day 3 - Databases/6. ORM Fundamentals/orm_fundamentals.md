# Object-Relational Mapping (ORM)

## Introduction to ORM

Object-Relational Mapping (ORM) is a programming technique that converts data between incompatible type systems in object-oriented programming languages and relational databases. It creates a "virtual object database" that can be used from within the programming language.

### Core Concepts

1. **Entity Mapping**
   - Converting database tables to classes/objects
   - Mapping columns to properties
   - Handling relationships between entities
   - Managing data types conversion

2. **Key Benefits**
   - Reduces boilerplate SQL code
   - Type safety and compile-time checks
   - Database vendor independence
   - Automatic handling of relationships
   - Built-in caching mechanisms

3. **Common Features**
   - CRUD operations abstraction
   - Query building
   - Relationship management
   - Transaction handling
   - Caching
   - Migration support

## Initial Setup and Configuration

### 1. Java - JPA/Hibernate

#### application.yaml
```yaml
spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/mydb
    username: myuser
    password: mypassword
    driver-class-name: org.postgresql.Driver
  jpa:
    hibernate:
      ddl-auto: update
    show-sql: true
    properties:
      hibernate:
        dialect: org.hibernate.dialect.PostgreSQLDialect
```

#### Dependencies (pom.xml)
```xml
<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>
    <dependency>
        <groupId>org.postgresql</groupId>
        <artifactId>postgresql</artifactId>
        <scope>runtime</scope>
    </dependency>
</dependencies>
```

### 2. Python - Peewee

#### database.py
```python
from peewee import *
from contextlib import contextmanager

# Database configuration
DB_NAME = 'myapp'
DB_USER = 'myuser'
DB_PASSWORD = 'mypassword'
DB_HOST = 'localhost'
DB_PORT = 5432

# Initialize database instance
db = PostgresqlDatabase(
    DB_NAME,
    user=DB_USER,
    password=DB_PASSWORD,
    host=DB_HOST,
    port=DB_PORT
)

# Connection management
@contextmanager
def get_db():
    try:
        db.connect()
        yield db
    finally:
        if not db.is_closed():
            db.close()

# Requirements (requirements.txt)
# peewee==3.16.0
# psycopg2-binary==2.9.6
```

#### models.py
```python
from database import db

class BaseModel(Model):
    class Meta:
        database = db

# Use BaseModel as parent for all models
class User(BaseModel):
    # model definition here
```

### 3. .NET - Entity Framework Core

#### appsettings.json
```json
{
  "ConnectionStrings": {
    "DefaultConnection": "Server=localhost;Database=mydb;User Id=myuser;Password=mypassword;"
  }
}
```

#### Program.cs
```csharp
var builder = WebApplication.CreateBuilder(args);

// Add DbContext configuration
builder.Services.AddDbContext<ApplicationDbContext>(options =>
    options.UseNpgsql(
        builder.Configuration.GetConnectionString("DefaultConnection")
    ));
```

#### ApplicationDbContext.cs
```csharp
public class ApplicationDbContext : DbContext
{
    public ApplicationDbContext(DbContextOptions<ApplicationDbContext> options)
        : base(options)
    {
    }

    // DbSet properties
    public DbSet<User> Users { get; set; }
    
    protected override void OnModelCreating(ModelBuilder modelBuilder)
    {
        base.OnModelCreating(modelBuilder);
        // Additional configuration here
    }
}
```

#### Project Dependencies (.csproj)
```xml
<ItemGroup>
    <PackageReference Include="Microsoft.EntityFrameworkCore" Version="7.0.0" />
    <PackageReference Include="Npgsql.EntityFrameworkCore.PostgreSQL" Version="7.0.0" />
    <PackageReference Include="Microsoft.EntityFrameworkCore.Design" Version="7.0.0">
      <IncludeAssets>runtime; build; native; contentfiles; analyzers; buildtransitive</IncludeAssets>
      <PrivateAssets>all</PrivateAssets>
    </PackageReference>
</ItemGroup>
```

## ORM Implementation by Language

### 1. Java - JPA/Hibernate

Java's ORM implementation is straightforward due to standardization through JPA (Java Persistence API).

#### Entity Definition
```java
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String username;
    
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Order> orders;
}
```

#### CRUD Operations
```java
// Create
User user = new User();
entityManager.persist(user);

// Read
User user = entityManager.find(User.class, 1L);

// Update
user.setUsername("newName");
entityManager.merge(user);

// Delete
entityManager.remove(user);

// Query
List<User> users = entityManager.createQuery(
    "SELECT u FROM User u WHERE u.username = :name", 
    User.class)
    .setParameter("name", "John")
    .getResultList();
```

### 2. Python - Peewee

Python's Peewee ORM provides a lightweight and expressive way to interact with databases. It's simpler to learn and use compared to SQLAlchemy, making it ideal for smaller to medium-sized applications.

#### Entity Definition
```python
from peewee import *

db = SqliteDatabase('my_app.db')  # or use PostgresqlDatabase, MySQLDatabase

class BaseModel(Model):
    class Meta:
        database = db

class User(BaseModel):
    username = CharField(null=False)
    email = CharField(unique=True)
    
class Order(BaseModel):
    user = ForeignKeyField(User, backref='orders')
    order_date = DateTimeField(default=datetime.datetime.now)
    total = DecimalField()
```

#### CRUD Operations
```python
# Create
user = User.create(username="John", email="john@example.com")

# Or alternatively:
user = User(username="John", email="john@example.com")
user.save()

# Read
user = User.get(User.id == 1)
# or
user = User.get_by_id(1)

# Update
user.username = "newName"
user.save()

# Delete
user.delete_instance()
# or
User.delete().where(User.username == "John").execute()

# Queries
# Simple query
users = User.select().where(User.username == "John")

# Join query
orders = (Order
         .select(Order, User)
         .join(User)
         .where(User.username == "John"))

# Iterate results
for order in orders:
    print(order.user.username, order.total)

# Count
user_count = User.select().count()

# Complex queries
active_users = (User
                .select()
                .join(Order)
                .where(Order.order_date >= last_week)
                .group_by(User)
                .having(fn.COUNT(Order.id) > 0))
```

#### Relationships
```python
# One-to-Many
class User(BaseModel):
    username = CharField()

class Tweet(BaseModel):
    user = ForeignKeyField(User, backref='tweets')
    content = TextField()

# Many-to-Many
class Student(BaseModel):
    name = CharField()

class Course(BaseModel):
    name = CharField()

class Enrollment(BaseModel):
    student = ForeignKeyField(Student, backref='enrollments')
    course = ForeignKeyField(Course, backref='enrollments')
    date = DateTimeField(default=datetime.datetime.now)
```

#### Transaction Management
```python
with db.atomic() as transaction:
    try:
        user = User.create(username="John")
        order = Order.create(user=user, total=100)
    except:
        transaction.rollback()
        raise
```

### 3. .NET - Entity Framework Core

.NET's Entity Framework Core offers a robust ORM with LINQ integration, making it powerful but requiring understanding of LINQ concepts.

#### Entity Definition
```csharp
public class User
{
    public int Id { get; set; }
    public string Username { get; set; }
    public ICollection<Order> Orders { get; set; }
}

public class ApplicationDbContext : DbContext
{
    public DbSet<User> Users { get; set; }
    
    protected override void OnModelCreating(ModelBuilder modelBuilder)
    {
        modelBuilder.Entity<User>()
            .Property(u => u.Username)
            .IsRequired();
    }
}
```

#### CRUD Operations
```csharp
// Create
var user = new User { Username = "John" };
context.Users.Add(user);
await context.SaveChangesAsync();

// Read
var user = await context.Users.FindAsync(1);

// Update
user.Username = "newName";
await context.SaveChangesAsync();

// Delete
context.Users.Remove(user);
await context.SaveChangesAsync();

// Query - Using LINQ
var users = await context.Users
    .Where(u => u.Username == "John")
    .Include(u => u.Orders)
    .ToListAsync();
```

## Key Differences Between Implementations

### 1. Configuration Approach
- **Java/JPA**: Uses annotations or XML, standardized across implementations
- **Python/Peewee**: Simple, pythonic model definitions with minimal configuration
- **.NET/EF Core**: Uses attributes and fluent API, tight integration with LINQ

### 2. Query Building
- **Java/JPA**: 
  - JPQL (JPA Query Language)
  - Criteria API
  - Native SQL when needed

- **Python/Peewee**:
  - Simple, chainable query API
  - Expression-based querying
  - Raw SQL support when needed
  - More intuitive for Python developers

- **.NET/EF Core**:
  - LINQ integration
  - Fluent API
  - Raw SQL support
  - Strong type safety

### 3. Relationship Handling
- **Java/JPA**: Straightforward with annotations
- **Python/Peewee**: More explicit, requires relationship() configuration
- **.NET/EF Core**: Mix of attributes and fluent API

### 4. Performance Considerations

#### Java/JPA
- Built-in first and second-level caching
- Lazy loading by default
- Easy to optimize with fetch joins

#### Python/Peewee
- Simple connection pooling
- Lazy loading by default
- Lightweight query construction
- Manual optimization needed for complex queries
- No built-in second-level cache

#### .NET/EF Core
- Change tracking
- Lazy loading requires explicit setup
- Strong LINQ optimization
- Built-in compiled queries

## Best Practices

1. **Entity Design**
   - Keep entities simple and focused
   - Use appropriate relationships
   - Consider lazy loading implications
   - Plan for serialization

2. **Performance**
   - Use eager loading when appropriate
   - Implement caching strategies
   - Monitor query performance
   - Avoid N+1 query problems

3. **Transaction Management**
   - Use appropriate transaction scopes
   - Handle concurrency properly
   - Implement proper error handling
   - Consider isolation levels

4. **Migration Strategy**
   - Use migration tools provided by ORM
   - Version control your migrations
   - Test migrations thoroughly
   - Have rollback plans 