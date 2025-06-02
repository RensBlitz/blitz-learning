# Methods 📚

## What is a Method? 🤔

A method (or function) is a named block of code that performs a specific task, can take input (parameters), and can return a result. Methods help organize code, promote reuse, and make programs easier to read and maintain.

### Real-world Analogy 🌍
Think of a method like a **recipe** or **instruction manual**:
- A recipe takes ingredients (parameters), follows steps (code), and produces a dish (return value).
- A coffee machine takes water and coffee beans (inputs), runs a process (method body), and gives you coffee (output).

## Core Principles 🧠
- **Encapsulation**: Group related code into reusable units
- **Parameters and Arguments**: Pass information into methods
- **Return Values**: Output a result from a method
- **Abstraction**: Hide implementation details behind a method name
- **Reusability**: Call methods multiple times with different inputs

## Method Signature Components 🏷️
A method signature defines how a method is declared and called. The main components are:

- **Method Name**: The identifier used to call the method. Should be descriptive and use lowerCamelCase (Java, JS, TS) or snake_case (Python).
- **Return Type**: The type of value the method returns (e.g., `int`, `void`, `String`). In Python and JavaScript, this can be omitted, but in Java and TypeScript it is required.
- **Input Parameters**: The variables listed in parentheses that the method accepts as input. Each has a type (except in Python/JS) and a name.
- **Access Modifier**: (Java/TypeScript) Specifies visibility, e.g., `public`, `private`, `protected`.
- **Static Keyword**: (Java/TypeScript) Indicates the method belongs to the class, not an instance.
- **Throws/Exceptions**: (Java) Optionally declares exceptions the method might throw.
- **Default Values**: (Python, JS, TS) Parameters can have default values.

**Example (Java):**
```java
public static int add(int a, int b) {
    return a + b;
}
```
- `public`: access modifier
- `static`: class method
- `int`: return type
- `add`: method name
- `(int a, int b)`: input parameters

**Example (Python):**
```python
def greet(name="World"):
    print(f"Hello, {name}!")
```
- `def`: function definition keyword
- `greet`: function name
- `(name="World")`: input parameter with default value

**Example (JavaScript/TypeScript):**
```typescript
function multiply(a: number, b: number): number {
    return a * b;
}
```
- `function`: function keyword
- `multiply`: function name
- `(a: number, b: number)`: input parameters with types (TypeScript)
- `: number`: return type (TypeScript)

## Feature Explanations by Language 🧩

Below are explanations for the key features compared across languages:

### Declaration
- **Java/TypeScript:** You must specify the return type and parameter types explicitly.
  ```java
  int add(int a, int b) { ... }
  ```
  ```typescript
  function add(a: number, b: number): number { ... }
  ```
- **Python/JavaScript:** Types are not required; the language infers them at runtime.
  ```python
def add(a, b): ...
  ```
  ```javascript
function add(a, b) { ... }
  ```

### Static Methods
- **Java/TypeScript:** Use the `static` keyword to define a method that belongs to the class, not an instance.
  ```java
  public static void greet() { ... }
  ```
- **Python/JavaScript/TypeScript:** Functions are global or belong to objects/classes, but the `static` keyword is only used in class contexts (ES6+ for JS/TS).
  ```javascript
  class MyClass {
    static greet() { ... }
  }
  ```

### Overloading
- **Java:** Supports method overloading (multiple methods with the same name but different parameter lists).
  ```java
  int add(int a, int b) { ... }
  double add(double a, double b) { ... }
  ```
- **Python/JavaScript/TypeScript:** No true overloading; use default parameters or inspect arguments inside the function.
  ```python
def add(a, b=0): ...
  ```

### Default Parameters
- **Java:** No default parameters; use overloading instead.
- **Python/JavaScript/TypeScript:** You can assign default values to parameters.
  ```python
def greet(name="World"): ...
  ```
  ```javascript
function greet(name = "World") { ... }
  ```
  ```typescript
function greet(name: string = "World"): void { ... }
  ```

