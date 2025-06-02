/**
 * Exercise 7: Nested Control Structures
 * 
 * This exercise focuses on using nested loops and conditionals to solve more complex problems.
 * 
 * Learning objectives:
 * - Understand how to use nested loops effectively
 * - Learn to combine different control structures
 * - Practice writing clean, readable nested control structures
 * 
 * Note: This exercise uses assertions. Run with the -ea flag:
 * java -ea NestedControlStructures
 */
public class NestedControlStructures {
    
    public static void main(String[] args) {
        System.out.println("Exercise 7: Nested Control Structures");
        
        try {
            // Test the pattern printer
            testPrintPattern();
            
            // Test the 2D matrix sum calculator
            testCalculateMatrixSum();
            
            // Test the number of times a subarray appears
            testCountSubarrayOccurrences();
            
            System.out.println("All tests passed! Your implementation is correct.");
        } catch (AssertionError e) {
            System.out.println("Test failed: " + e.getMessage());
        }
    }
    
    /**
     * Tests the pattern printer implementation.
     */
    private static void testPrintPattern() {
        // Test various pattern sizes
        String pattern1 = generateRightTriangle(1);
        String expected1 = "*\n";
        assert pattern1.equals(expected1) : "Pattern of size 1 does not match expected output";
        
        String pattern2 = generateRightTriangle(3);
        String expected2 = "  *\n" +
                           " ***\n" +
                           "*****\n";
        assert pattern2.equals(expected2) : "Pattern of size 3 does not match expected output";
        
        String pattern3 = generateRightTriangle(5);
        String expected3 = "    *\n" +
                           "   ***\n" +
                           "  *****\n" +
                           " *******\n" +
                           "*********\n";
        assert pattern3.equals(expected3) : "Pattern of size 5 does not match expected output";
    }
    
    /**
     * Tests the 2D matrix sum calculator implementation.
     */
    private static void testCalculateMatrixSum() {
        // Test with a simple 2x2 matrix
        int[][] matrix1 = {
            {1, 2},
            {3, 4}
        };
        assert matrixSum(matrix1) == 10 : "Sum of [[1,2],[3,4]] should be 10";
        
        // Test with a 3x3 matrix
        int[][] matrix2 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        assert matrixSum(matrix2) == 45 : "Sum of 3x3 matrix with values 1-9 should be 45";
        
        // Test with an empty matrix
        int[][] matrix3 = {};
        assert matrixSum(matrix3) == 0 : "Sum of empty matrix should be 0";
        
        // Test with a matrix containing negative numbers
        int[][] matrix4 = {
            {-1, -2},
            {-3, -4}
        };
        assert matrixSum(matrix4) == -10 : "Sum of [[-1,-2],[-3,-4]] should be -10";
        
        // Test with a non-square matrix
        int[][] matrix5 = {
            {1, 2, 3},
            {4, 5, 6}
        };
        assert matrixSum(matrix5) == 21 : "Sum of [[1,2,3],[4,5,6]] should be 21";
    }
    
    /**
     * Tests the subarray occurrences counter implementation.
     */
    private static void testCountSubarrayOccurrences() {
        // Test with a simple case
        int[] array1 = {1, 2, 3, 1, 2, 3, 1, 2, 3};
        int[] subArray1 = {1, 2, 3};
        assert countSubarrayOccurrences(array1, subArray1) == 3 : "Subarray [1,2,3] should occur 3 times in the array";
        
        // Test with no occurrences
        int[] array2 = {1, 2, 3, 4, 5};
        int[] subArray2 = {6, 7, 8};
        assert countSubarrayOccurrences(array2, subArray2) == 0 : "Subarray [6,7,8] should occur 0 times in the array";
        
        // Test with a subarray of length 1
        int[] array3 = {1, 2, 1, 3, 1, 4, 1};
        int[] subArray3 = {1};
        assert countSubarrayOccurrences(array3, subArray3) == 4 : "Subarray [1] should occur 4 times in the array";
        
        // Test with a subarray longer than the array
        int[] array4 = {1, 2, 3};
        int[] subArray4 = {1, 2, 3, 4};
        assert countSubarrayOccurrences(array4, subArray4) == 0 : "Subarray longer than array should occur 0 times";
        
        // Test with an empty subarray
        int[] array5 = {1, 2, 3};
        int[] subArray5 = {};
        assert countSubarrayOccurrences(array5, subArray5) == 0 : "Empty subarray should occur 0 times";
    }
    
    /**
     * Generates a right-aligned triangle pattern.
     * 
     * TODO: Implement a method that generates a visual pattern.
     * Consider how to organize the pattern and build it step by step.
     *
     * Requirements:
     * - Input: size (integer representing height)
     * - Output: string containing a right-aligned triangle of asterisks (*) with height equal to size
     * - Pattern should look like (for size=4):
     *      *
     *     **
     *    ***
     *   ****
     *
     * @param size The height of the triangle
     * @return A string containing the pattern
     */
    public static String generateRightTriangle(int size) {
        // TODO: Implement your solution here
        return "";
    }
    
    /**
     * TODO: Implement a method that performs calculations on a multi-dimensional data structure.
     * Consider how to navigate through the structure and aggregate values.
     *
     * Requirements:
     * - Input: 2D array of integers
     * - Output: sum of all elements in the matrix
     *
     * @param matrix The 2D array to process
     * @return The sum of all elements
     */
    public static int matrixSum(int[][] matrix) {
        // TODO: Implement your solution here
        return 0;
    }
    
    /**
     * TODO: Implement a method that searches for patterns within data.
     * Consider how to identify sequences and handle edge cases.
     *
     * Requirements:
     * - Input: parent array and subarray of integers
     * - Output: count of how many times the subarray appears in the parent array
     * - The subarray must appear as a continuous sequence
     * - An empty subarray appears in every position (size+1 times)
     * - If the subarray is longer than the parent array, return 0
     *
     * @param array The parent array to search in
     * @param subArray The subarray to search for
     * @return The number of occurrences
     */
    public static int countSubarrayOccurrences(int[] array, int[] subArray) {
        // TODO: Implement your solution here
        return 0;
    }
} 