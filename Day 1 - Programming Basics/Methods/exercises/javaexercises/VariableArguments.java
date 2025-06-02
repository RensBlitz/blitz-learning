package javaexercises;

/**
 * Methods7: Variable Arguments (Varargs)
 *
 * This exercise focuses on using variable arguments (varargs) in Java methods.
 * Varargs allow methods to accept a variable number of arguments of the same type.
 *
 * Learning objectives:
 * - Understand how varargs work in Java
 * - Create methods with variable arguments
 * - Use varargs with different data types
 * - Learn about varargs limitations and best practices
 *
 * Note: This exercise uses assertions. Run with assertions enabled.
 */
public class VariableArguments {

    public static void main(String[] args) {
        System.out.println("Methods7: Variable Arguments (Varargs)");

        try {
            testCalculateSum();
            testConcatenateStrings();
            testFindMaximum();
            testCreateFormattedList();
            System.out.println("All tests passed! Your implementation is correct.");
        } catch (AssertionError e) {
            System.out.println("Test failed: " + e.getMessage());
        }
    }

    /**
     * This method should calculate the sum of a variable number of integers.
     * 
     * TODO: Implement a method that:
     * 1. Accepts a variable number of int arguments
     * 2. Returns their sum as an int
     * 3. Returns 0 if no arguments are provided
     *
     * @param numbers Variable number of integers to sum
     * @return The sum of all the integers
     */
    public static int calculateSum(int... numbers) {
        // TODO: Implement your solution here
        return 0; // Replace with your implementation
    }

    /**
     * This method should concatenate a variable number of strings.
     * 
     * TODO: Implement a method that:
     * 1. Accepts a variable number of String arguments
     * 2. Accepts a delimiter String as the first parameter
     * 3. Concatenates all the strings with the delimiter in between
     * 4. Returns an empty string if no strings are provided (beyond the delimiter)
     *
     * @param delimiter The string to place between each concatenated string
     * @param strings Variable number of strings to concatenate
     * @return The concatenated string with delimiters
     */
    public static String concatenateStrings(String delimiter, String... strings) {
        // TODO: Implement your solution here
        return null; // Replace with your implementation
    }

    /**
     * This method should find the maximum value among a variable number of integers.
     * 
     * TODO: Implement a method that:
     * 1. Accepts a variable number of int arguments
     * 2. Returns the maximum value
     * 3. Throws an IllegalArgumentException with the message "No arguments provided"
     *    if no arguments are provided
     *
     * @param numbers Variable number of integers to compare
     * @return The maximum value
     * @throws IllegalArgumentException if no arguments are provided
     */
    public static int findMaximum(int... numbers) {
        // TODO: Implement your solution here
        return 0; // Replace with your implementation
    }

    /**
     * This method should create a formatted list from variable arguments.
     * 
     * TODO: Implement a method that:
     * 1. Accepts a String parameter for the title
     * 2. Accepts a variable number of Object arguments for the list items
     * 3. Returns a formatted string that looks like:
     *    "Title: [title]
     *     - [item1]
     *     - [item2]
     *     - [item3]
     *     ..."
     * 4. Returns just the title line if no list items are provided
     *
     * @param title The title of the list
     * @param items Variable number of objects to include as list items
     * @return A formatted string containing the title and list items
     */
    public static String createFormattedList(String title, Object... items) {
        // TODO: Implement your solution here
        return null; // Replace with your implementation
    }

    // Test methods
    private static void testCalculateSum() {
        int sum1 = calculateSum(1, 2, 3, 4, 5);
        assert sum1 == 15 : "Sum of [1, 2, 3, 4, 5] should be 15, but got " + sum1;
        
        int sum2 = calculateSum(10, -5, 7);
        assert sum2 == 12 : "Sum of [10, -5, 7] should be 12, but got " + sum2;
        
        int sum3 = calculateSum();
        assert sum3 == 0 : "Sum of [] should be 0, but got " + sum3;
        
        int sum4 = calculateSum(100);
        assert sum4 == 100 : "Sum of [100] should be 100, but got " + sum4;
    }

    private static void testConcatenateStrings() {
        String result1 = concatenateStrings(", ", "apple", "banana", "cherry");
        assert "apple, banana, cherry".equals(result1) : 
            "Concatenating [\"apple\", \"banana\", \"cherry\"] with delimiter \", \" should be \"apple, banana, cherry\", but got \"" + result1 + "\"";
        
        String result2 = concatenateStrings("-", "one", "two");
        assert "one-two".equals(result2) : 
            "Concatenating [\"one\", \"two\"] with delimiter \"-\" should be \"one-two\", but got \"" + result2 + "\"";
        
        String result3 = concatenateStrings(", ");
        assert "".equals(result3) : 
            "Concatenating [] with delimiter \", \" should be \"\", but got \"" + result3 + "\"";
        
        String result4 = concatenateStrings(" ", "hello");
        assert "hello".equals(result4) : 
            "Concatenating [\"hello\"] with delimiter \" \" should be \"hello\", but got \"" + result4 + "\"";
    }

    private static void testFindMaximum() {
        int max1 = findMaximum(5, 8, 2, 10, 3);
        assert max1 == 10 : "Max of [5, 8, 2, 10, 3] should be 10, but got " + max1;
        
        int max2 = findMaximum(100);
        assert max2 == 100 : "Max of [100] should be 100, but got " + max2;
        
        int max3 = findMaximum(-5, -10, -15);
        assert max3 == -5 : "Max of [-5, -10, -15] should be -5, but got " + max3;
        
        try {
            findMaximum();
            assert false : "findMaximum() should throw an IllegalArgumentException";
        } catch (IllegalArgumentException e) {
            assert "No arguments provided".equals(e.getMessage()) : 
                "Exception message should be \"No arguments provided\", but got \"" + e.getMessage() + "\"";
        }
    }

    private static void testCreateFormattedList() {
        String list1 = createFormattedList("Shopping List", "Apples", "Bananas", "Milk");
        String expected1 = "Title: Shopping List\n- Apples\n- Bananas\n- Milk";
        assert expected1.equals(list1) : 
            "Formatted list doesn't match expected output: " + list1;
        
        String list2 = createFormattedList("To-Do", "Study Java", "Exercise");
        String expected2 = "Title: To-Do\n- Study Java\n- Exercise";
        assert expected2.equals(list2) : 
            "Formatted list doesn't match expected output: " + list2;
        
        String list3 = createFormattedList("Empty List");
        String expected3 = "Title: Empty List";
        assert expected3.equals(list3) : 
            "Formatted list without items doesn't match expected output: " + list3;
        
        // Test with mixed object types
        String list4 = createFormattedList("Mixed Types", 42, "Hello", true, 3.14);
        String expected4 = "Title: Mixed Types\n- 42\n- Hello\n- true\n- 3.14";
        assert expected4.equals(list4) : 
            "Formatted list with mixed types doesn't match expected output: " + list4;
    }
} 