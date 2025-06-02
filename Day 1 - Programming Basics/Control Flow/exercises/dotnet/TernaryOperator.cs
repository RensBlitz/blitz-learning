namespace ControlFlow.Exercises;

/// <summary>
/// Exercise 5: Ternary Operator
/// 
/// This exercise focuses on using the ternary operator (? :) for compact conditional expressions.
/// 
/// Learning objectives:
/// - Understand the syntax and behavior of the ternary operator
/// - Learn when to use the ternary operator for cleaner code
/// - Practice using nested ternary operators responsibly
/// </summary>
public class TernaryOperator
{
    /// <summary>
    /// Finds the maximum of two numbers.
    /// 
    /// TODO: Implement this method to return the larger of two integers using the ternary operator.
    /// If the numbers are equal, return either one.
    /// 
    /// Examples:
    /// - FindMaximum(5, 10) should return 10
    /// - FindMaximum(10, 5) should return 10
    /// - FindMaximum(7, 7) should return 7
    /// </summary>
    /// <param name="a">The first number</param>
    /// <param name="b">The second number</param>
    /// <returns>The maximum of the two numbers</returns>
    public static int FindMaximum(int a, int b)
    {
        // TODO: Implement your solution here using the ternary operator
        return 0; // Replace with your implementation
    }
    
    /// <summary>
    /// Determines if a number is even or odd.
    /// 
    /// TODO: Implement this method to return "Even" if the number is even, and "Odd" if it's odd.
    /// Use the ternary operator for this check.
    /// 
    /// Examples:
    /// - CheckEvenOdd(4) should return "Even"
    /// - CheckEvenOdd(7) should return "Odd"
    /// - CheckEvenOdd(0) should return "Even"
    /// </summary>
    /// <param name="number">The number to check</param>
    /// <returns>"Even" if the number is even, "Odd" if it's odd</returns>
    public static string CheckEvenOdd(int number)
    {
        // TODO: Implement your solution here using the ternary operator
        return string.Empty; // Replace with your implementation
    }
    
    /// <summary>
    /// Determines the sign of a number.
    /// 
    /// TODO: Implement this method to return "Positive" if the number is greater than 0,
    /// "Negative" if less than 0, and "Zero" if equal to 0.
    /// Use nested ternary operators for this implementation.
    /// 
    /// Examples:
    /// - GetNumberSign(10) should return "Positive"
    /// - GetNumberSign(-5) should return "Negative"
    /// - GetNumberSign(0) should return "Zero"
    /// </summary>
    /// <param name="number">The number to check</param>
    /// <returns>"Positive", "Negative", or "Zero" based on the number's sign</returns>
    public static string GetNumberSign(int number)
    {
        // TODO: Implement your solution here using nested ternary operators
        return string.Empty; // Replace with your implementation
    }

    /// <summary>
    /// TODO: Implement a method that compares two numbers and selects one based on a condition.
    /// Consider what criteria should be used for the selection.
    ///
    /// Requirements:
    /// - Input: two integers a and b
    /// - Output: must return the larger of the two numbers
    /// </summary>
    /// <param name="a">First number to compare</param>
    /// <param name="b">Second number to compare</param>
    /// <returns>The larger of the two numbers</returns>
    public static int FindLarger(int a, int b)
    {
        // TODO: Implement your solution here
        return 0;
    }

    /// <summary>
    /// TODO: Implement a method that classifies a number based on its properties.
    /// Consider what makes a number fall into different categories.
    ///
    /// Requirements:
    /// - Input: integer number
    /// - Output must be exactly:
    ///   - "Even" when number is divisible by 2
    ///   - "Odd" when number is not divisible by 2
    /// </summary>
    /// <param name="number">The number to classify</param>
    /// <returns>Classification string as specified in requirements</returns>
    public static string ClassifyNumber(int number)
    {
        // TODO: Implement your solution here
        return string.Empty;
    }

    /// <summary>
    /// TODO: Implement a method that categorizes numbers based on their relation to zero.
    /// Consider how numbers can be classified based on their value.
    ///
    /// Requirements:
    /// - Input: integer number
    /// - Output must be exactly:
    ///   - "Positive" when number > 0
    ///   - "Negative" when number < 0
    ///   - "Zero" when number = 0
    /// </summary>
    /// <param name="number">The number to analyze</param>
    /// <returns>Classification string as specified in requirements</returns>
    public static string AnalyzeNumber(int number)
    {
        // TODO: Implement your solution here
        return string.Empty;
    }
} 