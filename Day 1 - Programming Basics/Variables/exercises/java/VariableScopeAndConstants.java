package java;

/**
 * Exercise 3: Variable Scope and Constants
 * 
 * This exercise focuses on understanding variable scope
 * and using constants in Java programs.
 * 
 * Learning objectives:
 * - Understand how variable scope works in Java
 * - Use the 'final' keyword to create constants
 * - Observe variable shadowing and its effects
 * 
 * Note: This exercise uses assertions. Run with the -ea flag:
 * java -ea Exercise3
 */
public class VariableScopeAndConstants {
    
    public static final double PI = 3.14159;
    
    public static void main(String[] args) {
        System.out.println("Exercise 3: Variable Scope and Constants");
        
        try {
            // Test the implementation
            testCircleCalculations();
            testScopeUnderstanding();
            
            System.out.println("All tests passed! Your implementation is correct.");
        } catch (AssertionError e) {
            System.out.println("Test failed: " + e.getMessage());
        }
    }
    
    /**
     * Calculates the area and circumference of a circle.
     * 
     * TODO: Implement this method to calculate:
     * 1. The area of a circle using the formula: PI * radius * radius
     * 2. The circumference of a circle using the formula: 2 * PI * radius
     * 
     * Use the PI constant that you declared at the class level.
     * 
     * @param radius The radius of the circle
     * @return An array with [area, circumference]
     */
    public static double[] calculateCircle(double radius) {
        // TODO: Implement your solution here
        
        return null; // Replace with your implementation
    }
    
    /**
     * Demonstrates understanding of variable scope and shadowing.
     * 
     * TODO: Implement this method to demonstrate your understanding of scope:
     * 1. Inside this method, create a variable x with value 10
     * 2. Create a code block (using curly braces {}) that:
     *    a. Declares another variable x with value 20 (shadowing the outer x)
     *    b. Returns the sum of both x values as seen from inside the block
     *
     * Note: This method tests your understanding of variable shadowing.
     * From inside the inner block, only the inner x is directly visible,
     * but the returned result should indicate your understanding of this
     * concept.
     * 
     * @return What would happen if you tried to add the outer and inner x
     *         variables from inside the inner block?
     *         Return the appropriate value or -1 if you think it's an error.
     */
    public static int demonstrateScope() {
        // TODO: Implement your solution here
        
        return -999; // Replace with your implementation
    }
    
    /**
     * Tests the student's implementation of circle calculations.
     */
    private static void testCircleCalculations() {
        // Test with radius 2.0
        double[] results = calculateCircle(2.0);
        
        // Check if array is not null and has correct size
        assert results != null : "Your method returned null instead of an array of results";
        assert results.length == 2 : "Your array should contain exactly 2 results, but it contains " + results.length;
        
        // Get expected values (calculated with PI as 3.14159)
        double expectedArea = 3.14159 * 2.0 * 2.0;
        double expectedCircumference = 2.0 * 3.14159 * 2.0;
        
        // Test calculations with a small tolerance for floating-point imprecision
        assert Math.abs(results[0] - expectedArea) < 0.0001 : 
            "The area calculation is incorrect. Expected " + expectedArea + " but got " + results[0];
        
        assert Math.abs(results[1] - expectedCircumference) < 0.0001 : 
            "The circumference calculation is incorrect. Expected " + expectedCircumference + 
            " but got " + results[1];
            
        // Attempt to directly access the constant to confirm it's defined correctly
        try {
            double pi = VariableScopeAndConstants.PI;
            assert Math.abs(pi - 3.14159) < 0.0001 : "PI should be defined as 3.14159";
        } catch (Error e) {
            throw new AssertionError("Failed to access the PI constant. Make sure it's " +
                                     "defined as a public static final double at the class level.");
        }
    }
    
    /**
     * Tests the student's understanding of variable scope.
     */
    private static void testScopeUnderstanding() {
        int result = demonstrateScope();
        
        // The correct answer is either 30 (if using a helper variable) or
        // -1 (if the student understands that direct access isn't possible)
        assert result == 30 || result == -1 : 
            "Your scope demonstration doesn't show correct understanding. " +
            "From inside the inner block, you either need to return 30 (if using a helper variable) " +
            "or -1 (if you understand that outer x isn't directly accessible by name in the inner block)";
    }
} 