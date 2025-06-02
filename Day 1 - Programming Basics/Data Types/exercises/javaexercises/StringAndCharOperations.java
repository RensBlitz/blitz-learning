package javaexercises;

/**
 * DataTypes5: String and Char Operations
 *
 * This exercise focuses on manipulating characters and strings in Java,
 * and understanding the relationship between them.
 *
 * Learning objectives:
 * - Work with String and char data types
 * - Manipulate strings and extract characters
 * - Convert between char and String
 * - Understand string immutability
 *
 * Note: This exercise uses assertions. Run with assertions enabled.
 */
public class StringAndCharOperations {

    public static void main(String[] args) {
        System.out.println("DataTypes5: String and Char Operations");

        try {
            testStringCharOperations();
            System.out.println("All tests passed! Your implementation is correct.");
        } catch (AssertionError e) {
            System.out.println("Test failed: " + e.getMessage());
        }
    }

    /**
     * Performs various operations on a string.
     * TODO: Implement this method to:
     * 1. Extract the first character from the input string
     * 2. Extract the last character from the input string
     * 3. Convert a char to a String
     * 4. Concatenate a char to a string
     *
     * @param inputString The string to manipulate
     * @param charToConvert The character to convert to a string
     * @return An object array containing:
     *         [firstChar, lastChar, convertedString, concatenatedString]
     */
    public static Object[] performStringCharOperations(String inputString, char charToConvert) {
        // TODO: Implement your solution here
        
        return new Object[]{' ', ' ', "", ""};
    }

    private static void testStringCharOperations() {
        Object[] results = performStringCharOperations("Hello", 'X');
        
        assert results != null : "The returned array should not be null.";
        assert results.length == 4 : "The array should contain 4 elements.";
        
        assert results[0] instanceof Character : "First element should be a Character.";
        assert (Character)results[0] == 'H' : "First character of 'Hello' should be 'H'. Got: " + results[0];
        
        assert results[1] instanceof Character : "Second element should be a Character.";
        assert (Character)results[1] == 'o' : "Last character of 'Hello' should be 'o'. Got: " + results[1];
        
        assert results[2] instanceof String : "Third element should be a String.";
        assert results[2].equals("X") : "Converting 'X' to String should result in \"X\". Got: " + results[2];
        
        assert results[3] instanceof String : "Fourth element should be a String.";
        assert results[3].equals("HelloX") : "Concatenating 'Hello' and 'X' should result in \"HelloX\". Got: " + results[3];
        
        // Test with different input
        Object[] results2 = performStringCharOperations("Java", 'Z');
        assert (Character)results2[0] == 'J' : "First character of 'Java' should be 'J'.";
        assert (Character)results2[1] == 'a' : "Last character of 'Java' should be 'a'.";
        assert results2[2].equals("Z") : "Converting 'Z' to String should result in \"Z\".";
        assert results2[3].equals("JavaZ") : "Concatenating 'Java' and 'Z' should result in \"JavaZ\".";
    }
} 