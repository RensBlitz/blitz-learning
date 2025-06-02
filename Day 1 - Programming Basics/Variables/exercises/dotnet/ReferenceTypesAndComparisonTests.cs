namespace Variables.Tests;

using Variables.Exercises;
using Xunit;

public class ReferenceTypesAndComparisonTests
{
    [Fact]
    public void CompareStrings_ShouldReturnExpectedResults()
    {
        var results = ReferenceTypesAndComparison.CompareStrings();
        Assert.NotNull(results);
        Assert.Equal(3, results.Length);
        Assert.True(results[0]); // two literals same ref
        Assert.False(results[1]); // literal vs new string ref
        Assert.True(results[2]); // content equal
    }

    [Fact]
    public void ModifyArray_ShouldReflectChangeThroughSecondReference()
    {
        var modified = ReferenceTypesAndComparison.ModifyArray();
        Assert.NotNull(modified);
        Assert.Equal(5, modified.Length);
        Assert.Equal(99, modified[0]);
    }
} 