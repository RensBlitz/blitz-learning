namespace Methods.Tests;

using Methods.Exercises;
using Xunit;

public class MethodParametersTests
{
    [Fact]
    public void CalculateAverage_ShouldReturnExpected()
    {
        Assert.InRange(MethodParameters.CalculateAverage(new[]{1.0,2.0,3.0,4.0,5.0}),2.999,3.001);
        Assert.InRange(MethodParameters.CalculateAverage(new[]{-1.5,2.5,0.0}),0.332,0.334);
        Assert.Equal(0.0, MethodParameters.CalculateAverage(System.Array.Empty<double>()));
    }

    [Fact]
    public void CountOccurrences_ShouldWork()
    {
        Assert.Equal(2, MethodParameters.CountOccurrences("hello",'l'));
        Assert.Equal(4, MethodParameters.CountOccurrences("Mississippi",'s'));
        Assert.Equal(0, MethodParameters.CountOccurrences("Java",'j'));
    }

    [Fact]
    public void CreateGreeting_ShouldFormatProperly()
    {
        Assert.Equal("Good morning, Alice!", MethodParameters.CreateGreeting("Alice","morning"));
        Assert.Equal("Good evening, Bob!", MethodParameters.CreateGreeting("Bob","evening"));
        Assert.Equal("Good day, Charlie!", MethodParameters.CreateGreeting("Charlie","night"));
    }

    [Fact]
    public void DoubleArrayElements_ShouldModifyInPlace()
    {
        int[] arr={1,2,3,4};
        MethodParameters.DoubleArrayElements(arr);
        Assert.Equal(new[]{2,4,6,8},arr);
        int[] arr2={0,-1,5};
        MethodParameters.DoubleArrayElements(arr2);
        Assert.Equal(new[]{0,-2,10},arr2);
    }
} 