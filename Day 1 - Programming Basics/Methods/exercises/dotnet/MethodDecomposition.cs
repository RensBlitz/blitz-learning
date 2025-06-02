namespace Methods.Exercises;

/// <summary>
/// Methods7: Method Decomposition
///
/// This exercise focuses on breaking down complex operations into multiple methods
/// for better organization, readability, and reusability.
///
/// Learning objectives:
/// - Learn how to decompose complex tasks into smaller, focused methods
/// - Organize code using helper methods
/// - Improve code readability and maintainability through decomposition
/// - Practice calling methods from other methods
/// </summary>
public static class MethodDecomposition
{
    /// <summary>
    /// This method processes student grades by calculating statistics.
    /// 
    /// TODO: Implement this method to process an array of student grades.
    /// Use helper methods to decompose the logic:
    /// 1. Call CalculateAverage() to get the average grade
    /// 2. Call FindHighestGrade() to get the highest grade
    /// 3. Call FindLowestGrade() to get the lowest grade
    /// 4. Call CountPassingGrades() to count grades >= 60
    /// 5. Return an array containing [average, highest, lowest, passingCount]
    /// </summary>
    /// <param name="grades">Array of student grades (0-100)</param>
    /// <returns>Array containing [average, highest, lowest, passingCount]</returns>
    public static double[] ProcessGrades(int[] grades)
    {
        // TODO: Implement your solution here by calling helper methods
        return new double[4]; // Replace with your implementation
    }

    /// <summary>
    /// TODO: Implement a helper method to calculate the average of an array of grades.
    /// If the array is empty, return 0.0.
    /// </summary>
    /// <param name="grades">Array of student grades</param>
    /// <returns>The average grade or 0.0 if array is empty</returns>
    private static double CalculateAverage(int[] grades)
    {
        // TODO: Implement your solution here
        return 0.0; // Replace with your implementation
    }

    /// <summary>
    /// TODO: Implement a helper method to find the highest grade in an array.
    /// If the array is empty, return 0.
    /// </summary>
    /// <param name="grades">Array of student grades</param>
    /// <returns>The highest grade or 0 if array is empty</returns>
    private static int FindHighestGrade(int[] grades)
    {
        // TODO: Implement your solution here
        return 0; // Replace with your implementation
    }

    /// <summary>
    /// TODO: Implement a helper method to find the lowest grade in an array.
    /// If the array is empty, return 0.
    /// </summary>
    /// <param name="grades">Array of student grades</param>
    /// <returns>The lowest grade or 0 if array is empty</returns>
    private static int FindLowestGrade(int[] grades)
    {
        // TODO: Implement your solution here
        return 0; // Replace with your implementation
    }

    /// <summary>
    /// TODO: Implement a helper method to count the number of passing grades.
    /// A passing grade is 60 or higher.
    /// </summary>
    /// <param name="grades">Array of student grades</param>
    /// <returns>The count of passing grades</returns>
    private static int CountPassingGrades(int[] grades)
    {
        // TODO: Implement your solution here
        return 0; // Replace with your implementation
    }

    /// <summary>
    /// This method validates a password using multiple criteria.
    /// 
    /// TODO: Implement this method to validate a password using helper methods:
    /// 1. Call IsLongEnough() to check if the password is at least 8 characters
    /// 2. Call HasUpperCase() to check if it contains at least one uppercase letter
    /// 3. Call HasLowerCase() to check if it contains at least one lowercase letter
    /// 4. Call HasDigit() to check if it contains at least one digit
    /// 5. Call HasSpecialChar() to check if it has at least one special character
    /// 
    /// Return true only if ALL criteria are met.
    /// </summary>
    /// <param name="password">The password to validate</param>
    /// <returns>true if the password meets all criteria, false otherwise</returns>
    public static bool ValidatePassword(string password)
    {
        // TODO: Implement your solution here by calling helper methods
        return false; // Replace with your implementation
    }

