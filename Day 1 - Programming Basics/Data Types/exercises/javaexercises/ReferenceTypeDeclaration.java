package javaexercises;

/**
 * DataTypes2: Reference Type Declaration and Initialization
 *
 * This exercise focuses on declaring and initializing reference types, specifically String and arrays.
 * You'll understand the difference between reference types and primitive types.
 *
 * Learning objectives:
 * - Declare and initialize String variables
 * - Declare and initialize array variables (e.g., int[])
 * - Understand that reference variables hold memory addresses (references)
 * - Differentiate behavior from primitive types
 *
 * Note: This exercise uses assertions. Run with assertions enabled.
 */
public class ReferenceTypeDeclaration {

    public static void main(String[] args) {
        System.out.println("DataTypes2: Reference Type Declaration and Initialization");

        try {
            testReferenceTypes();
            System.out.println("All tests passed! Your implementation is correct.");
        } catch (AssertionError e) {
            System.out.println("Test failed: " + e.getMessage());
        }
    }

    /**
     * This method should declare and initialize two reference type variables:
     * 1. A String variable named 'name' with value "Alice"
     * 2. An integer array named 'numbers' initialized with values {1, 2, 3}
     *
     * TODO: Implement this method to create and initialize the variables as described.
     * Then, return these variables in an Object array in the order: [name, numbers].
     *
     * @return An Object array containing the two initialized reference variables.
     */
    public static Object[] declareAndInitializeReferenceTypes() {
        // TODO: Implement your solution here
        String name = null;     // Placeholder
        int[] numbers = null;  // Placeholder

        return new Object[]{name, numbers};
    }

    /**
     * Tests the student's implementation.
     */
    private static void testReferenceTypes() {
        Object[] values = declareAndInitializeReferenceTypes();

        assert values != null : "The returned array should not be null.";
        assert values.length == 2 : "The array should contain 2 elements.";

        assert values[0] instanceof String : "First element should be a String.";
        assert "Alice".equals(values[0]) : "Name should be \"Alice\". Got: " + values[0];

        assert values[1] instanceof int[] : "Second element should be an int array.";
        int[] numbersArray = (int[]) values[1];
        assert numbersArray != null : "Numbers array should not be null.";
        assert numbersArray.length == 3 : "Numbers array should have 3 elements. Got: " + numbersArray.length;
        assert numbersArray[0] == 1 : "First element of numbers array should be 1. Got: " + numbersArray[0];
        assert numbersArray[1] == 2 : "Second element of numbers array should be 2. Got: " + numbersArray[1];
        assert numbersArray[2] == 3 : "Third element of numbers array should be 3. Got: " + numbersArray[2];
    }
} 