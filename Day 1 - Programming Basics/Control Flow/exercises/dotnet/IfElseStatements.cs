namespace ControlFlow.Exercises;

/// <summary>
/// Exercise 1: If-Else Conditional Statements
/// 
/// This exercise focuses on using if, else-if, and else statements to make decisions in code.
/// 
/// Learning objectives:
/// - Understand how to use simple if statements for conditional logic
/// - Learn to chain multiple conditions with else-if
/// - Practice creating complex conditional expressions
/// </summary>
public class IfElseStatements
{
    /// <summary>
    /// TODO: Implement a method that evaluates student performance.
    /// Consider how to categorize different levels of achievement.
    ///
    /// Requirements:
    /// - Input: numerical score (0-100)
    /// - Output must be exactly:
    ///   - "A" for scores >= 90
    ///   - "B" for scores >= 80 and < 90
    ///   - "C" for scores >= 70 and < 80
    ///   - "D" for scores >= 60 and < 70
    ///   - "F" for scores < 60
    /// </summary>
    /// <param name="score">The numerical score (0-100)</param>
    /// <returns>The letter grade as a string</returns>
    public static string ClassifyGrade(int score)
    {
        // TODO: Implement your solution here
        return string.Empty; // Replace with your implementation
    }
    
    /// <summary>
    /// TODO: Implement a method that calculates ticket prices based on customer attributes.
    /// Consider how different factors should affect the final price.
    ///
    /// Requirements:
    /// - Input: age (integer) and discount status (boolean)
    /// - Base prices must be:
    ///   - Adults (18-64): $10.00
    ///   - Seniors (65+): $8.00
    ///   - Children (under 18): $5.00
    /// - When hasDiscount is true: apply 20% discount to base price
    /// </summary>
    /// <param name="age">The age of the customer</param>
    /// <param name="hasDiscount">Whether the customer has a discount</param>
    /// <returns>The calculated ticket price</returns>
    public static double CalculateTicketPrice(int age, bool hasDiscount)
    {
        // TODO: Implement your solution here
        return 0.0; // Replace with your implementation
    }
    
    /// <summary>
    /// TODO: Implement a method that determines if a year is special based on certain rules.
    /// Consider how different numerical properties of a year might make it special.
    ///
    /// Requirements:
    /// - Input: year (integer)
    /// - Output must be true when ALL these conditions are met:
    ///   - Year is divisible by 4
    ///   - Year is NOT divisible by 100 OR year is divisible by 400
    /// - Output must be false otherwise
    /// </summary>
    /// <param name="year">The year to check</param>
    /// <returns>true if the year meets the special conditions, false otherwise</returns>
    public static bool IsLeapYear(int year)
    {
        // TODO: Implement your solution here
        return false; // Replace with your implementation
    }
} 