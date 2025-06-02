package java;

/**
 * DataStructures1: Arrays Basics
 *
 * This exercise focuses on working with arrays in Java, including declaration,
 * initialization, accessing elements, and performing basic operations.
 *
 * Learning objectives:
 * - Create and initialize arrays using different approaches
 * - Access and modify array elements
 * - Perform common array operations (sum, find max/min, etc.)
 * - Understand array limitations (fixed size, same type elements)
 *
 * Note: This exercise uses assertions. Run with assertions enabled.
 */
public class ArrayBasics {

    public static void main(String[] args) {
        System.out.println("DataStructures1: Arrays Basics");

        try {
            testArrayCreation();
            testArrayOperations();
            System.out.println("All tests passed! Your implementation is correct.");
        } catch (AssertionError e) {
            System.out.println("Test failed: " + e.getMessage());
        }
    }

    /**
     * TODO: Implement a method that creates and initializes different types of collections.
     * Consider what data types are appropriate for different kinds of information.
     *
     * Requirements:
     * - Create and return three arrays:
     *   1. Integer array of size 5 with values [10, 20, 30, 40, 50]
     *   2. String array of size 3 with values ["apple", "banana", "cherry"]
     *   3. Boolean array of size 4 with values [true, false, true, false]
     *
     * @return Object array containing [intArray, stringArray, booleanArray]
     */
    public static Object[] createArrays() {
        // TODO: Implement your solution here
        
        int[] intArray = null; // Replace with your implementation
        
        String[] stringArray = null; // Replace with your implementation
        
        boolean[] booleanArray = null; // Replace with your implementation
        
        return new Object[]{intArray, stringArray, booleanArray};
    }

    /**
     * TODO: Implement a method that processes an array to extract useful information.
     * Consider what analytical operations could provide insights about the data.
     *
     * Requirements:
     * - Input: array of integers
     * - Calculate and return:
     *   1. Sum of all elements
     *   2. Maximum value
     *   3. Minimum value
     *   4. Average value (as double)
     *   5. New array with elements in reverse order
     *
     * @param array An array of integers
     * @return An array containing [sum, max, min, average, reversedArray]
     */
    public static Object[] performArrayOperations(int[] array) {
        // TODO: Implement your solution here
        
        int sum = 0; // Replace with your implementation
        
        int max = 0; // Replace with your implementation
        
        int min = 0; // Replace with your implementation
        
        double average = 0.0; // Replace with your implementation
        
        int[] reversed = null; // Replace with your implementation
        
        return new Object[]{sum, max, min, average, reversed};
    }

    private static void testArrayCreation() {
        Object[] arrays = createArrays();
        
        assert arrays != null : "The returned array should not be null.";
        assert arrays.length == 3 : "The array should contain 3 elements.";
        
        // Test integer array
        assert arrays[0] instanceof int[] : "First element should be an int array.";
        int[] intArray = (int[]) arrays[0];
        assert intArray.length == 5 : "Integer array should have 5 elements.";
        assert intArray[0] == 10 : "First element should be 10.";
        assert intArray[1] == 20 : "Second element should be 20.";
        assert intArray[2] == 30 : "Third element should be 30.";
        assert intArray[3] == 40 : "Fourth element should be 40.";
        assert intArray[4] == 50 : "Fifth element should be 50.";
        
        // Test string array
        assert arrays[1] instanceof String[] : "Second element should be a String array.";
        String[] stringArray = (String[]) arrays[1];
        assert stringArray.length == 3 : "String array should have 3 elements.";
        assert "apple".equals(stringArray[0]) : "First element should be 'apple'.";
        assert "banana".equals(stringArray[1]) : "Second element should be 'banana'.";
        assert "cherry".equals(stringArray[2]) : "Third element should be 'cherry'.";
        
        // Test boolean array
        assert arrays[2] instanceof boolean[] : "Third element should be a boolean array.";
        boolean[] booleanArray = (boolean[]) arrays[2];
        assert booleanArray.length == 4 : "Boolean array should have 4 elements.";
        assert booleanArray[0] : "First element should be true.";
        assert !booleanArray[1] : "Second element should be false.";
        assert booleanArray[2] : "Third element should be true.";
        assert !booleanArray[3] : "Fourth element should be false.";
    }

    private static void testArrayOperations() {
        int[] testArray = {5, 3, 9, 1, 7};
        Object[] results = performArrayOperations(testArray);
        
        assert results != null : "The returned array should not be null.";
        assert results.length == 5 : "The array should contain 5 elements.";
        
        // Test sum
        assert results[0] instanceof Integer : "First element should be an Integer.";
        assert (Integer) results[0] == 25 : "Sum should be 25.";
        
        // Test max
        assert results[1] instanceof Integer : "Second element should be an Integer.";
        assert (Integer) results[1] == 9 : "Max should be 9.";
        
        // Test min
        assert results[2] instanceof Integer : "Third element should be an Integer.";
        assert (Integer) results[2] == 1 : "Min should be 1.";
        
        // Test average
        assert results[3] instanceof Double : "Fourth element should be a Double.";
        assert Math.abs((Double) results[3] - 5.0) < 0.001 : "Average should be 5.0.";
        
        // Test reversed array
        assert results[4] instanceof int[] : "Fifth element should be an int array.";
        int[] reversed = (int[]) results[4];
        assert reversed.length == 5 : "Reversed array should have 5 elements.";
        assert reversed[0] == 7 : "First element should be 7.";
        assert reversed[1] == 1 : "Second element should be 1.";
        assert reversed[2] == 9 : "Third element should be 9.";
        assert reversed[3] == 3 : "Fourth element should be 3.";
        assert reversed[4] == 5 : "Fifth element should be 5.";
    }
} 