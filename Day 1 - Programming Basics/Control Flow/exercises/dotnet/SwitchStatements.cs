namespace ControlFlow.Exercises;

/// <summary>
/// Exercise 4: Switch Statements
/// 
/// This exercise focuses on using switch statements for multi-branch decision making.
/// 
/// Learning objectives:
/// - Understand the syntax and structure of switch statements
/// - Learn when to use switch statements instead of if-else chains
/// - Practice using switch statements with different data types
/// </summary>
public class SwitchStatements
{
    /// <summary>
    /// TODO: Implement a method that converts numerical day representations to their text form.
    /// Consider how to handle valid and invalid inputs.
    ///
    /// Requirements:
    /// - Input: day number (1-7)
    /// - Output must be exactly:
    ///   - "Monday" for 1
    ///   - "Tuesday" for 2
    ///   - "Wednesday" for 3
    ///   - "Thursday" for 4
    ///   - "Friday" for 5
    ///   - "Saturday" for 6
    ///   - "Sunday" for 7
    ///   - "Invalid day" for any other number
    /// </summary>
    /// <param name="dayNumber">The day number (1-7)</param>
    /// <returns>The name of the day or "Invalid day" for invalid inputs</returns>
    public static string GetDayOfWeek(int dayNumber)
    {
        // TODO: Implement your solution here using a switch statement
        return string.Empty; // Replace with your implementation
    }
    
    /// <summary>
    /// TODO: Implement a method that determines the number of days in any given month,
    /// taking into account leap years.
    /// Consider how different months and special years affect the result.
    ///
    /// Requirements:
    /// - Input: month name and year
    /// - Output must be:
    ///   - 31 for: January, March, May, July, August, October, December
    ///   - 30 for: April, June, September, November
    ///   - For February:
    ///     - 29 in leap years
    ///     - 28 in non-leap years
    ///   - -1 for invalid month names
    /// - Leap year rule: divisible by 4, except century years not divisible by 400
    /// </summary>
    /// <param name="month">The name of the month</param>
    /// <param name="year">The year</param>
    /// <returns>The number of days in the month, or -1 for invalid inputs</returns>
    public static int GetDaysInMonth(string month, int year)
    {
        // TODO: Implement your solution here using a switch statement
        return 0; // Replace with your implementation
    }
    
    /// <summary>
    /// TODO: Implement a method that provides meaningful descriptions for HTTP status codes.
    /// Consider how to categorize different types of status codes and what information
    /// would be most helpful to users of your method.
    ///
    /// Requirements:
    /// - Input: HTTP status code (integer)
    /// - Output must be exactly:
    ///   - "OK" for 200
    ///   - "Created" for 201
    ///   - "No Content" for 204
    ///   - "Bad Request" for 400
    ///   - "Unauthorized" for 401
    ///   - "Forbidden" for 403
    ///   - "Not Found" for 404
    ///   - "Internal Server Error" for 500
    ///   - "Service Unavailable" for 503
    ///   - "Unknown Status Code" for any other code
    /// </summary>
    /// <param name="statusCode">The HTTP status code</param>
    /// <returns>A descriptive message for the status code</returns>
    public static string GetHttpStatusMessage(int statusCode)
    {
        // TODO: Implement your solution here using a switch statement
        return string.Empty; // Replace with your implementation
    }
} 