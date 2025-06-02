package java;

/**
 * PrimitiveTypeDeclaration: Primitive Type Declaration and Initialization
 *
 * This exercise focuses on declaring and initializing variables of different primitive types in Java.
 * You'll practice using int, double, char, and boolean, and understand their default values and assignments.
 *
 * Learning objectives:
 * - Declare variables of different primitive types (int, double, char, boolean)
 * - Initialize variables with appropriate values
 * - Understand default values for primitive types (though not explicitly tested here)
 * - Perform basic assignments
 *
 * Note: This exercise uses assertions. Run with assertions enabled.
 */
public class PrimitiveTypeDeclaration {

    public static void main(String[] args) {
        System.out.println("DataTypes1: Primitive Type Declaration and Initialization");

        try {
            testPrimitives();
            System.out.println("All tests passed! Your implementation is correct.");
        } catch (AssertionError e) {
            System.out.println("Test failed: " + e.getMessage());
        }
    }

    /**
     * This method should declare and initialize four variables:
     * 1. An integer variable named 'age' with value 30
     * 2. A double variable named 'price' with value 19.99
     * 3. A character variable named 'grade' with value 'A'
     * 4. A boolean variable named 'isActive' with value true
     *
     * TODO: Implement this method to create and initialize the variables as described.
     * Then, return these variables in an Object array in the order: [age, price, grade, isActive].
     *
     * @return An Object array containing the four initialized variables.
     */
    public static Object[] declareAndInitializePrimitives() {
        // TODO: Implement your solution here
        int age = 0;      // Placeholder
        double price = 0.0; // Placeholder
        char grade = ' ';   // Placeholder
        boolean isActive = false; // Placeholder

        // Replace placeholders with actual initialization
        // Example: age = 30;

        return new Object[]{age, price, grade, isActive}; // Replace with your initialized variables
    }

    /**
     * Tests the student's implementation.
     */
    private static void testPrimitives() {
        Object[] values = declareAndInitializePrimitives();

        assert values != null : "The returned array should not be null.";
        assert values.length == 4 : "The array should contain 4 elements.";

        assert values[0] instanceof Integer : "First element should be an Integer.";
        assert (Integer) values[0] == 30 : "Age should be 30. Got: " + values[0];

        assert values[1] instanceof Double : "Second element should be a Double.";
        assert Math.abs((Double) values[1] - 19.99) < 0.001 : "Price should be 19.99. Got: " + values[1];

        assert values[2] instanceof Character : "Third element should be a Character.";
        assert (Character) values[2] == 'A' : "Grade should be 'A'. Got: " + values[2];

        assert values[3] instanceof Boolean : "Fourth element should be a Boolean.";
        assert (Boolean) values[3] : "isActive should be true. Got: " + values[3];
    }
} 