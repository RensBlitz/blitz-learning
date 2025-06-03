using Xunit;
using Exercises;

namespace Tests;
public class BankFeeSimulator_Tests
{
    [Fact]
    public void Fee_PercentHigher() {
        Assert.Equal(980.0, BankFeeSimulator.ApplyMonthlyFee(1000, 2, 5), 3);
    }
    [Fact]
    public void Fee_MinHigher() {
        Assert.Equal(95.0, BankFeeSimulator.ApplyMonthlyFee(100, 2, 5), 3);
    }
} 