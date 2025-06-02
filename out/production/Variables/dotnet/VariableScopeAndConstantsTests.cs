namespace Variables.Tests;

using Variables.Exercises;
using Xunit;

public class VariableScopeAndConstantsTests
{
    [Fact]
    public void CalculateCircle_ShouldReturnCorrectAreaAndCircumference()
    {
        const double radius = 2.0;
        var results = VariableScopeAndConstants.CalculateCircle(radius);
        Assert.NotNull(results);
        Assert.Equal(2, results.Length);
        const double pi = 3.14159;
        var expectedArea = pi * radius * radius;
        var expectedCirc = 2 * pi * radius;
        Assert.InRange(results[0], expectedArea - 0.0001, expectedArea + 0.0001);
        Assert.InRange(results[1], expectedCirc - 0.0001, expectedCirc + 0.0001);
    }

    [Fact]
    public void DemonstrateScope_ShouldReturn30OrMinus1()
    {
        int result = VariableScopeAndConstants.DemonstrateScope();
        Assert.True(result == 30 || result == -1, "Expected 30 or -1 indicating understanding of variable shadowing");
    }

    [Fact]
    public void PiConstant_ShouldBeAccessibleAndCorrect()
    {
        // The constant should be declared and accessible
        var piField = typeof(VariableScopeAndConstants).GetField("PI");
        Assert.NotNull(piField);
        Assert.True(piField!.IsLiteral || piField.IsStatic, "PI should be a constant or static readonly field");
        double value = (double)piField.GetRawConstantValue()!;
        Assert.InRange(value, 3.14158, 3.14160);
    }
} 