package javaexercises;

/**
 * Exercise 1: If-Else Conditional Statements
 * 
 * This exercise focuses on using if, else-if, and else statements to make decisions in code.
 * 
 * Learning objectives:
 * - Understand how to use simple if statements for conditional logic
 * - Learn to chain multiple conditions with else-if
 * - Practice creating complex conditional expressions
 * 
 * Note: This exercise uses assertions. Run with the -ea flag:
 * java -ea IfElseStatements
 */
public class IfElseStatements {
    
    public static void main(String[] args) {
        System.out.println("Exercise 1: If-Else Conditional Statements");
        
        try {
            // Test the grade classifier
            testGradeClassifier();
            
            // Test the ticket price calculator
            testTicketPriceCalculator();
            
            // Test the leap year checker
            testLeapYearChecker();
            
            System.out.println("All tests passed! Your implementation is correct.");
        } catch (AssertionError e) {
            System.out.println("Test failed: " + e.getMessage());
        }
    }
    
    /**
     * Tests the grade classifier implementation.
     */
    private static void testGradeClassifier() {
        assert classifyGrade(95).equals("A") : "Grade 95 should be classified as 'A'";
        assert classifyGrade(85).equals("B") : "Grade 85 should be classified as 'B'";
        assert classifyGrade(75).equals("C") : "Grade 75 should be classified as 'C'";
        assert classifyGrade(65).equals("D") : "Grade 65 should be classified as 'D'";
        assert classifyGrade(55).equals("F") : "Grade 55 should be classified as 'F'";
        assert classifyGrade(30).equals("F") : "Grade 30 should be classified as 'F'";
        
        // Edge cases
        assert classifyGrade(90).equals("A") : "Grade 90 should be classified as 'A'";
        assert classifyGrade(80).equals("B") : "Grade 80 should be classified as 'B'";
        assert classifyGrade(70).equals("C") : "Grade 70 should be classified as 'C'";
        assert classifyGrade(60).equals("D") : "Grade 60 should be classified as 'D'";
        assert classifyGrade(0).equals("F") : "Grade 0 should be classified as 'F'";
        assert classifyGrade(100).equals("A") : "Grade 100 should be classified as 'A'";
    }
    
    /**
     * Tests the ticket price calculator implementation.
     */
    private static void testTicketPriceCalculator() {
        assert calculateTicketPrice(25, false) == 10.0 : "Adult without discount should pay $10.00";
        assert calculateTicketPrice(65, false) == 8.0 : "Senior without discount should pay $8.00";
        assert calculateTicketPrice(10, false) == 5.0 : "Child without discount should pay $5.00";
        assert calculateTicketPrice(25, true) == 8.0 : "Adult with discount should pay $8.00";
        assert calculateTicketPrice(65, true) == 6.4 : "Senior with discount should pay $6.40";
        assert calculateTicketPrice(10, true) == 4.0 : "Child with discount should pay $4.00";
    }
    
    /**
     * Tests the leap year checker implementation.
     */
    private static void testLeapYearChecker() {
        assert isLeapYear(2000) : "Year 2000 should be a leap year";
        assert isLeapYear(2004) : "Year 2004 should be a leap year";
        assert isLeapYear(2020) : "Year 2020 should be a leap year";
        assert !isLeapYear(1900) : "Year 1900 should not be a leap year";
        assert !isLeapYear(2001) : "Year 2001 should not be a leap year";
        assert !isLeapYear(2100) : "Year 2100 should not be a leap year";
    }
    
    /**
     * TODO: Implement a method that evaluates student performance.
     * Consider how to categorize different levels of achievement.
     *
     * Requirements:
     * - Input: numerical score (0-100)
     * - Output must be exactly:
     *   - "A" for scores >= 90
     *   - "B" for scores >= 80 and < 90
     *   - "C" for scores >= 70 and < 80
     *   - "D" for scores >= 60 and < 70
     *   - "F" for scores < 60
     *
     * @param score The numerical score (0-100)
     * @return The letter grade as a String
     */
    public static String classifyGrade(int score) {
        // TODO: Implement your solution here
        return null; // Replace with your implementation
    }
    
    /**
     * TODO: Implement a method that calculates ticket prices based on customer attributes.
     * Consider how different factors should affect the final price.
     *
     * Requirements:
     * - Input: age (integer) and discount status (boolean)
     * - Base prices must be:
     *   - Adults (18-64): $10.00
     *   - Seniors (65+): $8.00
     *   - Children (under 18): $5.00
     * - When hasDiscount is true: apply 20% discount to base price
     *
     * @param age The age of the customer
     * @param hasDiscount Whether the customer has a discount
     * @return The calculated ticket price
     */
    public static double calculateTicketPrice(int age, boolean hasDiscount) {
        // TODO: Implement your solution here
        return 0.0; // Replace with your implementation
    }
    
    /**
     * TODO: Implement a method that determines if a year is special based on certain rules.
     * Consider how different numerical properties of a year might make it special.
     *
     * Requirements:
     * - Input: year (integer)
     * - Output must be true when ALL these conditions are met:
     *   - Year is divisible by 4
     *   - Year is NOT divisible by 100 OR year is divisible by 400
     * - Output must be false otherwise
     *
     * @param year The year to check
     * @return true if the year meets the special conditions, false otherwise
     */
    public static boolean isLeapYear(int year) {
        // TODO: Implement your solution here
        return false; // Replace with your implementation
    }
} 