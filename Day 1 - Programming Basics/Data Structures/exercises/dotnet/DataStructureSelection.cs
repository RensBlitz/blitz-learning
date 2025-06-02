using System.Collections.Generic;

namespace DataStructures.Exercises;

/// <summary>
/// Exercise 8: Choosing the Right Data Structure
///
/// This exercise focuses on selecting appropriate data structures for
/// different scenarios based on their characteristics and performance.
///
/// Learning objectives:
/// - Understand the strengths and weaknesses of different data structures
/// - Evaluate which data structure is best suited for specific tasks
/// - Implement solutions using the most appropriate data structure
/// - Analyze performance considerations in data structure selection
/// - Measure and compare time complexity for different operations
///
/// Note: This exercise uses xUnit tests for validation.
/// Run 'dotnet test' to check your implementation.
/// </summary>
public class DataStructureSelection
{
    /// <summary>
    /// Scenario 1: You need to track a collection of unique items where 
    /// fast lookup is important but order does not matter.
    /// 
    /// TODO: Implement a method that:
    /// 1. Takes a list of potentially duplicate elements
    /// 2. Returns a collection of unique elements from the list
    /// 3. Provides O(1) lookup time to check if an element exists
    /// 
    /// Hint: Consider which data structure best handles unique elements with fast lookup.
    /// </summary>
    /// <param name="input">A list of potentially duplicate strings</param>
    /// <returns>A collection containing only the unique elements</returns>
    public static ICollection<string> CreateUniqueCollection(List<string> input)
    {
        // TODO: Implement your solution here
        
        // Choose and implement the appropriate data structure
        
        return null!; // Replace with your implementation
    }

    /// <summary>
    /// Scenario 2: You need to count how many times each item appears in a collection.
    /// 
    /// TODO: Implement a method that:
    /// 1. Counts the frequency of each element in the input list
    /// 2. Returns a data structure that allows quick lookup of counts by element
    /// 
    /// Hint: You need to associate each element with its count.
    /// </summary>
    /// <param name="input">A list of elements</param>
    /// <returns>A data structure mapping elements to their frequency counts</returns>
    public static Dictionary<string, int> CountFrequencies(List<string> input)
    {
        // TODO: Implement your solution here
        
        // Choose and implement the appropriate data structure
        
        return null!; // Replace with your implementation
    }

    /// <summary>
    /// Scenario 3: You need to implement a phone book with fast lookup by name.
    /// 
    /// TODO: Implement a method that:
    /// 1. Creates an appropriate data structure to store name-phone pairs
    /// 2. Allows fast lookup of phone numbers by name
    /// 3. Updates a phone number if the name already exists
    /// 
    /// Hint: Consider which data structure provides fast key-based lookups.
    /// </summary>
    /// <param name="names">A list of contact names</param>
    /// <param name="phoneNumbers">A parallel list of phone numbers</param>
    /// <returns>A data structure optimized for phone number lookups by name</returns>
    public static object CreatePhoneBook(List<string> names, List<string> phoneNumbers)
    {
        // TODO: Implement your solution here
        
        // Choose and implement the appropriate data structure
        
        return null!; // Replace with your implementation
    }

    /// <summary>
    /// Scenario 4: You need a collection that maintains insertion order and allows 
    /// fast access to both the first and last elements.
    /// 
    /// TODO: Implement a method that:
    /// 1. Creates an appropriate ordered collection from the input
    /// 2. Efficiently supports adding elements to the end
    /// 3. Efficiently supports removing elements from both the beginning and end
    /// 
    /// Hint: Consider which structure best maintains order with efficient operations at both ends.
    /// </summary>
    /// <param name="input">A list of elements to initialize the collection</param>
    /// <returns>An ordered collection optimized for operations at both ends</returns>
    public static object CreateOrderedCollection(List<string> input)
    {
        // TODO: Implement your solution here
        
        // Choose and implement the appropriate data structure
        
        return null!; // Replace with your implementation
    }

    /// <summary>
    /// Scenario 5: You need to implement a custom data structure for a specific use case.
    /// 
    /// In this case, implement a simple LRU (Least Recently Used) cache with a fixed size.
    /// When the cache reaches its capacity, the least recently accessed item should be removed.
    /// 
    /// TODO: Implement a LRU cache with the following operations:
    /// 1. put(key, value) - Add or update a key-value pair in the cache
    /// 2. get(key) - Get the value for a key (and mark it as recently used)
    /// 3. Count - Get the current number of items in the cache
    /// 
    /// Hint: You might need to combine multiple data structures or use a specialized collection.
    /// </summary>
    /// <param name="capacity">The maximum number of items the cache can hold</param>
    /// <returns>A Dictionary-like structure implementing an LRU cache</returns>
    public static IDictionary<string, string> CreateLRUCache(int capacity)
    {
        // This exercise is more advanced - you might need to use a custom implementation
        // or look into specialized collections
        
        // TODO: Implement your solution here
        
        return null!; // Replace with your implementation
    }
} 