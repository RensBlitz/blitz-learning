package javaexercises;

/**
 * Methods5: Method Decomposition
 *
 * This exercise focuses on breaking down complex operations into multiple methods
 * for better organization, readability, and reusability.
 *
 * Learning objectives:
 * - Learn how to decompose complex tasks into smaller, focused methods
 * - Organize code using helper methods
 * - Improve code readability and maintainability through decomposition
 * - Practice calling methods from other methods
 *
 * Note: This exercise uses assertions. Run with assertions enabled.
 */
public class MethodDecomposition {

    public static void main(String[] args) {
        System.out.println("Methods5: Method Decomposition");

        try {
            testStudentGradeProcessor();
            testPasswordValidator();
            testTextAnalyzer();
            System.out.println("All tests passed! Your implementation is correct.");
        } catch (AssertionError e) {
            System.out.println("Test failed: " + e.getMessage());
        }
    }

    /**
     * This method processes student grades by calculating statistics.
     * 
     * TODO: Implement this method to process an array of student grades.
     * Use helper methods to decompose the logic:
     * 1. Call calculateAverage() to get the average grade
     * 2. Call findHighestGrade() to get the highest grade
     * 3. Call findLowestGrade() to get the lowest grade
     * 4. Call countPassingGrades() to count grades >= 60
     * 5. Return an array containing [average, highest, lowest, passingCount]
     *
     * @param grades Array of student grades (0-100)
     * @return Array containing [average, highest, lowest, passingCount]
     */
    public static double[] processGrades(int[] grades) {
        // TODO: Implement your solution here by calling helper methods
        return null; // Replace with your implementation
    }

    /**
     * TODO: Implement a helper method to calculate the average of an array of grades.
     * If the array is empty, return 0.0.
     *
     * @param grades Array of student grades
     * @return The average grade or 0.0 if array is empty
     */
    private static double calculateAverage(int[] grades) {
        // TODO: Implement your solution here
        return 0.0; // Replace with your implementation
    }

    /**
     * TODO: Implement a helper method to find the highest grade in an array.
     * If the array is empty, return 0.
     *
     * @param grades Array of student grades
     * @return The highest grade or 0 if array is empty
     */
    private static int findHighestGrade(int[] grades) {
        // TODO: Implement your solution here
        return 0; // Replace with your implementation
    }

    /**
     * TODO: Implement a helper method to find the lowest grade in an array.
     * If the array is empty, return 0.
     *
     * @param grades Array of student grades
     * @return The lowest grade or 0 if array is empty
     */
    private static int findLowestGrade(int[] grades) {
        // TODO: Implement your solution here
        return 0; // Replace with your implementation
    }

    /**
     * TODO: Implement a helper method to count the number of passing grades.
     * A passing grade is 60 or higher.
     *
     * @param grades Array of student grades
     * @return The count of passing grades
     */
    private static int countPassingGrades(int[] grades) {
        // TODO: Implement your solution here
        return 0; // Replace with your implementation
    }

    /**
     * This method validates a password using multiple criteria.
     * 
     * TODO: Implement this method to validate a password using helper methods:
     * 1. Call isLongEnough() to check if the password is at least 8 characters
     * 2. Call hasUpperCase() to check if it contains at least one uppercase letter
     * 3. Call hasLowerCase() to check if it contains at least one lowercase letter
     * 4. Call hasDigit() to check if it contains at least one digit
     * 5. Call hasSpecialChar() to check if it has at least one special character
     * 
     * Return true only if ALL criteria are met.
     *
     * @param password The password to validate
     * @return true if the password meets all criteria, false otherwise
     */
    public static boolean validatePassword(String password) {
        // TODO: Implement your solution here by calling helper methods
        return false; // Replace with your implementation
    }

    /**
     * TODO: Implement a helper method to check if a password is at least 8 characters long.
     *
     * @param password The password to check
     * @return true if the password is at least 8 characters long, false otherwise
     */
    private static boolean isLongEnough(String password) {
        // TODO: Implement your solution here
        return false; // Replace with your implementation
    }

    /**
     * TODO: Implement a helper method to check if a password contains at least one uppercase letter.
     *
     * @param password The password to check
     * @return true if the password contains at least one uppercase letter, false otherwise
     */
    private static boolean hasUpperCase(String password) {
        // TODO: Implement your solution here
        return false; // Replace with your implementation
    }

    /**
     * TODO: Implement a helper method to check if a password contains at least one lowercase letter.
     *
     * @param password The password to check
     * @return true if the password contains at least one lowercase letter, false otherwise
     */
    private static boolean hasLowerCase(String password) {
        // TODO: Implement your solution here
        return false; // Replace with your implementation
    }

    /**
     * TODO: Implement a helper method to check if a password contains at least one digit.
     *
     * @param password The password to check
     * @return true if the password contains at least one digit, false otherwise
     */
    private static boolean hasDigit(String password) {
        // TODO: Implement your solution here
        return false; // Replace with your implementation
    }

    /**
     * TODO: Implement a helper method to check if a password contains at least one special character.
     * Special characters include: !@#$%^&*()-_=+[]{}|;:'",.<>/?
     *
     * @param password The password to check
     * @return true if the password contains at least one special character, false otherwise
     */
    private static boolean hasSpecialChar(String password) {
        // TODO: Implement your solution here
        return false; // Replace with your implementation
    }

