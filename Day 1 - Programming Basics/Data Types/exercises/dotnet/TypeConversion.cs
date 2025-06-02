namespace DataTypes.Exercises;

/// <summary>
/// TypeConversion: Type Conversion (Widening and Narrowing)
/// 
/// This exercise focuses on type conversion in C#, covering both implicit (widening)
/// and explicit (narrowing) conversions.
/// 
/// Learning objectives:
/// - Understand and perform widening conversions (e.g., int to double)
/// - Understand and perform narrowing conversions (e.g., double to int) using casting
/// - Recognize potential data loss during narrowing conversions
/// </summary>
public class TypeConversion
{
    /// <summary>
    /// Demonstrates widening conversion (implicit).
    /// TODO: Assign an int value to a double variable. Observe that no explicit cast is needed.
    /// Return the double variable.
    /// </summary>
    /// <param name="intValue">The integer value to be converted.</param>
    /// <returns>The converted double value.</returns>
    public static double PerformWidening(int intValue)
    {
        // TODO: Implement your solution here
        double doubleValue = 0.0; // Placeholder
        return doubleValue; // Replace with your implementation
    }

    /// <summary>
    /// Demonstrates narrowing conversion (explicit casting).
    /// TODO: Assign a double value to an int variable using an explicit cast.
    /// Return the int variable.
    /// </summary>
    /// <param name="doubleValue">The double value to be converted.</param>
    /// <returns>The converted int value (potentially with data loss).</returns>
    public static int PerformNarrowing(double doubleValue)
    {
        // TODO: Implement your solution here
        int intValue = 0; // Placeholder
        return intValue; // Replace with your implementation
    }
} 