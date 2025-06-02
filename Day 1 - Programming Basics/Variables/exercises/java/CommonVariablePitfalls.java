package java;

/**
 * Exercise 8: Common Pitfalls with Variables
 *
 * This exercise focuses on identifying and avoiding common pitfalls when working with variables in Java.
 *
 * Learning objectives:
 * - Recognize uninitialized variable errors
 * - Understand variable shadowing
 * - Avoid type confusion between primitives and reference types
 *
 * Note: This exercise uses assertions. Run with the -ea flag:
 * java -ea Exercise8
 */
public class CommonVariablePitfalls {
    public static void main(String[] args) {
        System.out.println("Exercise 8: Common Pitfalls with Variables");
        try {
            testPitfalls();
            System.out.println("All tests passed! Your implementation is correct.");
        } catch (AssertionError e) {
            System.out.println("Test failed: " + e.getMessage());
        }
    }

    /**
     * Demonstrates common pitfalls and how to avoid them.
     *
     * TODO: Implement this method to:
     * 1. Properly initialize all variables before use
     * 2. Avoid variable shadowing (use different names for inner and outer variables)
     * 3. Correctly compare strings using .equals(), not ==
     *
     * @return true if all best practices are followed, false otherwise
     */
    public static boolean avoidPitfalls() {
        int outerValue = 5;
        // Avoid shadowing by using a different name
        int innerValue = 10;
        String s1 = "test";
        String s2 = new String("test");
        boolean stringEquals = s1.equals(s2); // Correct way
        // All variables are initialized, no shadowing, correct comparison
        return (outerValue == 5 && innerValue == 10 && stringEquals);
    }

    private static void testPitfalls() {
        assert avoidPitfalls() : "You must avoid uninitialized variables, shadowing, and use .equals() for string comparison.";
    }
} 