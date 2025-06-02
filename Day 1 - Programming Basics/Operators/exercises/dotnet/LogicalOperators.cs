namespace Operators.Exercises;

/// <summary>
/// Exercise 3: Logical Operators
///
/// Scenario: You're developing a security system that needs to evaluate
/// multiple conditions to determine access permissions. The system uses
/// three different security checks that need to be combined in various ways.
///
/// Learning objectives:
/// - Use && (AND), || (OR), and ! (NOT) operators
/// - Combine multiple boolean conditions
/// - Understand short-circuit evaluation
/// - Apply logical operators in real-world scenarios
/// </summary>
public class LogicalOperators
{
    /// <summary>
    /// Scenario: The security system performs three types of checks:
    /// - Primary authentication (e.g., password check)
    /// - Secondary verification (e.g., biometric scan)
    /// - Emergency override (e.g., administrator bypass)
    /// 
    /// Evaluates security conditions and returns various logical combinations.
    /// The method should return an array with the following logical operations:
    /// 1. primaryAuth AND secondaryAuth
    /// 2. primaryAuth OR secondaryAuth
    /// 3. NOT primaryAuth
    /// 4. (primaryAuth AND secondaryAuth) OR emergencyOverride
    /// 5. primaryAuth AND (secondaryAuth OR emergencyOverride)
    /// </summary>
    /// <param name="primaryAuth">result of primary authentication check</param>
    /// <param name="secondaryAuth">result of secondary verification</param>
    /// <param name="emergencyOverride">result of emergency override check</param>
    /// <returns>array of boolean results for different security scenarios</returns>
    public static bool[] LogicalOps(bool primaryAuth, bool secondaryAuth, bool emergencyOverride)
    {
        // TODO: Implement your solution here
        return new bool[5]; // Replace with your implementation
    }
} 