namespace ControlFlow.Tests;

using ControlFlow.Exercises;
using Xunit;

public class BreakAndContinueTests
{
    [Fact]
    public void FindFirstNonNegative_ShouldReturnFirstNonNegativeNumber()
    {
        // Test with array containing non-negative numbers
        int[] array1 = {-5, -3, -1, 0, 2, 4};
        Assert.Equal(0, BreakAndContinue.FindFirstNonNegative(array1));
        
        // Test with array starting with non-negative number
        int[] array2 = {0, -1, -2, -3};
        Assert.Equal(0, BreakAndContinue.FindFirstNonNegative(array2));
        
        // Test with array containing only negative numbers
        int[] array3 = {-5, -4, -3, -2, -1};
        Assert.Equal(-1, BreakAndContinue.FindFirstNonNegative(array3));
        
        // Test with empty array
        int[] array4 = {};
        Assert.Equal(-1, BreakAndContinue.FindFirstNonNegative(array4));
        
        // Test with array containing only positive numbers
        int[] array5 = {1, 2, 3, 4, 5};
        Assert.Equal(1, BreakAndContinue.FindFirstNonNegative(array5));
    }

    [Fact]
    public void CountEvenNumbersOnly_ShouldReturnCorrectCount()
    {
        // Test with array containing mix of even and odd numbers
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Assert.Equal(5, BreakAndContinue.CountEvenNumbersOnly(array1));
        
        // Test with array containing only even numbers
        int[] array2 = {2, 4, 6, 8, 10};
        Assert.Equal(5, BreakAndContinue.CountEvenNumbersOnly(array2));
        
        // Test with array containing only odd numbers
        int[] array3 = {1, 3, 5, 7, 9};
        Assert.Equal(0, BreakAndContinue.CountEvenNumbersOnly(array3));
        
        // Test with empty array
        int[] array4 = {};
        Assert.Equal(0, BreakAndContinue.CountEvenNumbersOnly(array4));
        
        // Test with array containing negative numbers
        int[] array5 = {-2, -1, 0, 1, 2};
        Assert.Equal(3, BreakAndContinue.CountEvenNumbersOnly(array5));
    }

    [Fact]
    public void FindPrimeWithLimit_ShouldReturnFirstPrimeInRange()
    {
        // Find a prime number between 10 and 20
        Assert.Equal(11, BreakAndContinue.FindPrimeWithLimit(10, 20));
        
        // Find a prime number between 20 and 30
        Assert.Equal(23, BreakAndContinue.FindPrimeWithLimit(20, 30));
        
        // Find a prime number starting from a prime
        Assert.Equal(11, BreakAndContinue.FindPrimeWithLimit(11, 20));
        
        // Find a prime number with a small range
        Assert.Equal(23, BreakAndContinue.FindPrimeWithLimit(23, 29));
        
        // No primes in the range
        Assert.Equal(-1, BreakAndContinue.FindPrimeWithLimit(24, 28));
        
        // Invalid range
        Assert.Equal(-1, BreakAndContinue.FindPrimeWithLimit(30, 20));
    }
} 