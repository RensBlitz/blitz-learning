namespace DataTypes.Tests;

using DataTypes.Exercises;
using Xunit;

public class ArraysAndCollectionsTests
{
    [Fact]
    public void WorkWithArrays_ShouldReturnCorrectResults()
    {
        var results = ArraysAndCollections.WorkWithArrays();
        
        Assert.NotNull(results);
        Assert.Equal(4, results.Length);
        
        // Test integer array
        Assert.IsType<int[]>(results[0]);
        var numbers = (int[])results[0];
        Assert.Equal(5, numbers.Length);
        for (int i = 0; i < 5; i++)
        {
            Assert.Equal(i + 1, numbers[i]);
        }
        
        // Test strings array
        Assert.IsType<string[]>(results[1]);
        var strings = (string[])results[1];
        Assert.Equal(3, strings.Length);
        Assert.Equal("First", strings[0]);
        Assert.Equal("Second", strings[1]);
        Assert.Equal("Third", strings[2]);
        
        // Test updated strings array
        Assert.IsType<string[]>(results[2]);
        var updatedStrings = (string[])results[2];
        Assert.Equal(3, updatedStrings.Length);
        Assert.Equal("First", updatedStrings[0]);
        Assert.Equal("Updated", updatedStrings[1]);
        Assert.Equal("Third", updatedStrings[2]);
        
        // Test sum
        Assert.IsType<int>(results[3]);
        Assert.Equal(15, (int)results[3]);
    }
} 