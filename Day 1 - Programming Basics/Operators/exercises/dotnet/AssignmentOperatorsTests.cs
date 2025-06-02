namespace Operators.Tests;

using Operators.Exercises;
using Xunit;

public class AssignmentOperatorsTests
{
    [Fact]
    public void CompoundOps_ShouldReturnCorrectResult_FromJavaExample()
    {
        int result = AssignmentOperators.CompoundOps(5, 3, 2, 4, 3, 2);
        
        // Calculation: (((((5 + 3) - 2) * 4) / 3) % 2)
        // Steps: 5+3=8, 8-2=6, 6*4=24, 24/3=8, 8%2=0
        Assert.Equal(0, result);
    }

    [Fact]
    public void CompoundOps_ShouldReturnCorrectResult_SecondExample()
    {
        int result = AssignmentOperators.CompoundOps(10, 5, 3, 2, 4, 3);
        
        // Steps: 10+5=15, 15-3=12, 12*2=24, 24/4=6, 6%3=0
        Assert.Equal(0, result);
    }

    [Fact]
    public void CompoundOps_ShouldHandleNoRemainder()
    {
        int result = AssignmentOperators.CompoundOps(2, 3, 1, 3, 2, 5);
        
        // Steps: 2+3=5, 5-1=4, 4*3=12, 12/2=6, 6%5=1
        Assert.Equal(1, result);
    }

    [Fact]
    public void CompoundOps_ShouldHandleZeroOperations()
    {
        int result = AssignmentOperators.CompoundOps(7, 0, 0, 1, 1, 10);
        
        // Steps: 7+0=7, 7-0=7, 7*1=7, 7/1=7, 7%10=7
        Assert.Equal(7, result);
    }

    [Fact]
    public void CompoundOps_ShouldHandleNegativeNumbers()
    {
        int result = AssignmentOperators.CompoundOps(-4, 6, 3, 2, 2, 3);
        
        // Steps: -4+6=2, 2-3=-1, -1*2=-2, -2/2=-1, -1%3=-1
        Assert.Equal(-1, result);
    }
} 