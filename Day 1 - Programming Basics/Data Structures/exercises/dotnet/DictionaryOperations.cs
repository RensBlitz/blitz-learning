using System.Collections.Generic;

namespace DataStructures.Exercises;

/// <summary>
/// Exercise 4: Dictionaries and Key-Value Collections
///
/// This exercise focuses on working with dictionaries in C# using Dictionary&lt;K,V&gt;.
/// Dictionaries store key-value pairs and allow for efficient lookup by key.
///
/// Learning objectives:
/// - Create and initialize Dictionary collections
/// - Store and retrieve key-value pairs
/// - Update and remove entries
/// - Iterate through dictionary entries, keys, and values
/// - Understand when to use dictionaries over other data structures
///
/// Note: This exercise uses xUnit tests for validation.
/// Run 'dotnet test' to check your implementation.
/// </summary>
public class DictionaryOperations
{
    /// <summary>
    /// This method demonstrates the creation and initialization of dictionaries.
    /// TODO: Implement the following:
    /// 1. Create an empty Dictionary that maps String keys to Integer values
    /// 2. Create a Dictionary with the following key-value pairs:
    ///    - "one" -> 1
    ///    - "two" -> 2
    ///    - "three" -> 3
    /// </summary>
    /// <returns>An array containing [emptyDictionary, populatedDictionary]</returns>
    public static object[] CreateDictionaries()
    {
        // TODO: Implement your solution here
        
        // 1. Create an empty Dictionary
        Dictionary<string, int> emptyDictionary = null!; // Replace with your implementation
        
        // 2. Create a populated Dictionary
        Dictionary<string, int> populatedDictionary = null!; // Replace with your implementation
        
        return new object[] { emptyDictionary, populatedDictionary };
    }

    /// <summary>
    /// This method demonstrates common dictionary operations.
    /// TODO: Implement the following operations on the given dictionary:
    /// 1. Add a new entry: "four" -> 4
    /// 2. Check if the dictionary contains the key "two"
    /// 3. Get the value for the key "three"
    /// 4. Update the value for the key "two" to 22
    /// 5. Remove the entry with key "one"
    /// 6. Get all the keys as a collection
    /// 7. Get the count of the dictionary
    /// </summary>
    /// <param name="dictionary">A dictionary to perform operations on</param>
    /// <returns>An array containing [modifiedDictionary, containsKeyTwo, valueOfThree, keysCollection, count]</returns>
    public static object[] PerformDictionaryOperations(Dictionary<string, int> dictionary)
    {
        // TODO: Implement your solution here
        
        // 1. Add a new entry
        // Your code here
        
        // 2. Check if dictionary contains key
        bool containsKeyTwo = false; // Replace with your implementation
        
        // 3. Get value for key
        int valueOfThree = 0; // Replace with your implementation
        
        // 4. Update value for key
        // Your code here
        
        // 5. Remove entry
        // Your code here
        
        // 6. Get all keys
        ICollection<string> keysCollection = null!; // Replace with your implementation
        
        // 7. Get count
        int count = 0; // Replace with your implementation
        
        return new object[] { dictionary, containsKeyTwo, valueOfThree, keysCollection, count };
    }

    /// <summary>
    /// This method counts the frequency of each word in a string.
    /// TODO: Implement a method that:
    /// 1. Splits the input string into words (separated by spaces)
    /// 2. Counts how many times each word appears
    /// 3. Returns a dictionary where the keys are words and the values are their frequencies
    ///
    /// For example, for the input "apple banana apple orange banana apple"
    /// the output should be {"apple": 3, "banana": 2, "orange": 1}
    /// </summary>
    /// <param name="text">The input string to analyze</param>
    /// <returns>A dictionary of word frequencies</returns>
    public static Dictionary<string, int> CalculateWordFrequency(string text)
    {
        // TODO: Implement your solution here
        
        // 1. Split the input string into words
        
        // 2. Count the frequency of each word
        
        // 3. Return the frequency dictionary
        
        return null!; // Replace with your implementation
    }
} 