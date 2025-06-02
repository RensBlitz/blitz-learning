package javaexercises;

/**
 * Methods2: Method Parameters and Return Values
 *
 * This exercise focuses on working with different types of method parameters
 * and return values, including primitives, objects, and arrays.
 *
 * Learning objectives:
 * - Work with various parameter types (primitives, objects, arrays)
 * - Return different types of values from methods
 * - Understand pass-by-value behavior in Java
 * - Modify method parameters appropriately
 *
 * Note: This exercise uses assertions. Run with assertions enabled.
 */
public class MethodParameters {

    public static void main(String[] args) {
        System.out.println("Methods2: Method Parameters and Return Values");

        try {
            testCalculateAverage();
            testCountOccurrences();
            testCreateGreeting();
            testModifyArray();
            System.out.println("All tests passed! Your implementation is correct.");
        } catch (AssertionError e) {
            System.out.println("Test failed: " + e.getMessage());
        }
    }

    /**
     * TODO: Implement a method that computes a statistical measure for a set of values.
     * Consider what mathematical operations would provide meaningful insights.
     *
     * Requirements:
     * - Input: array of doubles
     * - Output: average (mean) of all values in the array
     * - Return 0.0 if the array is empty
     *
     * @param numbers An array of doubles
     * @return The average of the numbers, or 0.0 if the array is empty
     */
    public static double calculateAverage(double[] numbers) {
        // TODO: Implement your solution here
        return 0.0;
    }

    /**
     * TODO: Implement a method that analyzes text for specific patterns.
     * Consider how to search through text data efficiently.
     *
     * Requirements:
     * - Input: a string and a character
     * - Output: count of how many times the character appears in the string
     * - Search should be case-sensitive ('a' and 'A' are different characters)
     *
     * @param str The string to search in
     * @param ch The character to search for
     * @return The number of occurrences of the character in the string
     */
    public static int countOccurrences(String str, char ch) {
        // TODO: Implement your solution here
        return 0;
    }

    /**
     * TODO: Implement a method that creates formatted messages based on user attributes.
     * Consider how to combine and format text for different scenarios.
     *
     * Requirements:
     * - Input: 
     *   - name (string)
     *   - timeOfDay (string): "morning", "afternoon", or "evening"
     * - Output: greeting in format "Good [timeOfDay], [name]!"
     * - If timeOfDay is not one of the specified options, use "day" instead
     *
     * @param name The name of the person to greet
     * @param timeOfDay The time of day ("morning", "afternoon", or "evening")
     * @return A personalized greeting
     */
    public static String createGreeting(String name, String timeOfDay) {
        // TODO: Implement your solution here
        return null;
    }

    /**
     * TODO: Implement a method that transforms a collection of values.
     * Consider how changes to data can be applied in place.
     *
     * Requirements:
     * - Input: array of integers
     * - Operation: modify the array by doubling each element (multiply by 2)
     * - No return value (void) - array must be modified directly
     *
     * @param array The array to modify
     */
    public static void doubleArrayElements(int[] array) {
        // TODO: Implement your solution here
    }

    // Test methods
    private static void testCalculateAverage() {
        double[] numbers1 = {1.0, 2.0, 3.0, 4.0, 5.0};
        double average1 = calculateAverage(numbers1);
        assert Math.abs(average1 - 3.0) < 0.001 : 
            "Average of [1.0, 2.0, 3.0, 4.0, 5.0] should be 3.0, but got " + average1;
        
        double[] numbers2 = {-1.5, 2.5, 0.0};
        double average2 = calculateAverage(numbers2);
        assert Math.abs(average2 - 0.333) < 0.001 : 
            "Average of [-1.5, 2.5, 0.0] should be around 0.333, but got " + average2;
        
        double[] emptyArray = {};
        double average3 = calculateAverage(emptyArray);
        assert average3 == 0.0 : 
            "Average of an empty array should be 0.0, but got " + average3;
    }

    private static void testCountOccurrences() {
        int count1 = countOccurrences("hello", 'l');
        assert count1 == 2 : 
            "Character 'l' should appear 2 times in 'hello', but got " + count1;
        
        int count2 = countOccurrences("Mississippi", 's');
        assert count2 == 4 : 
            "Character 's' should appear 4 times in 'Mississippi', but got " + count2;
        
        int count3 = countOccurrences("Java", 'j');
        assert count3 == 0 : 
            "Character 'j' should appear 0 times in 'Java' (case-sensitive), but got " + count3;
    }

    private static void testCreateGreeting() {
        String greeting1 = createGreeting("Alice", "morning");
        assert "Good morning, Alice!".equals(greeting1) : 
            "Greeting should be 'Good morning, Alice!', but got '" + greeting1 + "'";
        
        String greeting2 = createGreeting("Bob", "evening");
        assert "Good evening, Bob!".equals(greeting2) : 
            "Greeting should be 'Good evening, Bob!', but got '" + greeting2 + "'";
        
        String greeting3 = createGreeting("Charlie", "night");
        assert "Good day, Charlie!".equals(greeting3) : 
            "Greeting with invalid time should be 'Good day, Charlie!', but got '" + greeting3 + "'";
    }

    private static void testModifyArray() {
        int[] array1 = {1, 2, 3, 4};
        doubleArrayElements(array1);
        assert array1[0] == 2 : "First element should be 2, but got " + array1[0];
        assert array1[1] == 4 : "Second element should be 4, but got " + array1[1];
        assert array1[2] == 6 : "Third element should be 6, but got " + array1[2];
        assert array1[3] == 8 : "Fourth element should be 8, but got " + array1[3];
        
        int[] array2 = {0, -1, 5};
        doubleArrayElements(array2);
        assert array2[0] == 0 : "First element should be 0, but got " + array2[0];
        assert array2[1] == -2 : "Second element should be -2, but got " + array2[1];
        assert array2[2] == 10 : "Third element should be 10, but got " + array2[2];
    }
} 