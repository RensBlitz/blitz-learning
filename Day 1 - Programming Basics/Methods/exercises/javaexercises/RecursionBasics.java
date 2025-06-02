package javaexercises;

/**
 * Methods8: Recursion Basics
 *
 * This exercise focuses on recursion - when a method calls itself to solve a problem.
 * Recursive methods are useful for problems that can be broken down into smaller,
 * similar subproblems.
 *
 * Learning objectives:
 * - Understand the concept of recursion
 * - Implement basic recursive methods
 * - Compare recursive and iterative solutions
 * - Recognize appropriate use cases for recursion
 *
 * Note: This exercise uses assertions. Run with assertions enabled.
 */
public class RecursionBasics {

    public static void main(String[] args) {
        System.out.println("Methods8: Recursion Basics");

        try {
            testFactorial();
            testFibonacci();
            testSumArray();
            testPalindrome();
            System.out.println("All tests passed! Your implementation is correct.");
        } catch (AssertionError e) {
            System.out.println("Test failed: " + e.getMessage());
        }
    }

    /**
     * This method should calculate the factorial of a number recursively.
     * The factorial of n (written as n!) is the product of all positive integers less than or equal to n.
     * For example: 5! = 5 × 4 × 3 × 2 × 1 = 120
     * 
     * TODO: Implement a recursive method that:
     * 1. Takes an integer parameter n
     * 2. Returns the factorial of n (n!)
     * 3. Base case: factorial of 0 is 1 (0! = 1)
     * 
     * @param n The number to calculate factorial for (must be non-negative)
     * @return The factorial of n
     * @throws IllegalArgumentException If n is negative
     */
    public static long factorialRecursive(int n) {
        // TODO: Implement your solution here
        return 0; // Replace with your implementation
    }

    /**
     * This method should calculate the factorial of a number iteratively (using a loop).
     * 
     * TODO: Implement an iterative method that:
     * 1. Takes an integer parameter n
     * 2. Returns the factorial of n (n!)
     * 3. Uses a loop instead of recursion
     * 
     * @param n The number to calculate factorial for (must be non-negative)
     * @return The factorial of n
     * @throws IllegalArgumentException If n is negative
     */
    public static long factorialIterative(int n) {
        // TODO: Implement your solution here
        return 0; // Replace with your implementation
    }

    /**
     * This method should calculate the nth Fibonacci number recursively.
     * The Fibonacci sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21, ...
     * where each number is the sum of the two preceding ones, starting from 0 and 1.
     * 
     * TODO: Implement a recursive method that:
     * 1. Takes an integer parameter n
     * 2. Returns the nth Fibonacci number (0-based index)
     * 3. Base cases: F(0) = 0, F(1) = 1
     * 
     * @param n The index in the Fibonacci sequence (must be non-negative)
     * @return The nth Fibonacci number
     * @throws IllegalArgumentException If n is negative
     */
    public static int fibonacciRecursive(int n) {
        // TODO: Implement your solution here
        return 0; // Replace with your implementation
    }

    /**
     * This method should calculate the nth Fibonacci number iteratively (using a loop).
     * 
     * TODO: Implement an iterative method that:
     * 1. Takes an integer parameter n
     * 2. Returns the nth Fibonacci number (0-based index)
     * 3. Uses a loop instead of recursion
     * 
     * @param n The index in the Fibonacci sequence (must be non-negative)
     * @return The nth Fibonacci number
     * @throws IllegalArgumentException If n is negative
     */
    public static int fibonacciIterative(int n) {
        // TODO: Implement your solution here
        return 0; // Replace with your implementation
    }

    /**
     * This method should calculate the sum of all elements in an array recursively.
     * 
     * TODO: Implement a recursive method that:
     * 1. Takes an array and an index to start from
     * 2. Returns the sum of all elements from index to the end of the array
     * 3. Base case: When index is past the end of the array, return 0
     * 
     * @param array The array of integers
     * @param index The starting index
     * @return The sum of elements from index to the end of the array
     */
    public static int sumArrayRecursive(int[] array, int index) {
        // TODO: Implement your solution here
        return 0; // Replace with your implementation
    }

