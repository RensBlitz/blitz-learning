namespace Methods.Tests;

using Methods.Exercises;
using Xunit;

public class MethodDocumentationTests
{
    [Fact]
    public void CalculateCircleArea_ValidRadius_ShouldReturnCorrectArea()
    {
        var area = MethodDocumentation.CalculateCircleArea(2.0);
        Assert.Equal(12.566, area, 3);
    }

    [Fact]
    public void CalculateCircleArea_ZeroRadius_ShouldReturnZero()
    {
        var area = MethodDocumentation.CalculateCircleArea(0.0);
        Assert.Equal(0.0, area);
    }

    [Fact]
    public void CalculateCircleArea_NegativeRadius_ShouldReturnZero()
    {
        var area = MethodDocumentation.CalculateCircleArea(-1.0);
        Assert.Equal(0.0, area);
    }

    [Fact]
    public void IsValidEmailAddress_ValidEmail_ShouldReturnTrue()
    {
        var isValid = MethodDocumentation.IsValidEmailAddress("user@example.com");
        Assert.True(isValid);
    }

    [Fact]
    public void IsValidEmailAddress_InvalidEmail_ShouldReturnFalse()
    {
        var isValid = MethodDocumentation.IsValidEmailAddress("invalid-email");
        Assert.False(isValid);
    }

    [Fact]
    public void IsValidEmailAddress_NullEmail_ShouldReturnFalse()
    {
        var isValid = MethodDocumentation.IsValidEmailAddress(null!);
        Assert.False(isValid);
    }

    [Fact]
    public void IsValidEmailAddress_EmailWithoutDot_ShouldReturnFalse()
    {
        var isValid = MethodDocumentation.IsValidEmailAddress("user@domain");
        Assert.False(isValid);
    }

    [Fact]
    public void FormatCurrency_ValidAmountAndSymbol_ShouldReturnFormattedString()
    {
        var formatted = MethodDocumentation.FormatCurrency(1234.56, "$");
        Assert.Equal("$1234.56", formatted);
    }

    [Fact]
    public void FormatCurrency_DifferentSymbol_ShouldReturnFormattedString()
    {
        var formatted = MethodDocumentation.FormatCurrency(0.5, "€");
        Assert.Equal("€0.50", formatted);
    }

    [Fact]
    public void FormatCurrency_NullSymbol_ShouldUseDefaultDollarSign()
    {
        var formatted = MethodDocumentation.FormatCurrency(1000.0, null!);
        Assert.Equal("$1000.00", formatted);
    }

    [Fact]
    public void CalculateFactorial_ValidNumber_ShouldReturnCorrectFactorial()
    {
        var factorial = MethodDocumentation.CalculateFactorial(5);
        Assert.Equal(120L, factorial);
    }

    [Fact]
    public void CalculateFactorial_Zero_ShouldReturnOne()
    {
        var factorial = MethodDocumentation.CalculateFactorial(0);
        Assert.Equal(1L, factorial);
    }

    [Fact]
    public void CalculateFactorial_One_ShouldReturnOne()
    {
        var factorial = MethodDocumentation.CalculateFactorial(1);
        Assert.Equal(1L, factorial);
    }

    [Fact]
    public void CalculateFactorial_LargerNumber_ShouldReturnCorrectFactorial()
    {
        var factorial = MethodDocumentation.CalculateFactorial(12);
        Assert.Equal(479001600L, factorial);
    }

    [Fact]
    public void CalculateFactorial_NegativeNumber_ShouldReturnZero()
    {
        var factorial = MethodDocumentation.CalculateFactorial(-1);
        Assert.Equal(0L, factorial);
    }
} 