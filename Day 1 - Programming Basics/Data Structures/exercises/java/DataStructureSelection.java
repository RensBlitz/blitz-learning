package java; /**
 * DataStructures8: Choosing the Right Data Structure
 *
 * This exercise focuses on selecting appropriate data structures for
 * different scenarios based on their characteristics and performance.
 *
 * Learning objectives:
 * - Understand the strengths and weaknesses of different data structures
 * - Evaluate which data structure is best suited for specific tasks
 * - Implement solutions using the most appropriate data structure
 * - Analyze performance considerations in data structure selection
 * - Measure and compare time complexity for different operations
 *
 * Note: This exercise uses assertions. Run with assertions enabled.
 */
import java.util.*;

public class DataStructureSelection {

    public static void main(String[] args) {
        System.out.println("DataStructures8: Choosing the Right Data Structure");

        try {
            testUniqueCollection();
            testFrequencyCounter();
            testFastLookup();
            testOrderedCollection();
            testCustomDataStructure();
            System.out.println("All tests passed! Your implementation is correct.");
        } catch (AssertionError e) {
            System.out.println("Test failed: " + e.getMessage());
        }
    }

    /**
     * Scenario 1: You need to track a collection of unique items where 
     * fast lookup is important but order does not matter.
     * 
     * TODO: Implement a method that:
     * 1. Takes a list of potentially duplicate elements
     * 2. Returns a collection of unique elements from the list
     * 3. Provides O(1) lookup time to check if an element exists
     * 
     * Hint: Consider which data structure best handles unique elements with fast lookup.
     *
     * @param input A list of potentially duplicate strings
     * @return A collection containing only the unique elements
     */
    public static Collection<String> createUniqueCollection(List<String> input) {
        // TODO: Implement your solution here
        
        // Choose and implement the appropriate data structure
        
        return null; // Replace with your implementation
    }

    /**
     * Scenario 2: You need to count how many times each item appears in a collection.
     * 
     * TODO: Implement a method that:
     * 1. Counts the frequency of each element in the input list
     * 2. Returns a data structure that allows quick lookup of counts by element
     * 
     * Hint: You need to associate each element with its count.
     *
     * @param input A list of elements
     * @return A data structure mapping elements to their frequency counts
     */
    public static Map<String, Integer> countFrequencies(List<String> input) {
        // TODO: Implement your solution here
        
        // Choose and implement the appropriate data structure
        
        return null; // Replace with your implementation
    }

    /**
     * Scenario 3: You need to implement a phone book with fast lookup by name.
     * 
     * TODO: Implement a method that:
     * 1. Creates an appropriate data structure to store name-phone pairs
     * 2. Allows fast lookup of phone numbers by name
     * 3. Updates a phone number if the name already exists
     * 
     * Hint: Consider which data structure provides fast key-based lookups.
     *
     * @param names A list of contact names
     * @param phoneNumbers A parallel list of phone numbers
     * @return A data structure optimized for phone number lookups by name
     */
    public static Object createPhoneBook(List<String> names, List<String> phoneNumbers) {
        // TODO: Implement your solution here
        
        // Choose and implement the appropriate data structure
        
        return null; // Replace with your implementation
    }

    /**
     * Scenario 4: You need a collection that maintains insertion order and allows 
     * fast access to both the first and last elements.
     * 
     * TODO: Implement a method that:
     * 1. Creates an appropriate ordered collection from the input
     * 2. Efficiently supports adding elements to the end
     * 3. Efficiently supports removing elements from both the beginning and end
     * 
     * Hint: Consider which structure best maintains order with efficient operations at both ends.
     *
     * @param input A list of elements to initialize the collection
     * @return An ordered collection optimized for operations at both ends
     */
    public static Object createOrderedCollection(List<String> input) {
        // TODO: Implement your solution here
        
        // Choose and implement the appropriate data structure
        
        return null; // Replace with your implementation
    }

    /**
     * Scenario 5: You need to implement a custom data structure for a specific use case.
     * 
     * In this case, implement a simple LRU (Least Recently Used) cache with a fixed size.
     * When the cache reaches its capacity, the least recently accessed item should be removed.
     * 
     * TODO: Implement a LRU cache with the following operations:
     * 1. put(key, value) - Add or update a key-value pair in the cache
     * 2. get(key) - Get the value for a key (and mark it as recently used)
     * 3. size() - Get the current number of items in the cache
     * 
     * Hint: You might need to combine multiple data structures.
     *
     * @param capacity The maximum number of items the cache can hold
     * @return A Map-like structure implementing an LRU cache
     */
    public static Map<String, String> createLRUCache(int capacity) {
        // This exercise is more advanced - you might need to use a LinkedHashMap
        // or create a custom implementation using multiple data structures
        
        // TODO: Implement your solution here
        
        return null; // Replace with your implementation
    }

