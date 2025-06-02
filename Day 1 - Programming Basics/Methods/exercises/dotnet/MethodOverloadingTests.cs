namespace Methods.Tests;

using Methods.Exercises;
using Xunit;

public class MethodOverloadingTests
{
    [Fact]
    public void CalculateArea_Square_ShouldReturnCorrectArea()
    {
        var area = MethodOverloading.CalculateArea(4.0);
        Assert.Equal(16.0, area, 3);
    }

    [Fact]
    public void CalculateArea_Rectangle_ShouldReturnCorrectArea()
    {
        var area = MethodOverloading.CalculateArea(3.0, 5.0);
        Assert.Equal(15.0, area, 3);
    }

    [Fact]
    public void CalculateArea_Circle_ShouldReturnCorrectArea()
    {
        var area = MethodOverloading.CalculateArea(2.0, true);
        Assert.Equal(12.566, area, 3);
    }

    [Fact]
    public void CalculateArea_Triangle_ShouldReturnCorrectArea()
    {
        var area = MethodOverloading.CalculateArea(3.0, 4.0, 5.0);
        Assert.Equal(6.0, area, 3);
    }

    [Fact]
    public void Concatenate_TwoStrings_ShouldReturnWithSpace()
    {
        var result = MethodOverloading.Concatenate("Hello", "World");
        Assert.Equal("Hello World", result);
    }

    [Fact]
    public void Concatenate_ThreeStrings_ShouldReturnWithSpaces()
    {
        var result = MethodOverloading.Concatenate("Good", "Morning", "Java");
        Assert.Equal("Good Morning Java", result);
    }

    [Fact]
    public void Concatenate_StringRepeated_ShouldReturnWithSpaces()
    {
        var result = MethodOverloading.Concatenate("Hi", 3);
        Assert.Equal("Hi Hi Hi", result);
    }

    [Fact]
    public void Concatenate_CharRepeated_ShouldReturnString()
    {
        var result = MethodOverloading.Concatenate('A', 5);
        Assert.Equal("AAAAA", result);
    }

    [Fact]
    public void FindMax_TwoInts_ShouldReturnLarger()
    {
        var max = MethodOverloading.FindMax(10, 20);
        Assert.Equal(20, max);
    }

    [Fact]
    public void FindMax_ThreeInts_ShouldReturnLargest()
    {
        var max = MethodOverloading.FindMax(10, 30, 20);
        Assert.Equal(30, max);
    }

    [Fact]
    public void FindMax_TwoDoubles_ShouldReturnLarger()
    {
        var max = MethodOverloading.FindMax(10.5, 20.5);
        Assert.Equal(20.5, max);
    }

    [Fact]
    public void FindMax_IntArray_ShouldReturnLargest()
    {
        var array = new[] { 5, 8, 2, 10, 3 };
        var max = MethodOverloading.FindMax(array);
        Assert.Equal(10, max);
    }

    [Fact]
    public void FindMax_EmptyArray_ShouldReturnMinValue()
    {
        var emptyArray = new int[0];
        var max = MethodOverloading.FindMax(emptyArray);
        Assert.Equal(int.MinValue, max);
    }

    [Fact]
    public void FindMax_NullArray_ShouldReturnMinValue()
    {
        var max = MethodOverloading.FindMax((int[])null!);
        Assert.Equal(int.MinValue, max);
    }

    [Fact]
    public void CreateUser_UsernameOnly_ShouldReturnGuestUser()
    {
        var user = MethodOverloading.CreateUser("johndoe");
        Assert.Equal("User: johndoe, Role: Guest", user);
    }

    [Fact]
    public void CreateUser_UsernameAndEmail_ShouldReturnRegisteredUser()
    {
        var user = MethodOverloading.CreateUser("janedoe", "jane@example.com");
        Assert.Equal("User: janedoe, Email: jane@example.com, Role: Registered", user);
    }

    [Fact]
    public void CreateUser_UsernameEmailAge_ShouldReturnMemberUser()
    {
        var user = MethodOverloading.CreateUser("alice", "alice@example.com", 25);
        Assert.Equal("User: alice, Email: alice@example.com, Age: 25, Role: Member", user);
    }

    [Fact]
    public void CreateUser_PremiumUser_ShouldReturnPremiumRole()
    {
        var user = MethodOverloading.CreateUser("bob", "bob@example.com", 30, true);
        Assert.Equal("User: bob, Email: bob@example.com, Age: 30, Role: Premium", user);
    }

    [Fact]
    public void CreateUser_NonPremiumUser_ShouldReturnMemberRole()
    {
        var user = MethodOverloading.CreateUser("charlie", "charlie@example.com", 35, false);
        Assert.Equal("User: charlie, Email: charlie@example.com, Age: 35, Role: Member", user);
    }
}