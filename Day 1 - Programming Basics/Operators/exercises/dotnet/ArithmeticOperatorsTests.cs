namespace Operators.Tests;

using Operators.Exercises;
using Xunit;

public class ArithmeticOperatorsTests
{
    [Fact]
    public void BasicArithmetic_ShouldReturnCorrectCalculations()
    {
        int[] result = ArithmeticOperators.BasicArithmetic(10, 3);
        
        Assert.NotNull(result);
        Assert.Equal(5, result.Length);
        Assert.Equal(13, result[0]); // Sum should be 13
        Assert.Equal(7, result[1]);  // Difference should be 7
        Assert.Equal(30, result[2]); // Product should be 30
        Assert.Equal(3, result[3]);  // Quotient should be 3
        Assert.Equal(1, result[4]);  // Remainder should be 1
    }

    [Fact]
    public void BasicArithmetic_ShouldHandleNegativeNumbers()
    {
        int[] result = ArithmeticOperators.BasicArithmetic(-6, 2);
        
        Assert.Equal(-4, result[0]); // Sum: -6 + 2 = -4
        Assert.Equal(-8, result[1]); // Difference: -6 - 2 = -8
        Assert.Equal(-12, result[2]); // Product: -6 * 2 = -12
        Assert.Equal(-3, result[3]); // Division: -6 / 2 = -3
        Assert.Equal(0, result[4]);  // Remainder: -6 % 2 = 0
    }

    [Fact]
    public void BasicArithmetic_ShouldHandleZero()
    {
        int[] result = ArithmeticOperators.BasicArithmetic(0, 5);
        
        Assert.Equal(5, result[0]);  // Sum: 0 + 5 = 5
        Assert.Equal(-5, result[1]); // Difference: 0 - 5 = -5
        Assert.Equal(0, result[2]);  // Product: 0 * 5 = 0
        Assert.Equal(0, result[3]);  // Division: 0 / 5 = 0
        Assert.Equal(0, result[4]);  // Remainder: 0 % 5 = 0
    }
} 