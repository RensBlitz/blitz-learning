# Data Types Exercises (.NET) 🧪

## Prerequisites ⚠️

Before attempting these exercises, please read the [DataTypes.md](../../DataTypes.md) file to understand the core concepts of data types in programming.

## Environment Setup 🔧

### Required Software
- .NET 8.0 SDK or higher
- Visual Studio, Visual Studio Code, or Rider (recommended)
- Git (for version control)

### Verifying Your Setup
1. Check your .NET version:
   ```bash
   dotnet --version
   ```
   The output should show version 8.0 or higher.

2. Make sure your IDE is configured to use the correct .NET SDK.

## How to Run the Exercises

### Using Visual Studio/Rider
1. Open the solution or project files in your IDE.
2. Build the solution to ensure everything compiles.
3. Run the tests using the built-in test runner.

### Using Command Line
1. Navigate to the `dotnet` folder.
2. Build the projects:
   ```bash
   dotnet build
   ```
3. Run the tests:
   ```bash
   dotnet test
   ```

## Exercise Overview 📂

This module contains 8 progressively challenging exercises:

1. **PrimitiveTypeDeclaration.cs**: Primitive type declaration and initialization
   - Declare and initialize variables of different primitive types
   - Understand default values and assignments

2. **ReferenceTypeDeclaration.cs**: Reference type declaration and initialization
   - Work with strings and arrays
   - Understand reference vs. value types

3. **TypeSafetyAndErrors.cs**: Type safety and assignment errors
   - Explore what happens when assigning incompatible types
   - Learn about compile-time and runtime errors

4. **TypeConversion.cs**: Type conversion (widening and narrowing)
   - Perform implicit and explicit type conversions
   - Handle potential data loss

5. **StringAndCharOperations.cs**: String and char operations
   - Manipulate characters and strings
   - Convert between char and string

6. **ArraysAndCollections.cs**: Arrays and collections basics
   - Declare, initialize, and use arrays
   - Access and modify array elements

7. **ConstantsAndImmutability.cs**: Constants and immutability
   - Use the `const` and `readonly` keywords for constants
   - Understand immutable types (e.g., string)

8. **DataTypeBestPractices.cs**: Common pitfalls and best practices
   - Identify and fix common mistakes with data types
   - Apply best practices for type usage

## Completing the Exercises ✅

Each exercise file contains:
- A detailed description of the problem using XML documentation
- Learning objectives for the exercise
- Methods with TODO comments explaining what you need to implement
- Corresponding test files that validate your solution using xUnit

Follow these steps for each exercise:

1. Read the class and method XML documentation comments carefully
2. Locate the TODO comments in the code
3. Implement your solution by completing the code
4. Run the tests to verify your solution
5. When all tests pass, you've successfully completed the exercise!

## Key Differences from Java 📝

- **Boolean type**: C# uses `bool` instead of `boolean`
- **Nullable types**: C# has nullable reference types (enabled in these projects)
- **String comparison**: Use `.Equals()` for content comparison, not `==` (though `==` works for string literals due to interning)
- **Constants**: C# uses `const` for compile-time constants and `readonly` for runtime constants
- **Testing framework**: Uses xUnit instead of JUnit-style assertions

## Tips and Hints 💡

- Each exercise file contains detailed XML documentation explaining what you need to implement.
- Look for the `TODO` comments in each file to identify what you need to complete.
- The xUnit tests will help you verify if your implementation is correct.
- If a test fails, the error message will give you a hint about what's wrong.
- Pay attention to nullable reference type warnings - they're enabled to help you write safer code.

## Additional Challenges 🌟

After completing the basic exercises, try these additional challenges:

1. Write a program that uses all primitive types in a real-world scenario.
2. Create your own class with properties of different data types.
3. Explore C#'s value types vs reference types in more detail.
4. Practice working with collections like `List<T>` and `Dictionary<TKey, TValue>`.
5. Explore C# 12+ features like primary constructors and collection expressions.

## Feedback and Questions ❓

If you have any questions or need clarification on any exercise, please reach out to your instructor. 