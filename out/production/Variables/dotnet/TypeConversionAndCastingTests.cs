namespace Variables.Tests;

using Variables.Exercises;
using Xunit;

public class TypeConversionAndCastingTests
{
    [Fact]
    public void PerformWidening_ShouldReturn100()
    {
        double result = TypeConversionAndCasting.PerformWidening();
        Assert.InRange(result, 99.999, 100.001);
    }

    [Fact]
    public void PerformNarrowing_ShouldReturnExpectedArray()
    {
        var results = TypeConversionAndCasting.PerformNarrowing();
        Assert.NotNull(results);
        Assert.Equal(6, results.Length);
        Assert.IsType<double>(results[0]);
        Assert.IsType<float>(results[1]);
        Assert.IsType<long>(results[2]);
        Assert.IsType<int>(results[3]);
        Assert.IsType<short>(results[4]);
        Assert.IsType<byte>(results[5]);
        // Validate truncation to byte 100
        Assert.Equal((byte)100, results[5]);
    }

    [Fact]
    public void ConvertWithStrings_ShouldReturnExpectedResults()
    {
        var results = TypeConversionAndCasting.ConvertWithStrings();
        Assert.NotNull(results);
        Assert.Equal(3, results.Length);
        Assert.Equal("42", results[0]);
        Assert.InRange((double)results[1], 3.14158, 3.14160);
        Assert.Equal(-1, results[2]);
    }
} 