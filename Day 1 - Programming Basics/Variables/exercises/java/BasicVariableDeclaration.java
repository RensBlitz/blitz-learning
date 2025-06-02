package java;

/**
 * Exercise 1: Basic Variable Declaration and Initialization
 *
 * This exercise focuses on declaring and initializing variables in Java.
 * You'll practice using different primitive data types and understand
 * how to store various types of values.
 *
 * Learning objectives:
 * - Declare variables of different primitive types
 * - Initialize variables with appropriate values
 * - Understand how to use basic data types in Java
 *
 * Note: This exercise uses assertions. Run with the -ea flag:
 * java -ea Exercise1
 */
public class BasicVariableDeclaration {

    public static void main(String[] args) {
        System.out.println("Exercise 1: Basic Variable Declaration and Initialization");

        try {
            // Test the implementation
            testStudentImplementation();

            System.out.println("All tests passed! Your implementation is correct.");
        } catch (AssertionError e) {
            System.out.println("Test failed: " + e.getMessage());
        }
    }

    /**
     * This method should declare and initialize four variables of different primitive types.
     *
     * TODO: Implement this method to create the following variables:
     * 1. An integer variable with value 25
     * 2. A double-precision floating-point variable with value 98.6
     * 3. A single character variable with value 'A'
     * 4. A boolean variable with value false
     *
     * Then return these variables in an array in the order specified above.
     *
     * Note: The return type is Object[] to allow different types in the array.
     *
     * @return An array containing the four variables in the specified order
     */
    public static Object[] createVariables() {
        // TODO: Implement your solution here

        // Return your variables in this array
        return null; // Replace with your implementation
    }

    /**
     * Tests the student's implementation.
     */
    private static void testStudentImplementation() {
        // Get the student's variables
        Object[] variables = createVariables();

        // Check if array is not null and has correct size
        assert variables != null : "Your method returned null instead of an array of variables";
        assert variables.length == 4 : "Your array should contain exactly 4 variables, but it contains " + variables.length;

        // Test the integer variable
        assert variables[0] instanceof Integer : "The first variable should be an integer (int)";
        assert ((Integer)variables[0]) == 25 : "The integer variable should be 25";

        // Test the double variable
        assert variables[1] instanceof Double : "The second variable should be a double";
        assert Math.abs(((Double)variables[1]) - 98.6) < 0.0001 : "The double variable should be 98.6";

        // Test the character variable
        assert variables[2] instanceof Character : "The third variable should be a character (char)";
        assert ((Character)variables[2]) == 'A' : "The character variable should be 'A'";

        // Test the boolean variable
        assert variables[3] instanceof Boolean : "The fourth variable should be a boolean";
        assert ((Boolean)variables[3]) == false : "The boolean variable should be false";
    }
}