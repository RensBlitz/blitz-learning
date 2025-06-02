using System.Collections.Generic;

namespace DataStructures.Exercises;

/// <summary>
/// Exercise 5: Sets
///
/// This exercise focuses on working with sets in C# using HashSet&lt;T&gt;.
/// Sets are collections that contain no duplicate elements.
///
/// Learning objectives:
/// - Create and initialize HashSet collections
/// - Add and remove elements from sets
/// - Check for element membership
/// - Perform set operations (union, intersection, difference)
/// - Understand when to use sets over other data structures
///
/// Note: This exercise uses xUnit tests for validation.
/// Run 'dotnet test' to check your implementation.
/// </summary>
public class SetOperations
{
    /// <summary>
    /// This method demonstrates the creation and initialization of sets.
    /// TODO: Implement the following:
    /// 1. Create an empty HashSet of Strings
    /// 2. Create a HashSet containing the elements "apple", "banana", and "cherry"
    /// </summary>
    /// <returns>An array containing [emptySet, populatedSet]</returns>
    public static object[] CreateSets()
    {
        // TODO: Implement your solution here
        
        // 1. Create an empty set
        HashSet<string> emptySet = null!; // Replace with your implementation
        
        // 2. Create a populated set
        HashSet<string> populatedSet = null!; // Replace with your implementation
        
        return new object[] { emptySet, populatedSet };
    }

    /// <summary>
    /// This method demonstrates common set operations.
    /// TODO: Implement the following operations on the given set:
    /// 1. Add the elements "date" and "elderberry"
    /// 2. Remove the element "banana"
    /// 3. Check if the set contains "cherry"
    /// 4. Get the count of the set
    /// </summary>
    /// <param name="set">A set to perform operations on</param>
    /// <returns>An array containing [modifiedSet, containsCherry, count]</returns>
    public static object[] PerformSetOperations(HashSet<string> set)
    {
        // TODO: Implement your solution here
        
        // 1. Add elements
        // Your code here
        
        // 2. Remove element
        // Your code here
        
        // 3. Check if set contains element
        bool containsCherry = false; // Replace with your implementation
        
        // 4. Get the count
        int count = 0; // Replace with your implementation
        
        return new object[] { set, containsCherry, count };
    }

    /// <summary>
    /// This method performs set operations: union, intersection, and difference.
    /// 
    /// TODO: Implement the following:
    /// 1. Calculate the union of set1 and set2 (all elements in either set)
    /// 2. Calculate the intersection of set1 and set2 (elements in both sets)
    /// 3. Calculate the difference of set1 and set2 (elements in set1 but not in set2)
    /// </summary>
    /// <param name="set1">The first set</param>
    /// <param name="set2">The second set</param>
    /// <returns>An array containing [union, intersection, difference]</returns>
    public static object[] PerformSetMethods(HashSet<int> set1, HashSet<int> set2)
    {
        // TODO: Implement your solution here
        
        // 1. Calculate union
        HashSet<int> union = null!; // Replace with your implementation
        
        // 2. Calculate intersection
        HashSet<int> intersection = null!; // Replace with your implementation
        
        // 3. Calculate difference
        HashSet<int> difference = null!; // Replace with your implementation
        
        return new object[] { union, intersection, difference };
    }
} 