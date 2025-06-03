using Xunit;
using Exercises;

namespace Tests;
public class SimpleCar_Tests
{
    [Fact]
    public void Description_Basic() {
        var c = new SimpleCar("Tesla","Model 3",2024);
        Assert.Equal("2024 Tesla Model 3", c.Description());
    }
} 