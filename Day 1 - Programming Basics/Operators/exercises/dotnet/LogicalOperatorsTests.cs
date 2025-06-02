namespace Operators.Tests;

using Operators.Exercises;
using Xunit;

public class LogicalOperatorsTests
{
    [Fact]
    public void LogicalOps_ShouldReturnCorrectResults_WithMixedValues()
    {
        bool[] result = LogicalOperators.LogicalOps(true, false, true);
        
        Assert.NotNull(result);
        Assert.Equal(5, result.Length);
        Assert.False(result[0]); // true && false should be false
        Assert.True(result[1]);  // true || false should be true
        Assert.False(result[2]); // !true should be false
        Assert.True(result[3]);  // (true && false) || true should be true
        Assert.True(result[4]);  // true && (false || true) should be true
    }

    [Fact]
    public void LogicalOps_ShouldReturnCorrectResults_WithAllFalse()
    {
        bool[] result = LogicalOperators.LogicalOps(false, false, false);
        
        Assert.False(result[0]); // false && false should be false
        Assert.False(result[1]); // false || false should be false
        Assert.True(result[2]);  // !false should be true
        Assert.False(result[3]); // (false && false) || false should be false
        Assert.False(result[4]); // false && (false || false) should be false
    }

    [Fact]
    public void LogicalOps_ShouldReturnCorrectResults_WithAllTrue()
    {
        bool[] result = LogicalOperators.LogicalOps(true, true, true);
        
        Assert.True(result[0]);  // true && true should be true
        Assert.True(result[1]);  // true || true should be true
        Assert.False(result[2]); // !true should be false
        Assert.True(result[3]);  // (true && true) || true should be true
        Assert.True(result[4]);  // true && (true || true) should be true
    }

    [Fact]
    public void LogicalOps_ShouldDemonstrateShortCircuitEvaluation()
    {
        // Test case to verify understanding of short-circuit evaluation
        bool[] result = LogicalOperators.LogicalOps(false, true, false);
        
        Assert.False(result[0]); // false && true should be false (short-circuited)
        Assert.True(result[1]);  // false || true should be true
        Assert.True(result[2]);  // !false should be true
        Assert.False(result[3]); // (false && true) || false should be false
        Assert.False(result[4]); // false && (true || false) should be false (short-circuited)
    }

    [Fact]
    public void LogicalOps_ShouldHandleEmergencyOverride()
    {
        // Test emergency override scenario
        bool[] result = LogicalOperators.LogicalOps(false, false, true);
        
        Assert.False(result[0]); // false && false should be false
        Assert.False(result[1]); // false || false should be false
        Assert.True(result[2]);  // !false should be true
        Assert.True(result[3]);  // (false && false) || true should be true (emergency override works)
        Assert.False(result[4]); // false && (false || true) should be false
    }
} 