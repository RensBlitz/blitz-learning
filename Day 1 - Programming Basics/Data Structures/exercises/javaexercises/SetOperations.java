package javaexercises; /**
 * DataStructures5: Sets
 *
 * This exercise focuses on working with sets in Java using HashSet.
 * Sets are collections that contain no duplicate elements.
 *
 * Learning objectives:
 * - Create and initialize HashSet collections
 * - Add and remove elements from sets
 * - Check for element membership
 * - Perform set operations (union, intersection, difference)
 * - Understand when to use sets over other data structures
 *
 * Note: This exercise uses assertions. Run with assertions enabled.
 */
import java.util.Set;
import java.util.HashSet;

public class SetOperations {

    public static void main(String[] args) {
        System.out.println("DataStructures5: Sets");

        try {
            testSetCreation();
            testSetOperations();
            testSetMethods();
            System.out.println("All tests passed! Your implementation is correct.");
        } catch (AssertionError e) {
            System.out.println("Test failed: " + e.getMessage());
        }
    }

    /**
     * This method demonstrates the creation and initialization of sets.
     * TODO: Implement the following:
     * 1. Create an empty HashSet of Strings
     * 2. Create a HashSet containing the elements "apple", "banana", and "cherry"
     *
     * @return An array containing [emptySet, populatedSet]
     */
    public static Object[] createSets() {
        // TODO: Implement your solution here
        
        // 1. Create an empty set
        Set<String> emptySet = null; // Replace with your implementation
        
        // 2. Create a populated set
        Set<String> populatedSet = null; // Replace with your implementation
        
        return new Object[]{emptySet, populatedSet};
    }

    /**
     * This method demonstrates common set operations.
     * TODO: Implement the following operations on the given set:
     * 1. Add the elements "date" and "elderberry"
     * 2. Remove the element "banana"
     * 3. Check if the set contains "cherry"
     * 4. Get the size of the set
     *
     * @param set A set to perform operations on
     * @return An array containing [modifiedSet, containsCherry, size]
     */
    public static Object[] performSetOperations(Set<String> set) {
        // TODO: Implement your solution here
        
        // 1. Add elements
        // Your code here
        
        // 2. Remove element
        // Your code here
        
        // 3. Check if set contains element
        boolean containsCherry = false; // Replace with your implementation
        
        // 4. Get the size
        int size = 0; // Replace with your implementation
        
        return new Object[]{set, containsCherry, size};
    }

    /**
     * This method performs set operations: union, intersection, and difference.
     * 
     * TODO: Implement the following:
     * 1. Calculate the union of set1 and set2 (all elements in either set)
     * 2. Calculate the intersection of set1 and set2 (elements in both sets)
     * 3. Calculate the difference of set1 and set2 (elements in set1 but not in set2)
     *
     * @param set1 The first set
     * @param set2 The second set
     * @return An array containing [union, intersection, difference]
     */
    public static Object[] performSetMethods(Set<Integer> set1, Set<Integer> set2) {
        // TODO: Implement your solution here
        
        // 1. Calculate union
        Set<Integer> union = null; // Replace with your implementation
        
        // 2. Calculate intersection
        Set<Integer> intersection = null; // Replace with your implementation
        
        // 3. Calculate difference
        Set<Integer> difference = null; // Replace with your implementation
        
        return new Object[]{union, intersection, difference};
    }

    private static void testSetCreation() {
        Object[] sets = createSets();
        
        assert sets != null : "The returned array should not be null.";
        assert sets.length == 2 : "The array should contain 2 elements.";
        
        // Test empty set
        assert sets[0] instanceof Set : "First element should be a Set.";
        Set<?> emptySet = (Set<?>) sets[0];
        assert emptySet.isEmpty() : "First set should be empty.";
        
        // Test populated set
        assert sets[1] instanceof Set : "Second element should be a Set.";
        Set<?> populatedSet = (Set<?>) sets[1];
        assert populatedSet.size() == 3 : "Second set should have 3 elements.";
        assert populatedSet.contains("apple") : "Set should contain 'apple'.";
        assert populatedSet.contains("banana") : "Set should contain 'banana'.";
        assert populatedSet.contains("cherry") : "Set should contain 'cherry'.";
    }

    private static void testSetOperations() {
        Set<String> testSet = new HashSet<>();
        testSet.add("apple");
        testSet.add("banana");
        testSet.add("cherry");
        
        Object[] results = performSetOperations(testSet);
        
        assert results != null : "The returned array should not be null.";
        assert results.length == 3 : "The array should contain 3 elements.";
        
        // Test modified set
        assert results[0] instanceof Set : "First element should be a Set.";
        Set<?> modifiedSet = (Set<?>) results[0];
        assert modifiedSet.size() == 4 : "Set should have 4 elements after operations.";
        assert modifiedSet.contains("apple") : "Set should contain 'apple'.";
        assert !modifiedSet.contains("banana") : "Set should not contain 'banana'.";
        assert modifiedSet.contains("cherry") : "Set should contain 'cherry'.";
        assert modifiedSet.contains("date") : "Set should contain 'date'.";
        assert modifiedSet.contains("elderberry") : "Set should contain 'elderberry'.";
        
        // Test contains element
        assert results[1] instanceof Boolean : "Second element should be a Boolean.";
        assert (Boolean) results[1] : "Set should contain 'cherry'.";
        
        // Test size
        assert results[2] instanceof Integer : "Third element should be an Integer.";
        assert results[2].equals(4) : "Size should be 4.";
    }

    private static void testSetMethods() {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        
        Set<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(3);
        set2.add(4);
        
        Object[] results = performSetMethods(set1, set2);
        
        assert results != null : "The returned array should not be null.";
        assert results.length == 3 : "The array should contain 3 elements.";
        
        // Test union
        assert results[0] instanceof Set : "First element should be a Set.";
        Set<?> union = (Set<?>) results[0];
        assert union.size() == 4 : "Union should have 4 elements.";
        assert union.contains(1) : "Union should contain 1.";
        assert union.contains(2) : "Union should contain 2.";
        assert union.contains(3) : "Union should contain 3.";
        assert union.contains(4) : "Union should contain 4.";
        
        // Test intersection
        assert results[1] instanceof Set : "Second element should be a Set.";
        Set<?> intersection = (Set<?>) results[1];
        assert intersection.size() == 2 : "Intersection should have 2 elements.";
        assert intersection.contains(2) : "Intersection should contain 2.";
        assert intersection.contains(3) : "Intersection should contain 3.";
        
        // Test difference
        assert results[2] instanceof Set : "Third element should be a Set.";
        Set<?> difference = (Set<?>) results[2];
        assert difference.size() == 1 : "Difference should have 1 element.";
        assert difference.contains(1) : "Difference should contain 1.";
    }
} 