### Named Parameters
- **Python:** Supports named (keyword) arguments.
  ```python
def connect(host, port=80): ...
connect(port=8080, host="localhost")
  ```
- **Java/JavaScript/TypeScript:** No direct support; in JS/TS, you can simulate with object destructuring.
  ```javascript
function connect({host, port = 80}) { ... }
connect({host: "localhost", port: 8080});
  ```

### Return Type Required
- **Java/TypeScript:** You must declare the return type.
- **Python/JavaScript:** No return type declaration required; can return any type or nothing.

### Arrow/Lambda Syntax
- **Java:** Lambdas for functional interfaces (Java 8+).
  ```java
  (int x, int y) -> x + y
  ```
- **Python:** `lambda` keyword for small anonymous functions.
  ```python
  lambda x, y: x + y
  ```
- **JavaScript/TypeScript:** Arrow functions for concise anonymous functions.
  ```javascript
  (x, y) => x + y
  ```

## Common Use Cases 🛠️
- Breaking down complex problems into smaller steps
- Avoiding code duplication
- Performing calculations or data processing
- Handling user input/output
- Implementing algorithms

## Syntax and Implementation 📝

### Pseudocode (Language-Independent)
```pseudocode
function functionName(parameter1, parameter2):
    // code block
    return result

// Calling a function
result = functionName(arg1, arg2)
```

## Language-Specific Examples

### Java ☕
```java
// Method definition
public static int add(int a, int b) {
    return a + b;
}

// Method call
int sum = add(3, 5); // sum is 8
```

### Python 🐍
```python
def add(a, b):
    return a + b

sum_ = add(3, 5)  # sum_ is 8
```

### JavaScript 🟨
```javascript
function add(a, b) {
    return a + b;
}

let sum = add(3, 5); // sum is 8
```

### TypeScript 🔷
```typescript
function add(a: number, b: number): number {
    return a + b;
}

let sum: number = add(3, 5); // sum is 8
```

## Key Differences Between Languages 📊

| Feature                | Java                        | Python                | JavaScript           | TypeScript            |
|------------------------|-----------------------------|-----------------------|----------------------|-----------------------|
| Declaration            | Explicit return & param types| Dynamic typing        | Dynamic typing       | Explicit types        |
| Static Methods         | Yes (static keyword)        | Functions are global  | Functions are global | Functions are global  |
| Overloading            | Yes                         | No (default args)     | No (default args)    | No (default args)     |
| Default Parameters     | No (use overloading)        | Yes                   | Yes                  | Yes                   |
| Named Parameters       | No                          | Yes (kwargs)          | No                   | No                    |
| Return Type Required   | Yes                         | No                    | No                   | Yes                   |
| Arrow/Lambda Syntax    | Yes (lambdas)               | Yes (lambdas)         | Yes (arrow funcs)    | Yes (arrow funcs)     |

## Best Practices ✅
- Use descriptive method names (verbs for actions)
- Keep methods short and focused on a single task
- Use parameters for input, return values for output
- Document method purpose, parameters, and return values
- Avoid side effects unless necessary
- Use consistent naming conventions

## Common Pitfalls ⚠️
- Forgetting to return a value (or returning the wrong type)
- Mismatching parameter types or order
- Overusing global variables instead of parameters
- Making methods too long or complex
- Not handling edge cases or invalid input
- Recursive methods without a base case (infinite recursion)

## Advanced Concepts 🚀
- **Recursion**: Methods that call themselves to solve problems
- **Method Overloading**: Multiple methods with the same name but different parameters (Java)
- **Default and Named Parameters**: Simplify method calls (Python, JS, TS)
- **First-Class Functions**: Functions as values (Python, JS, TS)
- **Lambdas/Anonymous Functions**: Short, inline functions
- **Higher-Order Functions**: Methods that take other functions as parameters

## Related Concepts 🔄
- Variables
- Parameters and Arguments
- Return Values
- Classes and Objects
- Control Flow
- Recursion 