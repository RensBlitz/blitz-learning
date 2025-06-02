package java;

/**
 * Exercise 5: Type Conversion and Casting
 * 
 * This exercise focuses on converting between different variable types,
 * understanding implicit and explicit type conversion, and handling
 * potential data loss during conversions.
 * 
 * Learning objectives:
 * - Understand implicit type conversion (widening)
 * - Apply explicit type casting (narrowing)
 * - Learn about potential data loss during conversions
 * - Practice converting between different data types
 * 
 * Note: This exercise uses assertions. Run with the -ea flag:
 * java -ea Exercise5
 */
public class TypeConversionAndCasting {
    
    public static void main(String[] args) {
        System.out.println("Exercise 5: Type Conversion and Casting");
        
        try {
            // Test the implementation
            testTypeConversion();
            testDataLoss();
            testStringConversion();
            
            System.out.println("All tests passed! Your implementation is correct.");
        } catch (AssertionError e) {
            System.out.println("Test failed: " + e.getMessage());
        }
    }
    
    /**
     * Demonstrates widening conversion (implicit conversion to larger types).
     * 
     * TODO: Implement this method to perform widening conversions:
     * 1. Start with a byte value (e.g., 100)
     * 2. Convert it to a short
     * 3. Convert the short to an int
     * 4. Convert the int to a long
     * 5. Convert the long to a float
     * 6. Convert the float to a double
     * 
     * Note: Widening conversions happen automatically without explicit casting.
     * 
     * @return The final double value after all conversions
     */
    public static double performWidening() {
        // TODO: Implement your solution here
        
        return 0.0; // Replace with your implementation
    }
    
    /**
     * Demonstrates narrowing conversion (explicit casting to smaller types).
     * 
     * TODO: Implement this method to perform narrowing conversions:
     * 1. Start with a double value with a decimal part (e.g., 100.9)
     * 2. Cast it to a float
     * 3. Cast the float to a long (notice any data loss?)
     * 4. Cast the long to an int
     * 5. Cast the int to a short
     * 6. Cast the short to a byte
     * 
     * Note: Narrowing conversions require explicit casting and may lose information.
     * 
     * @return An array containing all the values in this order:
     *         [double, float, long, int, short, byte]
     */
    public static Number[] performNarrowing() {
        // TODO: Implement your solution here
        
        return null; // Replace with your implementation
    }
    
    /**
     * Converts between numeric types and strings.
     * 
     * TODO: Implement this method to perform string conversions:
     * 1. Convert the integer 42 to a string
     * 2. Convert the string "3.14159" to a double
     * 3. Try to convert the string "Hello" to an integer (handle the exception)
     * 
     * @return An array containing: [the string "42", the double 3.14159, 
     *         -1 (or any error indicator for the last conversion)]
     */
    public static Object[] convertWithStrings() {
        // TODO: Implement your solution here
        
        return null; // Replace with your implementation
    }
    
    /**
     * TODO: Implement a method that transforms data between compatible types.
     * Consider when and why data type conversions happen automatically.
     *
     * Requirements:
     * - Input: integer, byte, and short values
     * - Return an object array containing:
     *   1. The int converted to long
     *   2. The int converted to float
     *   3. The int converted to double
     *   4. The byte converted to int
     *   5. The short converted to int
     *
     * @param intValue An integer value
     * @param byteValue A byte value
     * @param shortValue A short value
     * @return An array containing the converted values
     */
    public static Object[] performWideningConversions(int intValue, byte byteValue, short shortValue) {
        // TODO: Implement your solution here
        return null;
    }

    /**
     * TODO: Implement a method that transforms data between potentially incompatible types.
     * Consider how data might be lost and when explicit conversions are necessary.
     *
     * Requirements:
     * - Input: long, double, and float values
     * - Return an object array containing:
     *   1. The long converted to int
     *   2. The double converted to float
     *   3. The double converted to long
     *   4. The float converted to int
     *   5. The long converted to short
     *
     * @param longValue A long value
     * @param doubleValue A double value
     * @param floatValue A float value
     * @return An array containing the converted values
     */
    public static Object[] performNarrowingConversions(long longValue, double doubleValue, float floatValue) {
        // TODO: Implement your solution here
        return null;
    }

    /**
     * TODO: Implement a method that converts between string and numeric representations.
     * Consider how data can be formatted and parsed for different uses.
     *
     * Requirements:
     * - Input: integer, double, and boolean values
     * - Return an object array containing:
     *   1. The int converted to a string
     *   2. The double converted to a string
     *   3. The boolean converted to a string
     *   4. The string "100" parsed as an int
     *   5. The string "3.14" parsed as a double
     *   6. The string "true" parsed as a boolean
     *
     * @param intValue An integer value
     * @param doubleValue A double value
     * @param boolValue A boolean value
     * @return An array containing the converted values
     */
    public static Object[] performStringConversions(int intValue, double doubleValue, boolean boolValue) {
        // TODO: Implement your solution here
        return null;
    }
    
    /**
     * Tests the student's implementation of widening conversion.
     */
    private static void testTypeConversion() {
        double result = performWidening();
        
        // The exact result should be 100.0 if they started with 100
        assert Math.abs(result - 100.0) < 0.0001 : 
            "Your widening conversion didn't preserve the value 100. Got: " + result;
    }
    
    /**
     * Tests the student's implementation of narrowing conversion and data loss.
     */
    private static void testDataLoss() {
        Number[] results = performNarrowing();
        
        // Check if array is not null and has correct size
        assert results != null : "Your method returned null instead of an array of Number objects";
        assert results.length == 6 : "Your array should contain exactly 6 values, but it contains " + results.length;
        
        // Check the types of the returned values
        assert results[0] instanceof Double : "The first element should be a Double";
        assert results[1] instanceof Float : "The second element should be a Float";
        assert results[2] instanceof Long : "The third element should be a Long";
        assert results[3] instanceof Integer : "The fourth element should be an Integer";
        assert results[4] instanceof Short : "The fifth element should be a Short";
        assert results[5] instanceof Byte : "The sixth element should be a Byte";
        
        // Check for expected data loss - the byte value should be different from the original
        double originalValue = results[0].doubleValue();
        byte finalValue = results[5].byteValue();
        
        // If they chose 100.9 as suggested, it should be truncated to 100 as a byte
        assert originalValue > 100.0 && finalValue == 100 : 
            "Your implementation doesn't show the expected data loss pattern. " +
            "Try using a value like 100.9 that will demonstrate truncation.";
    }
    
    /**
     * Tests the student's implementation of string conversion.
     */
    private static void testStringConversion() {
        Object[] results = convertWithStrings();
        
        // Check if array is not null and has correct size
        assert results != null : "Your method returned null instead of an array of results";
        assert results.length == 3 : "Your array should contain exactly 3 values, but it contains " + results.length;
        
        // Check the conversions
        assert results[0] instanceof String && results[0].equals("42") : 
            "The first element should be the string \"42\"";
            
        assert results[1] instanceof Double && Math.abs(((Double)results[1]) - 3.14159) < 0.0001 : 
            "The second element should be the double value 3.14159";
            
        // Check error handling - the third element could be any error indicator
        assert results[2] != null && !(results[2] instanceof Integer && ((Integer)results[2]) > 0) : 
            "The third element should indicate an error in converting \"Hello\" to an integer";
    }
} 