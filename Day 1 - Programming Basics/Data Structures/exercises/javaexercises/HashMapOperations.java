package javaexercises; /**
 * DataStructures4: Maps and Dictionaries
 *
 * This exercise focuses on working with maps/dictionaries in Java using HashMap.
 * Maps store key-value pairs and allow for efficient lookup by key.
 *
 * Learning objectives:
 * - Create and initialize HashMap collections
 * - Store and retrieve key-value pairs
 * - Update and remove entries
 * - Iterate through map entries, keys, and values
 * - Understand when to use maps over other data structures
 *
 * Note: This exercise uses assertions. Run with assertions enabled.
 */
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class HashMapOperations {

    public static void main(String[] args) {
        System.out.println("DataStructures4: Maps and Dictionaries");

        try {
            testMapCreation();
            testMapOperations();
            testWordFrequency();
            System.out.println("All tests passed! Your implementation is correct.");
        } catch (AssertionError e) {
            System.out.println("Test failed: " + e.getMessage());
        }
    }

    /**
     * This method demonstrates the creation and initialization of maps.
     * TODO: Implement the following:
     * 1. Create an empty HashMap that maps String keys to Integer values
     * 2. Create a HashMap with the following key-value pairs:
     *    - "one" -> 1
     *    - "two" -> 2
     *    - "three" -> 3
     *
     * @return An array containing [emptyMap, populatedMap]
     */
    public static Object[] createMaps() {
        // TODO: Implement your solution here
        
        // 1. Create an empty HashMap
        Map<String, Integer> emptyMap = null; // Replace with your implementation
        
        // 2. Create a populated HashMap
        Map<String, Integer> populatedMap = null; // Replace with your implementation
        
        return new Object[]{emptyMap, populatedMap};
    }

    /**
     * This method demonstrates common map operations.
     * TODO: Implement the following operations on the given map:
     * 1. Add a new entry: "four" -> 4
     * 2. Check if the map contains the key "two"
     * 3. Get the value for the key "three"
     * 4. Update the value for the key "two" to 22
     * 5. Remove the entry with key "one"
     * 6. Get all the keys as a Set
     * 7. Get the size of the map
     *
     * @param map A map to perform operations on
     * @return An array containing [modifiedMap, containsKeyTwo, valueOfThree, keysSet, size]
     */
    public static Object[] performMapOperations(Map<String, Integer> map) {
        // TODO: Implement your solution here
        
        // 1. Add a new entry
        // Your code here
        
        // 2. Check if map contains key
        boolean containsKeyTwo = false; // Replace with your implementation
        
        // 3. Get value for key
        Integer valueOfThree = null; // Replace with your implementation
        
        // 4. Update value for key
        // Your code here
        
        // 5. Remove entry
        // Your code here
        
        // 6. Get all keys
        Set<String> keysSet = null; // Replace with your implementation
        
        // 7. Get size
        int size = 0; // Replace with your implementation
        
        return new Object[]{map, containsKeyTwo, valueOfThree, keysSet, size};
    }

    /**
     * This method counts the frequency of each word in a string.
     * TODO: Implement a method that:
     * 1. Splits the input string into words (separated by spaces)
     * 2. Counts how many times each word appears
     * 3. Returns a map where the keys are words and the values are their frequencies
     *
     * For example, for the input "apple banana apple orange banana apple"
     * the output should be {"apple": 3, "banana": 2, "orange": 1}
     *
     * @param text The input string to analyze
     * @return A map of word frequencies
     */
    public static Map<String, Integer> calculateWordFrequency(String text) {
        // TODO: Implement your solution here
        
        // 1. Split the input string into words
        
        // 2. Count the frequency of each word
        
        // 3. Return the frequency map
        
        return null; // Replace with your implementation
    }

    private static void testMapCreation() {
        Object[] maps = createMaps();
        
        assert maps != null : "The returned array should not be null.";
        assert maps.length == 2 : "The array should contain 2 elements.";
        
        // Test empty map
        assert maps[0] instanceof Map : "First element should be a Map.";
        Map<?, ?> emptyMap = (Map<?, ?>) maps[0];
        assert emptyMap.isEmpty() : "First map should be empty.";
        
        // Test populated map
        assert maps[1] instanceof Map : "Second element should be a Map.";
        Map<?, ?> populatedMap = (Map<?, ?>) maps[1];
        assert populatedMap.size() == 3 : "Second map should have 3 entries.";
        assert populatedMap.containsKey("one") : "Map should contain key 'one'.";
        assert populatedMap.containsKey("two") : "Map should contain key 'two'.";
        assert populatedMap.containsKey("three") : "Map should contain key 'three'.";
        assert populatedMap.get("one").equals(1) : "Value for key 'one' should be 1.";
        assert populatedMap.get("two").equals(2) : "Value for key 'two' should be 2.";
        assert populatedMap.get("three").equals(3) : "Value for key 'three' should be 3.";
    }

    private static void testMapOperations() {
        Map<String, Integer> testMap = new HashMap<>();
        testMap.put("one", 1);
        testMap.put("two", 2);
        testMap.put("three", 3);
        
        Object[] results = performMapOperations(testMap);
        
        assert results != null : "The returned array should not be null.";
        assert results.length == 5 : "The array should contain 5 elements.";
        
        // Test modified map
        assert results[0] instanceof Map : "First element should be a Map.";
        Map<?, ?> modifiedMap = (Map<?, ?>) results[0];
        assert modifiedMap.size() == 3 : "Map should have 3 entries after operations.";
        assert modifiedMap.containsKey("four") : "Map should contain key 'four'.";
        assert modifiedMap.containsKey("two") : "Map should contain key 'two'.";
        assert modifiedMap.containsKey("three") : "Map should contain key 'three'.";
        assert !modifiedMap.containsKey("one") : "Map should not contain key 'one'.";
        assert modifiedMap.get("two").equals(22) : "Value for key 'two' should be 22.";
        assert modifiedMap.get("four").equals(4) : "Value for key 'four' should be 4.";
        
        // Test contains key
        assert results[1] instanceof Boolean : "Second element should be a Boolean.";
        assert (Boolean) results[1] : "Map should contain key 'two'.";
        
        // Test value for key
        assert results[2] instanceof Integer : "Third element should be an Integer.";
        assert results[2].equals(3) : "Value for key 'three' should be 3.";
        
        // Test keys set
        assert results[3] instanceof Set : "Fourth element should be a Set.";
        Set<?> keysSet = (Set<?>) results[3];
        assert keysSet.size() == 3 : "Keys set should have 3 elements.";
        assert keysSet.contains("two") : "Keys set should contain 'two'.";
        assert keysSet.contains("three") : "Keys set should contain 'three'.";
        assert keysSet.contains("four") : "Keys set should contain 'four'.";
        
        // Test size
        assert results[4] instanceof Integer : "Fifth element should be an Integer.";
        assert results[4].equals(3) : "Size should be 3.";
    }

    private static void testWordFrequency() {
        String text = "apple banana apple orange banana apple";
        Map<String, Integer> frequencies = calculateWordFrequency(text);
        
        assert frequencies != null : "The returned map should not be null.";
        assert frequencies.size() == 3 : "The map should have 3 entries.";
        assert frequencies.get("apple").equals(3) : "Frequency of 'apple' should be 3.";
        assert frequencies.get("banana").equals(2) : "Frequency of 'banana' should be 2.";
        assert frequencies.get("orange").equals(1) : "Frequency of 'orange' should be 1.";
        
        String empty = "";
        Map<String, Integer> emptyResult = calculateWordFrequency(empty);
        assert emptyResult.isEmpty() : "Result for empty string should be an empty map.";
    }
} 