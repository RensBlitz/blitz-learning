package java;

/**
 * Methods4: Method Documentation and Good Practices
 *
 * This exercise focuses on writing properly documented methods using JavaDoc
 * and following Java method naming conventions and best practices.
 *
 * Learning objectives:
 * - Write clear and effective JavaDoc comments for methods
 * - Follow Java naming conventions for methods
 * - Understand the importance of preconditions and postconditions
 * - Create well-structured and maintainable methods
 *
 * Note: This exercise uses assertions. Run with assertions enabled.
 */
public class MethodDocumentation {

    public static void main(String[] args) {
        System.out.println("Methods4: Method Documentation and Good Practices");

        try {
            //TODO: Uncomment the test methods after implementing the methods
//            testCalculateCircleArea();
//            testIsValidEmailAddress();
//            testFormatCurrency();
//            testCalculateFactorial();
            System.out.println("All tests passed! Your implementation is correct.");
        } catch (AssertionError e) {
            System.out.println("Test failed: " + e.getMessage());
        }
    }

    /**
     * Scenario: You are developing a geometry calculation library.
     * The library needs a method to calculate the area of various shapes.
     * 
     * TODO: Design and implement a method to calculate circular areas.
     * Consider:
     * - What parameters are needed to calculate a circle's area?
     * - What should the method return?
     * - What are valid and invalid inputs?
     * - How should invalid inputs be handled?
     * - What mathematical constants might you need?
     * 
     * Write proper documentation that:
     * - Clearly describes the method's purpose
     * - Specifies parameter requirements
     * - Documents return values
     * - Notes any special cases or limitations
     */
    // TODO: Write both documentation and implementation here

    /**
     * Scenario: You are building a user registration system.
     * The system needs to validate email addresses before allowing registration.
     * 
     * TODO: Design and implement an email validation method.
     * Consider:
     * - What makes an email address valid?
     * - How should different error cases be handled?
     * - What should the method return to indicate validity?
     * - How will this method be used in the larger system?
     * 
     * Write proper documentation that:
     * - Explains the validation rules
     * - Describes edge cases
     * - Provides usage examples
     * - Documents return values
     */
    // TODO: Write both documentation and implementation here

    /**
     * Scenario: You are creating a financial reporting system.
     * The system needs to format monetary values consistently.
     * 
     * TODO: Design and implement a currency formatting method.
     * Consider:
     * - What information is needed to format a currency value?
     * - How should different currencies be handled?
     * - What format should the output follow?
     * - How should edge cases be handled (null, negative values, etc.)?
     * 
     * Write proper documentation that:
     * - Describes the formatting rules
     * - Explains parameter requirements
     * - Provides format examples
     * - Notes any limitations
     */
    // TODO: Write both documentation and implementation here

    /**
     * Scenario: You are implementing a mathematical utility library.
     * The library needs a method to calculate factorials.
     * 
     * TODO: Design and implement a factorial calculation method.
     * Consider:
     * - What is the valid range of inputs?
     * - How should edge cases be handled?
     * - What data type should be used for the result?
     * - What are the performance implications?
     * 
     * Write proper documentation that:
     * - Explains the mathematical concept
     * - Documents parameter constraints
     * - Warns about potential limitations
     * - Provides usage examples
     */
    // TODO: Write both documentation and implementation here

    // Test methods
    //TODO: uncomment the test methods after implementing the above methods
//    private static void testCalculateCircleArea() {
//        double area1 = calculateCircleArea(2.0);
//        assert Math.abs(area1 - 12.566) < 0.001 :
//            "Area of circle with radius 2.0 should be about 12.566, but got " + area1;
//
//        double area2 = calculateCircleArea(0.0);
//        assert area2 == 0.0 :
//            "Area of circle with radius 0.0 should be 0.0, but got " + area2;
//
//        double area3 = calculateCircleArea(-1.0);
//        assert area3 == 0.0 :
//            "Area of circle with negative radius should return 0.0, but got " + area3;
//    }
//
//    private static void testIsValidEmailAddress() {
//        boolean valid1 = isValidEmailAddress("user@example.com");
//        assert valid1 : "Email 'user@example.com' should be valid";
//
//        boolean valid2 = isValidEmailAddress("invalid-email");
//        assert !valid2 : "Email 'invalid-email' should be invalid";
//
//        boolean valid3 = isValidEmailAddress(null);
//        assert !valid3 : "Null email should be invalid";
//
//        boolean valid4 = isValidEmailAddress("user@domain");
//        assert !valid4 : "Email 'user@domain' should be invalid (missing dot)";
//    }
//
//    private static void testFormatCurrency() {
//        String formatted1 = formatCurrency(1234.56, "$");
//        assert "$1234.56".equals(formatted1) :
//            "Formatted currency should be '$1234.56', but got '" + formatted1 + "'";
//
//        String formatted2 = formatCurrency(0.5, "€");
//        assert "€0.50".equals(formatted2) :
//            "Formatted currency should be '€0.50', but got '" + formatted2 + "'";
//
//        String formatted3 = formatCurrency(1000.0, null);
//        assert "$1000.00".equals(formatted3) :
//            "Formatted currency with null symbol should use '$' as default, but got '" + formatted3 + "'";
//    }
//
//    private static void testCalculateFactorial() {
//        long factorial1 = calculateFactorial(5);
//        assert factorial1 == 120 : "Factorial of 5 should be 120, but got " + factorial1;
//
//        long factorial2 = calculateFactorial(0);
//        assert factorial2 == 1 : "Factorial of 0 should be 1, but got " + factorial2;
//
//        long factorial3 = calculateFactorial(1);
//        assert factorial3 == 1 : "Factorial of 1 should be 1, but got " + factorial3;
//
//        long factorial4 = calculateFactorial(12);
//        assert factorial4 == 479001600 : "Factorial of 12 should be 479001600, but got " + factorial4;
//    }
} 