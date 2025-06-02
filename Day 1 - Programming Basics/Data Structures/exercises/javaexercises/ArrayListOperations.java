package javaexercises; /**
 * DataStructures2: Lists and ArrayLists
 *
 * This exercise focuses on working with dynamic lists in Java using ArrayList.
 * Unlike arrays, ArrayLists can grow or shrink in size dynamically.
 *
 * Learning objectives:
 * - Create and initialize ArrayList collections
 * - Add, update, and remove elements from a list
 * - Search for elements in a list
 * - Understand the advantages of ArrayList over arrays
 *
 * Note: This exercise uses assertions. Run with assertions enabled.
 */
import java.util.ArrayList;
import java.util.List;

public class ArrayListOperations {

    public static void main(String[] args) {
        System.out.println("DataStructures2: Lists and ArrayLists");

        try {
            testListCreation();
            testListOperations();
            System.out.println("All tests passed! Your implementation is correct.");
        } catch (AssertionError e) {
            System.out.println("Test failed: " + e.getMessage());
        }
    }

    /**
     * This method demonstrates the creation and initialization of lists.
     * TODO: Implement the following:
     * 1. Create an empty ArrayList of Integers
     * 2. Create an ArrayList of Strings initialized with ["red", "green", "blue"]
     * 3. Convert the array {1, 2, 3, 4, 5} to an ArrayList of Integers
     *
     * @return An array containing [integerList, stringList, convertedList]
     */
    public static Object[] createLists() {
        // TODO: Implement your solution here
        
        // 1. Create an empty ArrayList of Integers
        List<Integer> integerList = null; // Replace with your implementation
        
        // 2. Create an ArrayList of Strings initialized with values
        List<String> stringList = null; // Replace with your implementation
        
        // 3. Convert the array to an ArrayList
        int[] array = {1, 2, 3, 4, 5};
        List<Integer> convertedList = null; // Replace with your implementation
        
        return new Object[]{integerList, stringList, convertedList};
    }

    /**
     * This method demonstrates common list operations.
     * TODO: Implement the following operations on the given list:
     * 1. Add the elements 10, 20, and 30 to the list
     * 2. Update the element at index 1 to be 25
     * 3. Remove the element with value 10
     * 4. Sort the list in ascending order
     * 5. Check if the list contains the value 25
     * 6. Get the size of the list
     *
     * @param list An empty ArrayList to perform operations on
     * @return An array containing [modifiedList, contains25, size]
     *         where modifiedList is the list after all operations,
     *         contains25 is a Boolean indicating if 25 is in the list,
     *         and size is an Integer with the size of the list
     */
    public static Object[] performListOperations(List<Integer> list) {
        // TODO: Implement your solution here
        
        // 1. Add elements to the list
        // Your code here
        
        // 2. Update element at index 1
        // Your code here
        
        // 3. Remove element with value 10
        // Your code here
        
        // 4. Sort the list
        // Your code here
        
        // 5. Check if list contains 25
        boolean contains25 = false; // Replace with your implementation
        
        // 6. Get the size
        int size = 0; // Replace with your implementation
        
        return new Object[]{list, contains25, size};
    }

    private static void testListCreation() {
        Object[] lists = createLists();
        
        assert lists != null : "The returned array should not be null.";
        assert lists.length == 3 : "The array should contain 3 elements.";
        
        // Test integer list
        assert lists[0] instanceof List : "First element should be a List.";
        List<?> integerList = (List<?>) lists[0];
        assert integerList.isEmpty() : "Integer list should be empty.";
        
        // Test string list
        assert lists[1] instanceof List : "Second element should be a List.";
        List<?> stringList = (List<?>) lists[1];
        assert stringList.size() == 3 : "String list should have 3 elements.";
        assert "red".equals(stringList.get(0)) : "First element should be 'red'.";
        assert "green".equals(stringList.get(1)) : "Second element should be 'green'.";
        assert "blue".equals(stringList.get(2)) : "Third element should be 'blue'.";
        
        // Test converted list
        assert lists[2] instanceof List : "Third element should be a List.";
        List<?> convertedList = (List<?>) lists[2];
        assert convertedList.size() == 5 : "Converted list should have 5 elements.";
        for (int i = 0; i < 5; i++) {
            assert (Integer) convertedList.get(i) == i + 1 : 
                "Element at index " + i + " should be " + (i + 1) + ".";
        }
    }

    private static void testListOperations() {
        List<Integer> testList = new ArrayList<>();
        Object[] results = performListOperations(testList);
        
        assert results != null : "The returned array should not be null.";
        assert results.length == 3 : "The array should contain 3 elements.";
        
        // Test modified list
        assert results[0] instanceof List : "First element should be a List.";
        List<?> modifiedList = (List<?>) results[0];
        assert modifiedList.size() == 2 : "List should have 2 elements after operations.";
        assert modifiedList.get(0).equals(25) : "First element should be 25.";
        assert modifiedList.get(1).equals(30) : "Second element should be 30.";
        
        // Test contains25
        assert results[1] instanceof Boolean : "Second element should be a Boolean.";
        assert (Boolean) results[1] : "List should contain 25.";
        
        // Test size
        assert results[2] instanceof Integer : "Third element should be an Integer.";
        assert (Integer) results[2] == 2 : "Size should be 2.";
    }
} 