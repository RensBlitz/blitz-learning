package javaexercises;

/**
 * Methods6: Method Overloading
 *
 * This exercise focuses on creating and using overloaded methods in Java.
 * Method overloading allows creating multiple methods with the same name
 * but different parameter lists.
 *
 * Learning objectives:
 * - Understand method overloading principles
 * - Create overloaded methods with different parameter types and counts
 * - Learn how Java selects the appropriate method to call
 * - Apply method overloading to make APIs more flexible
 *
 * Note: This exercise uses assertions. Run with assertions enabled.
 */
public class MethodOverloading {

    public static void main(String[] args) {
        System.out.println("Methods6: Method Overloading");

        try {
            testCalculateAreaOverloads();
            testConcatenateOverloads();
            testFindMaxOverloads();
            testCreateUserOverloads();
            System.out.println("All tests passed! Your implementation is correct.");
        } catch (AssertionError e) {
            System.out.println("Test failed: " + e.getMessage());
        }
    }

    /**
     * TODO: Implement overloaded calculateArea methods:
     * 
     * 1. A method that calculates the area of a square:
     *    - Takes a single double parameter for the side length
     *    - Returns the area as a double (side² for a square)
     *
     * @param side The side length of the square
     * @return The area of the square
     */
    public static double calculateArea(double side) {
        // TODO: Implement your solution here
        return 0.0; // Replace with your implementation
    }

    /**
     * 2. A method that calculates the area of a rectangle:
     *    - Takes two double parameters: length and width
     *    - Returns the area as a double (length × width for a rectangle)
     *
     * @param length The length of the rectangle
     * @param width The width of the rectangle
     * @return The area of the rectangle
     */
    public static double calculateArea(double length, double width) {
        // TODO: Implement your solution here
        return 0.0; // Replace with your implementation
    }

    /**
     * 3. A method that calculates the area of a circle:
     *    - Takes a single double parameter for the radius
     *    - Returns the area as a double (π × radius² for a circle)
     *    - But the parameter name should be 'radius' to distinguish from the square method
     *
     * @param radius The radius of the circle
     * @return The area of the circle
     */
    public static double calculateArea(double radius, boolean isCircle) {
        // TODO: Implement your solution here
        // Use Math.PI for the value of π
        
        return 0.0; // Replace with your implementation
    }

    /**
     * 4. A method that calculates the area of a triangle:
     *    - Takes three double parameters: a, b, and c for the side lengths
     *    - Returns the area as a double using Heron's formula:
     *      Area = √(s(s-a)(s-b)(s-c)) where s = (a+b+c)/2
     *
     * @param a The first side length
     * @param b The second side length
     * @param c The third side length
     * @return The area of the triangle
     */
    public static double calculateArea(double a, double b, double c) {
        // TODO: Implement your solution here
        return 0.0; // Replace with your implementation
    }

    /**
     * TODO: Implement overloaded concatenate methods:
     * 
     * 1. A method that concatenates two strings:
     *    - Takes two String parameters
     *    - Returns their concatenation with a space between them
     *
     * @param str1 The first string
     * @param str2 The second string
     * @return The concatenated string with a space between
     */
    public static String concatenate(String str1, String str2) {
        // TODO: Implement your solution here
        return null; // Replace with your implementation
    }

    /**
     * 2. A method that concatenates three strings:
     *    - Takes three String parameters
     *    - Returns their concatenation with spaces between them
     *
     * @param str1 The first string
     * @param str2 The second string
     * @param str3 The third string
     * @return The concatenated string with spaces between
     */
    public static String concatenate(String str1, String str2, String str3) {
        // TODO: Implement your solution here
        return null; // Replace with your implementation
    }

    /**
     * 3. A method that concatenates a string a specified number of times:
     *    - Takes a String parameter and an int parameter for repeat count
     *    - Returns the string repeated that many times with spaces between
     *
     * @param str The string to repeat
     * @param count The number of times to repeat
     * @return The concatenated string with spaces between repetitions
     */
    public static String concatenate(String str, int count) {
        // TODO: Implement your solution here
        return null; // Replace with your implementation
    }

