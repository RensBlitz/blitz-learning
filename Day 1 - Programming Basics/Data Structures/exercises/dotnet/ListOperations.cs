using System.Collections.Generic;

namespace DataStructures.Exercises;

/// <summary>
/// Exercise 2: Lists and Collections
///
/// This exercise focuses on working with dynamic lists in C# using List&lt;T&gt;.
/// Unlike arrays, Lists can grow or shrink in size dynamically.
///
/// Learning objectives:
/// - Create and initialize List collections
/// - Add, update, and remove elements from a list
/// - Search for elements in a list
/// - Understand the advantages of List over arrays
///
/// Note: This exercise uses xUnit tests for validation.
/// Run 'dotnet test' to check your implementation.
/// </summary>
public class ListOperations
{
    /// <summary>
    /// This method demonstrates the creation and initialization of lists.
    /// TODO: Implement the following:
    /// 1. Create an empty List of Integers
    /// 2. Create a List of Strings initialized with ["red", "green", "blue"]
    /// 3. Convert the array {1, 2, 3, 4, 5} to a List of Integers
    /// </summary>
    /// <returns>An array containing [integerList, stringList, convertedList]</returns>
    public static object[] CreateLists()
    {
        // TODO: Implement your solution here
        
        // 1. Create an empty List of Integers
        List<int> integerList = null!; // Replace with your implementation
        
        // 2. Create a List of Strings initialized with values
        List<string> stringList = null!; // Replace with your implementation
        
        // 3. Convert the array to a List
        int[] array = { 1, 2, 3, 4, 5 };
        List<int> convertedList = null!; // Replace with your implementation
        
        return new object[] { integerList, stringList, convertedList };
    }

    /// <summary>
    /// This method demonstrates common list operations.
    /// TODO: Implement the following operations on the given list:
    /// 1. Add the elements 10, 20, and 30 to the list
    /// 2. Update the element at index 1 to be 25
    /// 3. Remove the element with value 10
    /// 4. Sort the list in ascending order
    /// 5. Check if the list contains the value 25
    /// 6. Get the size of the list
    /// </summary>
    /// <param name="list">An empty List to perform operations on</param>
    /// <returns>An array containing [modifiedList, contains25, size]
    ///         where modifiedList is the list after all operations,
    ///         contains25 is a Boolean indicating if 25 is in the list,
    ///         and size is an Integer with the size of the list</returns>
    public static object[] PerformListOperations(List<int> list)
    {
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
        bool contains25 = false; // Replace with your implementation
        
        // 6. Get the size
        int size = 0; // Replace with your implementation
        
        return new object[] { list, contains25, size };
    }
} 