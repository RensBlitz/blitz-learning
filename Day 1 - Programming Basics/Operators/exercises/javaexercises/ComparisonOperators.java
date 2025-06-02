package javaexercises;

/**
 * Exercise 2: Comparison and Relational Operators
 *
 * Practice using equality, inequality, and relational operators in Java.
 *
 * Learning objectives:
 * - Use ==, !=, >, <, >=, <= operators
 * - Compare numbers and variables
 * - Practice boolean expressions
 *
 * Note: This exercise uses assertions. Run with the -ea flag:
 * java -ea Exercise2
 */
public class ComparisonOperators {
    public static void main(String[] args) {
        System.out.println("Exercise 2: Comparison and Relational Operators");
        try {
            testComparisons();
            System.out.println("All tests passed! Your implementation is correct.");
        } catch (AssertionError e) {
            System.out.println("Test failed: " + e.getMessage());
        }
    }

    /**
     * TODO: Implement a method that evaluates relationships between values.
     * Consider what comparisons would be meaningful and how to represent the results.
     *
     * Requirements:
     * - Input: two integers a and b
     * - Output: boolean array containing these comparison results in order:
     *   1. a equals b
     *   2. a not equals b
     *   3. a greater than b
     *   4. a less than b
     *   5. a greater than or equal to b
     *   6. a less than or equal to b
     *
     * @param a First integer to compare
     * @param b Second integer to compare
     * @return Boolean array with comparison results
     */
    public static boolean[] compareValues(int a, int b) {
        // TODO: Implement your solution here
        return null;
    }

    private static void testComparisons() {
        boolean[] result = compareValues(5, 3);
        assert result != null : "Result array is null";
        assert result.length == 6 : "Result array should have 6 elements";
        assert !result[0] : "5 == 3 should be false";
        assert result[1] : "5 != 3 should be true";
        assert result[2] : "5 > 3 should be true";
        assert !result[3] : "5 < 3 should be false";
        assert result[4] : "5 >= 3 should be true";
        assert !result[5] : "5 <= 3 should be false";

        boolean[] result2 = compareValues(4, 4);
        assert result2[0] : "4 == 4 should be true";
        assert !result2[1] : "4 != 4 should be false";
        assert !result2[2] : "4 > 4 should be false";
        assert !result2[3] : "4 < 4 should be false";
        assert result2[4] : "4 >= 4 should be true";
        assert result2[5] : "4 <= 4 should be true";
    }
} 