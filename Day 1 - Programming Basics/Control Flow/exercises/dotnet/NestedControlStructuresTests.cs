namespace ControlFlow.Tests;

using ControlFlow.Exercises;
using Xunit;

public class NestedControlStructuresTests
{
    [Fact]
    public void GenerateRightTriangle_ShouldCreateCorrectPattern()
    {
        // Test various pattern sizes
        string pattern1 = NestedControlStructures.GenerateRightTriangle(1);
        string expected1 = "*\n";
        Assert.Equal(expected1, pattern1);
        
        string pattern2 = NestedControlStructures.GenerateRightTriangle(3);
        string expected2 = "  *\n" +
                           " ***\n" +
                           "*****\n";
        Assert.Equal(expected2, pattern2);
        
        string pattern3 = NestedControlStructures.GenerateRightTriangle(5);
        string expected3 = "    *\n" +
                           "   ***\n" +
                           "  *****\n" +
                           " *******\n" +
                           "*********\n";
        Assert.Equal(expected3, pattern3);
    }

    [Fact]
    public void MatrixSum_ShouldCalculateCorrectSum()
    {
        // Test with a simple 2x2 matrix
        int[,] matrix1 = new int[,] {
            {1, 2},
            {3, 4}
        };
        Assert.Equal(10, NestedControlStructures.MatrixSum(matrix1));
        
        // Test with a 3x3 matrix
        int[,] matrix2 = new int[,] {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        Assert.Equal(45, NestedControlStructures.MatrixSum(matrix2));
        
        // Test with an empty matrix
        int[,] matrix3 = new int[0, 0];
        Assert.Equal(0, NestedControlStructures.MatrixSum(matrix3));
        
        // Test with a matrix containing negative numbers
        int[,] matrix4 = new int[,] {
            {-1, -2},
            {-3, -4}
        };
        Assert.Equal(-10, NestedControlStructures.MatrixSum(matrix4));
        
        // Test with a non-square matrix
        int[,] matrix5 = new int[,] {
            {1, 2, 3},
            {4, 5, 6}
        };
        Assert.Equal(21, NestedControlStructures.MatrixSum(matrix5));
    }

    [Fact]
    public void CountSubarrayOccurrences_ShouldCountCorrectly()
    {
        // Test with a simple case
        int[] array1 = {1, 2, 3, 1, 2, 3, 1, 2, 3};
        int[] subArray1 = {1, 2, 3};
        Assert.Equal(3, NestedControlStructures.CountSubarrayOccurrences(array1, subArray1));
        
        // Test with no occurrences
        int[] array2 = {1, 2, 3, 4, 5};
        int[] subArray2 = {6, 7, 8};
        Assert.Equal(0, NestedControlStructures.CountSubarrayOccurrences(array2, subArray2));
        
        // Test with a subarray of length 1
        int[] array3 = {1, 2, 1, 3, 1, 4, 1};
        int[] subArray3 = {1};
        Assert.Equal(4, NestedControlStructures.CountSubarrayOccurrences(array3, subArray3));
        
        // Test with a subarray longer than the array
        int[] array4 = {1, 2, 3};
        int[] subArray4 = {1, 2, 3, 4};
        Assert.Equal(0, NestedControlStructures.CountSubarrayOccurrences(array4, subArray4));
        
        // Test with an empty subarray
        int[] array5 = {1, 2, 3};
        int[] subArray5 = {};
        Assert.Equal(0, NestedControlStructures.CountSubarrayOccurrences(array5, subArray5));
    }
} 