    /**
     * 4. A method that concatenates a character a specified number of times:
     *    - Takes a char parameter and an int parameter for repeat count
     *    - Returns a string with the character repeated that many times
     *
     * @param ch The character to repeat
     * @param count The number of times to repeat
     * @return The concatenated string
     */
    public static String concatenate(char ch, int count) {
        // TODO: Implement your solution here
        return null; // Replace with your implementation
    }

    /**
     * TODO: Implement overloaded findMax methods:
     * 
     * 1. A method that finds the maximum of two integers:
     *    - Takes two int parameters
     *    - Returns the larger value
     *
     * @param a The first integer
     * @param b The second integer
     * @return The maximum value
     */
    public static int findMax(int a, int b) {
        // TODO: Implement your solution here
        return 0; // Replace with your implementation
    }

    /**
     * 2. A method that finds the maximum of three integers:
     *    - Takes three int parameters
     *    - Returns the largest value
     *
     * @param a The first integer
     * @param b The second integer
     * @param c The third integer
     * @return The maximum value
     */
    public static int findMax(int a, int b, int c) {
        // TODO: Implement your solution here
        return 0; // Replace with your implementation
    }

    /**
     * 3. A method that finds the maximum of two doubles:
     *    - Takes two double parameters
     *    - Returns the larger value
     *
     * @param a The first double
     * @param b The second double
     * @return The maximum value
     */
    public static double findMax(double a, double b) {
        // TODO: Implement your solution here
        return 0.0; // Replace with your implementation
    }

    /**
     * 4. A method that finds the maximum value in an array of integers:
     *    - Takes an int[] parameter
     *    - Returns the largest value in the array
     *    - Returns Integer.MIN_VALUE if the array is empty or null
     *
     * @param array The array of integers
     * @return The maximum value in the array
     */
    public static int findMax(int[] array) {
        // TODO: Implement your solution here
        return 0; // Replace with your implementation
    }

    /**
     * TODO: Implement overloaded createUser methods:
     * 
     * All these methods should return a string representation of a user profile.
     * 
     * 1. A method that creates a basic user with just a username:
     *    - Takes a String parameter for username
     *    - Returns "User: [username], Role: Guest"
     *
     * @param username The username
     * @return A string representation of a basic user
     */
    public static String createUser(String username) {
        // TODO: Implement your solution here
        return null; // Replace with your implementation
    }

    /**
     * 2. A method that creates a user with a username and email:
     *    - Takes String parameters for username and email
     *    - Returns "User: [username], Email: [email], Role: Registered"
     *
     * @param username The username
     * @param email The email address
     * @return A string representation of a registered user
     */
    public static String createUser(String username, String email) {
        // TODO: Implement your solution here
        return null; // Replace with your implementation
    }

    /**
     * 3. A method that creates a user with username, email, and age:
     *    - Takes String parameters for username and email, and int for age
     *    - Returns "User: [username], Email: [email], Age: [age], Role: Member"
     *
     * @param username The username
     * @param email The email address
     * @param age The user's age
     * @return A string representation of a member user
     */
    public static String createUser(String username, String email, int age) {
        // TODO: Implement your solution here
        return null; // Replace with your implementation
    }

    /**
     * 4. A method that creates a user with username, email, age, and premium status:
     *    - Takes String parameters for username and email, int for age, boolean for premium
     *    - Returns "User: [username], Email: [email], Age: [age], Role: [Premium/Member]"
     *      where the role is "Premium" if premium is true, otherwise "Member"
     *
     * @param username The username
     * @param email The email address
     * @param age The user's age
     * @param isPremium Whether the user has premium status
     * @return A string representation of a premium or member user
     */
    public static String createUser(String username, String email, int age, boolean isPremium) {
        // TODO: Implement your solution here
        return null; // Replace with your implementation
    }

