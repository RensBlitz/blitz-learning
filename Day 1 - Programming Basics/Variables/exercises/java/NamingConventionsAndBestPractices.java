package java;

/**
 * Exercise 7: Naming Conventions and Best Practices
 *
 * This exercise focuses on using proper naming conventions and best practices for variables in Java.
 *
 * Learning objectives:
 * - Use descriptive, meaningful variable names
 * - Follow Java naming conventions (camelCase)
 * - Declare variables close to where they're first used
 * - Avoid magic numbers and use constants
 *
 * Note: This exercise uses assertions. Run with the -ea flag:
 * java -ea Exercise7
 */
public class NamingConventionsAndBestPractices {
    public static final double TAX_RATE = 0.21; // Example of a constant

    public static void main(String[] args) {
        System.out.println("Exercise 7: Naming Conventions and Best Practices");
        try {
            testNaming();
            System.out.println("All tests passed! Your implementation is correct.");
        } catch (AssertionError e) {
            System.out.println("Test failed: " + e.getMessage());
        }
    }

    /**
     * Demonstrates naming conventions and best practices.
     *
     * TODO: Implement this method to:
     * 1. Declare a variable for a user's age (use a good name)
     * 2. Declare a variable for a product price (use a good name)
     * 3. Calculate the price including tax using the TAX_RATE constant
     * 4. Return an array with [age, price, priceWithTax]
     *
     * @return An array with [age, price, priceWithTax]
     */
    public static Object[] demonstrateNaming() {
        int userAge = 30;
        double productPrice = 100.0;
        double priceWithTax = productPrice * (1 + TAX_RATE);
        return new Object[] { userAge, productPrice, priceWithTax };
    }

    private static void testNaming() {
        Object[] values = demonstrateNaming();
        assert values != null : "Returned array is null";
        assert values.length == 3 : "Array should have 3 elements";
        assert values[0] instanceof Integer && (Integer)values[0] == 30 : "userAge should be 30";
        assert values[1] instanceof Double && Math.abs((Double)values[1] - 100.0) < 0.0001 : "productPrice should be 100.0";
        assert values[2] instanceof Double && Math.abs((Double)values[2] - 121.0) < 0.0001 : "priceWithTax should be 121.0";
    }
} 