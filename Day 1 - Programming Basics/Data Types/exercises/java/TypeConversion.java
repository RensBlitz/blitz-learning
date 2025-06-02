package java;

/**
 * DataTypes4: Type Conversion (Widening and Narrowing)
 *
 * This exercise focuses on type conversion in Java, covering both implicit (widening)
 * and explicit (narrowing) conversions.
 *
 * Learning objectives:
 * - Understand and perform widening conversions (e.g., int to double)
 * - Understand and perform narrowing conversions (e.g., double to int) using casting
 * - Recognize potential data loss during narrowing conversions
 *
 * Note: This exercise uses assertions. Run with assertions enabled.
 */
public class TypeConversion {

    public static void main(String[] args) {
        System.out.println("DataTypes4: Type Conversion (Widening and Narrowing)");

        try {
            testWideningConversion();
            testNarrowingConversion();
            System.out.println("All tests passed! Your implementation is correct.");
        } catch (AssertionError e) {
            System.out.println("Test failed: " + e.getMessage());
        }
    }

    /**
     * Demonstrates widening conversion (implicit).
     * TODO: Assign an int value to a double variable. Observe that no explicit cast is needed.
     * Return the double variable.
     *
     * @param intValue The integer value to be converted.
     * @return The converted double value.
     */
    public static double performWidening(int intValue) {
        // TODO: Implement your solution here
        double doubleValue = 0.0; // Placeholder
        return doubleValue; // Replace with your implementation
    }

    /**
     * Demonstrates narrowing conversion (explicit casting).
     * TODO: Assign a double value to an int variable using an explicit cast.
     * Return the int variable.
     *
     * @param doubleValue The double value to be converted.
     * @return The converted int value (potentially with data loss).
     */
    public static int performNarrowing(double doubleValue) {
        // TODO: Implement your solution here
        int intValue = 0; // Placeholder
        return intValue; // Replace with your implementation
    }

    private static void testWideningConversion() {
        double result = performWidening(100);
        assert Math.abs(result - 100.0) < 0.001 : "Widening 100 to double should be 100.0. Got: " + result;
    }

    private static void testNarrowingConversion() {
        int result = performNarrowing(123.75);
        assert result == 123 : "Narrowing 123.75 to int should be 123 (data loss). Got: " + result;
        int result2 = performNarrowing(99.99);
        assert result2 == 99 : "Narrowing 99.99 to int should be 99. Got: " + result2;
    }
} 