# Control Flow Exercises - .NET

This directory contains .NET exercises for learning control flow concepts in C#.

## Prerequisites

- .NET 8.0 SDK or later
- A code editor (Visual Studio, Visual Studio Code, or Rider)

## Running the Exercises

### Building the Projects

```bash
# Build the main exercises project
dotnet build ControlFlow.Exercises.csproj

# Build the test project
dotnet build ControlFlow.Tests.csproj
```

### Running Tests

```bash
# Run all tests
dotnet test ControlFlow.Tests.csproj

# Run tests for a specific class
dotnet test --filter "ClassName=IfElseStatementsTests"

# Run a specific test method
dotnet test --filter "MethodName=ClassifyGrade_ShouldReturnCorrectGrades"
```

## Exercises Overview

1. **IfElseStatements.cs** - Basic conditional logic with if-else statements
2. **ForLoops.cs** - Iteration and array manipulation using for loops
3. **WhileLoops.cs** - Conditional iteration with while loops
4. **SwitchStatements.cs** - Multi-branch decisions using switch statements
5. **TernaryOperator.cs** - Compact conditional expressions using the ternary operator
6. **NestedControlStructures.cs** - Complex problems using nested loops and conditionals
7. **GuardClauses.cs** - Clean code practices with guard clauses and early returns
8. **BreakAndContinue.cs** - Loop control with break and continue statements

## Exercise Instructions

Each exercise file contains:
- Method stubs with TODO comments
- Detailed requirements in XML documentation
- Examples of expected behavior

To complete an exercise:
1. Open the corresponding `.cs` file
2. Find the methods marked with `TODO` comments
3. Implement the logic according to the requirements
4. Run the tests to verify your solution

## Example: Implementing a Method

```csharp
public static string ClassifyGrade(int score)
{
    // TODO: Implement your solution here
    if (score >= 90) return "A";
    if (score >= 80) return "B";
    if (score >= 70) return "C";
    if (score >= 60) return "D";
    return "F";
}
```

## Testing Your Solutions

All exercises come with comprehensive unit tests. Use them to:
- Verify your implementation is correct
- Understand the expected behavior
- Test edge cases

## Learning Objectives

By completing these exercises, you will learn:
- How to use conditional statements effectively
- When to choose different types of loops
- How to write clean, readable control flow code
- Best practices for handling complex conditional logic
- How to refactor nested code using guard clauses

## Tips

- Start with the simpler exercises (IfElse, ForLoops) before moving to complex ones
- Read the test cases to understand what the method should do
- Use the debugger to step through your code if you encounter issues
- Focus on writing clean, readable code, not just making tests pass 