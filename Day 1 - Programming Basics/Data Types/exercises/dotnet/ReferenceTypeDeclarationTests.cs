namespace DataTypes.Tests;

using DataTypes.Exercises;
using Xunit;

public class ReferenceTypeDeclarationTests
{
    [Fact]
    public void DeclareAndInitializeReferenceTypes_ShouldReturnCorrectValues()
    {
        var values = ReferenceTypeDeclaration.DeclareAndInitializeReferenceTypes();

        Assert.NotNull(values);
        Assert.Equal(2, values.Length);

        Assert.IsType<string>(values[0]);
        Assert.Equal("Alice", (string)values[0]);

        Assert.IsType<int[]>(values[1]);
        var numbersArray = (int[])values[1];
        Assert.NotNull(numbersArray);
        Assert.Equal(3, numbersArray.Length);
        Assert.Equal(1, numbersArray[0]);
        Assert.Equal(2, numbersArray[1]);
        Assert.Equal(3, numbersArray[2]);
    }
} 