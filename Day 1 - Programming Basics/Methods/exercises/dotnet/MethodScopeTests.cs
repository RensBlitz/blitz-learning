namespace Methods.Tests;

using Methods.Exercises;
using Xunit;
using System.Reflection;

public class MethodScopeTests
{
    [Fact]
    public void DemonstrateLocalVariables_ShouldReturn50()
    {
        Assert.Equal(50, MethodScope.DemonstrateLocalVariables());
    }

    [Fact]
    public void IncrementCounter_ShouldWorkWithClassVariable()
    {
        // Reset counter via reflection since it's private
        var field = typeof(MethodScope).GetField("_classCounter", BindingFlags.NonPublic | BindingFlags.Static);
        field!.SetValue(null, 0);

        Assert.Equal(5, MethodScope.IncrementCounter(5));
        Assert.Equal(8, MethodScope.IncrementCounter(3));
        Assert.Equal(6, MethodScope.IncrementCounter(-2));
    }

    [Fact]
    public void DoubleValue_ShouldNotAffectOriginal()
    {
        Assert.Equal(20, MethodScope.DoubleValue(10));
        Assert.Equal(14, MethodScope.DoubleValue(7));
    }

    [Fact]
    public void RepeatText_ShouldRepeatCorrectly()
    {
        Assert.Equal("HiHiHi", MethodScope.RepeatText("Hi", 3));
        Assert.Equal("JavaJava", MethodScope.RepeatText("Java", 2));
        Assert.Equal("", MethodScope.RepeatText("Test", 0));
        Assert.Equal("", MethodScope.RepeatText("Negative", -1));
    }
} 