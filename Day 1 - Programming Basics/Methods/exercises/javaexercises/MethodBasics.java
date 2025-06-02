package javaexercises;

/**
 * Methods1: Method Basics - Declaration and Invocation
 *
 * This exercise focuses on the fundamentals of creating and calling methods in Java.
 * You'll learn how to define methods with different return types and parameters,
 * and how to invoke them properly.
 *
 * Learning objectives:
 * - Understand method signatures (name, parameters, return type)
 * - Create methods that return values and methods that don't (void)
 * - Pass arguments to methods and handle the returned values
 * - Call methods from the main method and from other methods
 *
 * Note: This exercise uses assertions. Run with assertions enabled.
 */
public class MethodBasics {

    public static void main(String[] args) {
        System.out.println("Methods1: Method Basics - Declaration and Invocation");

        try {
            testGreetMethod();
            testAddNumbers();
            testIsEven();
            testGetFullName();
            System.out.println("All tests passed! Your implementation is correct.");
        } catch (AssertionError e) {
            System.out.println("Test failed: " + e.getMessage());
        }
    }

    /**
     * This method should print a greeting message to the console.
     * 
     * TODO: Implement a method that prints "Hello, World!" to the console.
     * This method should not take any parameters and should not return any value.
     */
    public static void greet() {
        // TODO: Implement your solution here
    }

    /**
     * This method should add two numbers and return the result.
     * 
     * TODO: Implement a method that:
     * 1. Takes two integer parameters
     * 2. Adds them together
     * 3. Returns the sum
     *
     * @param a The first number to add
     * @param b The second number to add
     * @return The sum of a and b
     */
    public static int addNumbers(int a, int b) {
        // TODO: Implement your solution here
        return 0; // Replace with your implementation
    }

    /**
     * This method should determine if a number is even.
     * 
     * TODO: Implement a method that:
     * 1. Takes an integer parameter
     * 2. Returns true if the number is even, false otherwise
     * 
     * Hint: A number is even if dividing by 2 gives no remainder.
     *
     * @param number The number to check
     * @return true if the number is even, false otherwise
     */
    public static boolean isEven(int number) {
        // TODO: Implement your solution here
        return false; // Replace with your implementation
    }

    /**
     * This method should combine a first name and last name into a full name.
     * 
     * TODO: Implement a method that:
     * 1. Takes two String parameters: firstName and lastName
     * 2. Combines them with a space in between
     * 3. Returns the full name
     * 
     * Example: If firstName is "John" and lastName is "Doe", return "John Doe"
     *
     * @param firstName The first name
     * @param lastName The last name
     * @return The full name in the format "firstName lastName"
     */
    public static String getFullName(String firstName, String lastName) {
        // TODO: Implement your solution here
        return null; // Replace with your implementation
    }

    // Test methods
    private static void testGreetMethod() {
        // We can't easily test console output with assertions, so we'll just call the method
        System.out.println("Testing greet method:");
        greet();
        // Visual inspection required for this test
    }

    private static void testAddNumbers() {
        int result1 = addNumbers(5, 3);
        assert result1 == 8 : "5 + 3 should equal 8, but got " + result1;
        
        int result2 = addNumbers(-2, 7);
        assert result2 == 5 : "-2 + 7 should equal 5, but got " + result2;
        
        int result3 = addNumbers(0, 0);
        assert result3 == 0 : "0 + 0 should equal 0, but got " + result3;
    }

    private static void testIsEven() {
        boolean result1 = isEven(4);
        assert result1 : "4 should be even, but isEven(4) returned false";
        
        boolean result2 = isEven(7);
        assert !result2 : "7 should be odd, but isEven(7) returned true";
        
        boolean result3 = isEven(0);
        assert result3 : "0 should be even, but isEven(0) returned false";
        
        boolean result4 = isEven(-2);
        assert result4 : "-2 should be even, but isEven(-2) returned false";
    }

    private static void testGetFullName() {
        String result1 = getFullName("John", "Doe");
        assert "John Doe".equals(result1) : 
            "getFullName(\"John\", \"Doe\") should return \"John Doe\", but got \"" + result1 + "\"";
        
        String result2 = getFullName("Alice", "Smith");
        assert "Alice Smith".equals(result2) : 
            "getFullName(\"Alice\", \"Smith\") should return \"Alice Smith\", but got \"" + result2 + "\"";
        
        String result3 = getFullName("", "");
        assert " ".equals(result3) : 
            "getFullName(\"\", \"\") should return \" \", but got \"" + result3 + "\"";
    }
} 