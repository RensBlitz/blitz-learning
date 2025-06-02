package javaexercises;

/**
 * Exercise 3: While Loops
 * 
 * This exercise focuses on using while loops and do-while loops to perform iterations based on conditions.
 * 
 * Learning objectives:
 * - Understand the difference between while and do-while loops
 * - Learn when to use while loops instead of for loops
 * - Practice using loop control variables effectively
 * 
 * Note: This exercise uses assertions. Run with the -ea flag:
 * java -ea WhileLoops
 */
public class WhileLoops {
    
    public static void main(String[] args) {
        System.out.println("Exercise 3: While Loops");
        
        try {
            // Test the digit counter
            testDigitCounter();
            
            // Test the prime number checker
            testPrimeChecker();
            
            // Test the binary converter
            testBinaryConverter();
            
            System.out.println("All tests passed! Your implementation is correct.");
        } catch (AssertionError e) {
            System.out.println("Test failed: " + e.getMessage());
        }
    }
    
    /**
     * Tests the digit counter implementation.
     */
    private static void testDigitCounter() {
        assert countDigits(0) == 1 : "Number 0 should have 1 digit";
        assert countDigits(5) == 1 : "Number 5 should have 1 digit";
        assert countDigits(10) == 2 : "Number 10 should have 2 digits";
        assert countDigits(123) == 3 : "Number 123 should have 3 digits";
        assert countDigits(9999) == 4 : "Number 9999 should have 4 digits";
        assert countDigits(-123) == 3 : "Number -123 should have 3 digits";
    }
    
    /**
     * Tests the prime number checker implementation.
     */
    private static void testPrimeChecker() {
        assert !isPrime(0) : "0 is not a prime number";
        assert !isPrime(1) : "1 is not a prime number";
        assert isPrime(2) : "2 is a prime number";
        assert isPrime(3) : "3 is a prime number";
        assert !isPrime(4) : "4 is not a prime number";
        assert isPrime(5) : "5 is a prime number";
        assert !isPrime(6) : "6 is not a prime number";
        assert isPrime(7) : "7 is a prime number";
        assert !isPrime(9) : "9 is not a prime number";
        assert isPrime(11) : "11 is a prime number";
        assert isPrime(13) : "13 is a prime number";
        assert !isPrime(15) : "15 is not a prime number";
        assert isPrime(17) : "17 is a prime number";
        assert isPrime(19) : "19 is a prime number";
        assert !isPrime(21) : "21 is not a prime number";
        assert isPrime(23) : "23 is a prime number";
    }
    
    /**
     * Tests the binary converter implementation.
     */
    private static void testBinaryConverter() {
        assert convertToBinary(0).equals("0") : "Binary representation of 0 should be '0'";
        assert convertToBinary(1).equals("1") : "Binary representation of 1 should be '1'";
        assert convertToBinary(2).equals("10") : "Binary representation of 2 should be '10'";
        assert convertToBinary(3).equals("11") : "Binary representation of 3 should be '11'";
        assert convertToBinary(4).equals("100") : "Binary representation of 4 should be '100'";
        assert convertToBinary(5).equals("101") : "Binary representation of 5 should be '101'";
        assert convertToBinary(10).equals("1010") : "Binary representation of 10 should be '1010'";
        assert convertToBinary(15).equals("1111") : "Binary representation of 15 should be '1111'";
        assert convertToBinary(20).equals("10100") : "Binary representation of 20 should be '10100'";
        assert convertToBinary(42).equals("101010") : "Binary representation of 42 should be '101010'";
    }
    
    /**
     * TODO: Implement a method that analyzes the structure of a number.
     * Consider how to break down a number into its components.
     *
     * Requirements:
     * - Input: positive integer
     * - Output: count of digits in the number
     * - Examples:
     *   - 123 must return 3
     *   - 5 must return 1
     *   - 0 must return 1
     *
     * @param number The number to analyze
     * @return The number of digits
     */
    public static int countDigits(int number) {
        // TODO: Implement your solution here
        return 0; // Replace with your implementation
    }
    
    /**
     * TODO: Implement a method that determines if a number has special mathematical properties.
     * Consider what makes a number unique in terms of its divisibility.
     *
     * Requirements:
     * - Input: positive integer
     * - Output: true if number is prime, false otherwise
     * - A number is prime if:
     *   - It is greater than 1
     *   - It has no divisors other than 1 and itself
     *
     * @param number The number to check
     * @return true if the number is prime, false otherwise
     */
    public static boolean isPrime(int number) {
        // TODO: Implement your solution here
        return false; // Replace with your implementation
    }
    
    /**
     * TODO: Implement a method that converts between different number representations.
     * Consider how numbers can be represented in different formats.
     *
     * Requirements:
     * - Input: positive decimal integer
     * - Output: binary representation as a string
     * - Examples:
     *   - 2 must return "10"
     *   - 7 must return "111"
     *   - 10 must return "1010"
     *
     * @param decimal The decimal number to convert
     * @return The binary representation as a string
     */
    public static String convertToBinary(int decimal) {
        // TODO: Implement your solution here
        return ""; // Replace with your implementation
    }
} 