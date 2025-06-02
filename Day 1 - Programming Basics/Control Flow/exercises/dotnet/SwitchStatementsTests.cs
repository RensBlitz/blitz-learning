namespace ControlFlow.Tests;

using ControlFlow.Exercises;
using Xunit;

public class SwitchStatementsTests
{
    [Fact]
    public void GetDayOfWeek_ShouldReturnCorrectDays()
    {
        Assert.Equal("Monday", SwitchStatements.GetDayOfWeek(1));
        Assert.Equal("Tuesday", SwitchStatements.GetDayOfWeek(2));
        Assert.Equal("Wednesday", SwitchStatements.GetDayOfWeek(3));
        Assert.Equal("Thursday", SwitchStatements.GetDayOfWeek(4));
        Assert.Equal("Friday", SwitchStatements.GetDayOfWeek(5));
        Assert.Equal("Saturday", SwitchStatements.GetDayOfWeek(6));
        Assert.Equal("Sunday", SwitchStatements.GetDayOfWeek(7));
        Assert.Equal("Invalid day", SwitchStatements.GetDayOfWeek(0));
        Assert.Equal("Invalid day", SwitchStatements.GetDayOfWeek(8));
    }

    [Fact]
    public void GetDaysInMonth_ShouldReturnCorrectDaysForNonLeapYear()
    {
        Assert.Equal(31, SwitchStatements.GetDaysInMonth("January", 2023));
        Assert.Equal(28, SwitchStatements.GetDaysInMonth("February", 2023));
        Assert.Equal(31, SwitchStatements.GetDaysInMonth("March", 2023));
        Assert.Equal(30, SwitchStatements.GetDaysInMonth("April", 2023));
        Assert.Equal(31, SwitchStatements.GetDaysInMonth("May", 2023));
        Assert.Equal(30, SwitchStatements.GetDaysInMonth("June", 2023));
        Assert.Equal(31, SwitchStatements.GetDaysInMonth("July", 2023));
        Assert.Equal(31, SwitchStatements.GetDaysInMonth("August", 2023));
        Assert.Equal(30, SwitchStatements.GetDaysInMonth("September", 2023));
        Assert.Equal(31, SwitchStatements.GetDaysInMonth("October", 2023));
        Assert.Equal(30, SwitchStatements.GetDaysInMonth("November", 2023));
        Assert.Equal(31, SwitchStatements.GetDaysInMonth("December", 2023));
    }

    [Fact]
    public void GetDaysInMonth_ShouldReturnCorrectDaysForLeapYear()
    {
        Assert.Equal(29, SwitchStatements.GetDaysInMonth("February", 2024));
    }

    [Fact]
    public void GetDaysInMonth_ShouldReturnMinusOneForInvalidMonth()
    {
        Assert.Equal(-1, SwitchStatements.GetDaysInMonth("Invalid", 2023));
    }

    [Fact]
    public void GetHttpStatusMessage_ShouldReturnCorrectMessages()
    {
        Assert.Equal("OK", SwitchStatements.GetHttpStatusMessage(200));
        Assert.Equal("Created", SwitchStatements.GetHttpStatusMessage(201));
        Assert.Equal("No Content", SwitchStatements.GetHttpStatusMessage(204));
        Assert.Equal("Bad Request", SwitchStatements.GetHttpStatusMessage(400));
        Assert.Equal("Unauthorized", SwitchStatements.GetHttpStatusMessage(401));
        Assert.Equal("Forbidden", SwitchStatements.GetHttpStatusMessage(403));
        Assert.Equal("Not Found", SwitchStatements.GetHttpStatusMessage(404));
        Assert.Equal("Internal Server Error", SwitchStatements.GetHttpStatusMessage(500));
        Assert.Equal("Service Unavailable", SwitchStatements.GetHttpStatusMessage(503));
        Assert.Equal("Unknown Status Code", SwitchStatements.GetHttpStatusMessage(999));
    }
} 