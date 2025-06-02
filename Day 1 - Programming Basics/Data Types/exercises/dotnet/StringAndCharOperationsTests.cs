namespace DataTypes.Tests;

using DataTypes.Exercises;
using Xunit;

public class StringAndCharOperationsTests
{
    [Fact]
    public void PerformStringCharOperations_ShouldReturnCorrectResults()
    {
        var results = StringAndCharOperations.PerformStringCharOperations("Hello", 'X');
        
        Assert.NotNull(results);
        Assert.Equal(4, results.Length);
        
        Assert.IsType<char>(results[0]);
        Assert.Equal('H', (char)results[0]);
        
        Assert.IsType<char>(results[1]);
        Assert.Equal('o', (char)results[1]);
        
        Assert.IsType<string>(results[2]);
        Assert.Equal("X", (string)results[2]);
        
        Assert.IsType<string>(results[3]);
        Assert.Equal("HelloX", (string)results[3]);
    }

    [Fact]
    public void PerformStringCharOperations_ShouldHandleDifferentInputs()
    {
        var results = StringAndCharOperations.PerformStringCharOperations("Java", 'Z');
        
        Assert.Equal('J', (char)results[0]);
        Assert.Equal('a', (char)results[1]);
        Assert.Equal("Z", (string)results[2]);
        Assert.Equal("JavaZ", (string)results[3]);
    }
} 