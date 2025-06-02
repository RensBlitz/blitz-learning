package javaexercises; /**
 * DataStructures6: Iterating Collections
 *
 * This exercise focuses on different ways to iterate through collections in Java.
 * You'll work with various iteration techniques including loops, iterators, and streams.
 *
 * Learning objectives:
 * - Use traditional for loops and enhanced for-each loops
 * - Work with iterators for flexible collection traversal
 * - Understand when to use different iteration methods
 * - Learn basic Java streams for collection processing
 * - Handle concurrent modification issues
 *
 * Note: This exercise uses assertions. Run with assertions enabled.
 */
import java.util.*;

public class CollectionIteration {

    public static void main(String[] args) {
        System.out.println("DataStructures6: Iterating Collections");

        try {
            testTraditionalForLoop();
            testEnhancedForLoop();
            testIterator();
            testBasicStreams();
            testFilteringIteration();
            System.out.println("All tests passed! Your implementation is correct.");
        } catch (AssertionError e) {
            System.out.println("Test failed: " + e.getMessage());
        }
    }

    /**
     * This method demonstrates using traditional for loop with arrays and lists.
     * TODO: Implement the following:
     * 1. Create a StringBuilder to store the results
     * 2. Use a traditional for loop with index to iterate through the array
     *    and append each element followed by a comma to the StringBuilder
     * 3. Use a traditional for loop with index to iterate through the list
     *    and append each element followed by a comma to the StringBuilder
     *
     * @param array An array of integers
     * @param list A list of strings
     * @return A string containing the elements, e.g. "1,2,3,A,B,C,"
     */
    public static String useTraditionalForLoop(int[] array, List<String> list) {
        // TODO: Implement your solution here
        
        // 1. Create a StringBuilder
        StringBuilder result = null; // Replace with your implementation
        
        // 2. Iterate through the array using a traditional for loop
        // Your code here
        
        // 3. Iterate through the list using a traditional for loop
        // Your code here
        
        return ""; // Replace with your implementation
    }

    /**
     * This method demonstrates using enhanced for-each loops.
     * TODO: Implement the following:
     * 1. Create a StringBuilder to store the results
     * 2. Use an enhanced for loop to iterate through the set
     *    and append each element followed by a comma to the StringBuilder
     * 3. Use an enhanced for loop to iterate through the map's entrySet
     *    and append each key-value pair as "key:value," to the StringBuilder
     *
     * @param set A set of integers
     * @param map A map with string keys and integer values
     * @return A string containing the elements, e.g. "1,2,3,A:1,B:2,C:3,"
     */
    public static String useEnhancedForLoop(Set<Integer> set, Map<String, Integer> map) {
        // TODO: Implement your solution here
        
        // 1. Create a StringBuilder
        StringBuilder result = null; // Replace with your implementation
        
        // 2. Iterate through the set using enhanced for loop
        // Your code here
        
        // 3. Iterate through the map's entrySet using enhanced for loop
        // Your code here
        
        return ""; // Replace with your implementation
    }

    /**
     * This method demonstrates using iterators for collection traversal.
     * TODO: Implement the following:
     * 1. Create a StringBuilder to store the results
     * 2. Use an iterator to iterate through the list and append
     *    each element followed by a comma to the StringBuilder
     * 3. While iterating, remove any elements that are less than 3
     * 4. Return both the resulting string and the modified list
     *
     * @param list A list of integers
     * @return An array containing [resultString, modifiedList]
     */
    public static Object[] useIterator(List<Integer> list) {
        // TODO: Implement your solution here
        
        // 1. Create a StringBuilder
        StringBuilder result = null; // Replace with your implementation
        
        // 2 & 3. Use an iterator to traverse and modify the list
        // Hint: you need to use an iterator to safely remove elements while iterating
        // Your code here
        
        return new Object[]{"", list}; // Replace with your implementation
    }

    /**
     * This method demonstrates using basic Java streams.
     * TODO: Implement the following:
     * 1. Use streams to filter the list to only include even numbers
     * 2. Use streams to map each even number to its square
     * 3. Use streams to reduce the squared numbers to their sum
     *
     * @param list A list of integers
     * @return The sum of squares of all even numbers in the list
     */
    public static int useBasicStreams(List<Integer> list) {
        // TODO: Implement your solution here
        
        // Use streams to filter, map, and reduce
        // Your code here
        
        return 0; // Replace with your implementation
    }