    // Test methods
    private static void testCalculateAreaOverloads() {
        // Test square area
        double squareArea = calculateArea(4.0);
        assert Math.abs(squareArea - 16.0) < 0.001 : 
            "Area of square with side 4.0 should be 16.0, but got " + squareArea;
        
        // Test rectangle area
        double rectangleArea = calculateArea(3.0, 5.0);
        assert Math.abs(rectangleArea - 15.0) < 0.001 : 
            "Area of rectangle with sides 3.0 and 5.0 should be 15.0, but got " + rectangleArea;
        
        // Test circle area
        double circleArea = calculateArea(2.0, true);
        assert Math.abs(circleArea - 12.566) < 0.001 : 
            "Area of circle with radius 2.0 should be about 12.566, but got " + circleArea;
        
        // Test triangle area
        double triangleArea = calculateArea(3.0, 4.0, 5.0);
        assert Math.abs(triangleArea - 6.0) < 0.001 : 
            "Area of triangle with sides 3.0, 4.0, 5.0 should be 6.0, but got " + triangleArea;
    }

    private static void testConcatenateOverloads() {
        // Test two strings
        String result1 = concatenate("Hello", "World");
        assert "Hello World".equals(result1) : 
            "Concatenating \"Hello\" and \"World\" should be \"Hello World\", but got \"" + result1 + "\"";
        
        // Test three strings
        String result2 = concatenate("Good", "Morning", "Java");
        assert "Good Morning Java".equals(result2) : 
            "Concatenating \"Good\", \"Morning\", and \"Java\" should be \"Good Morning Java\", but got \"" + result2 + "\"";
        
        // Test string repeated n times
        String result3 = concatenate("Hi", 3);
        assert "Hi Hi Hi".equals(result3) : 
            "Concatenating \"Hi\" 3 times should be \"Hi Hi Hi\", but got \"" + result3 + "\"";
        
        // Test char repeated n times
        String result4 = concatenate('A', 5);
        assert "AAAAA".equals(result4) : 
            "Concatenating 'A' 5 times should be \"AAAAA\", but got \"" + result4 + "\"";
    }

    private static void testFindMaxOverloads() {
        // Test max of two ints
        int max1 = findMax(10, 20);
        assert max1 == 20 : "Max of 10 and 20 should be 20, but got " + max1;
        
        // Test max of three ints
        int max2 = findMax(10, 30, 20);
        assert max2 == 30 : "Max of 10, 30, and 20 should be 30, but got " + max2;
        
        // Test max of two doubles
        double max3 = findMax(10.5, 20.5);
        assert max3 == 20.5 : "Max of 10.5 and 20.5 should be 20.5, but got " + max3;
        
        // Test max of int array
        int[] array = {5, 8, 2, 10, 3};
        int max4 = findMax(array);
        assert max4 == 10 : "Max of [5, 8, 2, 10, 3] should be 10, but got " + max4;
        
        // Test empty array
        int[] emptyArray = {};
        int max5 = findMax(emptyArray);
        assert max5 == Integer.MIN_VALUE : 
            "Max of empty array should be Integer.MIN_VALUE, but got " + max5;
    }

    private static void testCreateUserOverloads() {
        // Test basic user
        String user1 = createUser("johndoe");
        assert "User: johndoe, Role: Guest".equals(user1) : 
            "Basic user should be \"User: johndoe, Role: Guest\", but got \"" + user1 + "\"";
        
        // Test user with email
        String user2 = createUser("janedoe", "jane@example.com");
        assert "User: janedoe, Email: jane@example.com, Role: Registered".equals(user2) : 
            "User with email should match expected format, but got \"" + user2 + "\"";
        
        // Test user with email and age
        String user3 = createUser("alice", "alice@example.com", 25);
        assert "User: alice, Email: alice@example.com, Age: 25, Role: Member".equals(user3) : 
            "User with email and age should match expected format, but got \"" + user3 + "\"";
        
        // Test premium user
        String user4 = createUser("bob", "bob@example.com", 30, true);
        assert "User: bob, Email: bob@example.com, Age: 30, Role: Premium".equals(user4) : 
            "Premium user should match expected format, but got \"" + user4 + "\"";
        
        // Test non-premium user
        String user5 = createUser("charlie", "charlie@example.com", 35, false);
        assert "User: charlie, Email: charlie@example.com, Age: 35, Role: Member".equals(user5) : 
            "Non-premium user should match expected format, but got \"" + user5 + "\"";
    }
} 