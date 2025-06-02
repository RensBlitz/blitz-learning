package java;

/**
 * DataTypes8: Common Pitfalls and Best Practices
 *
 * This exercise focuses on identifying and avoiding common mistakes with data types in Java,
 * and applying best practices for data type usage.
 *
 * Learning objectives:
 * - Identify and fix common data type related issues
 * - Understand null references and uninitialized variables
 * - Apply best practices for type selection and conversion
 * - Recognize type-related error messages
 *
 * Note: This exercise uses assertions. Run with assertions enabled.
 */
public class DataTypeBestPractices {

    public static void main(String[] args) {
        System.out.println("DataTypes8: Common Pitfalls and Best Practices");

        try {
            testFixNullReference();
            testFixIntegerDivision();
            testFixStringEquality();
            System.out.println("All tests passed! Your implementation is correct.");
        } catch (AssertionError e) {
            System.out.println("Test failed: " + e.getMessage());
        }
    }

    /**
     * This method demonstrates fixing a null reference error.
     * TODO: Initialize the array before accessing its elements.
     * The current implementation throws a NullPointerException.
     *
     * @return An integer representing the sum of all elements in the array.
     */
    public static int fixNullReference() {
        // TODO: Fix the null reference issue
        // Create an array with elements 1, 2, 3 and return their sum
        
        return 0;
    }

    /**
     * This method demonstrates a common pitfall with integer division in Java.
     * TODO: Fix the division to get the correct result (2.5).
     * The current implementation incorrectly returns 2.
     *
     * @return The correct result of dividing 5 by 2 (should be 2.5).
     */
    public static double fixIntegerDivision() {
        // TODO: Fix the integer division issue
        // Divide 5 by 2 to get 2.5 (not 2)
        
        return 0.0;
    }

    /**
     * This method demonstrates a common pitfall with String comparison.
     * TODO: Fix the string comparison to correctly check if two strings have the same content.
     * The current implementation incorrectly uses == instead of .equals().
     *
     * @param s1 First string to compare
     * @param s2 Second string to compare
     * @return true if the strings have the same content, false otherwise.
     */
    public static boolean fixStringEquality(String s1, String s2) {
        // TODO: Fix the string comparison issue
        // Compare the content of the strings, not their references
        
        return false;
    }

    private static void testFixNullReference() {
        int sum = fixNullReference();
        assert sum == 6 : "The sum should be 6 (1+2+3). Got: " + sum;
    }

    private static void testFixIntegerDivision() {
        double result = fixIntegerDivision();
        assert Math.abs(result - 2.5) < 0.001 : "The result should be 2.5. Got: " + result;
    }

    private static void testFixStringEquality() {
        // These are different string instances with the same content
        String s1 = "Hello";
        String s2 = new String("Hello");
        
        boolean result = fixStringEquality(s1, s2);
        assert result : "Strings with the same content should be considered equal using .equals()";
    }
} 