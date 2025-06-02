namespace Variables.Tests;

using Variables.Exercises;
using Xunit;

public class CommonVariablePitfallsTests
{
    [Fact]
    public void AvoidPitfalls_ShouldReturnTrue()
    {
        Assert.True(CommonVariablePitfalls.AvoidPitfalls());
    }
} 