    private static void testUniqueCollection() {
        List<String> input = Arrays.asList("apple", "banana", "apple", "cherry", "banana", "date");
        Collection<String> uniqueCollection = createUniqueCollection(input);
        
        assert uniqueCollection != null : "Returned collection should not be null.";
        assert uniqueCollection.size() == 4 : "Collection should contain 4 unique elements.";
        assert uniqueCollection.contains("apple") : "Collection should contain 'apple'.";
        assert uniqueCollection.contains("banana") : "Collection should contain 'banana'.";
        assert uniqueCollection.contains("cherry") : "Collection should contain 'cherry'.";
        assert uniqueCollection.contains("date") : "Collection should contain 'date'.";
        
        // Check if the implementation uses an efficient data structure (should be a Set)
        assert uniqueCollection instanceof Set : 
            "The implementation should use a Set for unique elements with fast lookup.";
    }

    private static void testFrequencyCounter() {
        List<String> input = Arrays.asList("apple", "banana", "apple", "cherry", "banana", "apple");
        Map<String, Integer> frequencies = countFrequencies(input);
        
        assert frequencies != null : "Returned map should not be null.";
        assert frequencies.size() == 3 : "Map should contain 3 entries.";
        assert frequencies.get("apple") == 3 : "Frequency of 'apple' should be 3.";
        assert frequencies.get("banana") == 2 : "Frequency of 'banana' should be 2.";
        assert frequencies.get("cherry") == 1 : "Frequency of 'cherry' should be 1.";
    }

    private static void testFastLookup() {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        List<String> phones = Arrays.asList("123-456-7890", "234-567-8901", "345-678-9012");
        
        Object phoneBook = createPhoneBook(names, phones);
        
        assert phoneBook != null : "Returned phone book should not be null.";
        assert phoneBook instanceof Map : "Phone book should be a Map for fast lookups.";
        
        @SuppressWarnings("unchecked")
        Map<String, String> phoneMap = (Map<String, String>) phoneBook;
        
        assert phoneMap.size() == 3 : "Phone book should contain 3 entries.";
        assert "123-456-7890".equals(phoneMap.get("Alice")) : "Alice's phone should be 123-456-7890.";
        assert "234-567-8901".equals(phoneMap.get("Bob")) : "Bob's phone should be 234-567-8901.";
        assert "345-678-9012".equals(phoneMap.get("Charlie")) : "Charlie's phone should be 345-678-9012.";
    }

    private static void testOrderedCollection() {
        List<String> input = Arrays.asList("first", "second", "third", "fourth");
        
        Object collection = createOrderedCollection(input);
        
        assert collection != null : "Returned collection should not be null.";
        assert collection instanceof Deque : 
            "Collection should be a Deque for efficient operations at both ends.";
        
        @SuppressWarnings("unchecked")
        Deque<String> deque = (Deque<String>) collection;
        
        assert deque.size() == 4 : "Collection should contain 4 elements.";
        assert "first".equals(deque.getFirst()) : "First element should be 'first'.";
        assert "fourth".equals(deque.getLast()) : "Last element should be 'fourth'.";
        
        // Test adding to the end
        deque.addLast("fifth");
        assert "fifth".equals(deque.getLast()) : "Last element should now be 'fifth'.";
        
        // Test removing from the beginning
        String removed = deque.removeFirst();
        assert "first".equals(removed) : "Removed element should be 'first'.";
        assert "second".equals(deque.getFirst()) : "First element should now be 'second'.";
    }

    private static void testCustomDataStructure() {
        Map<String, String> lruCache = createLRUCache(3);
        
        assert lruCache != null : "Returned cache should not be null.";
        
        // Test putting elements
        lruCache.put("key1", "value1");
        lruCache.put("key2", "value2");
        lruCache.put("key3", "value3");
        
        assert lruCache.size() == 3 : "Cache should contain 3 elements.";
        assert "value1".equals(lruCache.get("key1")) : "Value for key1 should be 'value1'.";
        
        // Test eviction (LRU)
        lruCache.put("key4", "value4");
        assert lruCache.size() <= 3 : "Cache should maintain its maximum capacity of 3.";
        assert !lruCache.containsKey("key2") : "key2 should be evicted as least recently used.";
        
        // Test updating access order
        lruCache.get("key1"); // Access key1, making key3 the least recently used
        lruCache.put("key5", "value5");
        assert lruCache.containsKey("key1") : "key1 should still be in cache after access.";
        assert !lruCache.containsKey("key3") : "key3 should be evicted as least recently used.";
    }
} 