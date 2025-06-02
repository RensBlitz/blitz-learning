# Operators 📚

## What are Operators? 🤔

Operators are special symbols or keywords in programming languages that perform operations on one or more operands (values or variables). They are used to manipulate data, perform calculations, compare values, and control logic in a program.

### Real-world Analogy 🌍
Think of operators like tools or actions:
- A **calculator** uses +, -, *, / to add, subtract, multiply, or divide numbers
- A **scale** compares weights (like >, <, ==)
- A **light switch** toggles on/off (like logical operators)

## Core Principles 🧠
- **Arithmetic Operators**: Perform mathematical calculations (e.g., +, -, *, /, %)
- **Comparison (Relational) Operators**: Compare values (e.g., ==, !=, >, <, >=, <=)
- **Logical Operators**: Combine or invert boolean values (e.g., &&, ||, !)
- **Assignment Operators**: Assign values to variables (e.g., =, +=, -=)
- **Unary/Binary/Ternary**: Operators can take one, two, or three operands

## Common Use Cases 🛠️
- Performing calculations
- Making decisions based on comparisons
- Combining multiple conditions
- Updating variable values
- Implementing algorithms

## Syntax and Implementation 📝

### Pseudocode (Language-Independent)
```pseudocode
// Arithmetic
sum = a + b
difference = a - b
product = a * b
quotient = a / b
remainder = a % b

// Comparison
isEqual = (a == b)
isGreater = (a > b)

// Logical
result = (a > 0) AND (b < 10)

// Assignment
x = 5
x += 2
```

## Language-Specific Examples

### Java ☕
```java
int a = 10, b = 3;
int sum = a + b;
int diff = a - b;
int prod = a * b;
int quot = a / b;
int rem = a % b;

boolean isEqual = (a == b);
boolean isGreater = (a > b);
boolean bothPositive = (a > 0) && (b > 0);

int x = 5;
x += 2;
```

### Python 🐍
```python
a, b = 10, 3
sum_ = a + b
diff = a - b
prod = a * b
quot = a // b
rem = a % b

is_equal = (a == b)
is_greater = (a > b)
both_positive = (a > 0) and (b > 0)

x = 5
x += 2
```

### JavaScript 🟨
```javascript
let a = 10, b = 3;
let sum = a + b;
let diff = a - b;
let prod = a * b;
let quot = Math.floor(a / b);
let rem = a % b;

let isEqual = (a === b);
let isGreater = (a > b);
let bothPositive = (a > 0) && (b > 0);

let x = 5;
x += 2;
```

### TypeScript 🔷
```typescript
let a: number = 10, b: number = 3;
let sum: number = a + b;
let diff: number = a - b;
let prod: number = a * b;
let quot: number = Math.floor(a / b);
let rem: number = a % b;

let isEqual: boolean = (a === b);
let isGreater: boolean = (a > b);
let bothPositive: boolean = (a > 0) && (b > 0);

let x: number = 5;
x += 2;
```

## Key Differences Between Languages 📊

| Feature              | Java           | Python         | JavaScript      | TypeScript      |
|----------------------|----------------|----------------|-----------------|----------------|
| Integer Division     | / (truncates)  | //             | Math.floor(/)   | Math.floor(/)   |
| Strict Equality      | ==, .equals()  | ==             | ===             | ===             |
| Logical Operators    | &&, ||, !      | and, or, not   | &&, ||, !       | &&, ||, !       |
| Assignment Shortcuts | +=, -=, etc.   | +=, -=, etc.   | +=, -=, etc.    | +=, -=, etc.    |
| Ternary Operator     | ? :            | value_if_true if cond else value_if_false | ? : | ? : |

## Best Practices ✅
- Use parentheses to clarify complex expressions
- Avoid mixing types in operations (e.g., int + String)
- Use strict equality (===) in JavaScript/TypeScript
- Prefer explicit comparisons for clarity
- Be careful with integer division and rounding

## Common Pitfalls ⚠️
- Integer division truncation (Java, JavaScript)
- Confusing assignment (=) with equality (==)
- Operator precedence mistakes
- Using == instead of .equals() for objects in Java
- Type coercion in JavaScript

## Advanced Concepts 🚀
- **Bitwise Operators**: Manipulate individual bits (e.g., &, |, ^, ~, <<, >>)
- **Short-circuit Evaluation**: Logical operators may skip evaluation of some operands
- **Operator Overloading**: Redefining operator behavior (supported in some languages, not Java)

## Related Concepts 🔄
- Variables
- Data Types
- Control Flow
- Expressions
- Functions

</rewritten_file> 