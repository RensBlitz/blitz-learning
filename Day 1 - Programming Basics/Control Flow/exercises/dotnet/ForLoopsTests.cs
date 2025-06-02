namespace ControlFlow.Tests;

using ControlFlow.Exercises;
using Xunit;

public class ForLoopsTests
{
    [Fact]
    public void CalculateSum_ShouldReturnCorrectSums()
    {
        Assert.Equal(15, ForLoops.CalculateSum(5));
        Assert.Equal(55, ForLoops.CalculateSum(10));
        Assert.Equal(1, ForLoops.CalculateSum(1));
        Assert.Equal(0, ForLoops.CalculateSum(0));
    }

    [Fact]
    public void TransformArray_ShouldDoubleAllElements()
    {
        int[] array1 = {1, 2, 3, 4, 5};
        ForLoops.TransformArray(array1);
        Assert.Equal(new int[] {2, 4, 6, 8, 10}, array1);

        int[] array2 = {-1, -2, -3, -4, -5};
        ForLoops.TransformArray(array2);
        Assert.Equal(new int[] {-2, -4, -6, -8, -10}, array2);

        int[] array3 = {0, 1, -2, 3, -4};
        ForLoops.TransformArray(array3);
        Assert.Equal(new int[] {0, 2, -4, 6, -8}, array3);

        int[] array4 = {};
        ForLoops.TransformArray(array4);
        Assert.Equal(new int[] {}, array4);
    }

    [Fact]
    public void DoubleArrayElements_ShouldReturnNewDoubledArray()
    {
        int[] original1 = {1, 2, 3, 4, 5};
        int[] result1 = ForLoops.DoubleArrayElements(original1);
        Assert.Equal(new int[] {2, 4, 6, 8, 10}, result1);
        Assert.Equal(new int[] {1, 2, 3, 4, 5}, original1); // Original should be unchanged

        int[] original2 = {-1, -2, -3, -4, -5};
        int[] result2 = ForLoops.DoubleArrayElements(original2);
        Assert.Equal(new int[] {-2, -4, -6, -8, -10}, result2);

        int[] original3 = {0, 1, -2, 3, -4};
        int[] result3 = ForLoops.DoubleArrayElements(original3);
        Assert.Equal(new int[] {0, 2, -4, 6, -8}, result3);

        int[] original4 = {};
        int[] result4 = ForLoops.DoubleArrayElements(original4);
        Assert.Equal(new int[] {}, result4);
    }

    [Fact]
    public void GenerateMultiplicationTable_ShouldReturnCorrectTable()
    {
        int[,] expected1 = new int[,] {
            {1, 2, 3},
            {2, 4, 6},
            {3, 6, 9}
        };
        int[,] result1 = ForLoops.GenerateMultiplicationTable(3);
        Assert.Equal(expected1, result1);

        int[,] expected2 = new int[,] {
            {1, 2, 3, 4, 5},
            {2, 4, 6, 8, 10},
            {3, 6, 9, 12, 15},
            {4, 8, 12, 16, 20},
            {5, 10, 15, 20, 25}
        };
        int[,] result2 = ForLoops.GenerateMultiplicationTable(5);
        Assert.Equal(expected2, result2);

        int[,] expected3 = new int[,] {{1}};
        int[,] result3 = ForLoops.GenerateMultiplicationTable(1);
        Assert.Equal(expected3, result3);
    }

    [Fact]
    public void CreatePattern_ShouldReturnCorrectPattern()
    {
        int[,] expected1 = new int[,] {
            {1, 2, 3},
            {2, 4, 6},
            {3, 6, 9}
        };
        int[,] result1 = ForLoops.CreatePattern(3);
        Assert.Equal(expected1, result1);

        int[,] expected2 = new int[,] {{1}};
        int[,] result2 = ForLoops.CreatePattern(1);
        Assert.Equal(expected2, result2);
    }
} 