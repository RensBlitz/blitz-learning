package javaexercises; /**
 * DataStructures3: Stacks and Queues
 *
 * This exercise focuses on working with stack (LIFO - Last In, First Out) and
 * queue (FIFO - First In, First Out) data structures in Java.
 *
 * Learning objectives:
 * - Understand the Stack (LIFO) and Queue (FIFO) concepts
 * - Implement push/pop operations for a Stack
 * - Implement enqueue/dequeue operations for a Queue
 * - Apply stacks and queues to solve problems
 *
 * Note: This exercise uses assertions. Run with assertions enabled.
 */
import java.util.Stack;
import java.util.Queue;

public class StackAndQueue {

    public static void main(String[] args) {
        System.out.println("DataStructures3: Stacks and Queues");

        try {
            testStack();
            testQueue();
            testReverseWithStack();
            testIsPalindrome();
            System.out.println("All tests passed! Your implementation is correct.");
        } catch (AssertionError e) {
            System.out.println("Test failed: " + e.getMessage());
        }
    }

    /**
     * This method demonstrates stack operations.
     * TODO: Implement the following:
     * 1. Create a new Stack of Integers
     * 2. Push the elements 10, 20, and 30 onto the stack
     * 3. Peek at the top element (without removing it)
     * 4. Pop the top element
     * 5. Check if the stack is empty
     * 6. Get the size of the stack
     *
     * @return Array of [stack, peekedElement, poppedElement, isEmpty, size]
     */
    public static Object[] workWithStack() {
        // TODO: Implement your solution here
        
        // 1. Create a stack
        Stack<Integer> stack = null; // Replace with your implementation
        
        // 2. Push elements
        // Your code here
        
        // 3. Peek at top element
        Integer peekedElement = null; // Replace with your implementation
        
        // 4. Pop top element
        Integer poppedElement = null; // Replace with your implementation
        
        // 5. Check if empty
        boolean isEmpty = true; // Replace with your implementation
        
        // 6. Get size
        int size = 0; // Replace with your implementation
        
        return new Object[]{stack, peekedElement, poppedElement, isEmpty, size};
    }

    /**
     * This method demonstrates queue operations.
     * TODO: Implement the following:
     * 1. Create a new Queue of Strings using a LinkedList
     * 2. Enqueue (add) the elements "first", "second", and "third"
     * 3. Peek at the front element (without removing it)
     * 4. Dequeue (remove) the front element
     * 5. Check if the queue is empty
     * 6. Get the size of the queue
     *
     * @return Array of [queue, peekedElement, dequeuedElement, isEmpty, size]
     */
    public static Object[] workWithQueue() {
        // TODO: Implement your solution here
        
        // 1. Create a queue
        Queue<String> queue = null; // Replace with your implementation
        
        // 2. Enqueue elements
        // Your code here
        
        // 3. Peek at front element
        String peekedElement = null; // Replace with your implementation
        
        // 4. Dequeue front element
        String dequeuedElement = null; // Replace with your implementation
        
        // 5. Check if empty
        boolean isEmpty = true; // Replace with your implementation
        
        // 6. Get size
        int size = 0; // Replace with your implementation
        
        return new Object[]{queue, peekedElement, dequeuedElement, isEmpty, size};
    }

    /**
     * This method uses a stack to reverse a string.
     * TODO: Implement a method that uses a Stack to reverse a string.
     * For example, "hello" should become "olleh"
     *
     * @param input The string to reverse
     * @return The reversed string
     */
    public static String reverseWithStack(String input) {
        // TODO: Implement your solution here
        
        // Use a stack to reverse the string
        
        return ""; // Replace with your implementation
    }

    /**
     * This method checks if a string is a palindrome using a stack and a queue.
     * A palindrome reads the same forward and backward (ignoring spaces and case).
     * 
     * TODO: Implement a method that:
     * 1. Uses both a Stack and a Queue to check if the input is a palindrome
     * 2. Ignores spaces and is case-insensitive
     * 
     * For example, "racecar" is a palindrome, as is "A man a plan a canal Panama"
     *
     * @param input The string to check
     * @return true if the input is a palindrome, false otherwise
     */
    public static boolean isPalindrome(String input) {
        // TODO: Implement your solution here
        
        // 1. Remove spaces and convert to lowercase
        
        // 2. Use a stack and queue to check if it's a palindrome
        
        return false; // Replace with your implementation
    }

    private static void testStack() {
        Object[] results = workWithStack();
        
        assert results != null : "The returned array should not be null.";
        assert results.length == 5 : "The array should contain 5 elements.";
        
        // Test stack
        assert results[0] instanceof Stack : "First element should be a Stack.";
        Stack<?> stack = (Stack<?>) results[0];
        assert stack.size() == 2 : "Stack should have 2 elements.";
        assert stack.contains(10) : "Stack should contain 10.";
        assert stack.contains(20) : "Stack should contain 20.";
        
        // Test peeked element
        assert results[1] instanceof Integer : "Second element should be an Integer.";
        assert (Integer) results[1] == 30 : "Peeked element should be 30.";
        
        // Test popped element
        assert results[2] instanceof Integer : "Third element should be an Integer.";
        assert (Integer) results[2] == 30 : "Popped element should be 30.";
        
        // Test isEmpty
        assert results[3] instanceof Boolean : "Fourth element should be a Boolean.";
        assert !(Boolean) results[3] : "Stack should not be empty.";
        
        // Test size
        assert results[4] instanceof Integer : "Fifth element should be an Integer.";
        assert (Integer) results[4] == 2 : "Size should be 2.";
    }

    private static void testQueue() {
        Object[] results = workWithQueue();
        
        assert results != null : "The returned array should not be null.";
        assert results.length == 5 : "The array should contain 5 elements.";
        
        // Test queue
        assert results[0] instanceof Queue : "First element should be a Queue.";
        Queue<?> queue = (Queue<?>) results[0];
        assert queue.size() == 2 : "Queue should have 2 elements.";
        
        // Test peeked element
        assert results[1] instanceof String : "Second element should be a String.";
        assert "first".equals(results[1]) : "Peeked element should be 'first'.";
        
        // Test dequeued element
        assert results[2] instanceof String : "Third element should be a String.";
        assert "first".equals(results[2]) : "Dequeued element should be 'first'.";
        
        // Test isEmpty
        assert results[3] instanceof Boolean : "Fourth element should be a Boolean.";
        assert !(Boolean) results[3] : "Queue should not be empty.";
        
        // Test size
        assert results[4] instanceof Integer : "Fifth element should be an Integer.";
        assert (Integer) results[4] == 2 : "Size should be 2.";
    }

    private static void testReverseWithStack() {
        String result = reverseWithStack("hello");
        assert "olleh".equals(result) : "Reversed 'hello' should be 'olleh'. Got: " + result;
        
        result = reverseWithStack("Java");
        assert "avaJ".equals(result) : "Reversed 'Java' should be 'avaJ'. Got: " + result;
    }

    private static void testIsPalindrome() {
        boolean result = isPalindrome("racecar");
        assert result : "'racecar' should be a palindrome.";
        
        result = isPalindrome("hello");
        assert !result : "'hello' should not be a palindrome.";
        
        result = isPalindrome("A man a plan a canal Panama");
        assert result : "'A man a plan a canal Panama' should be a palindrome.";
    }
} 