/**
 * Exercise 6: Break and Continue Statements
 * 
 * This exercise focuses on using break and continue statements to control loop flow.
 * 
 * Learning objectives:
 * - Understand how to use break to exit a loop prematurely
 * - Learn how to use continue to skip the current iteration
 * - Practice using these statements in different scenarios
 * 
 * Note: This exercise uses assertions. Run with the -ea flag:
 * java -ea BreakAndContinue
 */
public class BreakAndContinue {
    
    public static void main(String[] args) {
        System.out.println("Exercise 6: Break and Continue Statements");
        
        try {
            // Test the first non-negative finder
            testFindFirstNonNegative();
            
            // Test the even numbers only counter
            testCountEvenNumbersOnly();
            
            // Test the prime finder with limit
            testFindPrimeWithLimit();
            
            System.out.println("All tests passed! Your implementation is correct.");
        } catch (AssertionError e) {
            System.out.println("Test failed: " + e.getMessage());
        }
    }
    
    /**
     * Tests the first non-negative finder implementation.
     */
    private static void testFindFirstNonNegative() {
        // Test with array containing non-negative numbers
        int[] array1 = {-5, -3, -1, 0, 2, 4};
        assert findFirstNonNegative(array1) == 0 : "First non-negative in [-5, -3, -1, 0, 2, 4] should be 0";
        
        // Test with array starting with non-negative number
        int[] array2 = {0, -1, -2, -3};
        assert findFirstNonNegative(array2) == 0 : "First non-negative in [0, -1, -2, -3] should be 0";
        
        // Test with array containing only negative numbers
        int[] array3 = {-5, -4, -3, -2, -1};
        assert findFirstNonNegative(array3) == -1 : "First non-negative in [-5, -4, -3, -2, -1] should be -1 (not found)";
        
        // Test with empty array
        int[] array4 = {};
        assert findFirstNonNegative(array4) == -1 : "First non-negative in [] should be -1 (not found)";
        
        // Test with array containing only positive numbers
        int[] array5 = {1, 2, 3, 4, 5};
        assert findFirstNonNegative(array5) == 1 : "First non-negative in [1, 2, 3, 4, 5] should be 1";
    }
    
    /**
     * Tests the even numbers only counter implementation.
     */
    private static void testCountEvenNumbersOnly() {
        // Test with array containing mix of even and odd numbers
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assert countEvenNumbersOnly(array1) == 5 : "Count of even numbers in [1-10] should be 5";
        
        // Test with array containing only even numbers
        int[] array2 = {2, 4, 6, 8, 10};
        assert countEvenNumbersOnly(array2) == 5 : "Count of even numbers in [2,4,6,8,10] should be 5";
        
        // Test with array containing only odd numbers
        int[] array3 = {1, 3, 5, 7, 9};
        assert countEvenNumbersOnly(array3) == 0 : "Count of even numbers in [1,3,5,7,9] should be 0";
        
        // Test with empty array
        int[] array4 = {};
        assert countEvenNumbersOnly(array4) == 0 : "Count of even numbers in [] should be 0";
        
        // Test with array containing negative numbers
        int[] array5 = {-2, -1, 0, 1, 2};
        assert countEvenNumbersOnly(array5) == 3 : "Count of even numbers in [-2,-1,0,1,2] should be 3";
    }
    
    /**
     * Tests the prime finder with limit implementation.
     */
    private static void testFindPrimeWithLimit() {
        // Find a prime number between 10 and 20
        assert findPrimeWithLimit(10, 20) == 11 : "First prime between 10 and 20 should be 11";
        
        // Find a prime number between 20 and 30
        assert findPrimeWithLimit(20, 30) == 23 : "First prime between 20 and 30 should be 23";
        
        // Find a prime number starting from a prime
        assert findPrimeWithLimit(11, 20) == 11 : "First prime between 11 and 20 should be 11";
        
        // Find a prime number with a small range
        assert findPrimeWithLimit(23, 29) == 23 : "First prime between 23 and 29 should be 23";
        
        // No primes in the range
        assert findPrimeWithLimit(24, 28) == -1 : "No primes between 24 and 28, should return -1";
        
        // Invalid range
        assert findPrimeWithLimit(30, 20) == -1 : "Invalid range 30 to 20, should return -1";
    }
    
    /**
     * TODO: Implement a method that searches through data to find a value meeting certain criteria.
     * Consider how to optimize the search and handle exceptions.
     *
     * Requirements:
     * - Input: array of integers (may contain positive, negative, or zero values)
     * - Output: first non-negative number found in the array
     * - If no non-negative number exists, return -1
     *
     * @param array The array to search
     * @return The first non-negative number or -1 if none exists
     */
    public static int findFirstNonNegative(int[] array) {
        // TODO: Implement your solution here
        return 0;
    }
    
    /**
     * TODO: Implement a method that analyzes data based on numerical properties.
     * Consider what patterns to look for and how to track occurrences.
     *
     * Requirements:
     * - Input: array of integers
     * - Output: count of even numbers in the array
     * - An even number is exactly divisible by 2
     *
     * @param array The array to analyze
     * @return The count of even numbers
     */
    public static int countMatchingElements(int[] array) {
        // TODO: Implement your solution here
        return 0;
    }
    
    /**
     * TODO: Implement a method that searches for values with special mathematical properties.
     * Consider what makes a number special and how to efficiently find it.
     *
     * Requirements:
     * - Input: start and end integers defining a range (inclusive)
     * - Output: first prime number in the range
     * - If no prime number exists in the range, return -1
     * - A prime number is greater than 1 and has no divisors other than 1 and itself
     *
     * @param start The start of the range (inclusive)
     * @param end The end of the range (inclusive)
     * @return The first prime number in the range, or -1 if none exists
     */
    public static int findSpecialNumber(int start, int end) {
        // TODO: Implement your solution here
        return 0;
    }
    
    /**
     * Helper method to check if a number is prime.
     * A prime number is a natural number greater than 1 that is not divisible by any smaller number except 1.
     */
    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        
        if (number <= 3) {
            return true;
        }
        
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        
        return true;
    }
} 