    /**
     * This method demonstrates filtering collections based on criteria.
     * 
     * Scenario: You are building a search and analytics system that needs to:
     * - Filter a collection of text data based on search criteria
     * - Analyze numerical data to identify significant values
     * 
     * TODO: Implement a method that processes collections according to search criteria.
     * Think about:
     * - Which collection types would be most efficient for storing the filtered results?
     * - How can you ensure efficient filtering of the collections?
     * - What edge cases should you handle? (null values, empty strings, etc.)
     * - How would your solution scale with larger collections?
     *
     * @param words A list of words to search through
     * @param prefix The search criteria for the words
     * @param map A map containing analytics data
     * @param threshold The minimum value to consider significant
     * @return An array containing [filteredWords, significantData]
     */
    public static Object[] filterWhileIterating(List<String> words, String prefix, 
                                               Map<String, Integer> map, int threshold) {
        // TODO: Implement your solution here
        
        // 1. Find words that start with the prefix
        List<String> matchingWords = null; // Replace with your implementation
        
        // 2. Find map entries with values greater than the threshold
        Map<String, Integer> matchingEntries = null; // Replace with your implementation
        
        return new Object[]{matchingWords, matchingEntries};
    }

    private static void testTraditionalForLoop() {
        int[] array = {1, 2, 3};
        List<String> list = Arrays.asList("A", "B", "C");
        
        String result = useTraditionalForLoop(array, list);
        assert result.equals("1,2,3,A,B,C,") : 
            "Expected '1,2,3,A,B,C,', but got '" + result + "'";
    }

    private static void testEnhancedForLoop() {
        Set<Integer> set = new HashSet<>(Arrays.asList(1, 2, 3));
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        
        String result = useEnhancedForLoop(set, map);
        
        // Since sets and maps don't guarantee order, we need to check that all elements are present
        assert result.contains("1,") : "Result should contain '1,'.";
        assert result.contains("2,") : "Result should contain '2,'.";
        assert result.contains("3,") : "Result should contain '3,'.";
        assert result.contains("A:1,") : "Result should contain 'A:1,'.";
        assert result.contains("B:2,") : "Result should contain 'B:2,'.";
        assert result.contains("C:3,") : "Result should contain 'C:3,'.";
    }

    private static void testIterator() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        
        Object[] results = useIterator(list);
        assert results != null : "The returned array should not be null.";
        assert results.length == 2 : "The array should contain 2 elements.";
        
        // Test result string
        String resultString = (String) results[0];
        assert resultString.contains("1,") : "Result should contain '1,'.";
        assert resultString.contains("2,") : "Result should contain '2,'.";
        assert resultString.contains("3,") : "Result should contain '3,'.";
        assert resultString.contains("4,") : "Result should contain '4,'.";
        assert resultString.contains("5,") : "Result should contain '5,'.";
        
        // Test modified list
        List<?> modifiedList = (List<?>) results[1];
        assert modifiedList.size() == 3 : "List should have 3 elements after modification.";
        assert !modifiedList.contains(1) : "List should not contain 1.";
        assert !modifiedList.contains(2) : "List should not contain 2.";
        assert modifiedList.contains(3) : "List should contain 3.";
        assert modifiedList.contains(4) : "List should contain 4.";
        assert modifiedList.contains(5) : "List should contain 5.";
    }

    private static void testBasicStreams() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        
        int result = useBasicStreams(list);
        assert result == 56 : "Sum of squares of even numbers should be 56. Got: " + result;
        // (2² + 4² + 6²) = 4 + 16 + 36 = 56
    }

    private static void testFilteringIteration() {
        List<String> words = Arrays.asList("apple", "banana", "apricot", "orange", "avocado");
        String prefix = "a";
        
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 5);
        map.put("C", 3);
        map.put("D", 7);
        int threshold = 4;
        
        Object[] results = filterWhileIterating(words, prefix, map, threshold);
        assert results != null : "The returned array should not be null.";
        assert results.length == 2 : "The array should contain 2 elements.";
        
        // Test matching words
        List<?> matchingWords = (List<?>) results[0];
        assert matchingWords.size() == 3 : "Should find 3 words starting with 'a'.";
        assert matchingWords.contains("apple") : "Matching words should contain 'apple'.";
        assert matchingWords.contains("apricot") : "Matching words should contain 'apricot'.";
        assert matchingWords.contains("avocado") : "Matching words should contain 'avocado'.";
        
        // Test matching entries
        Map<?, ?> matchingEntries = (Map<?, ?>) results[1];
        assert matchingEntries.size() == 2 : "Should find 2 entries with values > 4.";
        assert matchingEntries.containsKey("B") : "Matching entries should contain key 'B'.";
        assert matchingEntries.containsKey("D") : "Matching entries should contain key 'D'.";
    }
} 