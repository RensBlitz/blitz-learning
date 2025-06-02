namespace Variables.Tests;

using Variables.Exercises;
using Xunit;

public class VariableLifetimeAndMemoryTests
{
    [Fact]
    public void DemonstrateLifetime_ShouldReturnExpectedValues()
    {
        var values = VariableLifetimeAndMemory.DemonstrateLifetime();
        Assert.NotNull(values);
        Assert.Equal(2, values.Length);
        Assert.Equal(7, values[0]);
        Assert.Equal(42, values[1]);
    }
} 