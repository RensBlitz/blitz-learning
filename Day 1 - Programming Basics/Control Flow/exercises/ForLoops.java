/**
 * Exercise 2: For Loops
 * 
 * This exercise focuses on using for loops to iterate through sequences, arrays, and perform calculations.
 * 
 * Learning objectives:
 * - Understand basic for loop structure and syntax
 * - Learn to iterate through arrays and collections
 * - Practice nested for loops for multi-dimensional data
 * 
 * Note: This exercise uses assertions. Run with the -ea flag:
 * java -ea ForLoops
 */
public class ForLoops {
    
    public static void main(String[] args) {
        System.out.println("Exercise 2: For Loops");
        
        try {
            // Test the sum calculator
            testSumCalculator();
            
            // Test the array element doubler
            testArrayElementDoubler();
            
            // Test the multiplication table generator
            testMultiplicationTableGenerator();
            
            System.out.println("All tests passed! Your implementation is correct.");
        } catch (AssertionError e) {
            System.out.println("Test failed: " + e.getMessage());
        }
    }
    
    /**
     * Tests the sum calculator implementation.
     */
    private static void testSumCalculator() {
        assert calculateSum(5) == 15 : "Sum of numbers 1 to 5 should be 15";
        assert calculateSum(10) == 55 : "Sum of numbers 1 to 10 should be 55";
        assert calculateSum(1) == 1 : "Sum of numbers 1 to 1 should be 1";
        assert calculateSum(0) == 0 : "Sum of numbers 1 to 0 should be 0";
    }
    
    /**
     * Tests the array element doubler implementation.
     */
    private static void testArrayElementDoubler() {
        // Test with positive numbers
        int[] original1 = {1, 2, 3, 4, 5};
        int[] expected1 = {2, 4, 6, 8, 10};
        int[] result1 = doubleArrayElements(original1);
        assertArraysEqual(result1, expected1, "Array doubling test with positive numbers failed");
        
        // Test with negative numbers
        int[] original2 = {-1, -2, -3, -4, -5};
        int[] expected2 = {-2, -4, -6, -8, -10};
        int[] result2 = doubleArrayElements(original2);
        assertArraysEqual(result2, expected2, "Array doubling test with negative numbers failed");
        
        // Test with mixed numbers
        int[] original3 = {0, 1, -2, 3, -4};
        int[] expected3 = {0, 2, -4, 6, -8};
        int[] result3 = doubleArrayElements(original3);
        assertArraysEqual(result3, expected3, "Array doubling test with mixed numbers failed");
        
        // Test with empty array
        int[] original4 = {};
        int[] expected4 = {};
        int[] result4 = doubleArrayElements(original4);
        assertArraysEqual(result4, expected4, "Array doubling test with empty array failed");
    }
    
    /**
     * Tests the multiplication table generator implementation.
     */
    private static void testMultiplicationTableGenerator() {
        // Test 3x3 multiplication table
        int[][] expected1 = {
            {1, 2, 3},
            {2, 4, 6},
            {3, 6, 9}
        };
        int[][] result1 = generateMultiplicationTable(3);
        assertArraysEqual2D(result1, expected1, "3x3 multiplication table test failed");
        
        // Test 5x5 multiplication table
        int[][] expected2 = {
            {1, 2, 3, 4, 5},
            {2, 4, 6, 8, 10},
            {3, 6, 9, 12, 15},
            {4, 8, 12, 16, 20},
            {5, 10, 15, 20, 25}
        };
        int[][] result2 = generateMultiplicationTable(5);
        assertArraysEqual2D(result2, expected2, "5x5 multiplication table test failed");
        
        // Test 1x1 multiplication table
        int[][] expected3 = {{1}};
        int[][] result3 = generateMultiplicationTable(1);
        assertArraysEqual2D(result3, expected3, "1x1 multiplication table test failed");
    }
    
    /**
     * Helper method to assert that two arrays are equal.
     */
    private static void assertArraysEqual(int[] actual, int[] expected, String message) {
        assert actual.length == expected.length : message + " - Arrays have different lengths";
        
        for (int i = 0; i < actual.length; i++) {
            assert actual[i] == expected[i] : message + " - Element at index " + i + " differs";
        }
    }
    
    /**
     * Helper method to assert that two 2D arrays are equal.
     */
    private static void assertArraysEqual2D(int[][] actual, int[][] expected, String message) {
        assert actual.length == expected.length : message + " - Arrays have different number of rows";
        
        for (int i = 0; i < actual.length; i++) {
            assert actual[i].length == expected[i].length : message + " - Row " + i + " has different length";
            
            for (int j = 0; j < actual[i].length; j++) {
                assert actual[i][j] == expected[i][j] : message + " - Element at [" + i + "][" + j + "] differs";
            }
        }
    }
    
    /**
     * TODO: Implement a method that calculates a running total up to a given number.
     * Consider how to accumulate values in a sequence.
     *
     * Requirements:
     * - Input: positive integer n
     * - Output: sum of all integers from 1 to n inclusive
     * - Example: for n=5, return 1+2+3+4+5 = 15
     *
     * @param n The upper limit of the sequence
     * @return The sum of the sequence
     */
    public static int calculateSum(int n) {
        // TODO: Implement your solution here
        return 0;
    }
    
    /**
     * TODO: Implement a method that transforms each element in a collection.
     * Consider how to modify values while preserving the collection structure.
     *
     * Requirements:
     * - Input: array of integers
     * - Output: same array with each element multiplied by 2
     * - Must modify the input array, not create a new one
     *
     * @param array The array to modify
     */
    public static void transformArray(int[] array) {
        // TODO: Implement your solution here
    }
    
    /**
     * TODO: Implement a method that generates a mathematical pattern.
     * Consider how values in different positions relate to each other.
     *
     * Requirements:
     * - Input: positive integer n
     * - Output: n×n array where each element [i][j] contains i×j
     * - Example: for n=3, return:
     *   [[1,2,3],
     *    [2,4,6],
     *    [3,6,9]]
     *
     * @param n The size of the table
     * @return The multiplication table as a 2D array
     */
    public static int[][] createPattern(int n) {
        // TODO: Implement your solution here
        return null;
    }
    
    /**
     * Creates a new array where each element is twice the value of the corresponding element in the input array.
     * 
     * TODO: Implement this method to double each element in the input array.
     * The original array should not be modified.
     * 
     * Examples:
     * - doubleArrayElements({1, 2, 3}) should return {2, 4, 6}
     * - doubleArrayElements({0, -1, 5}) should return {0, -2, 10}
     * 
     * @param arr The input array
     * @return A new array with each element doubled
     */
    public static int[] doubleArrayElements(int[] arr) {
        // TODO: Implement your solution here using a for loop
        return null; // Replace with your implementation
    }
    
    /**
     * Generates a multiplication table of size n x n.
     * 
     * TODO: Implement this method to create a multiplication table where each element [i][j]
     * is the product of (i+1) and (j+1).
     * 
     * Example: 
     * generateMultiplicationTable(3) should return:
     * {
     *   {1, 2, 3},
     *   {2, 4, 6},
     *   {3, 6, 9}
     * }
     * 
     * @param n The size of the multiplication table
     * @return A 2D array representing the multiplication table
     */
    public static int[][] generateMultiplicationTable(int n) {
        // TODO: Implement your solution here using nested for loops
        return null; // Replace with your implementation
    }
} 