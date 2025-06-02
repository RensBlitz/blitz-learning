/**
 * Exercise 2: Constructors and Fields
 * 
 * This exercise focuses on creating classes with multiple constructors and fields.
 * 
 * Learning objectives:
 * - Understand how to implement multiple constructors
 * - Learn to use constructor chaining (this())
 * - Practice using default values for optional parameters
 * 
 * Note: This exercise uses assertions. Run with the -ea flag:
 * java -ea ConstructorsAndFields
 */
public class ConstructorsAndFields {
    
    public static void main(String[] args) {
        System.out.println("Exercise 2: Constructors and Fields");
        
        try {
            // Test the Rectangle class
            testRectangleClass();
            
            System.out.println("All tests passed! Your implementation is correct.");
        } catch (AssertionError e) {
            System.out.println("Test failed: " + e.getMessage());
        }
    }
    
    /**
     * Tests the Rectangle class implementation.
     */
    private static void testRectangleClass() {
        // Test the main constructor
        Rectangle rect1 = new Rectangle(5.0, 3.0, "red", true);
        assert rect1.getWidth() == 5.0 : "Width should be 5.0";
        assert rect1.getHeight() == 3.0 : "Height should be 3.0";
        assert rect1.getColor().equals("red") : "Color should be 'red'";
        assert rect1.isFilled() : "Rectangle should be filled";
        
        // Test constructor with only width and height (default values for color and filled)
        Rectangle rect2 = new Rectangle(4.0, 2.0);
        assert rect2.getWidth() == 4.0 : "Width should be 4.0";
        assert rect2.getHeight() == 2.0 : "Height should be 2.0";
        assert rect2.getColor().equals("black") : "Default color should be 'black'";
        assert !rect2.isFilled() : "Default filled status should be false";
        
        // Test the no-arg constructor (default values for all fields)
        Rectangle rect3 = new Rectangle();
        assert rect3.getWidth() == 1.0 : "Default width should be 1.0";
        assert rect3.getHeight() == 1.0 : "Default height should be 1.0";
        assert rect3.getColor().equals("black") : "Default color should be 'black'";
        assert !rect3.isFilled() : "Default filled status should be false";
        
        // Test square constructor
        Rectangle square = new Rectangle(6.0);
        assert square.getWidth() == 6.0 : "Square width should be 6.0";
        assert square.getHeight() == 6.0 : "Square height should be 6.0";
        assert square.getColor().equals("black") : "Default color should be 'black'";
        assert !square.isFilled() : "Default filled status should be false";
        
        // Test setters
        rect1.setWidth(10.0);
        assert rect1.getWidth() == 10.0 : "Width should be updated to 10.0";
        
        rect1.setHeight(7.0);
        assert rect1.getHeight() == 7.0 : "Height should be updated to 7.0";
        
        rect1.setColor("blue");
        assert rect1.getColor().equals("blue") : "Color should be updated to 'blue'";
        
        rect1.setFilled(false);
        assert !rect1.isFilled() : "Filled status should be updated to false";
        
        // Test area and perimeter
        assert rect1.getArea() == 70.0 : "Area should be 70.0 (10.0 * 7.0)";
        assert rect1.getPerimeter() == 34.0 : "Perimeter should be 34.0 (2 * (10.0 + 7.0))";
    }
}

/**
 * Represents a rectangle with width, height, color, and filled status.
 * 
 * TODO: Implement this class with the following:
 * - Fields for width (double), height (double), color (String), and filled (boolean)
 * - Four constructors:
 *   1. A no-arg constructor that creates a default rectangle (width=1.0, height=1.0, color="black", filled=false)
 *   2. A constructor that takes width and height (use default values for color and filled)
 *   3. A constructor that takes width, height, color, and filled
 *   4. A constructor that takes one parameter (side) and creates a square (width=side, height=side)
 * - Use constructor chaining (this()) to avoid code duplication
 * - Getter and setter methods for all fields
 * - A getArea() method that returns the area (width * height)
 * - A getPerimeter() method that returns the perimeter (2 * (width + height))
 */
// TODO: Create the Rectangle class here 