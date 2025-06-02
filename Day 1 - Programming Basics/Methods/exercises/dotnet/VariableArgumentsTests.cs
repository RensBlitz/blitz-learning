namespace Methods.Tests;

using Methods.Exercises;
using Xunit;
using System;

public class VariableArgumentsTests
{
    [Fact]
    public void CalculateSum_MultipleNumbers_ShouldReturnCorrectSum()
    {
        var sum = VariableArguments.CalculateSum(1, 2, 3, 4, 5);
        Assert.Equal(15, sum);
    }

    [Fact]
    public void CalculateSum_MixedNumbers_ShouldReturnCorrectSum()
    {
        var sum = VariableArguments.CalculateSum(10, -5, 7);
        Assert.Equal(12, sum);
    }

    [Fact]
    public void CalculateSum_NoArguments_ShouldReturnZero()
    {
        var sum = VariableArguments.CalculateSum();
        Assert.Equal(0, sum);
    }

    [Fact]
    public void CalculateSum_SingleNumber_ShouldReturnThatNumber()
    {
        var sum = VariableArguments.CalculateSum(100);
        Assert.Equal(100, sum);
    }

    [Fact]
    public void ConcatenateStrings_MultipleStrings_ShouldReturnConcatenatedWithDelimiter()
    {
        var result = VariableArguments.ConcatenateStrings(", ", "apple", "banana", "cherry");
        Assert.Equal("apple, banana, cherry", result);
    }

    [Fact]
    public void ConcatenateStrings_TwoStrings_ShouldReturnConcatenatedWithDelimiter()
    {
        var result = VariableArguments.ConcatenateStrings("-", "one", "two");
        Assert.Equal("one-two", result);
    }

    [Fact]
    public void ConcatenateStrings_NoStrings_ShouldReturnEmptyString()
    {
        var result = VariableArguments.ConcatenateStrings(", ");
        Assert.Equal("", result);
    }

    [Fact]
    public void ConcatenateStrings_SingleString_ShouldReturnThatString()
    {
        var result = VariableArguments.ConcatenateStrings(" ", "hello");
        Assert.Equal("hello", result);
    }

    [Fact]
    public void FindMaximum_MultipleNumbers_ShouldReturnLargest()
    {
        var max = VariableArguments.FindMaximum(5, 8, 2, 10, 3);
        Assert.Equal(10, max);
    }

    [Fact]
    public void FindMaximum_SingleNumber_ShouldReturnThatNumber()
    {
        var max = VariableArguments.FindMaximum(100);
        Assert.Equal(100, max);
    }

    [Fact]
    public void FindMaximum_NegativeNumbers_ShouldReturnLargest()
    {
        var max = VariableArguments.FindMaximum(-5, -10, -15);
        Assert.Equal(-5, max);
    }

    [Fact]
    public void FindMaximum_NoArguments_ShouldThrowArgumentException()
    {
        var exception = Assert.Throws<ArgumentException>(() => VariableArguments.FindMaximum());
        Assert.Equal("No arguments provided", exception.Message);
    }

    [Fact]
    public void CreateFormattedList_MultipleItems_ShouldReturnFormattedList()
    {
        var result = VariableArguments.CreateFormattedList("Shopping List", "Apples", "Bananas", "Milk");
        var expected = "Title: Shopping List\n- Apples\n- Bananas\n- Milk";
        Assert.Equal(expected, result);
    }

    [Fact]
    public void CreateFormattedList_TwoItems_ShouldReturnFormattedList()
    {
        var result = VariableArguments.CreateFormattedList("To-Do", "Study Java", "Exercise");
        var expected = "Title: To-Do\n- Study Java\n- Exercise";
        Assert.Equal(expected, result);
    }

    [Fact]
    public void CreateFormattedList_NoItems_ShouldReturnTitleOnly()
    {
        var result = VariableArguments.CreateFormattedList("Empty List");
        var expected = "Title: Empty List";
        Assert.Equal(expected, result);
    }

    [Fact]
    public void CreateFormattedList_MixedTypes_ShouldReturnFormattedList()
    {
        var result = VariableArguments.CreateFormattedList("Mixed Types", 42, "Hello", true, 3.14);
        var expected = "Title: Mixed Types\n- 42\n- Hello\n- True\n- 3.14";
        Assert.Equal(expected, result);
    }
} 