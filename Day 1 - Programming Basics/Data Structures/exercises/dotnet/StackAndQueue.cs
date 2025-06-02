using System.Collections.Generic;

namespace DataStructures.Exercises;

/// <summary>
/// Exercise 3: Stacks and Queues
///
/// This exercise focuses on working with stack (LIFO - Last In, First Out) and
/// queue (FIFO - First In, First Out) data structures in C#.
///
/// Learning objectives:
/// - Understand the Stack (LIFO) and Queue (FIFO) concepts
/// - Implement push/pop operations for a Stack
/// - Implement enqueue/dequeue operations for a Queue
/// - Apply stacks and queues to solve problems
///
/// Note: This exercise uses xUnit tests for validation.
/// Run 'dotnet test' to check your implementation.
/// </summary>
public class StackAndQueue
{
    /// <summary>
    /// This method demonstrates stack operations.
    /// TODO: Implement the following:
    /// 1. Create a new Stack of Integers
    /// 2. Push the elements 10, 20, and 30 onto the stack
    /// 3. Peek at the top element (without removing it)
    /// 4. Pop the top element
    /// 5. Check if the stack is empty
    /// 6. Get the count of the stack
    /// </summary>
    /// <returns>Array of [stack, peekedElement, poppedElement, isEmpty, count]</returns>
    public static object[] WorkWithStack()
    {
        // TODO: Implement your solution here
        
        // 1. Create a stack
        Stack<int> stack = null!; // Replace with your implementation
        
        // 2. Push elements
        // Your code here
        
        // 3. Peek at top element
        int peekedElement = 0; // Replace with your implementation
        
        // 4. Pop top element
        int poppedElement = 0; // Replace with your implementation
        
        // 5. Check if empty
        bool isEmpty = true; // Replace with your implementation
        
        // 6. Get count
        int count = 0; // Replace with your implementation
        
        return new object[] { stack, peekedElement, poppedElement, isEmpty, count };
    }

    /// <summary>
    /// This method demonstrates queue operations.
    /// TODO: Implement the following:
    /// 1. Create a new Queue of Strings
    /// 2. Enqueue the elements "first", "second", and "third"
    /// 3. Peek at the front element (without removing it)
    /// 4. Dequeue the front element
    /// 5. Check if the queue is empty
    /// 6. Get the count of the queue
    /// </summary>
    /// <returns>Array of [queue, peekedElement, dequeuedElement, isEmpty, count]</returns>
    public static object[] WorkWithQueue()
    {
        // TODO: Implement your solution here
        
        // 1. Create a queue
        Queue<string> queue = null!; // Replace with your implementation
        
        // 2. Enqueue elements
        // Your code here
        
        // 3. Peek at front element
        string peekedElement = null!; // Replace with your implementation
        
        // 4. Dequeue front element
        string dequeuedElement = null!; // Replace with your implementation
        
        // 5. Check if empty
        bool isEmpty = true; // Replace with your implementation
        
        // 6. Get count
        int count = 0; // Replace with your implementation
        
        return new object[] { queue, peekedElement, dequeuedElement, isEmpty, count };
    }

    /// <summary>
    /// This method uses a stack to reverse a string.
    /// TODO: Implement a method that uses a Stack to reverse a string.
    /// For example, "hello" should become "olleh"
    /// </summary>
    /// <param name="input">The string to reverse</param>
    /// <returns>The reversed string</returns>
    public static string ReverseWithStack(string input)
    {
        // TODO: Implement your solution here
        
        // Use a stack to reverse the string
        
        return string.Empty; // Replace with your implementation
    }

    /// <summary>
    /// This method checks if a string is a palindrome using a stack and a queue.
    /// A palindrome reads the same forward and backward (ignoring spaces and case).
    /// 
    /// TODO: Implement a method that:
    /// 1. Uses both a Stack and a Queue to check if the input is a palindrome
    /// 2. Ignores spaces and is case-insensitive
    /// 
    /// For example, "racecar" is a palindrome, as is "A man a plan a canal Panama"
    /// </summary>
    /// <param name="input">The string to check</param>
    /// <returns>true if the input is a palindrome, false otherwise</returns>
    public static bool IsPalindrome(string input)
    {
        // TODO: Implement your solution here
        
        // 1. Remove spaces and convert to lowercase
        
        // 2. Use a stack and queue to check if it's a palindrome
        
        return false; // Replace with your implementation
    }
} 