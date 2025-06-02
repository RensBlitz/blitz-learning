namespace DataTypes.Tests;

using DataTypes.Exercises;
using Xunit;

public class TypeConversionTests
{
    [Fact]
    public void PerformWidening_ShouldConvertIntToDouble()
    {
        double result = TypeConversion.PerformWidening(100);
        Assert.Equal(100.0, result, 3);
    }

    [Fact]
    public void PerformNarrowing_ShouldConvertDoubleToIntWithDataLoss()
    {
        int result = TypeConversion.PerformNarrowing(123.75);
        Assert.Equal(123, result);

        int result2 = TypeConversion.PerformNarrowing(99.99);
        Assert.Equal(99, result2);
    }
} 