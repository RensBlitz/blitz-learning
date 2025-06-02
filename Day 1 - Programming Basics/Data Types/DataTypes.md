# Data Types 📚

## What is a Data Type? 🤔

A data type defines the kind of data a variable can hold and what operations can be performed on it. Data types are fundamental to programming because they determine how information is stored, interpreted, and manipulated in a program.

### Real-world Analogy 🌍
Think of data types like different kinds of containers in your kitchen:
- A **water bottle** holds liquids (like a `double` or `float` for decimals)
- A **jar** holds cookies (like an `int` for whole numbers)
- A **label** on a box tells you what's inside (like a `String` for text)
- You can't put soup in a cookie jar, just like you can't put text in an integer variable

## Core Principles 🧠
- **Primitive Types**: Basic built-in types (e.g., int, double, char, boolean)
- **Reference Types**: Types that refer to objects (e.g., String, arrays, custom classes)
- **Type Safety**: Ensures that operations are performed on compatible types
- **Type Conversion**: Changing a value from one type to another (casting)

## Common Use Cases 🛠️
- Storing numbers, text, and logical values
- Performing calculations
- Representing true/false conditions
- Working with collections of data (arrays, lists)
- Passing information between methods

## Syntax and Implementation 📝

### Pseudocode (Language-Independent)
```pseudocode
// Declaration
variable_name: data_type

// Initialization
variable_name: data_type = value

// Type conversion
converted_value = convert(value, target_type)
```

## Language-Specific Examples

### Java ☕
```java
// Primitive types
int age = 30;
double price = 19.99;
char grade = 'A';
boolean isActive = true;

// Reference types
String name = "Alice";
int[] numbers = {1, 2, 3};
```

### Python 🐍
```python
# Dynamic typing, but types exist
age = 30           # int
price = 19.99      # float
grade = 'A'        # str (single character)
is_active = True   # bool
name = "Alice"     # str
numbers = [1, 2, 3] # list
```

### JavaScript 🟨
```javascript
let age = 30;           // number
let price = 19.99;      // number
let grade = 'A';        // string (no char type)
let isActive = true;    // boolean
let name = "Alice";     // string
let numbers = [1, 2, 3]; // array
```

### TypeScript 🔷
```typescript
let age: number = 30;
let price: number = 19.99;
let grade: string = 'A';
let isActive: boolean = true;
let name: string = "Alice";
let numbers: number[] = [1, 2, 3];
```

## Key Differences Between Languages 📊

| Feature         | Java                | Python         | JavaScript      | TypeScript      |
|-----------------|---------------------|----------------|-----------------|----------------|
| Type System     | Static, strong      | Dynamic, strong| Dynamic, weak   | Static, strong |
| Primitives      | Yes                 | Yes            | No (all objects)| Yes            |
| Reference Types | Yes                 | Yes            | Yes             | Yes            |
| Type Inference  | Limited (var)       | Yes            | Yes             | Yes            |
| Char Type       | Yes                 | No (str)       | No (string)     | No (string)    |
| Arrays          | Yes                 | Yes (list)     | Yes             | Yes            |

## Best Practices ✅
- Choose the most appropriate data type for your data
- Use primitives for simple values, reference types for objects/collections
- Avoid unnecessary type conversions
- Use constants for values that don't change
- Be explicit with types when clarity is needed

## Common Pitfalls ⚠️
- Mixing up types (e.g., int vs. double)
- Using the wrong type for a value (e.g., storing text in an int)
- Forgetting to initialize variables
- Type conversion errors (loss of precision, exceptions)
- Null pointer exceptions with reference types

## Advanced Concepts 🚀
- **Autoboxing/Unboxing**: Automatic conversion between primitives and their wrapper classes (e.g., int ↔ Integer)
- **Generics**: Writing code that works with any data type (e.g., List<T>)
- **Type Erasure**: How generics are implemented in Java
- **Immutable Types**: Types whose values cannot be changed (e.g., String)

## Related Concepts 🔄
- Variables
- Operators
- Control Flow
- Collections
- Type Conversion 