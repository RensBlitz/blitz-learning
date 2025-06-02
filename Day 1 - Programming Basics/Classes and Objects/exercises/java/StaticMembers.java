/**
 * Exercise 7: Static Members
 * 
 * This exercise focuses on using static fields and methods.
 * 
 * Learning objectives:
 * - Understand the difference between static and instance members
 * - Learn to use static fields to share data across all instances
 * - Practice using static methods for operations that don't require an instance
 * 
 * Note: This exercise uses assertions. Run with the -ea flag:
 * java -ea StaticMembers
 */
public class StaticMembers {
    
    public static void main(String[] args) {
        System.out.println("Exercise 7: Static Members");
        
        try {
            // Test the MathUtils and Counter classes
            testMathUtilsClass();
            testCounterClass();
            
            System.out.println("All tests passed! Your implementation is correct.");
        } catch (AssertionError e) {
            System.out.println("Test failed: " + e.getMessage());
        }
    }
    
    /**
     * Tests the MathUtils class implementation.
     */
    private static void testMathUtilsClass() {
        // Test circle area
        double circleArea = MathUtils.calculateCircleArea(5.0);
        assert Math.abs(circleArea - 78.54) < 0.01 : "Circle area calculation is incorrect";
        
        // Test rectangle area
        double rectangleArea = MathUtils.calculateRectangleArea(4.0, 6.0);
        assert rectangleArea == 24.0 : "Rectangle area calculation is incorrect";
        
        // Test triangle area
        double triangleArea = MathUtils.calculateTriangleArea(5.0, 8.0);
        assert triangleArea == 20.0 : "Triangle area calculation is incorrect";
        
        // Test min and max
        assert MathUtils.min(5, 10) == 5 : "Min function returned incorrect value";
        assert MathUtils.min(-3, -7) == -7 : "Min function returned incorrect value";
        assert MathUtils.max(5, 10) == 10 : "Max function returned incorrect value";
        assert MathUtils.max(-3, -7) == -3 : "Max function returned incorrect value";
        
        // Test temperature conversion
        double celsius = MathUtils.fahrenheitToCelsius(32.0);
        assert celsius == 0.0 : "Fahrenheit to Celsius conversion is incorrect";
        
        celsius = MathUtils.fahrenheitToCelsius(212.0);
        assert celsius == 100.0 : "Fahrenheit to Celsius conversion is incorrect";
        
        double fahrenheit = MathUtils.celsiusToFahrenheit(0.0);
        assert fahrenheit == 32.0 : "Celsius to Fahrenheit conversion is incorrect";
        
        fahrenheit = MathUtils.celsiusToFahrenheit(100.0);
        assert fahrenheit == 212.0 : "Celsius to Fahrenheit conversion is incorrect";
        
        // Test PI and E constants
        assert Math.abs(MathUtils.PI - 3.14159) < 0.0001 : "PI constant is incorrect";
        assert Math.abs(MathUtils.E - 2.71828) < 0.0001 : "E constant is incorrect";
    }
    
    /**
     * Tests the Counter class implementation.
     */
    private static void testCounterClass() {
        // Reset total count before testing
        Counter.resetTotalCount();
        assert Counter.getTotalCount() == 0 : "Initial total count should be 0";
        
        // Create counters and test individual counts
        Counter counter1 = new Counter("Counter 1");
        assert counter1.getName().equals("Counter 1") : "Counter name should be 'Counter 1'";
        assert counter1.getCount() == 0 : "Initial count should be 0";
        assert Counter.getTotalCount() == 0 : "Total count should still be 0";
        
        counter1.increment();
        assert counter1.getCount() == 1 : "Count should be 1 after increment";
        assert Counter.getTotalCount() == 1 : "Total count should be 1";
        
        Counter counter2 = new Counter("Counter 2");
        assert counter2.getCount() == 0 : "Initial count for counter2 should be 0";
        assert Counter.getTotalCount() == 1 : "Total count should still be 1";
        
        counter2.increment();
        counter2.increment();
        assert counter2.getCount() == 2 : "Count for counter2 should be 2";
        assert Counter.getTotalCount() == 3 : "Total count should be 3";
        
        counter1.increment();
        assert counter1.getCount() == 2 : "Count for counter1 should be 2";
        assert Counter.getTotalCount() == 4 : "Total count should be 4";
        
        // Test reset
        counter1.reset();
        assert counter1.getCount() == 0 : "Count should be 0 after reset";
        assert Counter.getTotalCount() == 2 : "Total count should be 2 after individual reset";
        
        // Test resetTotalCount
        Counter.resetTotalCount();
        assert Counter.getTotalCount() == 0 : "Total count should be 0 after reset";
        assert counter1.getCount() == 0 : "Counter1 count should still be 0";
        assert counter2.getCount() == 2 : "Counter2 count should still be 2";
        
        // Add more counters and test total count
        Counter counter3 = new Counter("Counter 3");
        Counter counter4 = new Counter("Counter 4");
        
        counter3.increment();
        counter3.increment();
        counter3.increment();
        counter4.increment();
        counter1.increment();
        counter2.increment();
        
        assert counter1.getCount() == 1 : "Counter1 count should be 1";
        assert counter2.getCount() == 3 : "Counter2 count should be 3";
        assert counter3.getCount() == 3 : "Counter3 count should be 3";
        assert counter4.getCount() == 1 : "Counter4 count should be 1";
        assert Counter.getTotalCount() == 8 : "Total count should be 8";
        
        // Test counter count
        assert Counter.getCounterCount() == 4 : "Counter count should be 4";
    }
}

/**
 * Utility class for mathematical operations.
 * 
 * TODO: Implement this class with the following:
 * - Static constants:
 *   - PI (3.14159)
 *   - E (2.71828)
 * - Static methods:
 *   - calculateCircleArea(double radius) - returns area of a circle (PI * radius^2)
 *   - calculateRectangleArea(double width, double height) - returns area of a rectangle
 *   - calculateTriangleArea(double base, double height) - returns area of a triangle (0.5 * base * height)
 *   - min(int a, int b) - returns the smaller of two integers
 *   - max(int a, int b) - returns the larger of two integers
 *   - fahrenheitToCelsius(double fahrenheit) - converts Fahrenheit to Celsius ((F - 32) * 5/9)
 *   - celsiusToFahrenheit(double celsius) - converts Celsius to Fahrenheit ((C * 9/5) + 32)
 * - The class should not be instantiable (private constructor)
 */
// TODO: Create the MathUtils class here

/**
 * Represents a counter that keeps track of individual and total counts.
 * 
 * TODO: Implement this class with the following:
 * - Private instance fields for name (String) and count (int)
 * - Private static field for totalCount (int) to keep track of all increments across all counters
 * - Private static field for counterCount (int) to keep track of how many Counter objects have been created
 * - A constructor that takes a name and initializes count to 0, and increments counterCount
 * - Getter methods for name and count
 * - Static getter methods for totalCount and counterCount
 * - An increment() method that increases the counter's count by 1 and the totalCount by 1
 * - A reset() method that subtracts the counter's current count from totalCount and resets count to 0
 * - A static resetTotalCount() method that resets the totalCount to 0 without affecting individual counters
 */
// TODO: Create the Counter class here 