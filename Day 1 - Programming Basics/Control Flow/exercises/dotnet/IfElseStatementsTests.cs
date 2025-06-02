namespace ControlFlow.Tests;

using ControlFlow.Exercises;
using Xunit;

public class IfElseStatementsTests
{
    [Fact]
    public void ClassifyGrade_ShouldReturnCorrectGrades()
    {
        Assert.Equal("A", IfElseStatements.ClassifyGrade(95));
        Assert.Equal("B", IfElseStatements.ClassifyGrade(85));
        Assert.Equal("C", IfElseStatements.ClassifyGrade(75));
        Assert.Equal("D", IfElseStatements.ClassifyGrade(65));
        Assert.Equal("F", IfElseStatements.ClassifyGrade(55));
        Assert.Equal("F", IfElseStatements.ClassifyGrade(30));
    }

    [Fact]
    public void ClassifyGrade_ShouldHandleEdgeCases()
    {
        Assert.Equal("A", IfElseStatements.ClassifyGrade(90));
        Assert.Equal("B", IfElseStatements.ClassifyGrade(80));
        Assert.Equal("C", IfElseStatements.ClassifyGrade(70));
        Assert.Equal("D", IfElseStatements.ClassifyGrade(60));
        Assert.Equal("F", IfElseStatements.ClassifyGrade(0));
        Assert.Equal("A", IfElseStatements.ClassifyGrade(100));
    }

    [Fact]
    public void CalculateTicketPrice_ShouldReturnCorrectPrices()
    {
        Assert.Equal(10.0, IfElseStatements.CalculateTicketPrice(25, false));
        Assert.Equal(8.0, IfElseStatements.CalculateTicketPrice(65, false));
        Assert.Equal(5.0, IfElseStatements.CalculateTicketPrice(10, false));
        Assert.Equal(8.0, IfElseStatements.CalculateTicketPrice(25, true));
        Assert.Equal(6.4, IfElseStatements.CalculateTicketPrice(65, true));
        Assert.Equal(4.0, IfElseStatements.CalculateTicketPrice(10, true));
    }

    [Fact]
    public void IsLeapYear_ShouldReturnCorrectResults()
    {
        Assert.True(IfElseStatements.IsLeapYear(2000));
        Assert.True(IfElseStatements.IsLeapYear(2004));
        Assert.True(IfElseStatements.IsLeapYear(2020));
        Assert.False(IfElseStatements.IsLeapYear(1900));
        Assert.False(IfElseStatements.IsLeapYear(2001));
        Assert.False(IfElseStatements.IsLeapYear(2100));
    }
} 