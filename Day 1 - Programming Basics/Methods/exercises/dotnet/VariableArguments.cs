namespace Methods.Exercises;

/// <summary>
/// Methods6: Variable Arguments (params)
///
/// This exercise focuses on using variable arguments (params) in C# methods.
/// The params keyword allows methods to accept a variable number of arguments of the same type.
///
/// Learning objectives:
/// - Understand how params work in C#
/// - Create methods with variable arguments
/// - Use params with different data types
/// - Learn about params limitations and best practices
/// </summary>
public static class VariableArguments
{
    /// <summary>
    /// This method should calculate the sum of a variable number of integers.
    /// 
    /// TODO: Implement a method that:
    /// 1. Accepts a variable number of int arguments using params
    /// 2. Returns their sum as an int
    /// 3. Returns 0 if no arguments are provided
    /// </summary>
    /// <param name="numbers">Variable number of integers to sum</param>
    /// <returns>The sum of all the integers</returns>
    public static int CalculateSum(params int[] numbers)
    {
        // TODO: Implement your solution here
        return 0; // Replace with your implementation
    }

    /// <summary>
    /// This method should concatenate a variable number of strings.
    /// 
    /// TODO: Implement a method that:
    /// 1. Accepts a delimiter string as the first parameter
    /// 2. Accepts a variable number of string arguments using params
    /// 3. Concatenates all the strings with the delimiter in between
    /// 4. Returns an empty string if no strings are provided (beyond the delimiter)
    /// </summary>
    /// <param name="delimiter">The string to place between each concatenated string</param>
    /// <param name="strings">Variable number of strings to concatenate</param>
    /// <returns>The concatenated string with delimiters</returns>
    public static string ConcatenateStrings(string delimiter, params string[] strings)
    {
        // TODO: Implement your solution here
        return string.Empty; // Replace with your implementation
    }

    /// <summary>
    /// This method should find the maximum value among a variable number of integers.
    /// 
    /// TODO: Implement a method that:
    /// 1. Accepts a variable number of int arguments using params
    /// 2. Returns the maximum value
    /// 3. Throws an ArgumentException with the message "No arguments provided"
    ///    if no arguments are provided
    /// </summary>
    /// <param name="numbers">Variable number of integers to compare</param>
    /// <returns>The maximum value</returns>
    /// <exception cref="ArgumentException">Thrown when no arguments are provided</exception>
    public static int FindMaximum(params int[] numbers)
    {
        // TODO: Implement your solution here
        return 0; // Replace with your implementation
    }

    /// <summary>
    /// This method should create a formatted list from variable arguments.
    /// 
    /// TODO: Implement a method that:
    /// 1. Accepts a string parameter for the title
    /// 2. Accepts a variable number of object arguments for the list items using params
    /// 3. Returns a formatted string that looks like:
    ///    "Title: [title]
    ///     - [item1]
    ///     - [item2]
    ///     - [item3]
    ///     ..."
    /// 4. Returns just the title line if no list items are provided
    /// </summary>
    /// <param name="title">The title of the list</param>
    /// <param name="items">Variable number of objects to include as list items</param>
    /// <returns>A formatted string containing the title and list items</returns>
    public static string CreateFormattedList(string title, params object[] items)
    {
        // TODO: Implement your solution here
        return string.Empty; // Replace with your implementation
    }
} 