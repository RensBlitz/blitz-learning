/**
 * Exercise 4: Switch Statements
 * 
 * This exercise focuses on using switch statements for multi-branch decision making.
 * 
 * Learning objectives:
 * - Understand the syntax and structure of switch statements
 * - Learn when to use switch statements instead of if-else chains
 * - Practice using switch statements with different data types
 * 
 * Note: This exercise uses assertions. Run with the -ea flag:
 * java -ea SwitchStatements
 */
public class SwitchStatements {
    
    public static void main(String[] args) {
        System.out.println("Exercise 4: Switch Statements");
        
        try {
            // Test the day of week converter
            testDayOfWeek();
            
            // Test the month days calculator
            testMonthDays();
            
            // Test the HTTP status code interpreter
            testHttpStatusInterpreter();
            
            System.out.println("All tests passed! Your implementation is correct.");
        } catch (AssertionError e) {
            System.out.println("Test failed: " + e.getMessage());
        }
    }
    
    /**
     * Tests the day of week converter implementation.
     */
    private static void testDayOfWeek() {
        assert getDayOfWeek(1).equals("Monday") : "Day 1 should be Monday";
        assert getDayOfWeek(2).equals("Tuesday") : "Day 2 should be Tuesday";
        assert getDayOfWeek(3).equals("Wednesday") : "Day 3 should be Wednesday";
        assert getDayOfWeek(4).equals("Thursday") : "Day 4 should be Thursday";
        assert getDayOfWeek(5).equals("Friday") : "Day 5 should be Friday";
        assert getDayOfWeek(6).equals("Saturday") : "Day 6 should be Saturday";
        assert getDayOfWeek(7).equals("Sunday") : "Day 7 should be Sunday";
        assert getDayOfWeek(0).equals("Invalid day") : "Day 0 should be Invalid day";
        assert getDayOfWeek(8).equals("Invalid day") : "Day 8 should be Invalid day";
    }
    
    /**
     * Tests the month days calculator implementation.
     */
    private static void testMonthDays() {
        // Non-leap year (2023)
        assert getDaysInMonth("January", 2023) == 31 : "January 2023 should have 31 days";
        assert getDaysInMonth("February", 2023) == 28 : "February 2023 should have 28 days";
        assert getDaysInMonth("March", 2023) == 31 : "March 2023 should have 31 days";
        assert getDaysInMonth("April", 2023) == 30 : "April 2023 should have 30 days";
        assert getDaysInMonth("May", 2023) == 31 : "May 2023 should have 31 days";
        assert getDaysInMonth("June", 2023) == 30 : "June 2023 should have 30 days";
        assert getDaysInMonth("July", 2023) == 31 : "July 2023 should have 31 days";
        assert getDaysInMonth("August", 2023) == 31 : "August 2023 should have 31 days";
        assert getDaysInMonth("September", 2023) == 30 : "September 2023 should have 30 days";
        assert getDaysInMonth("October", 2023) == 31 : "October 2023 should have 31 days";
        assert getDaysInMonth("November", 2023) == 30 : "November 2023 should have 30 days";
        assert getDaysInMonth("December", 2023) == 31 : "December 2023 should have 31 days";
        
        // Leap year (2024)
        assert getDaysInMonth("February", 2024) == 29 : "February 2024 should have 29 days";
        
        // Invalid month
        assert getDaysInMonth("Invalid", 2023) == -1 : "Invalid month should return -1";
    }
    
    /**
     * Tests the HTTP status code interpreter implementation.
     */
    private static void testHttpStatusInterpreter() {
        assert getHttpStatusMessage(200).equals("OK") : "Status 200 should be OK";
        assert getHttpStatusMessage(201).equals("Created") : "Status 201 should be Created";
        assert getHttpStatusMessage(204).equals("No Content") : "Status 204 should be No Content";
        assert getHttpStatusMessage(400).equals("Bad Request") : "Status 400 should be Bad Request";
        assert getHttpStatusMessage(401).equals("Unauthorized") : "Status 401 should be Unauthorized";
        assert getHttpStatusMessage(403).equals("Forbidden") : "Status 403 should be Forbidden";
        assert getHttpStatusMessage(404).equals("Not Found") : "Status 404 should be Not Found";
        assert getHttpStatusMessage(500).equals("Internal Server Error") : "Status 500 should be Internal Server Error";
        assert getHttpStatusMessage(503).equals("Service Unavailable") : "Status 503 should be Service Unavailable";
        assert getHttpStatusMessage(999).equals("Unknown Status Code") : "Status 999 should be Unknown Status Code";
    }
    
    /**
     * TODO: Implement a method that converts numerical day representations to their text form.
     * Consider how to handle valid and invalid inputs.
     *
     * Requirements:
     * - Input: day number (1-7)
     * - Output must be exactly:
     *   - "Monday" for 1
     *   - "Tuesday" for 2
     *   - "Wednesday" for 3
     *   - "Thursday" for 4
     *   - "Friday" for 5
     *   - "Saturday" for 6
     *   - "Sunday" for 7
     *   - "Invalid day" for any other number
     *
     * @param dayNumber The day number (1-7)
     * @return The name of the day or "Invalid day" for invalid inputs
     */
    public static String getDayOfWeek(int dayNumber) {
        // TODO: Implement your solution here using a switch statement
        return null; // Replace with your implementation
    }
    
    /**
     * TODO: Implement a method that determines the number of days in any given month,
     * taking into account leap years.
     * Consider how different months and special years affect the result.
     *
     * Requirements:
     * - Input: month name and year
     * - Output must be:
     *   - 31 for: January, March, May, July, August, October, December
     *   - 30 for: April, June, September, November
     *   - For February:
     *     - 29 in leap years
     *     - 28 in non-leap years
     *   - -1 for invalid month names
     * - Leap year rule: divisible by 4, except century years not divisible by 400
     *
     * @param month The name of the month
     * @param year The year
     * @return The number of days in the month, or -1 for invalid inputs
     */
    public static int getDaysInMonth(String month, int year) {
        // TODO: Implement your solution here using a switch statement
        return 0; // Replace with your implementation
    }
    
    /**
     * TODO: Implement a method that provides meaningful descriptions for HTTP status codes.
     * Consider how to categorize different types of status codes and what information
     * would be most helpful to users of your method.
     *
     * Requirements:
     * - Input: HTTP status code (integer)
     * - Output must be exactly:
     *   - "OK" for 200
     *   - "Created" for 201
     *   - "No Content" for 204
     *   - "Bad Request" for 400
     *   - "Unauthorized" for 401
     *   - "Forbidden" for 403
     *   - "Not Found" for 404
     *   - "Internal Server Error" for 500
     *   - "Service Unavailable" for 503
     *   - "Unknown Status Code" for any other code
     *
     * @param statusCode The HTTP status code
     * @return A descriptive message for the status code
     */
    public static String getHttpStatusMessage(int statusCode) {
        // TODO: Implement your solution here using a switch statement
        return null; // Replace with your implementation
    }
} 