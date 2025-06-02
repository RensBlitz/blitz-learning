namespace DataTypes.Tests;

using DataTypes.Exercises;
using Xunit;

public class PrimitiveTypeDeclarationTests
{
    [Fact]
    public void DeclareAndInitializePrimitives_ShouldReturnCorrectValues()
    {
        var values = PrimitiveTypeDeclaration.DeclareAndInitializePrimitives();

        Assert.NotNull(values);
        Assert.Equal(4, values.Length);

        Assert.IsType<int>(values[0]);
        Assert.Equal(30, (int)values[0]);

        Assert.IsType<double>(values[1]);
        Assert.Equal(19.99, (double)values[1], 3);

        Assert.IsType<char>(values[2]);
        Assert.Equal('A', (char)values[2]);

        Assert.IsType<bool>(values[3]);
        Assert.True((bool)values[3]);
    }
} 