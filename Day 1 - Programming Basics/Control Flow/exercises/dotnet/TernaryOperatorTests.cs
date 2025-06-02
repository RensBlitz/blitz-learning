namespace ControlFlow.Tests;

using ControlFlow.Exercises;
using Xunit;

public class TernaryOperatorTests
{
    [Fact]
    public void FindMaximum_ShouldReturnLargerNumber()
    {
        Assert.Equal(10, TernaryOperator.FindMaximum(5, 10));
        Assert.Equal(10, TernaryOperator.FindMaximum(10, 5));
        Assert.Equal(7, TernaryOperator.FindMaximum(7, 7));
        Assert.Equal(-5, TernaryOperator.FindMaximum(-5, -10));
        Assert.Equal(0, TernaryOperator.FindMaximum(0, 0));
    }

    [Fact]
    public void CheckEvenOdd_ShouldReturnCorrectClassification()
    {
        Assert.Equal("Even", TernaryOperator.CheckEvenOdd(0));
        Assert.Equal("Odd", TernaryOperator.CheckEvenOdd(1));
        Assert.Equal("Even", TernaryOperator.CheckEvenOdd(2));
        Assert.Equal("Odd", TernaryOperator.CheckEvenOdd(3));
        Assert.Equal("Even", TernaryOperator.CheckEvenOdd(4));
        Assert.Equal("Odd", TernaryOperator.CheckEvenOdd(-1));
        Assert.Equal("Even", TernaryOperator.CheckEvenOdd(-2));
    }

    [Fact]
    public void GetNumberSign_ShouldReturnCorrectSign()
    {
        Assert.Equal("Positive", TernaryOperator.GetNumberSign(10));
        Assert.Equal("Negative", TernaryOperator.GetNumberSign(-10));
        Assert.Equal("Zero", TernaryOperator.GetNumberSign(0));
        Assert.Equal("Positive", TernaryOperator.GetNumberSign(int.MaxValue));
        Assert.Equal("Negative", TernaryOperator.GetNumberSign(int.MinValue));
    }

    [Fact]
    public void FindLarger_ShouldReturnLargerNumber()
    {
        Assert.Equal(10, TernaryOperator.FindLarger(5, 10));
        Assert.Equal(10, TernaryOperator.FindLarger(10, 5));
        Assert.Equal(7, TernaryOperator.FindLarger(7, 7));
    }

    [Fact]
    public void ClassifyNumber_ShouldReturnCorrectClassification()
    {
        Assert.Equal("Even", TernaryOperator.ClassifyNumber(4));
        Assert.Equal("Odd", TernaryOperator.ClassifyNumber(7));
        Assert.Equal("Even", TernaryOperator.ClassifyNumber(0));
    }

    [Fact]
    public void AnalyzeNumber_ShouldReturnCorrectAnalysis()
    {
        Assert.Equal("Positive", TernaryOperator.AnalyzeNumber(10));
        Assert.Equal("Negative", TernaryOperator.AnalyzeNumber(-5));
        Assert.Equal("Zero", TernaryOperator.AnalyzeNumber(0));
    }
} 