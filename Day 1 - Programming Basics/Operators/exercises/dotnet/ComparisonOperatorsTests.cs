namespace Operators.Tests;

using Operators.Exercises;
using Xunit;

public class ComparisonOperatorsTests
{
    [Fact]
    public void CompareValues_ShouldReturnCorrectComparisons_WhenFirstGreater()
    {
        bool[] result = ComparisonOperators.CompareValues(5, 3);
        
        Assert.NotNull(result);
        Assert.Equal(6, result.Length);
        Assert.False(result[0]); // 5 == 3 should be false
        Assert.True(result[1]);  // 5 != 3 should be true
        Assert.True(result[2]);  // 5 > 3 should be true
        Assert.False(result[3]); // 5 < 3 should be false
        Assert.True(result[4]);  // 5 >= 3 should be true
        Assert.False(result[5]); // 5 <= 3 should be false
    }

    [Fact]
    public void CompareValues_ShouldReturnCorrectComparisons_WhenEqual()
    {
        bool[] result = ComparisonOperators.CompareValues(4, 4);
        
        Assert.True(result[0]);  // 4 == 4 should be true
        Assert.False(result[1]); // 4 != 4 should be false
        Assert.False(result[2]); // 4 > 4 should be false
        Assert.False(result[3]); // 4 < 4 should be false
        Assert.True(result[4]);  // 4 >= 4 should be true
        Assert.True(result[5]);  // 4 <= 4 should be true
    }

    [Fact]
    public void CompareValues_ShouldReturnCorrectComparisons_WhenFirstSmaller()
    {
        bool[] result = ComparisonOperators.CompareValues(2, 7);
        
        Assert.False(result[0]); // 2 == 7 should be false
        Assert.True(result[1]);  // 2 != 7 should be true
        Assert.False(result[2]); // 2 > 7 should be false
        Assert.True(result[3]);  // 2 < 7 should be true
        Assert.False(result[4]); // 2 >= 7 should be false
        Assert.True(result[5]);  // 2 <= 7 should be true
    }

    [Fact]
    public void CompareValues_ShouldHandleNegativeNumbers()
    {
        bool[] result = ComparisonOperators.CompareValues(-3, -1);
        
        Assert.False(result[0]); // -3 == -1 should be false
        Assert.True(result[1]);  // -3 != -1 should be true
        Assert.False(result[2]); // -3 > -1 should be false
        Assert.True(result[3]);  // -3 < -1 should be true
        Assert.False(result[4]); // -3 >= -1 should be false
        Assert.True(result[5]);  // -3 <= -1 should be true
    }
} 