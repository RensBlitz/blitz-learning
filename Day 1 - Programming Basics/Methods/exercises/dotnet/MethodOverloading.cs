namespace Methods.Exercises;

/// <summary>
/// Methods5: Method Overloading
///
/// This exercise focuses on creating and using overloaded methods in C#.
/// Method overloading allows creating multiple methods with the same name
/// but different parameter lists.
///
/// Learning objectives:
/// - Understand method overloading principles
/// - Create overloaded methods with different parameter types and counts
/// - Learn how C# selects the appropriate method to call
/// - Apply method overloading to make APIs more flexible
/// </summary>
public static class MethodOverloading
{
    /// <summary>
    /// Calculates the area of a square.
    /// Takes a single double parameter for the side length.
    /// Returns the area as a double (side² for a square).
    /// </summary>
    /// <param name="side">The side length of the square</param>
    /// <returns>The area of the square</returns>
    public static double CalculateArea(double side)
    {
        // TODO: Implement your solution here
        return 0.0; // Replace with your implementation
    }

    /// <summary>
    /// Calculates the area of a rectangle.
    /// Takes two double parameters: length and width.
    /// Returns the area as a double (length × width for a rectangle).
    /// </summary>
    /// <param name="length">The length of the rectangle</param>
    /// <param name="width">The width of the rectangle</param>
    /// <returns>The area of the rectangle</returns>
    public static double CalculateArea(double length, double width)
    {
        // TODO: Implement your solution here
        return 0.0; // Replace with your implementation
    }

    /// <summary>
    /// Calculates the area of a circle.
    /// Takes a single double parameter for the radius and a boolean to distinguish from square.
    /// Returns the area as a double (π × radius² for a circle).
    /// </summary>
    /// <param name="radius">The radius of the circle</param>
    /// <param name="isCircle">Boolean to distinguish from square method</param>
    /// <returns>The area of the circle</returns>
    public static double CalculateArea(double radius, bool isCircle)
    {
        // TODO: Implement your solution here
        // Use Math.PI for the value of π
        return 0.0; // Replace with your implementation
    }

    /// <summary>
    /// Calculates the area of a triangle.
    /// Takes three double parameters: a, b, and c for the side lengths.
    /// Returns the area as a double using Heron's formula:
    /// Area = √(s(s-a)(s-b)(s-c)) where s = (a+b+c)/2
    /// </summary>
    /// <param name="a">The first side length</param>
    /// <param name="b">The second side length</param>
    /// <param name="c">The third side length</param>
    /// <returns>The area of the triangle</returns>
    public static double CalculateArea(double a, double b, double c)
    {
        // TODO: Implement your solution here
        return 0.0; // Replace with your implementation
    }

    /// <summary>
    /// Concatenates two strings.
    /// Takes two string parameters.
    /// Returns their concatenation with a space between them.
    /// </summary>
    /// <param name="str1">The first string</param>
    /// <param name="str2">The second string</param>
    /// <returns>The concatenated string with a space between</returns>
    public static string Concatenate(string str1, string str2)
    {
        // TODO: Implement your solution here
        return string.Empty; // Replace with your implementation
    }

    /// <summary>
    /// Concatenates three strings.
    /// Takes three string parameters.
    /// Returns their concatenation with spaces between them.
    /// </summary>
    /// <param name="str1">The first string</param>
    /// <param name="str2">The second string</param>
    /// <param name="str3">The third string</param>
    /// <returns>The concatenated string with spaces between</returns>
    public static string Concatenate(string str1, string str2, string str3)
    {
        // TODO: Implement your solution here
        return string.Empty; // Replace with your implementation
    }

    /// <summary>
    /// Concatenates a string a specified number of times.
    /// Takes a string parameter and an int parameter for repeat count.
    /// Returns the string repeated that many times with spaces between.
    /// </summary>
    /// <param name="str">The string to repeat</param>
    /// <param name="count">The number of times to repeat</param>
    /// <returns>The concatenated string with spaces between repetitions</returns>
    public static string Concatenate(string str, int count)
    {
        // TODO: Implement your solution here
        return string.Empty; // Replace with your implementation
    }

