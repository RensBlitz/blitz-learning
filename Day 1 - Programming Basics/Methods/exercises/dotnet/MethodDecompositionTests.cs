namespace Methods.Tests;

using Methods.Exercises;
using Xunit;
using System;

public class MethodDecompositionTests
{
    [Fact]
    public void ProcessGrades_ValidGrades_ShouldReturnCorrectStatistics()
    {
        var grades = new[] { 85, 92, 78, 65, 90, 55, 72, 68 };
        var result = MethodDecomposition.ProcessGrades(grades);

        Assert.NotNull(result);
        Assert.Equal(4, result.Length);
        Assert.Equal(75.625, result[0], 3); // Average
        Assert.Equal(92, result[1], 0); // Highest
        Assert.Equal(55, result[2], 0); // Lowest
        Assert.Equal(7, result[3], 0); // Passing count
    }

    [Fact]
    public void ProcessGrades_EmptyArray_ShouldReturnZeros()
    {
        var emptyGrades = new int[0];
        var result = MethodDecomposition.ProcessGrades(emptyGrades);

        Assert.NotNull(result);
        Assert.Equal(4, result.Length);
        Assert.Equal(0.0, result[0]); // Average
        Assert.Equal(0, result[1], 0); // Highest
        Assert.Equal(0, result[2], 0); // Lowest
        Assert.Equal(0, result[3], 0); // Passing count
    }

    [Fact]
    public void ValidatePassword_ValidPassword_ShouldReturnTrue()
    {
        var isValid = MethodDecomposition.ValidatePassword("Passw0rd!");
        Assert.True(isValid);
    }

    [Fact]
    public void ValidatePassword_MissingUppercase_ShouldReturnFalse()
    {
        var isValid = MethodDecomposition.ValidatePassword("password1!");
        Assert.False(isValid);
    }

    [Fact]
    public void ValidatePassword_MissingLowercase_ShouldReturnFalse()
    {
        var isValid = MethodDecomposition.ValidatePassword("PASSWORD1!");
        Assert.False(isValid);
    }

    [Fact]
    public void ValidatePassword_MissingDigit_ShouldReturnFalse()
    {
        var isValid = MethodDecomposition.ValidatePassword("Password!");
        Assert.False(isValid);
    }

    [Fact]
    public void ValidatePassword_MissingSpecialChar_ShouldReturnFalse()
    {
        var isValid = MethodDecomposition.ValidatePassword("Password1");
        Assert.False(isValid);
    }

    [Fact]
    public void ValidatePassword_TooShort_ShouldReturnFalse()
    {
        var isValid = MethodDecomposition.ValidatePassword("Pass1!");
        Assert.False(isValid);
    }

    [Fact]
    public void ValidatePassword_SimplePassword_ShouldReturnFalse()
    {
        var isValid = MethodDecomposition.ValidatePassword("password");
        Assert.False(isValid);
    }

    [Fact]
    public void ValidatePassword_NumericPassword_ShouldReturnFalse()
    {
        var isValid = MethodDecomposition.ValidatePassword("12345678");
        Assert.False(isValid);
    }

    [Fact]
    public void AnalyzeText_ValidText_ShouldReturnCorrectStatistics()
    {
        var text = "Hello, world! This is a sample text. It has three sentences.";
        var result = MethodDecomposition.AnalyzeText(text);

        Assert.NotNull(result);
        Assert.Equal(3, result.Length);
        Assert.Equal(12, result[0]); // Word count
        Assert.Equal(3, result[1]); // Sentence count
        Assert.Equal(4.0, (double)result[2], 3); // Average word length
    }

    [Fact]
    public void AnalyzeText_EmptyText_ShouldReturnZeros()
    {
        var result = MethodDecomposition.AnalyzeText("");

        Assert.NotNull(result);
        Assert.Equal(3, result.Length);
        Assert.Equal(0, result[0]); // Word count
        Assert.Equal(0, result[1]); // Sentence count
        Assert.Equal(0.0, (double)result[2]); // Average word length
    }

    [Fact]
    public void AnalyzeText_NullText_ShouldReturnZeros()
    {
        var result = MethodDecomposition.AnalyzeText(null!);

        Assert.NotNull(result);
        Assert.Equal(3, result.Length);
        Assert.Equal(0, result[0]); // Word count
        Assert.Equal(0, result[1]); // Sentence count
        Assert.Equal(0.0, (double)result[2]); // Average word length
    }

    [Fact]
    public void AnalyzeText_SingleWord_ShouldReturnCorrectStatistics()
    {
        var text = "Hello!";
        var result = MethodDecomposition.AnalyzeText(text);

        Assert.NotNull(result);
        Assert.Equal(3, result.Length);
        Assert.Equal(1, result[0]); // Word count
        Assert.Equal(1, result[1]); // Sentence count
        Assert.Equal(5.0, (double)result[2], 3); // Average word length (Hello = 5 chars)
    }

    [Fact]
    public void AnalyzeText_MultipleSentenceTypes_ShouldCountCorrectly()
    {
        var text = "Is this working? Yes, it is! Great.";
        var result = MethodDecomposition.AnalyzeText(text);

        Assert.NotNull(result);
        Assert.Equal(3, result.Length);
        Assert.Equal(6, result[0]); // Word count: Is, this, working, Yes, it, is, Great
        Assert.Equal(3, result[1]); // Sentence count: ?, !, .
    }
} 