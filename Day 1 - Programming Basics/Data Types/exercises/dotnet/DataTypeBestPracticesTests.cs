namespace DataTypes.Tests;

using DataTypes.Exercises;
using Xunit;

public class DataTypeBestPracticesTests
{
    [Fact]
    public void FixNullReference_ShouldReturnCorrectSum()
    {
        int sum = DataTypeBestPractices.FixNullReference();
        Assert.Equal(6, sum);
    }

    [Fact]
    public void FixIntegerDivision_ShouldReturnCorrectResult()
    {
        double result = DataTypeBestPractices.FixIntegerDivision();
        Assert.Equal(2.5, result, 3);
    }

    [Fact]
    public void FixStringEquality_ShouldCompareContent()
    {
        // These are different string instances with the same content
        string s1 = "Hello";
        string s2 = new string("Hello".ToCharArray());
        
        bool result = DataTypeBestPractices.FixStringEquality(s1, s2);
        Assert.True(result);
    }
} 