    /**
     * This is a convenience method to calculate the sum of an entire array recursively.
     * It calls sumArrayRecursive starting from index 0.
     * 
     * @param array The array of integers
     * @return The sum of all elements in the array
     */
    public static int sumArrayRecursive(int[] array) {
        // DO NOT MODIFY THIS METHOD
        return sumArrayRecursive(array, 0);
    }

    /**
     * This method should calculate the sum of all elements in an array iteratively (using a loop).
     * 
     * TODO: Implement an iterative method that:
     * 1. Takes an array of integers
     * 2. Returns the sum of all elements in the array
     * 3. Uses a loop instead of recursion
     * 
     * @param array The array of integers
     * @return The sum of all elements in the array
     */
    public static int sumArrayIterative(int[] array) {
        // TODO: Implement your solution here
        return 0; // Replace with your implementation
    }

    /**
     * This method should check if a string is a palindrome recursively.
     * A palindrome is a string that reads the same backward as forward, ignoring case, spaces, and punctuation.
     * Examples: "racecar", "A man a plan a canal Panama"
     * 
     * TODO: Implement a recursive method that:
     * 1. Takes a string and two indices (start and end)
     * 2. Returns true if the string is a palindrome, false otherwise
     * 3. Base cases: 
     *    - Empty string or one-character string is a palindrome
     *    - If characters at start and end don't match, it's not a palindrome
     *    - If start >= end, we've checked all characters, it's a palindrome
     * 
     * Note: Ignore spaces, punctuation, and case differences
     * 
     * @param str The string to check
     * @param start The starting index
     * @param end The ending index
     * @return true if the string is a palindrome, false otherwise
     */
    public static boolean isPalindromeRecursive(String str, int start, int end) {
        // TODO: Implement your solution here
        return false; // Replace with your implementation
    }

    /**
     * This is a convenience method to check if a string is a palindrome recursively.
     * It calls isPalindromeRecursive starting from the first and last characters.
     * It also preprocesses the string to lowercase and removes non-alphanumeric characters.
     * 
     * @param str The string to check
     * @return true if the string is a palindrome, false otherwise
     */
    public static boolean isPalindromeRecursive(String str) {
        // DO NOT MODIFY THIS METHOD
        if (str == null) {
            return false;
        }
        
        // Remove non-alphanumeric characters and convert to lowercase
        String processed = str.toLowerCase().replaceAll("[^a-z0-9]", "");
        
        return isPalindromeRecursive(processed, 0, processed.length() - 1);
    }

    /**
     * This method should check if a string is a palindrome iteratively (using loops).
     * 
     * TODO: Implement an iterative method that:
     * 1. Takes a string
     * 2. Returns true if the string is a palindrome, false otherwise
     * 3. Uses a loop instead of recursion
     * 
     * Note: Ignore spaces, punctuation, and case differences
     * 
     * @param str The string to check
     * @return true if the string is a palindrome, false otherwise
     */
    public static boolean isPalindromeIterative(String str) {
        // TODO: Implement your solution here
        return false; // Replace with your implementation
    }

    // Test methods
    private static void testFactorial() {
        // Test recursive factorial
        assert factorialRecursive(0) == 1 : "0! should be 1";
        assert factorialRecursive(1) == 1 : "1! should be 1";
        assert factorialRecursive(5) == 120 : "5! should be 120";
        assert factorialRecursive(10) == 3628800 : "10! should be 3628800";
        
        try {
            factorialRecursive(-1);
            assert false : "factorialRecursive should throw an exception for negative numbers";
        } catch (IllegalArgumentException e) {
            // Expected exception
        }
        
        // Test iterative factorial
        assert factorialIterative(0) == 1 : "0! should be 1";
        assert factorialIterative(1) == 1 : "1! should be 1";
        assert factorialIterative(5) == 120 : "5! should be 120";
        assert factorialIterative(10) == 3628800 : "10! should be 3628800";
        
        try {
            factorialIterative(-1);
            assert false : "factorialIterative should throw an exception for negative numbers";
        } catch (IllegalArgumentException e) {
            // Expected exception
        }
        
        // Compare results of both implementations
        for (int i = 0; i <= 10; i++) {
            assert factorialRecursive(i) == factorialIterative(i) : 
                "Recursive and iterative factorial implementations should match for n = " + i;
        }
    }

