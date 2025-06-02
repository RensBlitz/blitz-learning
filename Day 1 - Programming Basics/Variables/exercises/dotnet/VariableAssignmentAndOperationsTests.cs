namespace Variables.Tests;

using Variables.Exercises;
using Xunit;

public class VariableAssignmentAndOperationsTests
{
    [Fact]
    public void PerformCalculations_ShouldReturnArrayWithCorrectLength()
    {
        var results = VariableAssignmentAndOperations.PerformCalculations();
        Assert.NotNull(results);
        Assert.Equal(5, results.Length);
    }

    [Fact]
    public void PerformCalculations_ShouldReturnCorrectArithmeticResults()
    {
        var results = VariableAssignmentAndOperations.PerformCalculations();
        Assert.NotNull(results);
        Assert.Equal(13, results[0]); // sum
        Assert.Equal(7, results[1]);  // difference
        Assert.Equal(30, results[2]); // product
        Assert.Equal(3, results[3]);  // quotient (integer division)
        Assert.Equal(1, results[4]);  // remainder
    }
} 