package java;

/**
 * Exercise 1: Basic Arithmetic Operators
 *
 * Scenario: You're building a calculator application that needs to perform
 * basic arithmetic operations. Users will input two numbers and expect
 * various calculations to be performed.
 *
 * Learning objectives:
 * - Use arithmetic operators (+, -, *, /, %)
 * - Perform calculations with variables
 * - Understand operator precedence
 * - Handle edge cases in arithmetic operations
 *
 * Note: This exercise uses assertions. Run with the -ea flag:
 * java -ea Exercise1
 */
public class ArithmeticOperators {
    public static void main(String[] args) {
        System.out.println("Exercise 1: Basic Arithmetic Operators");
        try {
            testArithmetic();
            System.out.println("All tests passed! Your implementation is correct.");
        } catch (AssertionError e) {
            System.out.println("Test failed: " + e.getMessage());
        }
    }

    /**
     * TODO: Implement a method that performs arithmetic operations on two numbers.
     * Consider what operations would be useful and how to organize the results.
     *
     * Requirements:
     * - Input: two integers a and b
     * - Output must be an array containing in this order:
     *   - Sum of a and b
     *   - Difference of a and b
     *   - Product of a and b
     *   - Integer division of a by b
     *   - Remainder of a divided by b
     *
     * @param a first integer operand
     * @param b second integer operand
     * @return array containing the results of various calculations
     */
    public static int[] basicArithmetic(int a, int b) {
        // TODO: Implement your solution here
        return null; // Replace with your implementation
    }

    private static void testArithmetic() {
        int[] result = basicArithmetic(10, 3);
        assert result != null : "Result array is null";
        assert result.length == 5 : "Result array should have 5 elements";
        assert result[0] == 13 : "Sum should be 13";
        assert result[1] == 7 : "Difference should be 7";
        assert result[2] == 30 : "Product should be 30";
        assert result[3] == 3 : "Quotient should be 3";
        assert result[4] == 1 : "Remainder should be 1";
    }
} 