namespace ControlFlow.Tests;

using ControlFlow.Exercises;
using Xunit;

public class GuardClausesTests
{
    [Fact]
    public void ValidateUserInput_ShouldReturnCorrectValidationResults()
    {
        // Valid inputs
        Assert.Equal("Input is valid", GuardClauses.ValidateUserInput("username", "password123", true));
        
        // Invalid username
        Assert.Equal("Username cannot be empty", GuardClauses.ValidateUserInput("", "password123", true));
        Assert.Equal("Username cannot be null", GuardClauses.ValidateUserInput(null, "password123", true));
        
        // Invalid password
        Assert.Equal("Password cannot be empty", GuardClauses.ValidateUserInput("username", "", true));
        Assert.Equal("Password cannot be null", GuardClauses.ValidateUserInput("username", null, true));
        Assert.Equal("Password must be at least 8 characters", GuardClauses.ValidateUserInput("username", "pass", true));
        
        // Terms not accepted
        Assert.Equal("Terms must be accepted", GuardClauses.ValidateUserInput("username", "password123", false));
    }

    [Fact]
    public void CheckDiskSpace_ShouldReturnCorrectStatus()
    {
        // Sufficient disk space
        Assert.Equal("Sufficient disk space", GuardClauses.CheckDiskSpace(1000, 900, false));
        
        // Insufficient disk space
        Assert.Equal("Disk space low", GuardClauses.CheckDiskSpace(1000, 950, false));
        
        // Critical disk space
        Assert.Equal("Disk space critical", GuardClauses.CheckDiskSpace(1000, 980, false));
        
        // Disk full
        Assert.Equal("Disk full", GuardClauses.CheckDiskSpace(1000, 1000, false));
        
        // Error cases
        Assert.Equal("Invalid disk size", GuardClauses.CheckDiskSpace(0, 0, false));
        Assert.Equal("Invalid disk size", GuardClauses.CheckDiskSpace(-100, 0, false));
        Assert.Equal("Invalid used space", GuardClauses.CheckDiskSpace(1000, -100, false));
        Assert.Equal("Used space exceeds disk size", GuardClauses.CheckDiskSpace(1000, 1100, false));
        
        // System disk different thresholds
        Assert.Equal("Disk space low", GuardClauses.CheckDiskSpace(1000, 800, true));
        Assert.Equal("Disk space critical", GuardClauses.CheckDiskSpace(1000, 900, true));
    }

    [Fact]
    public void CheckPasswordStrength_ShouldReturnCorrectStrength()
    {
        // Invalid cases
        Assert.Equal("Invalid password", GuardClauses.CheckPasswordStrength(null));
        Assert.Equal("Invalid password", GuardClauses.CheckPasswordStrength(""));
        
        // Very weak password
        Assert.Equal("Very weak", GuardClauses.CheckPasswordStrength("abc"));
        
        // Weak password
        Assert.Equal("Weak", GuardClauses.CheckPasswordStrength("abcdefgh"));
        
        // Medium password
        Assert.Equal("Medium", GuardClauses.CheckPasswordStrength("Abcdefgh"));
        
        // Strong password
        Assert.Equal("Strong", GuardClauses.CheckPasswordStrength("Abcdef1"));
        
        // Very strong password
        Assert.Equal("Very strong", GuardClauses.CheckPasswordStrength("Abcdef1!"));
    }
} 