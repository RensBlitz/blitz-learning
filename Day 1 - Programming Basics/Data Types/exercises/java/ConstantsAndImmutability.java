package java;

/**
 * DataTypes7: Constants and Immutability
 *
 * This exercise focuses on working with constants and understanding immutability in Java.
 * You'll learn about the 'final' keyword and how immutable types like String behave.
 *
 * Learning objectives:
 * - Understand and use the 'final' keyword for declaring constants
 * - Recognize the immutability of Strings and its implications
 * - Differentiate between constant variables and constant references
 *
 * Note: This exercise uses assertions. Run with assertions enabled.
 */
public class ConstantsAndImmutability {

    // TODO: Declare a class-level constant PI with value 3.14159
    // Your code here

    public static void main(String[] args) {
        System.out.println("DataTypes7: Constants and Immutability");

        try {
            testConstants();
            testImmutability();
            System.out.println("All tests passed! Your implementation is correct.");
        } catch (AssertionError e) {
            System.out.println("Test failed: " + e.getMessage());
        }
    }

    /**
     * This method demonstrates the use of constants with the 'final' keyword.
     * TODO: 
     * 1. Declare a final integer MAX_VALUE with value 100
     * 2. Try to uncomment the line that attempts to change MAX_VALUE
     *    and observe the compile-time error
     * 3. Declare a final array FIXED_ARRAY with values {1, 2, 3}
     * 4. Modify an element of the array (this is allowed because the array elements aren't final)
     *
     * @return Object array containing: [MAX_VALUE, FIXED_ARRAY]
     */
    public static Object[] workWithConstants() {
        // TODO: Implement your solution here
        
        // 1. Declare a final integer
        // Your code here (replace this line with your implementation)
        int MAX_VALUE = 0; // This should be final; replace with correct implementation
        
        // 2. Try to change the value (this will cause a compile error)
        // Uncomment to see the error:
        // MAX_VALUE = 200;
        
        // 3. Declare a final array
        // Your code here (replace this line with your implementation)
        int[] FIXED_ARRAY = null; // This should be final; replace with correct implementation
        
        // 4. Modify an element (allowed because the array reference is final, not its contents)
        // Uncomment and implement:
        // FIXED_ARRAY[0] = 99;
        
        return new Object[]{MAX_VALUE, FIXED_ARRAY};
    }

    /**
     * This method demonstrates the immutability of Strings.
     * TODO:
     * 1. Create a String named 'original' with value "Hello"
     * 2. Create another String 'modified' by concatenating original with " World"
     * 3. Check if 'original' was modified (it shouldn't be, as Strings are immutable)
     * 4. Return both strings
     *
     * @return Object array containing: [original, modified]
     */
    public static Object[] demonstrateStringImmutability() {
        // TODO: Implement your solution here
        
        // Create an original string
        String original = null; // Replace with actual implementation
        
        // Create a "modified" version
        String modified = null; // Replace with actual implementation
        
        return new Object[]{original, modified};
    }

    private static void testConstants() {
        Object[] results = workWithConstants();
        
        assert results != null : "The returned array should not be null.";
        assert results.length == 2 : "The array should contain 2 elements.";
        
        // Test MAX_VALUE
        assert results[0] instanceof Integer : "First element should be an Integer.";
        assert (Integer)results[0] == 100 : "MAX_VALUE should be 100. Got: " + results[0];
        
        // Test FIXED_ARRAY
        assert results[1] instanceof int[] : "Second element should be an int array.";
        int[] fixedArray = (int[])results[1];
        assert fixedArray.length == 3 : "FIXED_ARRAY should have 3 elements.";
        assert fixedArray[0] == 99 : "First element should be 99 (after modification). Got: " + fixedArray[0];
        assert fixedArray[1] == 2 : "Second element should be 2. Got: " + fixedArray[1];
        assert fixedArray[2] == 3 : "Third element should be 3. Got: " + fixedArray[2];
    }

    private static void testImmutability() {
        Object[] results = demonstrateStringImmutability();
        
        assert results != null : "The returned array should not be null.";
        assert results.length == 2 : "The array should contain 2 elements.";
        
        // Test original string
        assert results[0] instanceof String : "First element should be a String.";
        assert "Hello".equals(results[0]) : "Original string should be \"Hello\". Got: " + results[0];
        
        // Test modified string
        assert results[1] instanceof String : "Second element should be a String.";
        assert "Hello World".equals(results[1]) : "Modified string should be \"Hello World\". Got: " + results[1];
    }
} 