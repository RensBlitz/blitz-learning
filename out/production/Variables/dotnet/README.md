# Variables Exercises 🏋️‍♀️

## Prerequisites ⚠️

Before attempting these exercises, please read the [Variables.md](../../Variables.md) file to understand the core concepts of variables in programming.

## Environment Setup 🔧

### Required Software
- **.NET 8.0 SDK** or higher
- **Visual Studio 2022**, **Visual Studio Code**, or **JetBrains Rider**
- **Git** (for version control)

### Installation Instructions

#### Install .NET 8.0 SDK
1. Visit [https://dotnet.microsoft.com/download](https://dotnet.microsoft.com/download)
2. Download and install the latest .NET 8.0 SDK for your operating system
3. Restart your terminal/command prompt after installation

#### IDE Options
**Visual Studio Code (Recommended for beginners):**
- Install VS Code from [https://code.visualstudio.com/](https://code.visualstudio.com/)
- Install the "C# Dev Kit" extension

**Visual Studio 2022:**
- Download from [https://visualstudio.microsoft.com/](https://visualstudio.microsoft.com/)
- Select the ".NET desktop development" workload during installation

**JetBrains Rider:**
- Download from [https://www.jetbrains.com/rider/](https://www.jetbrains.com/rider/)

### Verifying Your Setup
1. Check your .NET version:
   ```bash
   dotnet --version
   ```
   The output should show version 8.0.0 or higher.

2. Verify you can create a new project:
   ```bash
   dotnet new console -o test-project
   cd test-project
   dotnet run
   ```

### Running the Exercises

#### Using Command Line:
```bash
# Navigate to the exercise directory
cd "Day 1 - Programming Basics/Variables/exercises/dotnet"

# Run the tests to validate your solutions
dotnet test

# Run a specific exercise (console application)
dotnet run --project BasicVariableDeclaration
```

#### Using Visual Studio Code:
1. Open the `dotnet` folder in VS Code
2. Install recommended extensions when prompted
3. Open any `.cs` file
4. Press `F5` to run or `Ctrl+F5` to run without debugging
5. Use `Ctrl+Shift+P` and search "Test: Run All Tests" to run unit tests

#### Using Visual Studio 2022:
1. Open the `Variables.sln` solution file
2. Right-click any project and select "Set as Startup Project"
3. Press `F5` to run or `Ctrl+F5` to run without debugging
4. Use Test Explorer to run unit tests

## Project Structure 📂

This module contains a complete .NET solution with the following structure:

```
dotnet/
├── Variables.sln                          # Solution file
├── Variables.Exercises/                   # Main exercise implementations
│   ├── BasicVariableDeclaration.cs
│   ├── VariableAssignmentAndOperations.cs
│   ├── VariableScopeAndConstants.cs
│   ├── ReferenceTypesAndComparison.cs
│   ├── TypeConversionAndCasting.cs
│   ├── VariableLifetimeAndMemory.cs
│   ├── NamingConventionsAndBestPractices.cs
│   ├── CommonVariablePitfalls.cs
│   └── Variables.Exercises.csproj
└── Variables.Tests/                       # Unit tests to validate solutions
    ├── BasicVariableDeclarationTests.cs
    ├── [Other test files...]
    └── Variables.Tests.csproj
```

## Exercise Overview 📂

This module contains 8 progressively challenging exercises:

1. **BasicVariableDeclaration.cs**: Basic variable declaration and initialization
   - Declaring and initializing variables of different value types
   - Understanding C#'s basic data types

2. **VariableAssignmentAndOperations.cs**: Variable assignment and operations
   - Assigning values to variables
   - Performing basic arithmetic operations
   - Understanding operator precedence

3. **VariableScopeAndConstants.cs**: Variable scope and constants
   - Understanding variable scope and lifetime
   - Working with class-level variables
   - Creating and using constants with the `const` and `readonly` keywords
   - Experiencing variable shadowing

4. **ReferenceTypesAndComparison.cs**: Reference types and variable comparison
   - Understanding the difference between value and reference types
   - Learning about `==` vs `.Equals()` for comparison
   - Seeing how assignment works with value types vs references

5. **TypeConversionAndCasting.cs**: Type conversion and casting
   - Working with implicit type conversion (widening)
   - Performing explicit type casting (narrowing)
   - Converting between strings and other data types
   - Using `Convert` class and `Parse` methods

6. **VariableLifetimeAndMemory.cs**: Variable lifetime and memory (stack vs. heap)
   - Distinguish between local (stack) and object (heap) variables
   - Understand when variables are created and destroyed
   - Observe the effect of variable scope on lifetime

7. **NamingConventionsAndBestPractices.cs**: Naming conventions and best practices
   - Use descriptive, meaningful variable names
   - Follow C# naming conventions (PascalCase for methods, camelCase for locals)
   - Declare variables close to where they're first used
   - Avoid magic numbers and use constants

8. **CommonVariablePitfalls.cs**: Common pitfalls with variables
   - Recognize uninitialized variable errors
   - Understand variable shadowing
   - Avoid type confusion between value and reference types

## Completing the Exercises ✅

Each exercise consists of:
- **Implementation file** (.cs): Contains methods with TODO comments for you to implement
- **Test file** (Tests.cs): Contains xUnit tests that validate your solution

Follow these steps for each exercise:

1. Read the file header and method XML documentation comments carefully
2. Locate the TODO comments in the implementation code
3. Implement your solution by completing the methods
4. Run the tests to verify your solution: `dotnet test`
5. When all tests pass, you've successfully completed the exercise!

## Key Differences from Java 🔄

If you're coming from Java, note these important differences:

- **Testing Framework**: Uses xUnit instead of assertions
- **Data Types**: `bool` instead of `boolean`, `string` instead of `String`
- **Naming Conventions**: PascalCase for public members, camelCase for locals
- **Constants**: Use `const` for compile-time constants, `readonly` for runtime constants
- **Properties**: C# uses properties instead of getter/setter methods
- **Nullable Types**: C# has nullable reference types and value types

## Hints and Tips 💡

If you get stuck:
1. Review the relevant concepts in the [Variables.md](../../Variables.md) file
2. Look at the test failure messages to understand what the expected results are
3. Use the debugger to step through your code
4. Check for common issues like incorrect data types or naming convention mistakes

## Additional Challenges 🌟

After completing the basic exercises, try these additional challenges:

1. Explore nullable value types (`int?`, `bool?`) and how they differ from regular value types
2. Create a program that demonstrates memory usage differences between value and reference types
3. Implement a temperature converter using different numeric types and proper type conversion
4. Experiment with C# 12's new features like primary constructors and collection expressions

## Useful Commands 🛠️

```bash
# Create a new console application
dotnet new console -n MyProject

# Add a reference to another project
dotnet add reference ../OtherProject/OtherProject.csproj

# Install a NuGet package
dotnet add package PackageName

# Build the solution
dotnet build

# Run tests
dotnet test

# Run with detailed test output
dotnet test --verbosity normal
```

## Feedback and Questions ❓

If you have any questions or need clarification on any exercise, please reach out to your instructor.

This directory contains a series of exercises to help you understand and practice variable concepts in C#. 