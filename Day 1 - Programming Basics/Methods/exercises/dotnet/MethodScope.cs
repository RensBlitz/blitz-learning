namespace Methods.Exercises;

/// <summary>
/// Methods3: Method Scope and Variable Visibility
/// </summary>
public class MethodScope
{
    // Class-level variable (visible to all methods in the class)
    private static int _classCounter = 0;

    /// <summary>
    /// Demonstrates local variable scope.
    /// Should declare local 'result' = 10, create block with 'multiplier' = 5,
    /// multiply result by multiplier, return final result (50).
    /// </summary>
    public static int DemonstrateLocalVariables()
    {
        // TODO: Implement
        return 0;
    }

    /// <summary>
    /// Increments the class-level counter by the given amount and returns new value.
    /// </summary>
    public static int IncrementCounter(int amount)
    {
        // TODO: Implement
        return 0;
    }

    /// <summary>
    /// Takes a base value, doubles it, and returns the result.
    /// Should not affect variables outside its scope.
    /// </summary>
    public static int DoubleValue(int baseValue)
    {
        // TODO: Implement
        return 0;
    }

    /// <summary>
    /// Repeats the given text for the specified count.
    /// Returns empty string if count is 0 or negative.
    /// </summary>
    public static string RepeatText(string text, int count)
    {
        // TODO: Implement
        return string.Empty;
    }
} 