    /**
     * This method analyzes a text and returns statistics about it.
     * 
     * TODO: Implement this method to analyze a text using helper methods:
     * 1. Call countWords() to count the number of words in the text
     * 2. Call countSentences() to count the number of sentences
     * 3. Call calculateAverageWordLength() to get the average word length
     * 4. Return an array containing [wordCount, sentenceCount, avgWordLength]
     *
     * @param text The text to analyze
     * @return Array containing [wordCount, sentenceCount, avgWordLength]
     */
    public static Object[] analyzeText(String text) {
        // TODO: Implement your solution here by calling helper methods
        return null; // Replace with your implementation
    }

    /**
     * TODO: Implement a helper method to count the number of words in a text.
     * Words are separated by one or more spaces.
     * If the text is empty or null, return 0.
     *
     * @param text The text to analyze
     * @return The number of words in the text
     */
    private static int countWords(String text) {
        // TODO: Implement your solution here
        return 0; // Replace with your implementation
    }

    /**
     * TODO: Implement a helper method to count the number of sentences in a text.
     * Sentences end with ., !, or ?.
     * If the text is empty or null, return 0.
     *
     * @param text The text to analyze
     * @return The number of sentences in the text
     */
    private static int countSentences(String text) {
        // TODO: Implement your solution here
        return 0; // Replace with your implementation
    }

    /**
     * TODO: Implement a helper method to calculate the average word length in a text.
     * If there are no words, return 0.0.
     *
     * @param text The text to analyze
     * @return The average word length
     */
    private static double calculateAverageWordLength(String text) {
        // TODO: Implement your solution here
        return 0.0; // Replace with your implementation
    }

    // Test methods
    private static void testStudentGradeProcessor() {
        int[] grades = {85, 92, 78, 65, 90, 55, 72, 68};
        double[] result = processGrades(grades);
        
        assert result != null : "processGrades should not return null";
        assert result.length == 4 : "processGrades should return an array of length 4";
        
        assert Math.abs(result[0] - 75.625) < 0.001 : 
            "Average grade should be 75.625, but got " + result[0];
        assert result[1] == 92 : "Highest grade should be 92, but got " + (int)result[1];
        assert result[2] == 55 : "Lowest grade should be 55, but got " + (int)result[2];
        assert result[3] == 7 : "Passing count should be 7, but got " + (int)result[3];
        
        // Test with empty array
        int[] emptyGrades = {};
        double[] emptyResult = processGrades(emptyGrades);
        
        assert emptyResult != null : "processGrades should not return null for empty array";
        assert emptyResult.length == 4 : "processGrades should return an array of length 4 for empty array";
        assert emptyResult[0] == 0.0 : "Average grade for empty array should be 0.0";
        assert emptyResult[1] == 0 : "Highest grade for empty array should be 0";
        assert emptyResult[2] == 0 : "Lowest grade for empty array should be 0";
        assert emptyResult[3] == 0 : "Passing count for empty array should be 0";
    }

    private static void testPasswordValidator() {
        boolean valid1 = validatePassword("Passw0rd!");
        assert valid1 : "Password 'Passw0rd!' should be valid";
        
        boolean valid2 = validatePassword("password");
        assert !valid2 : "Password 'password' should be invalid (missing uppercase, digit, and special char)";
        
        boolean valid3 = validatePassword("12345678");
        assert !valid3 : "Password '12345678' should be invalid (missing uppercase, lowercase, and special char)";
        
        boolean valid4 = validatePassword("Pass");
        assert !valid4 : "Password 'Pass' should be invalid (too short, missing digit and special char)";
        
        boolean valid5 = validatePassword("Password1");
        assert !valid5 : "Password 'Password1' should be invalid (missing special char)";
    }

    private static void testTextAnalyzer() {
        String text = "Hello, world! This is a sample text. It has three sentences.";
        Object[] result = analyzeText(text);
        
        assert result != null : "analyzeText should not return null";
        assert result.length == 3 : "analyzeText should return an array of length 3";
        
        assert result[0].equals(12) : "Word count should be 12, but got " + result[0];
        assert result[1].equals(3) : "Sentence count should be 3, but got " + result[1];
        assert Math.abs((Double)result[2] - 4.0) < 0.001 : 
            "Average word length should be 4.0, but got " + result[2];
        
        // Test with empty text
        Object[] emptyResult = analyzeText("");
        
        assert emptyResult != null : "analyzeText should not return null for empty text";
        assert emptyResult.length == 3 : "analyzeText should return an array of length 3 for empty text";
        assert emptyResult[0].equals(0) : "Word count for empty text should be 0";
        assert emptyResult[1].equals(0) : "Sentence count for empty text should be 0";
        assert (Double)emptyResult[2] == 0.0 : "Average word length for empty text should be 0.0";
        
        // Test with null
        Object[] nullResult = analyzeText(null);
        
        assert nullResult != null : "analyzeText should not return null for null text";
        assert nullResult.length == 3 : "analyzeText should return an array of length 3 for null text";
        assert nullResult[0].equals(0) : "Word count for null text should be 0";
        assert nullResult[1].equals(0) : "Sentence count for null text should be 0";
        assert (Double)nullResult[2] == 0.0 : "Average word length for null text should be 0.0";
    }
} 