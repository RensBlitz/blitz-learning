namespace DataTypes.Exercises;

/// <summary>
/// ConstantsAndImmutability: Constants and Immutability
/// 
/// This exercise focuses on working with constants and understanding immutability in C#.
/// You'll learn about the 'const' and 'readonly' keywords and how immutable types like string behave.
/// 
/// Learning objectives:
/// - Understand and use the 'const' keyword for declaring constants
/// - Recognize the immutability of strings and its implications
/// - Differentiate between constant variables and constant references
/// </summary>
public class ConstantsAndImmutability
{
    // TODO: Declare a class-level constant PI with value 3.14159
    // Your code here

    /// <summary>
    /// This method demonstrates the use of constants with the 'const' keyword.
    /// TODO: 
    /// 1. Declare a const integer MAX_VALUE with value 100
    /// 2. Try to uncomment the line that attempts to change MAX_VALUE
    ///    and observe the compile-time error
    /// 3. Declare a readonly array FIXED_ARRAY with values {1, 2, 3}
    /// 4. Modify an element of the array (this is allowed because the array elements aren't readonly)
    /// </summary>
    /// <returns>Object array containing: [MAX_VALUE, FIXED_ARRAY]</returns>
    public static object[] WorkWithConstants()
    {
        // TODO: Implement your solution here
        
        // 1. Declare a const integer
        // Your code here (replace this line with your implementation)
        int MAX_VALUE = 0; // This should be const; replace with correct implementation
        
        // 2. Try to change the value (this will cause a compile error)
        // Uncomment to see the error:
        // MAX_VALUE = 200;
        
        // 3. Declare a readonly array
        // Your code here (replace this line with your implementation)
        int[]? FIXED_ARRAY = null; // This should be readonly; replace with correct implementation
        
        // 4. Modify an element (allowed because the array reference is readonly, not its contents)
        // Uncomment and implement:
        // FIXED_ARRAY[0] = 99;
        
        return new object[] { MAX_VALUE, FIXED_ARRAY! };
    }

    /// <summary>
    /// This method demonstrates the immutability of strings.
    /// TODO:
    /// 1. Create a string named 'original' with value "Hello"
    /// 2. Create another string 'modified' by concatenating original with " World"
    /// 3. Check if 'original' was modified (it shouldn't be, as strings are immutable)
    /// 4. Return both strings
    /// </summary>
    /// <returns>Object array containing: [original, modified]</returns>
    public static object[] DemonstrateStringImmutability()
    {
        // TODO: Implement your solution here
        
        // Create an original string
        string? original = null; // Replace with actual implementation
        
        // Create a "modified" version
        string? modified = null; // Replace with actual implementation
        
        return new object[] { original!, modified! };
    }
} 