    /// <summary>
    /// TODO: Implement a helper method to check if a password is at least 8 characters long.
    /// </summary>
    /// <param name="password">The password to check</param>
    /// <returns>true if the password is at least 8 characters long, false otherwise</returns>
    private static bool IsLongEnough(string password)
    {
        // TODO: Implement your solution here
        return false; // Replace with your implementation
    }

    /// <summary>
    /// TODO: Implement a helper method to check if a password contains at least one uppercase letter.
    /// </summary>
    /// <param name="password">The password to check</param>
    /// <returns>true if the password contains at least one uppercase letter, false otherwise</returns>
    private static bool HasUpperCase(string password)
    {
        // TODO: Implement your solution here
        return false; // Replace with your implementation
    }

    /// <summary>
    /// TODO: Implement a helper method to check if a password contains at least one lowercase letter.
    /// </summary>
    /// <param name="password">The password to check</param>
    /// <returns>true if the password contains at least one lowercase letter, false otherwise</returns>
    private static bool HasLowerCase(string password)
    {
        // TODO: Implement your solution here
        return false; // Replace with your implementation
    }

    /// <summary>
    /// TODO: Implement a helper method to check if a password contains at least one digit.
    /// </summary>
    /// <param name="password">The password to check</param>
    /// <returns>true if the password contains at least one digit, false otherwise</returns>
    private static bool HasDigit(string password)
    {
        // TODO: Implement your solution here
        return false; // Replace with your implementation
    }

    /// <summary>
    /// TODO: Implement a helper method to check if a password contains at least one special character.
    /// Special characters include: !@#$%^&*()-_=+[]{}|;:'",.<>/?
    /// </summary>
    /// <param name="password">The password to check</param>
    /// <returns>true if the password contains at least one special character, false otherwise</returns>
    private static bool HasSpecialChar(string password)
    {
        // TODO: Implement your solution here
        return false; // Replace with your implementation
    }

    /// <summary>
    /// This method analyzes a text and returns statistics about it.
    /// 
    /// TODO: Implement this method to analyze a text using helper methods:
    /// 1. Call CountWords() to count the number of words in the text
    /// 2. Call CountSentences() to count the number of sentences
    /// 3. Call CalculateAverageWordLength() to get the average word length
    /// 4. Return an array containing [wordCount, sentenceCount, avgWordLength]
    /// </summary>
    /// <param name="text">The text to analyze</param>
    /// <returns>Array containing [wordCount, sentenceCount, avgWordLength]</returns>
    public static object[] AnalyzeText(string text)
    {
        // TODO: Implement your solution here by calling helper methods
        return new object[3]; // Replace with your implementation
    }

    /// <summary>
    /// TODO: Implement a helper method to count the number of words in a text.
    /// Words are separated by one or more spaces.
    /// If the text is empty or null, return 0.
    /// </summary>
    /// <param name="text">The text to analyze</param>
    /// <returns>The number of words in the text</returns>
    private static int CountWords(string text)
    {
        // TODO: Implement your solution here
        return 0; // Replace with your implementation
    }

    /// <summary>
    /// TODO: Implement a helper method to count the number of sentences in a text.
    /// Sentences end with ., !, or ?.
    /// If the text is empty or null, return 0.
    /// </summary>
    /// <param name="text">The text to analyze</param>
    /// <returns>The number of sentences in the text</returns>
    private static int CountSentences(string text)
    {
        // TODO: Implement your solution here
        return 0; // Replace with your implementation
    }

    /// <summary>
    /// TODO: Implement a helper method to calculate the average word length in a text.
    /// If there are no words, return 0.0.
    /// </summary>
    /// <param name="text">The text to analyze</param>
    /// <returns>The average word length</returns>
    private static double CalculateAverageWordLength(string text)
    {
        // TODO: Implement your solution here
        return 0.0; // Replace with your implementation
    }
} 