/**
 * Exercise 5: Ternary Operator
 * 
 * This exercise focuses on using the ternary operator (? :) for compact conditional expressions.
 * 
 * Learning objectives:
 * - Understand the syntax and behavior of the ternary operator
 * - Learn when to use the ternary operator for cleaner code
 * - Practice using nested ternary operators responsibly
 * 
 * Note: This exercise uses assertions. Run with the -ea flag:
 * java -ea TernaryOperator
 */
public class TernaryOperator {
    
    public static void main(String[] args) {
        System.out.println("Exercise 5: Ternary Operator");
        
        try {
            // Test the maximum finder
            testFindMaximum();
            
            // Test the even-odd checker
            testEvenOddChecker();
            
            // Test the sign checker
            testGetNumberSign();
            
            System.out.println("All tests passed! Your implementation is correct.");
        } catch (AssertionError e) {
            System.out.println("Test failed: " + e.getMessage());
        }
    }
    
    /**
     * Tests the maximum finder implementation.
     */
    private static void testFindMaximum() {
        assert findMaximum(5, 10) == 10 : "Maximum of 5 and 10 should be 10";
        assert findMaximum(10, 5) == 10 : "Maximum of 10 and 5 should be 10";
        assert findMaximum(7, 7) == 7 : "Maximum of 7 and 7 should be 7";
        assert findMaximum(-5, -10) == -5 : "Maximum of -5 and -10 should be -5";
        assert findMaximum(0, 0) == 0 : "Maximum of 0 and 0 should be 0";
    }
    
    /**
     * Tests the even-odd checker implementation.
     */
    private static void testEvenOddChecker() {
        assert checkEvenOdd(0).equals("Even") : "0 should be Even";
        assert checkEvenOdd(1).equals("Odd") : "1 should be Odd";
        assert checkEvenOdd(2).equals("Even") : "2 should be Even";
        assert checkEvenOdd(3).equals("Odd") : "3 should be Odd";
        assert checkEvenOdd(4).equals("Even") : "4 should be Even";
        assert checkEvenOdd(-1).equals("Odd") : "-1 should be Odd";
        assert checkEvenOdd(-2).equals("Even") : "-2 should be Even";
    }
    
    /**
     * Tests the sign checker implementation.
     */
    private static void testGetNumberSign() {
        assert getNumberSign(10).equals("Positive") : "10 should be Positive";
        assert getNumberSign(-10).equals("Negative") : "-10 should be Negative";
        assert getNumberSign(0).equals("Zero") : "0 should be Zero";
        assert getNumberSign(Integer.MAX_VALUE).equals("Positive") : "Integer.MAX_VALUE should be Positive";
        assert getNumberSign(Integer.MIN_VALUE).equals("Negative") : "Integer.MIN_VALUE should be Negative";
    }
    
    /**
     * Finds the maximum of two numbers.
     * 
     * TODO: Implement this method to return the larger of two integers using the ternary operator.
     * If the numbers are equal, return either one.
     * 
     * Examples:
     * - findMaximum(5, 10) should return 10
     * - findMaximum(10, 5) should return 10
     * - findMaximum(7, 7) should return 7
     * 
     * @param a The first number
     * @param b The second number
     * @return The maximum of the two numbers
     */
    public static int findMaximum(int a, int b) {
        // TODO: Implement your solution here using the ternary operator
        return 0; // Replace with your implementation
    }
    
    /**
     * Determines if a number is even or odd.
     * 
     * TODO: Implement this method to return "Even" if the number is even, and "Odd" if it's odd.
     * Use the ternary operator for this check.
     * 
     * Examples:
     * - checkEvenOdd(4) should return "Even"
     * - checkEvenOdd(7) should return "Odd"
     * - checkEvenOdd(0) should return "Even"
     * 
     * @param number The number to check
     * @return "Even" if the number is even, "Odd" if it's odd
     */
    public static String checkEvenOdd(int number) {
        // TODO: Implement your solution here using the ternary operator
        return null; // Replace with your implementation
    }
    
    /**
     * Determines the sign of a number.
     * 
     * TODO: Implement this method to return "Positive" if the number is greater than 0,
     * "Negative" if less than 0, and "Zero" if equal to 0.
     * Use nested ternary operators for this implementation.
     * 
     * Examples:
     * - getNumberSign(10) should return "Positive"
     * - getNumberSign(-5) should return "Negative"
     * - getNumberSign(0) should return "Zero"
     * 
     * @param number The number to check
     * @return "Positive", "Negative", or "Zero" based on the number's sign
     */
    public static String getNumberSign(int number) {
        // TODO: Implement your solution here using nested ternary operators
        return null; // Replace with your implementation
    }

    /**
     * TODO: Implement a method that compares two numbers and selects one based on a condition.
     * Consider what criteria should be used for the selection.
     *
     * Requirements:
     * - Input: two integers a and b
     * - Output: must return the larger of the two numbers
     *
     * @param a First number to compare
     * @param b Second number to compare
     * @return The larger of the two numbers
     */
    public static int findLarger(int a, int b) {
        // TODO: Implement your solution here
        return 0;
    }

    /**
     * TODO: Implement a method that classifies a number based on its properties.
     * Consider what makes a number fall into different categories.
     *
     * Requirements:
     * - Input: integer number
     * - Output must be exactly:
     *   - "Even" when number is divisible by 2
     *   - "Odd" when number is not divisible by 2
     *
     * @param number The number to classify
     * @return Classification string as specified in requirements
     */
    public static String classifyNumber(int number) {
        // TODO: Implement your solution here
        return "";
    }

    /**
     * TODO: Implement a method that categorizes numbers based on their relation to zero.
     * Consider how numbers can be classified based on their value.
     *
     * Requirements:
     * - Input: integer number
     * - Output must be exactly:
     *   - "Positive" when number > 0
     *   - "Negative" when number < 0
     *   - "Zero" when number = 0
     *
     * @param number The number to analyze
     * @return Classification string as specified in requirements
     */
    public static String analyzeNumber(int number) {
        // TODO: Implement your solution here
        return "";
    }
} 