package javaexercises;

/**
 * Exercise 4: Reference Types and Variable Comparison
 * 
 * This exercise focuses on working with reference types (like String)
 * and understanding the difference between primitive and reference types
 * when it comes to comparison and assignment.
 * 
 * Learning objectives:
 * - Work with reference types (String, arrays)
 * - Understand the difference between == and .equals() for comparison
 * - Learn about value vs. reference assignment
 * 
 * Note: This exercise uses assertions. Run with the -ea flag:
 * java -ea Exercise4
 */
public class ReferenceTypesAndComparison {
    
    public static void main(String[] args) {
        System.out.println("Exercise 4: Reference Types and Variable Comparison");
        
        try {
            // Test the implementation
            testStringComparison();
            testArrayModification();
            
            System.out.println("All tests passed! Your implementation is correct.");
        } catch (AssertionError e) {
            System.out.println("Test failed: " + e.getMessage());
        }
    }
    
    /**
     * Evaluates string comparisons and returns the results.
     * 
     * TODO: Implement this method to demonstrate string comparison:
     * 1. Create two String variables with the value "Hello" using string literals
     * 2. Create a third String with the same value using the new operator
     * 3. Compare these strings using == and .equals()
     * 
     * @return An array of boolean values containing:
     *         [string1 == string2, string1 == string3, string1.equals(string3)]
     */
    public static boolean[] compareStrings() {
        // TODO: Implement your solution here
        
        return null; // Replace with your implementation
    }
    
    /**
     * Modifies an array to demonstrate pass-by-reference behavior.
     * 
     * TODO: Implement this method to demonstrate array modification:
     * 1. Create an integer array with values {1, 2, 3, 4, 5}
     * 2. Create a second reference to the same array
     * 3. Modify the original array by changing its first element to 99
     * 4. Return the second reference (which should reflect the change)
     * 
     * @return The second reference to the array
     */
    public static int[] modifyArray() {
        // TODO: Implement your solution here
        
        return null; // Replace with your implementation
    }
    
    /**
     * Tests the student's understanding of string comparison.
     */
    private static void testStringComparison() {
        // Get the comparison results
        boolean[] results = compareStrings();
        
        // Check if array is not null and has correct size
        assert results != null : "Your method returned null instead of an array of comparison results";
        assert results.length == 3 : "Your array should contain exactly 3 boolean results, but it contains " + results.length;
        
        // Test the comparison results - these should be true for a correct implementation
        assert results[0] == true : "Two string literals with the same value should be == to each other";
        assert results[1] == false : "A string literal and new String() with the same value should not be == to each other";
        assert results[2] == true : ".equals() should compare string content, not reference";
    }
    
    /**
     * Tests the student's understanding of pass-by-reference behavior.
     */
    private static void testArrayModification() {
        // Get the modified array
        int[] modifiedArray = modifyArray();
        
        // Check if array is not null and has correct size
        assert modifiedArray != null : "Your method returned null instead of an array";
        assert modifiedArray.length == 5 : "Your array should have 5 elements, but it has " + modifiedArray.length;
        
        // Test that the modification is reflected in the returned reference
        assert modifiedArray[0] == 99 : 
            "The first element of the array should be 99, but it is " + modifiedArray[0] + 
            ". This indicates that you haven't understood how reference types work.";
    }
} 