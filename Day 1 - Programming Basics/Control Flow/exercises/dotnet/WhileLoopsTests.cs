namespace ControlFlow.Tests;

using ControlFlow.Exercises;
using Xunit;

public class WhileLoopsTests
{
    [Fact]
    public void CountDigits_ShouldReturnCorrectCount()
    {
        Assert.Equal(1, WhileLoops.CountDigits(0));
        Assert.Equal(1, WhileLoops.CountDigits(5));
        Assert.Equal(2, WhileLoops.CountDigits(10));
        Assert.Equal(3, WhileLoops.CountDigits(123));
        Assert.Equal(4, WhileLoops.CountDigits(9999));
        Assert.Equal(3, WhileLoops.CountDigits(-123));
    }

    [Fact]
    public void IsPrime_ShouldReturnCorrectResults()
    {
        Assert.False(WhileLoops.IsPrime(0));
        Assert.False(WhileLoops.IsPrime(1));
        Assert.True(WhileLoops.IsPrime(2));
        Assert.True(WhileLoops.IsPrime(3));
        Assert.False(WhileLoops.IsPrime(4));
        Assert.True(WhileLoops.IsPrime(5));
        Assert.False(WhileLoops.IsPrime(6));
        Assert.True(WhileLoops.IsPrime(7));
        Assert.False(WhileLoops.IsPrime(9));
        Assert.True(WhileLoops.IsPrime(11));
        Assert.True(WhileLoops.IsPrime(13));
        Assert.False(WhileLoops.IsPrime(15));
        Assert.True(WhileLoops.IsPrime(17));
        Assert.True(WhileLoops.IsPrime(19));
        Assert.False(WhileLoops.IsPrime(21));
        Assert.True(WhileLoops.IsPrime(23));
    }

    [Fact]
    public void ConvertToBinary_ShouldReturnCorrectBinary()
    {
        Assert.Equal("0", WhileLoops.ConvertToBinary(0));
        Assert.Equal("1", WhileLoops.ConvertToBinary(1));
        Assert.Equal("10", WhileLoops.ConvertToBinary(2));
        Assert.Equal("11", WhileLoops.ConvertToBinary(3));
        Assert.Equal("100", WhileLoops.ConvertToBinary(4));
        Assert.Equal("101", WhileLoops.ConvertToBinary(5));
        Assert.Equal("1010", WhileLoops.ConvertToBinary(10));
        Assert.Equal("1111", WhileLoops.ConvertToBinary(15));
        Assert.Equal("10100", WhileLoops.ConvertToBinary(20));
        Assert.Equal("101010", WhileLoops.ConvertToBinary(42));
    }
} 