package java;

/**
 * Methods3: Method Scope and Variable Visibility
 *
 * This exercise focuses on understanding variable scope within methods,
 * including local variables, parameters, and class-level variables.
 *
 * Learning objectives:
 * - Understand the scope of variables in different contexts
 * - Use local variables within methods
 * - Learn how method parameters work and their scope
 * - See how class variables differ from local variables in visibility
 *
 * Note: This exercise uses assertions. Run with assertions enabled.
 */
public class MethodScope {
    // Class-level variable (visible to all methods in the class)
    private static int classCounter = 0;

    public static void main(String[] args) {
        System.out.println("Methods3: Method Scope and Variable Visibility");

        try {
            testLocalVariables();
            testIncrementCounter();
            testScopeIsolation();
            testParameterScope();
            System.out.println("All tests passed! Your implementation is correct.");
        } catch (AssertionError e) {
            System.out.println("Test failed: " + e.getMessage());
        }
    }

    /**
     * This method demonstrates local variable scope.
     * 
     * TODO: Implement a method that:
     * 1. Declares a local variable 'result' and initializes it to 10
     * 2. Creates a new code block with { }
     * 3. Inside that block, declares another local variable 'multiplier' set to 5
     * 4. Inside that block, updates 'result' by multiplying it by 'multiplier'
     * 5. Returns the final value of 'result'
     *
     * @return The final value of the result variable
     */
    public static int demonstrateLocalVariables() {
        // TODO: Implement your solution here
        
        return 0; // Replace with your implementation
    }

    /**
     * This method demonstrates how to work with the class-level variable.
     * 
     * TODO: Implement a method that:
     * 1. Takes an integer parameter 'amount'
     * 2. Increments the class-level 'classCounter' variable by that amount
     * 3. Returns the new value of 'classCounter'
     *
     * @param amount The amount to increment the counter by
     * @return The new value of the counter
     */
    public static int incrementCounter(int amount) {
        // TODO: Implement your solution here
        
        return 0; // Replace with your implementation
    }

    /**
     * This method demonstrates scope isolation between method calls.
     * 
     * TODO: Implement a method that:
     * 1. Takes an integer parameter 'base'
     * 2. Declares a local variable 'result' and initializes it to the value of 'base'
     * 3. Doubles the value of 'result'
     * 4. Returns the value of 'result'
     * 
     * Note: This method should not affect other methods or variables outside its scope.
     *
     * @param base The starting value
     * @return The doubled value
     */
    public static int doubleValue(int base) {
        // TODO: Implement your solution here
        
        return 0; // Replace with your implementation
    }

    /**
     * This method demonstrates parameter scope.
     * 
     * TODO: Implement a method that:
     * 1. Takes a String parameter 'text'
     * 2. Takes an int parameter 'count'
     * 3. Returns a String that repeats the 'text' for 'count' times
     * 
     * For example, if text is "Hi" and count is 3, it should return "HiHiHi".
     * If count is 0 or negative, return an empty string.
     *
     * @param text The text to repeat
     * @param count The number of times to repeat the text
     * @return The repeated text
     */
    public static String repeatText(String text, int count) {
        // TODO: Implement your solution here
        
        return null; // Replace with your implementation
    }

    // Test methods
    private static void testLocalVariables() {
        int result = demonstrateLocalVariables();
        assert result == 50 : "demonstrateLocalVariables should return 50, but got " + result;
    }

    private static void testIncrementCounter() {
        // Reset the counter before testing
        classCounter = 0;
        
        int result1 = incrementCounter(5);
        assert result1 == 5 : "First increment should return 5, but got " + result1;
        
        int result2 = incrementCounter(3);
        assert result2 == 8 : "Second increment should return 8, but got " + result2;
        
        int result3 = incrementCounter(-2);
        assert result3 == 6 : "Third increment should return 6, but got " + result3;
    }

    private static void testScopeIsolation() {
        int value1 = 10;
        int result1 = doubleValue(value1);
        assert result1 == 20 : "doubleValue(10) should return 20, but got " + result1;
        
        // value1 should remain unchanged since variables are pass-by-value
        assert value1 == 10 : "The original value should remain unchanged, but got " + value1;
        
        int value2 = 7;
        int result2 = doubleValue(value2);
        assert result2 == 14 : "doubleValue(7) should return 14, but got " + result2;
    }

    private static void testParameterScope() {
        String result1 = repeatText("Hi", 3);
        assert "HiHiHi".equals(result1) : 
            "repeatText(\"Hi\", 3) should return \"HiHiHi\", but got \"" + result1 + "\"";
        
        String result2 = repeatText("Java", 2);
        assert "JavaJava".equals(result2) : 
            "repeatText(\"Java\", 2) should return \"JavaJava\", but got \"" + result2 + "\"";
        
        String result3 = repeatText("Test", 0);
        assert "".equals(result3) : 
            "repeatText(\"Test\", 0) should return \"\", but got \"" + result3 + "\"";
        
        String result4 = repeatText("Negative", -1);
        assert "".equals(result4) : 
            "repeatText(\"Negative\", -1) should return \"\", but got \"" + result4 + "\"";
    }
} 