    /// <summary>
    /// Concatenates a character a specified number of times.
    /// Takes a char parameter and an int parameter for repeat count.
    /// Returns a string with the character repeated that many times.
    /// </summary>
    /// <param name="ch">The character to repeat</param>
    /// <param name="count">The number of times to repeat</param>
    /// <returns>The concatenated string</returns>
    public static string Concatenate(char ch, int count)
    {
        // TODO: Implement your solution here
        return string.Empty; // Replace with your implementation
    }

    /// <summary>
    /// Finds the maximum of two integers.
    /// Takes two int parameters.
    /// Returns the larger value.
    /// </summary>
    /// <param name="a">The first integer</param>
    /// <param name="b">The second integer</param>
    /// <returns>The maximum value</returns>
    public static int FindMax(int a, int b)
    {
        // TODO: Implement your solution here
        return 0; // Replace with your implementation
    }

    /// <summary>
    /// Finds the maximum of three integers.
    /// Takes three int parameters.
    /// Returns the largest value.
    /// </summary>
    /// <param name="a">The first integer</param>
    /// <param name="b">The second integer</param>
    /// <param name="c">The third integer</param>
    /// <returns>The maximum value</returns>
    public static int FindMax(int a, int b, int c)
    {
        // TODO: Implement your solution here
        return 0; // Replace with your implementation
    }

    /// <summary>
    /// Finds the maximum of two doubles.
    /// Takes two double parameters.
    /// Returns the larger value.
    /// </summary>
    /// <param name="a">The first double</param>
    /// <param name="b">The second double</param>
    /// <returns>The maximum value</returns>
    public static double FindMax(double a, double b)
    {
        // TODO: Implement your solution here
        return 0.0; // Replace with your implementation
    }

    /// <summary>
    /// Finds the maximum value in an array of integers.
    /// Takes an int[] parameter.
    /// Returns the largest value in the array.
    /// Returns int.MinValue if the array is empty or null.
    /// </summary>
    /// <param name="array">The array of integers</param>
    /// <returns>The maximum value in the array</returns>
    public static int FindMax(int[] array)
    {
        // TODO: Implement your solution here
        return 0; // Replace with your implementation
    }

    /// <summary>
    /// Creates a basic user with just a username.
    /// Takes a string parameter for username.
    /// Returns "User: [username], Role: Guest"
    /// </summary>
    /// <param name="username">The username</param>
    /// <returns>A string representation of a basic user</returns>
    public static string CreateUser(string username)
    {
        // TODO: Implement your solution here
        return string.Empty; // Replace with your implementation
    }

    /// <summary>
    /// Creates a user with a username and email.
    /// Takes string parameters for username and email.
    /// Returns "User: [username], Email: [email], Role: Registered"
    /// </summary>
    /// <param name="username">The username</param>
    /// <param name="email">The email address</param>
    /// <returns>A string representation of a registered user</returns>
    public static string CreateUser(string username, string email)
    {
        // TODO: Implement your solution here
        return string.Empty; // Replace with your implementation
    }

    /// <summary>
    /// Creates a user with username, email, and age.
    /// Takes string parameters for username and email, and int for age.
    /// Returns "User: [username], Email: [email], Age: [age], Role: Member"
    /// </summary>
    /// <param name="username">The username</param>
    /// <param name="email">The email address</param>
    /// <param name="age">The user's age</param>
    /// <returns>A string representation of a member user</returns>
    public static string CreateUser(string username, string email, int age)
    {
        // TODO: Implement your solution here
        return string.Empty; // Replace with your implementation
    }

    /// <summary>
    /// Creates a user with username, email, age, and premium status.
    /// Takes string parameters for username and email, int for age, bool for premium.
    /// Returns "User: [username], Email: [email], Age: [age], Role: [Premium/Member]"
    /// where the role is "Premium" if premium is true, otherwise "Member"
    /// </summary>
    /// <param name="username">The username</param>
    /// <param name="email">The email address</param>
    /// <param name="age">The user's age</param>
    /// <param name="isPremium">Whether the user has premium status</param>
    /// <returns>A string representation of a premium or member user</returns>
    public static string CreateUser(string username, string email, int age, bool isPremium)
    {
        // TODO: Implement your solution here
        return string.Empty; // Replace with your implementation
    }
} 