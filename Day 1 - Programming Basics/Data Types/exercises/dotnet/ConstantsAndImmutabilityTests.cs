namespace DataTypes.Tests;

using DataTypes.Exercises;
using Xunit;

public class ConstantsAndImmutabilityTests
{
    [Fact]
    public void WorkWithConstants_ShouldReturnCorrectResults()
    {
        var results = ConstantsAndImmutability.WorkWithConstants();
        
        Assert.NotNull(results);
        Assert.Equal(2, results.Length);
        
        // Test MAX_VALUE
        Assert.IsType<int>(results[0]);
        Assert.Equal(100, (int)results[0]);
        
        // Test FIXED_ARRAY
        Assert.IsType<int[]>(results[1]);
        var fixedArray = (int[])results[1];
        Assert.Equal(3, fixedArray.Length);
        Assert.Equal(99, fixedArray[0]);
        Assert.Equal(2, fixedArray[1]);
        Assert.Equal(3, fixedArray[2]);
    }

    [Fact]
    public void DemonstrateStringImmutability_ShouldReturnCorrectResults()
    {
        var results = ConstantsAndImmutability.DemonstrateStringImmutability();
        
        Assert.NotNull(results);
        Assert.Equal(2, results.Length);
        
        // Test original string
        Assert.IsType<string>(results[0]);
        Assert.Equal("Hello", (string)results[0]);
        
        // Test modified string
        Assert.IsType<string>(results[1]);
        Assert.Equal("Hello World", (string)results[1]);
    }
} 