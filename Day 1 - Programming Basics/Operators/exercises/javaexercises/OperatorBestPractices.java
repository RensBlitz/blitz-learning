package javaexercises;

/**
 * Exercise 5: Operator Pitfalls and Best Practices
 *
 * Identify and avoid common mistakes with operators, and apply best practices for clarity.
 *
 * Learning objectives:
 * - Recognize and fix common operator mistakes (e.g., = vs ==, precedence)
 * - Use parentheses to clarify expressions
 * - Write clear and correct expressions
 *
 * Note: This exercise uses assertions. Run with the -ea flag:
 * java -ea Exercise5
 */
public class OperatorBestPractices {
    public static void main(String[] args) {
        System.out.println("Exercise 5: Operator Pitfalls and Best Practices");
        try {
            testPitfalls();
            System.out.println("All tests passed! Your implementation is correct.");
        } catch (AssertionError e) {
            System.out.println("Test failed: " + e.getMessage());
        }
    }

    /**
     * Evaluates and fixes common operator pitfalls.
     *
     * TODO: Implement this method to:
     * 1. Return true if x is even (use % and == correctly)
     * 2. Return the result of (a + b) * c (use parentheses for correct precedence)
     * 3. Return true if both a and b are positive (use &&)
     *
     * @param x integer to check for evenness
     * @param a first integer
     * @param b second integer
     * @param c third integer
     * @return Object array: [isEven (Boolean), result (Integer), bothPositive (Boolean)]
     */
    public static Object[] fixPitfalls(int x, int a, int b, int c) {
        // TODO: Implement your solution here
        return null; // Replace with your implementation
    }

    private static void testPitfalls() {
        Object[] result = fixPitfalls(4, 2, 3, 5);
        assert result != null : "Result array is null";
        assert result.length == 3 : "Result array should have 3 elements";
        assert Boolean.TRUE.equals(result[0]) : "4 should be even";
        assert Integer.valueOf(25).equals(result[1]) : "(2+3)*5 should be 25";
        assert Boolean.TRUE.equals(result[2]) : "2 and 3 should both be positive";

        Object[] result2 = fixPitfalls(7, -1, 2, 4);
        assert Boolean.FALSE.equals(result2[0]) : "7 should not be even";
        assert Integer.valueOf(4).equals(result2[1]) : "(-1+2)*4 should be 4";
        assert Boolean.FALSE.equals(result2[2]) : "-1 and 2 are not both positive";
    }
} 