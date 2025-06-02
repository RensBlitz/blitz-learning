namespace Operators.Tests;

using Operators.Exercises;
using Xunit;

public class OperatorBestPracticesTests
{
    [Fact]
    public void FixPitfalls_ShouldReturnCorrectResults_FromJavaExample()
    {
        object[] result = OperatorBestPractices.FixPitfalls(4, 2, 3, 5);
        
        Assert.NotNull(result);
        Assert.Equal(3, result.Length);
        Assert.Equal(true, result[0]);  // 4 should be even
        Assert.Equal(25, result[1]);    // (2+3)*5 should be 25
        Assert.Equal(true, result[2]);  // 2 and 3 should both be positive
    }

    [Fact]
    public void FixPitfalls_ShouldReturnCorrectResults_SecondExample()
    {
        object[] result = OperatorBestPractices.FixPitfalls(7, -1, 2, 4);
        
        Assert.Equal(false, result[0]); // 7 should not be even
        Assert.Equal(4, result[1]);     // (-1+2)*4 should be 4
        Assert.Equal(false, result[2]); // -1 and 2 are not both positive
    }

    [Fact]
    public void FixPitfalls_ShouldHandleZero()
    {
        object[] result = OperatorBestPractices.FixPitfalls(0, 0, 5, 3);
        
        Assert.Equal(true, result[0]);  // 0 should be even
        Assert.Equal(15, result[1]);    // (0+5)*3 should be 15
        Assert.Equal(false, result[2]); // 0 and 5 are not both positive (0 is not positive)
    }

    [Fact]
    public void FixPitfalls_ShouldHandleNegativeNumbers()
    {
        object[] result = OperatorBestPractices.FixPitfalls(-6, -3, -2, 2);
        
        Assert.Equal(true, result[0]);  // -6 should be even
        Assert.Equal(-10, result[1]);   // (-3+(-2))*2 should be -10
        Assert.Equal(false, result[2]); // -3 and -2 are not both positive
    }

    [Fact]
    public void FixPitfalls_ShouldDemonstrateOperatorPrecedence()
    {
        // This test demonstrates the importance of parentheses
        object[] result = OperatorBestPractices.FixPitfalls(10, 3, 4, 2);
        
        Assert.Equal(true, result[0]);  // 10 should be even
        Assert.Equal(14, result[1]);    // (3+4)*2 = 14, not 3+4*2 = 11
        Assert.Equal(true, result[2]);  // 3 and 4 are both positive
    }

    [Fact]
    public void FixPitfalls_ShouldValidateBooleanTypes()
    {
        object[] result = OperatorBestPractices.FixPitfalls(1, 1, 1, 1);
        
        // Verify that the returned objects are of the correct types
        Assert.IsType<bool>(result[0]);
        Assert.IsType<int>(result[1]);
        Assert.IsType<bool>(result[2]);
        
        Assert.Equal(false, result[0]); // 1 is not even
        Assert.Equal(2, result[1]);     // (1+1)*1 = 2
        Assert.Equal(true, result[2]);  // 1 and 1 are both positive
    }
} 