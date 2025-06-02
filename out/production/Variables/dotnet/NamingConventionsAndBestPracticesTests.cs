namespace Variables.Tests;

using Variables.Exercises;
using Xunit;

public class NamingConventionsAndBestPracticesTests
{
    [Fact]
    public void DemonstrateNaming_ShouldReturnExpectedValues()
    {
        var results = NamingConventionsAndBestPractices.DemonstrateNaming();
        Assert.NotNull(results);
        Assert.Equal(3, results.Length);
        Assert.Equal(30, results[0]);
        Assert.InRange((double)results[1], 99.999, 100.001);
        Assert.InRange((double)results[2], 120.999, 121.001);
    }

    [Fact]
    public void TaxRateConstant_ShouldBeDeclared()
    {
        var field = typeof(NamingConventionsAndBestPractices).GetField("TAX_RATE");
        Assert.NotNull(field);
        double value = (double)field!.GetRawConstantValue()!;
        Assert.InRange(value, 0.209, 0.211);
    }
} 