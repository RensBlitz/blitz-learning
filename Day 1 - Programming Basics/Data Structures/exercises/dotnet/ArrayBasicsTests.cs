using Xunit;

namespace DataStructures.Exercises.Tests;

/// <summary>
/// Unit tests for the ArrayBasics exercise.
/// These tests validate that your implementation correctly creates and manipulates arrays.
/// </summary>
public class ArrayBasicsTests
{
    [Fact]
    public void CreateArrays_ShouldReturnCorrectArrays()
    {
        // Act
        var result = ArrayBasics.CreateArrays();
        
        // Assert
        Assert.NotNull(result);
        Assert.Equal(3, result.Length);
        
        // Test integer array
        Assert.IsType<int[]>(result[0]);
        var intArray = (int[])result[0];
        Assert.Equal(5, intArray.Length);
        Assert.Equal(new int[] { 10, 20, 30, 40, 50 }, intArray);
        
        // Test string array
        Assert.IsType<string[]>(result[1]);
        var stringArray = (string[])result[1];
        Assert.Equal(3, stringArray.Length);
        Assert.Equal(new string[] { "apple", "banana", "cherry" }, stringArray);
        
        // Test boolean array
        Assert.IsType<bool[]>(result[2]);
        var boolArray = (bool[])result[2];
        Assert.Equal(4, boolArray.Length);
        Assert.Equal(new bool[] { true, false, true, false }, boolArray);
    }

    [Fact]
    public void PerformArrayOperations_ShouldCalculateCorrectResults()
    {
        // Arrange
        var testArray = new int[] { 5, 3, 9, 1, 7 };
        
        // Act
        var result = ArrayBasics.PerformArrayOperations(testArray);
        
        // Assert
        Assert.NotNull(result);
        Assert.Equal(5, result.Length);
        
        // Test sum
        Assert.IsType<int>(result[0]);
        Assert.Equal(25, (int)result[0]);
        
        // Test max
        Assert.IsType<int>(result[1]);
        Assert.Equal(9, (int)result[1]);
        
        // Test min
        Assert.IsType<int>(result[2]);
        Assert.Equal(1, (int)result[2]);
        
        // Test average
        Assert.IsType<double>(result[3]);
        Assert.Equal(5.0, (double)result[3], 3);
        
        // Test reversed array
        Assert.IsType<int[]>(result[4]);
        var reversed = (int[])result[4];
        Assert.Equal(new int[] { 7, 1, 9, 3, 5 }, reversed);
    }

    [Fact]
    public void PerformArrayOperations_WithEmptyArray_ShouldHandleGracefully()
    {
        // Arrange
        var emptyArray = new int[0];
        
        // Act & Assert
        // This test ensures your implementation can handle edge cases
        var result = ArrayBasics.PerformArrayOperations(emptyArray);
        Assert.NotNull(result);
    }
} 