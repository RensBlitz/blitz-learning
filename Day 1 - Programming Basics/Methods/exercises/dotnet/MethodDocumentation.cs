namespace Methods.Exercises;

/// <summary>
/// Methods4: Method Documentation and Good Practices
///
/// This exercise focuses on writing properly documented methods using XML documentation
/// and following C# method naming conventions and best practices.
///
/// Learning objectives:
/// - Write clear and effective XML documentation comments for methods
/// - Follow C# naming conventions for methods
/// - Understand the importance of preconditions and postconditions
/// - Create well-structured and maintainable methods
/// </summary>
public static class MethodDocumentation
{
    /// <summary>
    /// Scenario: You are developing a geometry calculation library.
    /// The library needs a method to calculate the area of various shapes.
    /// 
    /// TODO: Design and implement a method to calculate circular areas.
    /// Consider:
    /// - What parameters are needed to calculate a circle's area?
    /// - What should the method return?
    /// - What are valid and invalid inputs?
    /// - How should invalid inputs be handled?
    /// - What mathematical constants might you need?
    /// 
    /// Write proper documentation that:
    /// - Clearly describes the method's purpose
    /// - Specifies parameter requirements
    /// - Documents return values
    /// - Notes any special cases or limitations
    /// </summary>
    // TODO: Write both XML documentation and implementation here
    // Method should be named: CalculateCircleArea
    // Should take a double radius parameter
    // Should return double area
    // Should return 0.0 for negative or invalid inputs

    /// <summary>
    /// Scenario: You are building a user registration system.
    /// The system needs to validate email addresses before allowing registration.
    /// 
    /// TODO: Design and implement an email validation method.
    /// Consider:
    /// - What makes an email address valid?
    /// - How should different error cases be handled?
    /// - What should the method return to indicate validity?
    /// - How will this method be used in the larger system?
    /// 
    /// Write proper documentation that:
    /// - Explains the validation rules
    /// - Describes edge cases
    /// - Provides usage examples
    /// - Documents return values
    /// </summary>
    // TODO: Write both XML documentation and implementation here
    // Method should be named: IsValidEmailAddress
    // Should take a string email parameter
    // Should return bool validity
    // Should check for basic email format (contains @ and .)

    /// <summary>
    /// Scenario: You are creating a financial reporting system.
    /// The system needs to format monetary values consistently.
    /// 
    /// TODO: Design and implement a currency formatting method.
    /// Consider:
    /// - What information is needed to format a currency value?
    /// - How should different currencies be handled?
    /// - What format should the output follow?
    /// - How should edge cases be handled (null, negative values, etc.)?
    /// 
    /// Write proper documentation that:
    /// - Describes the formatting rules
    /// - Explains parameter requirements
    /// - Provides format examples
    /// - Notes any limitations
    /// </summary>
    // TODO: Write both XML documentation and implementation here
    // Method should be named: FormatCurrency
    // Should take a double amount and string symbol parameters
    // Should return formatted string
    // Should use "$" as default symbol if null is provided

    /// <summary>
    /// Scenario: You are implementing a mathematical utility library.
    /// The library needs a method to calculate factorials.
    /// 
    /// TODO: Design and implement a factorial calculation method.
    /// Consider:
    /// - What is the valid range of inputs?
    /// - How should edge cases be handled?
    /// - What data type should be used for the result?
    /// - What are the performance implications?
    /// 
    /// Write proper documentation that:
    /// - Explains the mathematical concept
    /// - Documents parameter constraints
    /// - Warns about potential limitations
    /// - Provides usage examples
    /// </summary>
    // TODO: Write both XML documentation and implementation here
    // Method should be named: CalculateFactorial
    // Should take an int n parameter
    // Should return long result
    // Should handle edge cases: 0! = 1, negative numbers should return 0
} 