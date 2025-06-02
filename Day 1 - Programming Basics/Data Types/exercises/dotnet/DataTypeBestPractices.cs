namespace DataTypes.Exercises;

/// <summary>
/// DataTypeBestPractices: Common Pitfalls and Best Practices
/// 
/// This exercise focuses on identifying and avoiding common mistakes with data types in C#,
/// and applying best practices for data type usage.
/// 
/// Learning objectives:
/// - Identify and fix common data type related issues
/// - Understand null references and uninitialized variables
/// - Apply best practices for type selection and conversion
/// - Recognize type-related error messages
/// </summary>
public class DataTypeBestPractices
{
    /// <summary>
    /// This method demonstrates fixing a null reference error.
    /// TODO: Initialize the array before accessing its elements.
    /// The current implementation throws a NullReferenceException.
    /// </summary>
    /// <returns>An integer representing the sum of all elements in the array.</returns>
    public static int FixNullReference()
    {
        // TODO: Fix the null reference issue
        int[]? numbers = null; // This line causes a NullReferenceException when accessing array elements
        
        // Calculate the sum
        int sum = 0;
        for (int i = 0; i < 3; i++)
        {
            sum += numbers![i]; // This line throws NullReferenceException
        }
        
        return sum;
    }

    /// <summary>
    /// This method demonstrates a common pitfall with integer division in C#.
    /// TODO: Fix the division to get the correct result (2.5).
    /// The current implementation incorrectly returns 2.
    /// </summary>
    /// <returns>The correct result of dividing 5 by 2 (should be 2.5).</returns>
    public static double FixIntegerDivision()
    {
        // TODO: Fix the integer division issue
        int a = 5;
        int b = 2;
        double result = a / b; // This performs integer division, giving 2 instead of 2.5
        
        return result;
    }

    /// <summary>
    /// This method demonstrates a common pitfall with string comparison.
    /// TODO: Fix the string comparison to correctly check if two strings have the same content.
    /// The current implementation incorrectly uses == instead of .Equals().
    /// </summary>
    /// <param name="s1">First string to compare</param>
    /// <param name="s2">Second string to compare</param>
    /// <returns>true if the strings have the same content, false otherwise.</returns>
    public static bool FixStringEquality(string s1, string s2)
    {
        // TODO: Fix the string comparison issue
        return s1 == s2; // This checks reference equality, not content equality
    }
} 