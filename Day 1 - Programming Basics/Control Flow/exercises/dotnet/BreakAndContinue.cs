namespace ControlFlow.Exercises;

/// <summary>
/// Exercise 6: Break and Continue Statements
/// 
/// This exercise focuses on using break and continue statements to control loop flow.
/// 
/// Learning objectives:
/// - Understand how to use break to exit a loop prematurely
/// - Learn how to use continue to skip the current iteration
/// - Practice using these statements in different scenarios
/// </summary>
public class BreakAndContinue
{
    /// <summary>
    /// TODO: Implement a method that searches through data to find a value meeting certain criteria.
    /// Consider how to optimize the search and handle exceptions.
    ///
    /// Requirements:
    /// - Input: array of integers (may contain positive, negative, or zero values)
    /// - Output: first non-negative number found in the array
    /// - If no non-negative number exists, return -1
    /// </summary>
    /// <param name="array">The array to search</param>
    /// <returns>The first non-negative number or -1 if none exists</returns>
    public static int FindFirstNonNegative(int[] array)
    {
        // TODO: Implement your solution here
        return 0;
    }
    
    /// <summary>
    /// TODO: Implement a method that analyzes data based on numerical properties.
    /// Consider what patterns to look for and how to track occurrences.
    ///
    /// Requirements:
    /// - Input: array of integers
    /// - Output: count of even numbers in the array
    /// - An even number is exactly divisible by 2
    /// </summary>
    /// <param name="array">The array to analyze</param>
    /// <returns>The count of even numbers</returns>
    public static int CountEvenNumbersOnly(int[] array)
    {
        // TODO: Implement your solution here
        return 0;
    }
    
    /// <summary>
    /// TODO: Implement a method that searches for values with special mathematical properties.
    /// Consider what makes a number special and how to efficiently find it.
    ///
    /// Requirements:
    /// - Input: start and end integers defining a range (inclusive)
    /// - Output: first prime number in the range
    /// - If no prime number exists in the range, return -1
    /// - A prime number is greater than 1 and has no divisors other than 1 and itself
    /// </summary>
    /// <param name="start">The start of the range (inclusive)</param>
    /// <param name="end">The end of the range (inclusive)</param>
    /// <returns>The first prime number in the range, or -1 if none exists</returns>
    public static int FindPrimeWithLimit(int start, int end)
    {
        // TODO: Implement your solution here
        return 0;
    }
    
    /// <summary>
    /// Helper method to check if a number is prime.
    /// A prime number is a natural number greater than 1 that is not divisible by any smaller number except 1.
    /// </summary>
    /// <param name="number">The number to check</param>
    /// <returns>true if the number is prime, false otherwise</returns>
    private static bool IsPrime(int number)
    {
        if (number <= 1)
        {
            return false;
        }
        
        if (number <= 3)
        {
            return true;
        }
        
        if (number % 2 == 0 || number % 3 == 0)
        {
            return false;
        }
        
        for (int i = 5; i * i <= number; i += 6)
        {
            if (number % i == 0 || number % (i + 2) == 0)
            {
                return false;
            }
        }
        
        return true;
    }
} 