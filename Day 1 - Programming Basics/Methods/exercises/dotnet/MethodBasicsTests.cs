namespace Methods.Tests;

using Methods.Exercises;
using Xunit;

public class MethodBasicsTests
{
    [Fact]
    public void AddNumbers_ShouldReturnCorrectSum()
    {
        Assert.Equal(8, MethodBasics.AddNumbers(5,3));
        Assert.Equal(5, MethodBasics.AddNumbers(-2,7));
        Assert.Equal(0, MethodBasics.AddNumbers(0,0));
    }

    [Fact]
    public void IsEven_ShouldReturnExpectedResults()
    {
        Assert.True(MethodBasics.IsEven(4));
        Assert.False(MethodBasics.IsEven(7));
        Assert.True(MethodBasics.IsEven(0));
        Assert.True(MethodBasics.IsEven(-2));
    }

    [Fact]
    public void GetFullName_ShouldCombineNames()
    {
        Assert.Equal("John Doe", MethodBasics.GetFullName("John","Doe"));
        Assert.Equal("Alice Smith", MethodBasics.GetFullName("Alice","Smith"));
        Assert.Equal(" ", MethodBasics.GetFullName("",""));
    }
} 