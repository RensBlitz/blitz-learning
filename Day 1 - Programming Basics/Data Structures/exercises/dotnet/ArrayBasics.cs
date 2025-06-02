namespace DataStructures.Exercises;

/// <summary>
/// Exercise 1: Arrays Basics
///
/// This exercise focuses on working with arrays in C#, including declaration,
/// initialization, accessing elements, and performing basic operations.
///
/// Learning objectives:
/// - Create and initialize arrays using different approaches
/// - Access and modify array elements
/// - Perform common array operations (sum, find max/min, etc.)
/// - Understand array limitations (fixed size, same type elements)
///
/// Note: This exercise uses xUnit tests for validation.
/// Run 'dotnet test' to check your implementation.
/// </summary>
public class ArrayBasics
{
    /// <summary>
    /// This method should create and initialize different types of arrays.
    /// Consider what data types are appropriate for different kinds of information.
    ///
    /// TODO: Implement this method to create the following arrays:
    /// 1. Integer array of size 5 with values [10, 20, 30, 40, 50]
    /// 2. String array of size 3 with values ["apple", "banana", "cherry"]
    /// 3. Boolean array of size 4 with values [true, false, true, false]
    ///
    /// Requirements:
    /// - Create and return three arrays as specified above
    /// </summary>
    /// <returns>An object array containing [intArray, stringArray, booleanArray]</returns>
    public static object[] CreateArrays()
    {
        // TODO: Implement your solution here
        
        int[] intArray = null!; // Replace with your implementation
        
        string[] stringArray = null!; // Replace with your implementation
        
        bool[] booleanArray = null!; // Replace with your implementation
        
        return new object[] { intArray, stringArray, booleanArray };
    }

    /// <summary>
    /// This method should process an array to extract useful information.
    /// Consider what analytical operations could provide insights about the data.
    ///
    /// TODO: Implement this method to calculate and return:
    /// 1. Sum of all elements
    /// 2. Maximum value
    /// 3. Minimum value
    /// 4. Average value (as double)
    /// 5. New array with elements in reverse order
    ///
    /// Requirements:
    /// - Input: array of integers
    /// - Calculate all the specified metrics
    /// </summary>
    /// <param name="array">An array of integers</param>
    /// <returns>An array containing [sum, max, min, average, reversedArray]</returns>
    public static object[] PerformArrayOperations(int[] array)
    {
        // TODO: Implement your solution here
        
        int sum = 0; // Replace with your implementation
        
        int max = 0; // Replace with your implementation
        
        int min = 0; // Replace with your implementation
        
        double average = 0.0; // Replace with your implementation
        
        int[] reversed = null!; // Replace with your implementation
        
        return new object[] { sum, max, min, average, reversed };
    }
} 