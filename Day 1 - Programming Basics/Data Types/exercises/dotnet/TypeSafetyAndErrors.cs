namespace DataTypes.Exercises;

/// <summary>
/// TypeSafetyAndErrors: Type Safety and Assignment Errors
/// 
/// This exercise explores type safety in C#. You will attempt to assign incompatible types
/// and observe the compile-time errors that occur. This exercise is more about understanding
/// concepts than writing runnable code that passes tests in the traditional sense.
/// 
/// Learning objectives:
/// - Understand C#'s static type checking
/// - Recognize compile-time errors due to type incompatibility
/// - Appreciate the benefits of type safety
/// 
/// Note: The primary goal is to observe errors. The provided "solution" will have
/// commented-out lines that would cause errors if uncommented.
/// </summary>
public class TypeSafetyAndErrors
{
    /// <summary>
    /// This method contains examples of type-incompatible assignments.
    /// TODO: Uncomment each of the commented-out lines ONE AT A TIME.
    /// Observe the compile-time error that your IDE or the C# compiler shows.
    /// Reflect on why each assignment is not allowed.
    /// After observing the error, you can comment the line out again to proceed or leave it to see all errors.
    /// </summary>
    public static void ExploreTypeSafety()
    {
        int myInt = 10;
        double myDouble = 20.5;
        char myChar = 'A';
        bool myBoolean = true;
        string myString = "Hello";

        Console.WriteLine("\nStarting with valid assignments:");
        Console.WriteLine($"myInt = {myInt}");
        Console.WriteLine($"myDouble = {myDouble}");
        Console.WriteLine($"myChar = {myChar}");
        Console.WriteLine($"myBoolean = {myBoolean}");
        Console.WriteLine($"myString = {myString}");

        Console.WriteLine("\nNow, let's try some incompatible assignments (uncomment these one by one):");

        // Incompatible assignment 1: Trying to put a double into an int without a cast
        // myInt = myDouble; // What error do you see? Why?

        // Incompatible assignment 2: Trying to put a boolean into an int
        // myInt = myBoolean; // What error do you see? Why?

        // Incompatible assignment 3: Trying to put a string into a char
        // myChar = myString; // What error do you see? Why?

        // Incompatible assignment 4: Trying to put an int into a boolean
        // myBoolean = myInt; // What error do you see? Why?

        // Incompatible assignment 5: Trying to assign a char to a string directly (char is not a string)
        // myString = myChar; // This is also an error. String needs a char to be explicitly converted.

        // Note: Some languages are more flexible (dynamically typed) but C# is statically typed,
        // which helps catch these errors at compile time, preventing runtime issues.
    }
} 