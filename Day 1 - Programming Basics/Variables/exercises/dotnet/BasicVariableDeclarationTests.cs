namespace Variables.Tests;

using Variables.Exercises;
using Xunit;

/// <summary>
/// Tests for the BasicVariableDeclaration exercise.
/// These tests validate that your implementation correctly creates and initializes variables.
/// </summary>
public class BasicVariableDeclarationTests
{
    [Fact]
    public void CreateVariables_ShouldReturnArrayWithCorrectLength()
    {
        // Act
        var variables = BasicVariableDeclaration.CreateVariables();

        // Assert
        Assert.NotNull(variables);
        Assert.Equal(4, variables.Length);
    }

    [Fact]
    public void CreateVariables_ShouldReturnIntegerAsFirstElement()
    {
        // Act
        var variables = BasicVariableDeclaration.CreateVariables();

        // Assert
        Assert.NotNull(variables);
        Assert.True(variables.Length >= 1, "Array should have at least 1 element");
        Assert.IsType<int>(variables[0]);
        Assert.Equal(25, variables[0]);
    }

    [Fact]
    public void CreateVariables_ShouldReturnDoubleAsSecondElement()
    {
        // Act
        var variables = BasicVariableDeclaration.CreateVariables();

        // Assert
        Assert.NotNull(variables);
        Assert.True(variables.Length >= 2, "Array should have at least 2 elements");
        Assert.IsType<double>(variables[1]);
        Assert.Equal(98.6, (double)variables[1], precision: 4);
    }

    [Fact]
    public void CreateVariables_ShouldReturnCharAsThirdElement()
    {
        // Act
        var variables = BasicVariableDeclaration.CreateVariables();

        // Assert
        Assert.NotNull(variables);
        Assert.True(variables.Length >= 3, "Array should have at least 3 elements");
        Assert.IsType<char>(variables[2]);
        Assert.Equal('A', variables[2]);
    }

    [Fact]
    public void CreateVariables_ShouldReturnBooleanAsFourthElement()
    {
        // Act
        var variables = BasicVariableDeclaration.CreateVariables();

        // Assert
        Assert.NotNull(variables);
        Assert.True(variables.Length >= 4, "Array should have at least 4 elements");
        Assert.IsType<bool>(variables[3]);
        Assert.Equal(false, variables[3]);
    }

    [Fact]
    public void CreateVariables_ShouldReturnAllVariablesInCorrectOrder()
    {
        // Act
        var variables = BasicVariableDeclaration.CreateVariables();

        // Assert
        Assert.NotNull(variables);
        Assert.Equal(4, variables.Length);
        
        // Test all variables at once
        Assert.Equal(25, variables[0]);
        Assert.Equal(98.6, (double)variables[1], precision: 4);
        Assert.Equal('A', variables[2]);
        Assert.Equal(false, variables[3]);
    }
} 