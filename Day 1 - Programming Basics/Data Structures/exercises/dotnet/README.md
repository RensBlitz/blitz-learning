# Data Structures Exercises 🏗️

## Prerequisites ⚠️

Before attempting these exercises, please read the [DataStructures.md](../../DataStructures.md) file to understand the core concepts of data structures in programming.

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
cd "Day 1 - Programming Basics/Data Structures/exercises/dotnet"

# Run the tests to validate your solutions
dotnet test

# Build the solution
dotnet build

# Run tests with detailed output
dotnet test --verbosity normal
```

#### Using Visual Studio Code:
1. Open the `dotnet` folder in VS Code
2. Install recommended extensions when prompted
3. Open any `.cs` file
4. Use `Ctrl+Shift+P` and search "Test: Run All Tests" to run unit tests
5. Use the Test Explorer to run individual tests

#### Using Visual Studio 2022:
1. Open the `DataStructures.sln` solution file
2. Use Test Explorer to run unit tests
3. Build the solution with `Ctrl+Shift+B`

## Project Structure 📂

This module contains a complete .NET solution with the following structure:

```
dotnet/
├── DataStructures.sln                     # Solution file
├── DataStructures.Exercises.csproj        # Main exercise implementations project
├── DataStructures.Tests.csproj            # Unit tests project
├── ArrayBasics.cs                         # Exercise 1: Basic array operations
├── ListOperations.cs                      # Exercise 2: Dynamic list operations
├── StackAndQueue.cs                       # Exercise 3: Stack and Queue structures
├── DictionaryOperations.cs                # Exercise 4: Key-value collections
├── SetOperations.cs                       # Exercise 5: Unique element collections
├── CollectionIteration.cs                 # Exercise 6: Iteration techniques
├── NestedCollections.cs                   # Exercise 7: Complex nested structures
├── DataStructureSelection.cs              # Exercise 8: Choosing right structures
├── ArrayBasicsTests.cs                    # Tests for Exercise 1
└── README.md                              # This file
```

## Exercise Overview 📂

This module contains 8 progressively challenging exercises:

1. **ArrayBasics.cs**: Basic array declaration and operations
   - Creating and initializing arrays of different types
   - Performing calculations (sum, max, min, average)
   - Array reversal and manipulation

2. **ListOperations.cs**: Dynamic list operations using `List<T>`
   - Creating and initializing lists
   - Adding, updating, and removing elements
   - Searching and sorting operations

3. **StackAndQueue.cs**: Stack (LIFO) and Queue (FIFO) structures
   - Understanding push/pop operations for stacks
   - Understanding enqueue/dequeue operations for queues
   - Practical applications (string reversal, palindrome checking)

4. **DictionaryOperations.cs**: Key-value collections using `Dictionary<K,V>`
   - Creating and manipulating dictionaries
   - Fast key-based lookups and updates
   - Practical applications (word frequency counting)

5. **SetOperations.cs**: Unique element collections using `HashSet<T>`
   - Working with sets for unique elements
   - Set operations (union, intersection, difference)
   - Understanding when to use sets vs other collections

6. **CollectionIteration.cs**: Various iteration techniques
   - Traditional for loops vs foreach loops
   - Working with enumerators
   - Introduction to LINQ for collection processing
   - Filtering and transforming collections

7. **NestedCollections.cs**: Complex nested data structures
   - Lists of lists (2D structures)
   - Dictionaries containing lists
   - Lists containing dictionaries
   - Complex organizational data modeling

8. **DataStructureSelection.cs**: Choosing the right data structure
   - Performance considerations for different scenarios
   - Analyzing requirements to select optimal structures
   - Advanced scenarios (LRU cache implementation)

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

## Key C# Collections Used 📚

This exercise series introduces you to C#'s core collection types:

- **Arrays** (`int[]`, `string[]`): Fixed-size, indexed collections
- **List&lt;T&gt;** (`List<int>`, `List<string>`): Dynamic arrays that can grow/shrink
- **Dictionary&lt;K,V&gt;** (`Dictionary<string, int>`): Key-value pairs for fast lookups
- **HashSet&lt;T&gt;** (`HashSet<string>`): Unordered collections of unique elements
- **Stack&lt;T&gt;** (`Stack<int>`): LIFO (Last In, First Out) collection
- **Queue&lt;T&gt;** (`Queue<string>`): FIFO (First In, First Out) collection

## C# Specific Features 🌟

This exercise series also introduces important C# concepts:

- **Generics**: Type-safe collections (`List<T>`, `Dictionary<K,V>`)
- **LINQ**: Language Integrated Query for collection processing
- **Nullable Reference Types**: Using `null!` for placeholders
- **XML Documentation**: Triple-slash comments (`///`)
- **xUnit Testing**: Modern unit testing framework for .NET

## Key Differences from Java 🔄

If you're coming from Java, note these important differences:

- **Collections**: `List<T>` instead of `ArrayList`, `Dictionary<K,V>` instead of `HashMap`
- **Iteration**: `foreach` instead of enhanced for loops
- **LINQ**: Powerful built-in query capabilities (like Java Streams but more integrated)
- **Naming**: `Count` property instead of `size()` method
- **Testing**: xUnit instead of JUnit/assertions
- **Nullability**: Explicit nullable reference types in modern C#

## Hints and Tips 💡

If you get stuck:
1. Review the relevant concepts in the [DataStructures.md](../../DataStructures.md) file
2. Look at the test failure messages to understand expected results
3. Use IntelliSense in your IDE to explore available methods
4. Check the official documentation: [docs.microsoft.com](https://docs.microsoft.com/en-us/dotnet/)
5. Use the debugger to step through your code

## Common Pitfalls to Avoid ⚠️

- **Index out of bounds**: Remember that C# collections are zero-indexed
- **Null reference exceptions**: Initialize your collections before using them
- **Modifying collections while iterating**: Use `ToList()` or iterate backwards when removing items
- **Case sensitivity**: C# is case-sensitive (`Count` vs `count`)
- **LINQ confusion**: Remember that LINQ methods return new collections, they don't modify the original

## Additional Challenges 🌟

After completing the basic exercises, try these additional challenges:

1. Implement a custom generic data structure (e.g., a binary tree)
2. Compare performance of different collection types for various operations
3. Explore thread-safe collections (`ConcurrentDictionary`, etc.)
4. Implement advanced LINQ queries with complex filtering and grouping
5. Create a real-world application using multiple data structures together

## Useful Commands 🛠️

```bash
# Build the solution
dotnet build

# Run all tests
dotnet test

# Run tests with detailed output
dotnet test --verbosity normal

# Run tests for a specific class
dotnet test --filter "ArrayBasicsTests"

# Clean and rebuild
dotnet clean && dotnet build

# Create a new console application (for experimentation)
dotnet new console -n MyExperiment
```

## Performance Considerations 📊

As you work through these exercises, consider:

- **Arrays**: Fixed size, very fast access, but can't resize
- **Lists**: Dynamic sizing, slightly slower than arrays, most versatile
- **Dictionaries**: O(1) average lookup time, perfect for key-value scenarios
- **Sets**: O(1) contains checks, automatic duplicate removal
- **Stacks/Queues**: Optimized for specific access patterns

## Feedback and Questions ❓

If you have any questions or need clarification on any exercise, please reach out to your instructor.

This directory contains a series of exercises to help you understand and practice data structure concepts in C#. Each exercise builds upon the previous ones, so it's recommended to complete them in order. 