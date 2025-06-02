package java;

/**
 * Exercise 6: Variable Lifetime and Memory (Stack vs. Heap)
 *
 * This exercise focuses on understanding the lifetime of variables and the difference
 * between stack and heap memory in Java.
 *
 * Learning objectives:
 * - Distinguish between local (stack) and object (heap) variables
 * - Understand when variables are created and destroyed
 * - Observe the effect of variable scope on lifetime
 *
 * Note: This exercise uses assertions. Run with the -ea flag:
 * java -ea Exercise6
 */
public class VariableLifetimeAndMemory {
    // Class-level (heap) variable
    private int heapVariable = 42;

    public static void main(String[] args) {
        System.out.println("Exercise 6: Variable Lifetime and Memory (Stack vs. Heap)");
        try {
            testLifetime();
            System.out.println("All tests passed! Your implementation is correct.");
        } catch (AssertionError e) {
            System.out.println("Test failed: " + e.getMessage());
        }
    }

    /**
     * Demonstrates variable lifetime and memory location.
     *
     * TODO: Implement this method to:
     * 1. Create a local variable (stack) and assign it a value
     * 2. Create an object of Exercise6 and access its heap variable
     * 3. Return an array with the values of both variables
     *
     * @return An array with [stackVariable, heapVariable]
     */
    public static int[] demonstrateLifetime() {
        // TODO: Implement your solution here
        
        return null; // Replace with your implementation
    }

    private static void testLifetime() {
        int[] values = demonstrateLifetime();
        assert values != null : "Returned array is null";
        assert values.length == 2 : "Array should have 2 elements";
        assert values[0] == 7 : "Stack variable should be 7";
        assert values[1] == 42 : "Heap variable should be 42";
    }
} 