namespace DataTypes.Exercises;

/// <summary>
/// ReferenceTypeDeclaration: Reference Type Declaration and Initialization
/// 
/// This exercise focuses on declaring and initializing reference types, specifically string and arrays.
/// You'll understand the difference between reference types and value types.
/// 
/// Learning objectives:
/// - Declare and initialize string variables
/// - Declare and initialize array variables (e.g., int[])
/// - Understand that reference variables hold memory addresses (references)
/// - Differentiate behavior from value types
/// </summary>
public class ReferenceTypeDeclaration
{
    /// <summary>
    /// This method should declare and initialize two reference type variables:
    /// 1. A string variable named 'name' with value "Alice"
    /// 2. An integer array named 'numbers' initialized with values {1, 2, 3}
    /// 
    /// TODO: Implement this method to create and initialize the variables as described.
    /// Then, return these variables in an object array in the order: [name, numbers].
    /// </summary>
    /// <returns>An object array containing the two initialized reference variables.</returns>
    public static object[] DeclareAndInitializeReferenceTypes()
    {
        // TODO: Implement your solution here
        string? name = null;     // Placeholder
        int[]? numbers = null;  // Placeholder

        // Replace placeholders with actual initialization
        // Example: name = "Alice";
        // Example: numbers = new int[] {1, 2, 3};

        return new object[] { name!, numbers! }; // Replace with your initialized variables
    }
} 