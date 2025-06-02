# Exercise Creation Guidelines

This document outlines the standards for creating programming exercises for the Java Traineeship modules.

## General Principles

1. **Simplicity First**: Each exercise should focus on a single concept or a small set of related concepts.
2. **Progressive Difficulty**: Exercises should start simple and gradually increase in complexity.
3. **Self-Contained**: Each exercise file should be runnable on its own without external dependencies.
4. **Clarity**: Instructions should be clear and concise, with examples where appropriate.
5. **Testability**: Include proper assertions to validate the correctness of the solution automatically.
6. **Learning by Doing**: Exercises should require students to write their own code, not just fill in blanks.

## Exercise Structure

### File Organization
- Create 8 exercise files for each topic (NameOfTopic.java through NameOfTopicN.java)
- Place all exercises in the `exercises` directory inside the topic folder
- Include a README.md in the exercises directory with an overview of all exercises and clear IntelliJ running instructions (see below)

### Individual Exercise Files

Each exercise file should follow this structure:

1. **File Structure**:
   - No package declaration is needed for standalone exercises
   - Each file must contain exactly one public class matching the filename
   - The class must include a public static void main method

2. **Header Comment Block**:
   - Title and exercise number
   - Brief description of what the exercise covers
   - 2-4 specific learning objectives
   - Instructions for running with assertions enabled

3. **Main Method**:
   - Code to test the implementation using assertions
   - Clear error messages if assertions fail
   - Avoid unnecessary complexity in the test logic
   - Always wrap assertion testing in a try-catch block for AssertionError

4. **Method(s) to Implement**:
   - Method signatures with clear parameter and return type definitions
   - Thorough JavaDoc comments explaining expected behavior
   - TODO comments indicating what students need to implement
   - **IMPORTANT**: Do NOT include commented-out solutions or direct implementation hints

## Validation Approach

- Use assertions to validate results, not implementation details
- Test the behavior and output, not how the student achieved it
- Design tests to allow for multiple valid implementations
- Provide helper methods for testing instead of examining specific variables
- Include clear error messages that explain what went wrong but don't reveal the solution

## Ensuring Exercises Are Runnable in IntelliJ

- **The only thing you need to do is mark the `exercises` folder as a source root in IntelliJ.**
- Instruct students to:
  1. Open the project in IntelliJ IDEA.
  2. In the Project view, right-click the `exercises` folder.
  3. Select "Mark Directory as" → "Sources Root".
  4. Open any `ExerciseN.java` file (where N is 1-5).
  5. Click the green "Run" arrow next to the `main` method or at the top of the file to run the exercise.
- Do **not** include command line or Maven instructions in the README for the exercises folder.

## Exercise Complexity Guidelines

1. **Exercise 1**: Basic concept introduction
   - Focus on the most fundamental aspects of the topic
   - Target completion time: 5-10 minutes
   - Simple implementation with clear requirements

2. **Exercise 2**: Simple application
   - Apply the basic concept in a slightly more practical context
   - Target completion time: 10-15 minutes
   - Multiple steps but straightforward implementation

3. **Exercise 3**: Concept expansion
   - Introduce additional aspects of the topic
   - Target completion time: 15-20 minutes
   - Requires combining multiple concepts

4. **Exercise 4**: Problem-solving
   - Apply concepts to solve a more complex problem
   - Target completion time: 20-30 minutes
   - Multiple valid approaches to reach a solution

5. **Exercise 5**: Integration
   - Combine the topic with previously learned concepts
   - Target completion time: 30-45 minutes
   - Open-ended with specific requirements

## Example Exercise Template

```java
/**
 * Exercise X: [Title]
 * 
 * [Brief description of what this exercise covers and what the student will learn]
 * 
 * Learning objectives:
 * - [Objective 1]
 * - [Objective 2]
 * 
 * Note: This exercise uses assertions. Run with the -ea flag:
 * java -ea ExerciseX
 */
public class ExerciseX {
    
    public static void main(String[] args) {
        System.out.println("Exercise X: [Title]");
        
        try {
            // Call method(s) to test student implementation
            testStudentImplementation();
            
            System.out.println("All tests passed! Your implementation is correct.");
        } catch (AssertionError e) {
            System.out.println("Test failed: " + e.getMessage());
        }
    }
    
    /**
     * Tests the student's implementation.
     */
    private static void testStudentImplementation() {
        // Test with various inputs
        ReturnType result1 = studentMethod(params1);
        ReturnType result2 = studentMethod(params2);
        
        // Assert correct behavior
        assert condition1 : "Error message explaining what went wrong";
        assert condition2 : "Another error message";
    }
    
    /**
     * [Description of what this method should do]
     * 
     * TODO: Implement this method to [clear goal description].
     * The method should [explanation of expected behavior].
     * 
     * Examples:
     * - For input X, the expected output is Y
     * - For input A, the expected output is B
     * 
     * @param [param] [description]
     * @return [description of return value]
     */
    public static [ReturnType] studentMethod([parameters]) {
        // TODO: Implement your solution here
        
        // Return statement placeholder
        return null; // Replace with your implementation
    }
}
```

## Example README.md for Exercises

The README.md in the exercises directory should include:

```markdown
# [Topic] Exercises

This directory contains a series of exercises to help you understand and practice [topic] concepts in Java.

## How to Run the Exercises in IntelliJ

**The only thing you need to do is mark the `exercises` folder as a source root in IntelliJ.**

1. Open the project in IntelliJ IDEA.
2. In the Project view, right-click the `exercises` folder.
3. Select "Mark Directory as" → "Sources Root".
4. Open any `ExerciseN.java` file (where N is 1-5).
5. Click the green "Run" arrow next to the `main` method or at the top of the file to run the exercise.

That's it! You do not need to use the command line or Maven for these exercises.

## Exercise Overview

[List and describe each exercise]

## Tips

- Each exercise file contains detailed comments explaining what you need to implement.
- Look for the `TODO` comments in each file to identify what you need to complete.
- The assertion tests will help you verify if your implementation is correct.
- If an assertion fails, the error message will give you a hint about what's wrong.
```

## Final Notes

- Never include "fill in the blank" style exercises where students just uncomment code
- Avoid overly specific error messages that reveal the implementation
- Encourage experimentation and multiple approaches to solve problems
- Ensure that your assertions test the behavior, not the specific implementation
- Consider providing separately accessible solution files for instructors only
- Test all exercises in IntelliJ to ensure they run correctly as described above 