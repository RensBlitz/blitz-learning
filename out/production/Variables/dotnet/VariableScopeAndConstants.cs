namespace Variables.Exercises;

/// <summary>
/// Exercise 3: Variable Scope and Constants
///
/// Learning objectives:
/// - Understand variable scope in C#
/// - Use the 'const' keyword to create constants
/// - Observe variable shadowing and its effects
/// </summary>
public class VariableScopeAndConstants
{
    // TODO: Declare a public constant double PI with value 3.14159

    /// <summary>
    /// Calculates the area and circumference of a circle with the provided <paramref name="radius"/>.
    /// Use the PI constant declared at the class level.
    /// </summary>
    /// <param name="radius">Radius of the circle.</param>
    /// <returns>An array with [area, circumference].</returns>
    public static double[] CalculateCircle(double radius)
    {
        // TODO: Implement your solution here
        return null!;
    }

    /// <summary>
    /// Demonstrates understanding of variable scope and shadowing.
    /// 1. Create an outer variable x with value 10.
    /// 2. Inside an inner block, declare another x with value 20.
    /// 3. Return either:
    ///    - 30 (sum of outer and inner) if you use a helper variable, OR
    ///    - -1 if you believe accessing outer x directly is impossible.
    /// </summary>
    public static int DemonstrateScope()
    {
        // TODO: Implement your solution here
        return -999;
    }
} 