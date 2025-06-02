package javaexercises;

/**
 * Exercise 3: Logical Operators
 *
 * Scenario: You're developing a security system that needs to evaluate
 * multiple conditions to determine access permissions. The system uses
 * three different security checks that need to be combined in various ways.
 *
 * Learning objectives:
 * - Use && (AND), || (OR), and ! (NOT) operators
 * - Combine multiple boolean conditions
 * - Understand short-circuit evaluation
 * - Apply logical operators in real-world scenarios
 *
 * Note: This exercise uses assertions. Run with the -ea flag:
 * java -ea Exercise3
 */
public class LogicalOperators {
    public static void main(String[] args) {
        System.out.println("Exercise 3: Logical Operators");
        try {
            testLogical();
            System.out.println("All tests passed! Your implementation is correct.");
        } catch (AssertionError e) {
            System.out.println("Test failed: " + e.getMessage());
        }
    }

    /**
     * Scenario: The security system performs three types of checks:
     * - Primary authentication (e.g., password check)
     * - Secondary verification (e.g., biometric scan)
     * - Emergency override (e.g., administrator bypass)
     *
     * TODO: Design and implement a method that evaluates security conditions.
     * Consider:
     * - How should multiple security checks be combined?
     * - What combinations of conditions would grant or deny access?
     * - How can you optimize the evaluation order?
     * - What security implications does short-circuit evaluation have?
     * - How would you handle different security policies (e.g., strict vs. flexible)?
     *
     * @param primaryAuth result of primary authentication check
     * @param secondaryAuth result of secondary verification
     * @param emergencyOverride result of emergency override check
     * @return array of boolean results for different security scenarios
     */
    public static boolean[] logicalOps(boolean primaryAuth, boolean secondaryAuth, boolean emergencyOverride) {
        // TODO: Implement your solution here
        return null; // Replace with your implementation
    }

    private static void testLogical() {
        boolean[] result = logicalOps(true, false, true);
        assert result != null : "Result array is null";
        assert result.length == 5 : "Result array should have 5 elements";
        assert !result[0] : "true && false should be false";
        assert result[1] : "true || false should be true";
        assert !result[2] : "!true should be false";
        assert result[3] : "(true && false) || true should be true";
        assert result[4] : "true && (false || true) should be true";

        boolean[] result2 = logicalOps(false, false, false);
        assert !result2[0] : "false && false should be false";
        assert !result2[1] : "false || false should be false";
        assert result2[2] : "!false should be true";
        assert !result2[3] : "(false && false) || false should be false";
        assert !result2[4] : "false && (false || false) should be false";
    }
} 