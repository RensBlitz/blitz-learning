namespace ControlFlow.Exercises;

/// <summary>
/// Exercise 2: For Loops
/// 
/// This exercise focuses on using for loops to iterate through sequences, arrays, and perform calculations.
/// 
/// Learning objectives:
/// - Understand basic for loop structure and syntax
/// - Learn to iterate through arrays and collections
/// - Practice nested for loops for multi-dimensional data
/// </summary>
public class ForLoops
{
    /// <summary>
    /// TODO: Implement a method that calculates a running total up to a given number.
    /// Consider how to accumulate values in a sequence.
    ///
    /// Requirements:
    /// - Input: positive integer n
    /// - Output: sum of all integers from 1 to n inclusive
    /// - Example: for n=5, return 1+2+3+4+5 = 15
    /// </summary>
    /// <param name="n">The upper limit of the sequence</param>
    /// <returns>The sum of the sequence</returns>
    public static int CalculateSum(int n)
    {
        // TODO: Implement your solution here
        return 0;
    }
    
    /// <summary>
    /// TODO: Implement a method that transforms each element in a collection.
    /// Consider how to modify values while preserving the collection structure.
    ///
    /// Requirements:
    /// - Input: array of integers
    /// - Output: same array with each element multiplied by 2
    /// - Must modify the input array, not create a new one
    /// </summary>
    /// <param name="array">The array to modify</param>
    public static void TransformArray(int[] array)
    {
        // TODO: Implement your solution here
    }
    
    /// <summary>
    /// TODO: Implement a method that generates a mathematical pattern.
    /// Consider how values in different positions relate to each other.
    ///
    /// Requirements:
    /// - Input: positive integer n
    /// - Output: n×n array where each element [i][j] contains (i+1)×(j+1)
    /// - Example: for n=3, return:
    ///   [[1,2,3],
    ///    [2,4,6],
    ///    [3,6,9]]
    /// </summary>
    /// <param name="n">The size of the table</param>
    /// <returns>The multiplication table as a 2D array</returns>
    public static int[,] CreatePattern(int n)
    {
        // TODO: Implement your solution here
        return new int[0, 0];
    }
    
    /// <summary>
    /// Creates a new array where each element is twice the value of the corresponding element in the input array.
    /// 
    /// TODO: Implement this method to double each element in the input array.
    /// The original array should not be modified.
    /// 
    /// Examples:
    /// - DoubleArrayElements({1, 2, 3}) should return {2, 4, 6}
    /// - DoubleArrayElements({0, -1, 5}) should return {0, -2, 10}
    /// </summary>
    /// <param name="arr">The input array</param>
    /// <returns>A new array with each element doubled</returns>
    public static int[] DoubleArrayElements(int[] arr)
    {
        // TODO: Implement your solution here using a for loop
        return Array.Empty<int>(); // Replace with your implementation
    }
    
    /// <summary>
    /// Generates a multiplication table of size n x n.
    /// 
    /// TODO: Implement this method to create a multiplication table where each element [i,j]
    /// is the product of (i+1) and (j+1).
    /// 
    /// Example: 
    /// GenerateMultiplicationTable(3) should return:
    /// {
    ///   {1, 2, 3},
    ///   {2, 4, 6},
    ///   {3, 6, 9}
    /// }
    /// </summary>
    /// <param name="n">The size of the multiplication table</param>
    /// <returns>A 2D array representing the multiplication table</returns>
    public static int[,] GenerateMultiplicationTable(int n)
    {
        // TODO: Implement your solution here using nested for loops
        return new int[0, 0]; // Replace with your implementation
    }
} 