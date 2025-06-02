# Variables Exercises 🏋️‍♀️

## Prerequisites ⚠️

Before attempting these exercises, please read the [Variables.md](../../Variables.md) file to understand the core concepts of variables in programming.

## Environment Setup 🔧

### Required Software
- Java Development Kit (JDK) 21 or higher
- IntelliJ IDEA (recommended) or any Java IDE
- Git (for version control)

### Verifying Your Setup
1. Check your Java version:
   ```bash
   java -version
   ```
   The output should show version 21 or higher.

2. Make sure your IDE is configured to use the correct JDK.

### Running with Assertions Enabled

These exercises use Java assertions to validate your solutions. To run them properly:

#### Using Command Line:
```bash
# Navigate to the exercise directory
cd traineeship-learning/Day\ 1\ -\ Programming\ Basics/Variables/exercises

# Compile the Java file
javac Topic1.java

# Run with assertions enabled
java -ea Topic1
```

#### Using IntelliJ IDEA:
1. Open the project in IntelliJ IDEA
2. Go to Run > Edit Configurations
3. Add the VM option: `-ea`
4. Apply and run the exercises

## Exercise Overview 📂

This module contains 8 progressively challenging exercises:

1. **Topic1.java**: Basic variable declaration and initialization
   - Declaring and initializing variables of different primitive types
   - Understanding Java's basic data types

2. **Topic2.java**: Variable assignment and operations
   - Assigning values to variables
   - Performing basic arithmetic operations
   - Understanding operator precedence

3. **Topic3.java**: Variable scope and constants
   - Understanding variable scope and lifetime
   - Working with class-level variables
   - Creating and using constants with the `final` keyword
   - Experiencing variable shadowing

4. **Topic4.java**: Reference types and variable comparison
   - Understanding the difference between primitive and reference types
   - Learning about `==` vs `.equals()` for comparison
   - Seeing how assignment works with primitives vs references

5. **Topic5.java**: Type conversion and casting
   - Working with implicit type conversion (widening)
   - Performing explicit type casting (narrowing)
   - Converting between strings and other data types

6. **Topic6.java**: Variable lifetime and memory (stack vs. heap)
   - Distinguish between local (stack) and object (heap) variables
   - Understand when variables are created and destroyed
   - Observe the effect of variable scope on lifetime

7. **Topic7.java**: Naming conventions and best practices
   - Use descriptive, meaningful variable names
   - Follow Java naming conventions (camelCase)
   - Declare variables close to where they're first used
   - Avoid magic numbers and use constants

8. **Topic8.java**: Common pitfalls with variables
   - Recognize uninitialized variable errors
   - Understand variable shadowing
   - Avoid type confusion between primitives and reference types

## Completing the Exercises ✅

Each exercise file contains:
- A detailed description of the problem
- Learning objectives for the exercise
- Methods with TODO comments explaining what you need to implement
- Assertions that automatically validate your solution

Follow these steps for each exercise:

1. Read the file header and method JavaDoc comments carefully
2. Locate the TODO comments in the code
3. Implement your solution by uncommenting and completing the code
4. Run the file with assertions enabled to verify your solution
5. When all assertions pass, you've successfully completed the exercise!

## Hints and Tips 💡

If you get stuck:
1. Review the relevant concepts in the [Variables.md](../../Variables.md) file
2. Look at the assertion messages to understand what the expected results are
3. Make sure you're running the code with assertions enabled (`-ea` flag)
4. Check for common issues like typos or forgotten semicolons

## Additional Challenges 🌟

After completing the basic exercises, try these additional challenges:

1. Modify the exercises to work with other primitive types not covered (byte, short, float)
2. Create a program that demonstrates memory usage differences between primitive and reference types
3. Implement a temperature converter that handles different numeric types and unit conversions
4. Experiment with Java 21's new pattern matching features with different variable types

## Feedback and Questions ❓

If you have any questions or need clarification on any exercise, please reach out to your instructor.

This directory contains a series of exercises to help you understand and practice variable concepts in Java.

## How to Run the Exercises in IntelliJ

**The only thing you need to do is mark the `exercises` folder as a source root in IntelliJ.**

1. Open the project in IntelliJ IDEA.
2. In the Project view, right-click the `exercises` folder.
3. Select **"Mark Directory as" → "Sources Root"**.
4. Open any `ExerciseN.java` file (where N is 1-8).
5. Click the green "Run" arrow next to the `main` method or at the top of the file to run the exercise.

That's it! You do not need to use the command line or Maven for these exercises.

## Exercise Overview

1. **Exercise 1: Basic Variable Declaration and Initialization**
   - Practice declaring variables of different primitive types
   - Initialize variables with appropriate values
   - Understand basic data types in Java

2. **Exercise 2: Variable Assignment and Arithmetic Operations**
   - Assign values to variables
   - Perform basic arithmetic operations (+, -, *, /, %)
   - Understand operator precedence

3. **Exercise 3: Variable Scope and Constants**
   - Understand how variable scope works in Java
   - Use the 'final' keyword to create constants
   - Learn about variable shadowing

4. **Exercise 4: Reference Types and Variable Comparison**
   - Work with reference types (String, arrays)
   - Understand the difference between == and .equals() for comparison
   - Learn about value vs. reference assignment

5. **Exercise 5: Type Conversion and Casting**
   - Understand implicit type conversion (widening)
   - Apply explicit type casting (narrowing)
   - Learn about potential data loss during conversions
   - Practice converting between different data types

6. **Exercise 6: Variable Lifetime and Memory (Stack vs. Heap)**
   - Distinguish between local (stack) and object (heap) variables
   - Understand when variables are created and destroyed
   - Observe the effect of variable scope on lifetime

7. **Exercise 7: Naming Conventions and Best Practices**
   - Use descriptive, meaningful variable names
   - Follow Java naming conventions (camelCase)
   - Declare variables close to where they're first used
   - Avoid magic numbers and use constants

8. **Exercise 8: Common Pitfalls with Variables**
   - Recognize uninitialized variable errors
   - Understand variable shadowing
   - Avoid type confusion between primitives and reference types

## Tips

- Each exercise file contains detailed comments explaining what you need to implement.
- Look for the `TODO` comments in each file to identify what you need to complete.
- The assertion tests will help you verify if your implementation is correct.
- If an assertion fails, the error message will give you a hint about what's wrong.

## IDE Setup (IntelliJ IDEA)

1. Open the project by selecting the parent directory containing the pom.xml file
2. IntelliJ will automatically recognize it as a Maven project
3. To run an exercise with assertions enabled:
   - Right-click on the exercise file
   - Select "Modify Run Configuration"
   - Add `-ea` to the VM options
   - Run the configuration 