package java;

/**
 * DataTypes6: Arrays and Collections Basics
 *
 * This exercise focuses on working with arrays in Java,
 * understanding how to declare, initialize, and manipulate array elements.
 *
 * Learning objectives:
 * - Declare and initialize arrays using different methods
 * - Access and modify array elements
 * - Iterate through arrays
 * - Understand array properties (length, fixed size)
 *
 * Note: This exercise uses assertions. Run with assertions enabled.
 */
public class ArraysAndCollections {

    public static void main(String[] args) {
        System.out.println("DataTypes6: Arrays and Collections Basics");

        try {
            testArrays();
            System.out.println("All tests passed! Your implementation is correct.");
        } catch (AssertionError e) {
            System.out.println("Test failed: " + e.getMessage());
        }
    }

    /**
     * This method demonstrates array operations.
     * TODO: Implement the following:
     * 1. Declare and initialize an array of integers 1 through 5 (using array literal)
     * 2. Declare and initialize an array of 3 strings (using new operator)
     * 3. Change the element at index 1 in the strings array to "Updated"
     * 4. Calculate the sum of all integers in the numbers array
     *
     * @return Object array containing:
     *         [numbersArray, stringsArray, updatedStringsArray, sum]
     */
    public static Object[] workWithArrays() {
        // TODO: Implement your solution here
        
        return new Object[]{null, null, null, 0};
    }

    private static void testArrays() {
        Object[] results = workWithArrays();
        
        assert results != null : "The returned array should not be null.";
        assert results.length == 4 : "The array should contain 4 elements.";
        
        // Test integer array
        assert results[0] instanceof int[] : "First element should be an int array.";
        int[] numbers = (int[])results[0];
        assert numbers.length == 5 : "Numbers array should have 5 elements.";
        for (int i = 0; i < 5; i++) {
            assert numbers[i] == i + 1 : "Element at index " + i + " should be " + (i + 1) + ". Got: " + numbers[i];
        }
        
        // Test strings array
        assert results[1] instanceof String[] : "Second element should be a String array.";
        String[] strings = (String[])results[1];
        assert strings.length == 3 : "Strings array should have 3 elements.";
        assert "First".equals(strings[0]) : "First string should be \"First\". Got: " + strings[0];
        assert "Second".equals(strings[1]) : "Second string should be \"Second\". Got: " + strings[1];
        assert "Third".equals(strings[2]) : "Third string should be \"Third\". Got: " + strings[2];
        
        // Test updated strings array
        assert results[2] instanceof String[] : "Third element should be a String array.";
        String[] updatedStrings = (String[])results[2];
        assert updatedStrings.length == 3 : "Updated strings array should have 3 elements.";
        assert "First".equals(updatedStrings[0]) : "First string should be \"First\". Got: " + updatedStrings[0];
        assert "Updated".equals(updatedStrings[1]) : "Second string should be \"Updated\". Got: " + updatedStrings[1];
        assert "Third".equals(updatedStrings[2]) : "Third string should be \"Third\". Got: " + updatedStrings[2];
        
        // Test sum
        assert results[3] instanceof Integer : "Fourth element should be an Integer.";
        assert (Integer)results[3] == 15 : "Sum of numbers 1 through 5 should be 15. Got: " + results[3];
    }
} 