    private static void testFibonacci() {
        // Test recursive Fibonacci
        assert fibonacciRecursive(0) == 0 : "F(0) should be 0";
        assert fibonacciRecursive(1) == 1 : "F(1) should be 1";
        assert fibonacciRecursive(2) == 1 : "F(2) should be 1";
        assert fibonacciRecursive(3) == 2 : "F(3) should be 2";
        assert fibonacciRecursive(7) == 13 : "F(7) should be 13";
        
        try {
            fibonacciRecursive(-1);
            assert false : "fibonacciRecursive should throw an exception for negative numbers";
        } catch (IllegalArgumentException e) {
            // Expected exception
        }
        
        // Test iterative Fibonacci
        assert fibonacciIterative(0) == 0 : "F(0) should be 0";
        assert fibonacciIterative(1) == 1 : "F(1) should be 1";
        assert fibonacciIterative(2) == 1 : "F(2) should be 1";
        assert fibonacciIterative(3) == 2 : "F(3) should be 2";
        assert fibonacciIterative(7) == 13 : "F(7) should be 13";
        
        try {
            fibonacciIterative(-1);
            assert false : "fibonacciIterative should throw an exception for negative numbers";
        } catch (IllegalArgumentException e) {
            // Expected exception
        }
        
        // Compare results of both implementations (limiting to smaller values due to recursion inefficiency)
        for (int i = 0; i <= 10; i++) {
            assert fibonacciRecursive(i) == fibonacciIterative(i) : 
                "Recursive and iterative Fibonacci implementations should match for n = " + i;
        }
    }

    private static void testSumArray() {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {-1, -2, -3};
        int[] array3 = {};
        
        // Test recursive sum
        assert sumArrayRecursive(array1) == 15 : "Sum of [1, 2, 3, 4, 5] should be 15";
        assert sumArrayRecursive(array2) == -6 : "Sum of [-1, -2, -3] should be -6";
        assert sumArrayRecursive(array3) == 0 : "Sum of [] should be 0";
        
        // Test iterative sum
        assert sumArrayIterative(array1) == 15 : "Sum of [1, 2, 3, 4, 5] should be 15";
        assert sumArrayIterative(array2) == -6 : "Sum of [-1, -2, -3] should be -6";
        assert sumArrayIterative(array3) == 0 : "Sum of [] should be 0";
        
        // Compare results of both implementations
        assert sumArrayRecursive(array1) == sumArrayIterative(array1);
        assert sumArrayRecursive(array2) == sumArrayIterative(array2);
        assert sumArrayRecursive(array3) == sumArrayIterative(array3);
    }

    private static void testPalindrome() {
        // Test recursive palindrome checker
        assert isPalindromeRecursive("racecar") : "\"racecar\" should be a palindrome";
        assert isPalindromeRecursive("A man a plan a canal Panama") : "\"A man a plan a canal Panama\" should be a palindrome";
        assert !isPalindromeRecursive("hello") : "\"hello\" should not be a palindrome";
        assert isPalindromeRecursive("") : "Empty string should be a palindrome";
        assert isPalindromeRecursive("a") : "Single character should be a palindrome";
        assert !isPalindromeRecursive(null) : "null should not be a palindrome";
        
        // Test iterative palindrome checker
        assert isPalindromeIterative("racecar") : "\"racecar\" should be a palindrome";
        assert isPalindromeIterative("A man a plan a canal Panama") : "\"A man a plan a canal Panama\" should be a palindrome";
        assert !isPalindromeIterative("hello") : "\"hello\" should not be a palindrome";
        assert isPalindromeIterative("") : "Empty string should be a palindrome";
        assert isPalindromeIterative("a") : "Single character should be a palindrome";
        assert !isPalindromeIterative(null) : "null should not be a palindrome";
        
        // Test more complex examples
        String[] testStrings = {
            "Madam, I'm Adam",
            "Never odd or even",
            "Was it a car or a cat I saw?",
            "No 'x' in Nixon",
            "This is not a palindrome"
        };
        
        for (String str : testStrings) {
            boolean recursive = isPalindromeRecursive(str);
            boolean iterative = isPalindromeIterative(str);
            assert recursive == iterative : 
                "Recursive and iterative palindrome implementations should match for: \"" + str + "\"";
        }
    }
} 