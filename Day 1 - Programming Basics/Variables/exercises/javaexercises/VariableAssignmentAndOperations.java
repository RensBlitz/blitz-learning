package javaexercises;

/**
 * Exercise 2: Variable Assignment and Arithmetic Operations
 * 
 * This exercise focuses on assigning values to variables and
 * performing basic arithmetic operations with those variables.
 * 
 * Learning objectives:
 * - Assign values to variables
 * - Perform basic arithmetic operations (+, -, *, /, %)
 * - Understand operator precedence and associativity
 * 
 * Note: This exercise uses assertions. Run with the -ea flag:
 * java -ea Exercise2
 */
public class VariableAssignmentAndOperations {
    
    public static void main(String[] args) {
        System.out.println("Exercise 2: Variable Assignment and Arithmetic Operations");
        
        try {
            // Test the implementation
            testCalculations();
            
            System.out.println("All tests passed! Your implementation is correct.");
        } catch (AssertionError e) {
            System.out.println("Test failed: " + e.getMessage());
        }
    }
    
    /**
     * Performs arithmetic operations and returns the results.
     * 
     * TODO: Implement this method to perform these calculations:
     * 1. Create two integer variables with values 10 and 3
     * 2. Calculate their sum
     * 3. Calculate their difference
     * 4. Calculate their product
     * 5. Calculate the integer division result (10 / 3)
     * 6. Calculate the remainder (10 % 3)
     * 
     * @return An array containing the results in the order:
     *         [sum, difference, product, quotient, remainder]
     */
    public static int[] performCalculations() {
        // TODO: Implement your solution here
        
        return null; // Replace with your implementation
    }
    
    /**
     * Tests the student's implementation of arithmetic operations.
     */
    private static void testCalculations() {
        // Get the student's calculation results
        int[] results = performCalculations();
        
        // Check if array is not null and has correct size
        assert results != null : "Your method returned null instead of an array of results";
        assert results.length == 5 : "Your array should contain exactly 5 results, but it contains " + results.length;
        
        // Test each arithmetic operation
        assert results[0] == 13 : "The sum should be 13";
        assert results[1] == 7 : "The difference should be 7";
        assert results[2] == 30 : "The product should be 30";
        assert results[3] == 3 : "The quotient should be 3";
        assert results[4] == 1 : "The remainder should be 1";
    }
    
    /*
     * Expected successful output:
     * 
     * Exercise 2: Variable Assignment and Arithmetic Operations
     * All tests passed! Your implementation is correct.
     * 
     * If a test fails, you'll see which assertion failed and why.
     */
} 