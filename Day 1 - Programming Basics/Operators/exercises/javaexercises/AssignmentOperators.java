package javaexercises;

/**
 * Exercise 4: Assignment and Compound Operators
 *
 * Practice using assignment (=) and compound assignment operators (+=, -=, *=, /=, %=) in Java.
 *
 * Learning objectives:
 * - Use assignment and compound assignment operators
 * - Update variable values efficiently
 * - Practice chaining operations
 *
 * Note: This exercise uses assertions. Run with the -ea flag:
 * java -ea Exercise4
 */
public class AssignmentOperators {
    public static void main(String[] args) {
        System.out.println("Exercise 4: Assignment and Compound Operators");
        try {
            testCompound();
            System.out.println("All tests passed! Your implementation is correct.");
        } catch (AssertionError e) {
            System.out.println("Test failed: " + e.getMessage());
        }
    }

    /**
     * Applies a series of compound assignments to an integer.
     *
     * TODO: Implement this method to:
     * 1. Start with the value 'start'
     * 2. Add 'add' to it (+=)
     * 3. Subtract 'subtract' from it (-=)
     * 4. Multiply by 'multiply' (*=)
     * 5. Divide by 'divide' (/=)
     * 6. Take the remainder with 'modulus' (%=)
     * Return the final value.
     *
     * @param start initial value
     * @param add value to add
     * @param subtract value to subtract
     * @param multiply value to multiply
     * @param divide value to divide
     * @param modulus value for modulus
     * @return the final result after all operations
     */
    public static int compoundOps(int start, int add, int subtract, int multiply, int divide, int modulus) {
        // TODO: Implement your solution here
        return 0; // Replace with your implementation
    }

    private static void testCompound() {
        int result = compoundOps(5, 3, 2, 4, 3, 2);
        // Calculation: (((((5 + 3) - 2) * 4) / 3) % 2)
        // Steps: 5+3=8, 8-2=6, 6*4=24, 24/3=8, 8%2=0
        assert result == 0 : "Expected 0, got " + result;

        int result2 = compoundOps(10, 5, 3, 2, 4, 3);
        // 10+5=15, 15-3=12, 12*2=24, 24/4=6, 6%3=0
        assert result2 == 0 : "Expected 0, got " + result2;
    }
} 