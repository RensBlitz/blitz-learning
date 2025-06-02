package javaexercises;

/**
 * DataTypes3: Type Safety and Assignment Errors
 *
 * This exercise explores type safety in Java. You will attempt to assign incompatible types
 * and observe the compile-time errors that occur. This exercise is more about understanding
 * concepts than writing runnable code that passes assertions in the traditional sense.
 *
 * Learning objectives:
 * - Understand Java's static type checking
 * - Recognize compile-time errors due to type incompatibility
 * - Appreciate the benefits of type safety
 *
 * Note: The primary goal is to observe errors. The provided "solution" will have
 * commented-out lines that would cause errors if uncommented.
 */
public class TypeSafetyAndErrors {

    public static void main(String[] args) {
        System.out.println("DataTypes3: Type Safety and Assignment Errors");
        System.out.println("Instructions: Uncomment the lines in the exploreTypeSafety method one by one.");
        System.out.println("Observe the compile-time errors reported by your IDE or the compiler.");
        System.out.println("This exercise demonstrates Java's type safety.");

        // Call the method to ensure it's part of the class structure, though it won't "pass" tests.
        exploreTypeSafety();
        System.out.println("If you uncommented lines and observed errors, you've completed the learning objective!");
    }

    /**
     * This method contains examples of type-incompatible assignments.
     * TODO: Uncomment each of the commented-out lines ONE AT A TIME.
     * Observe the compile-time error that your IDE or the Java compiler shows.
     * Reflect on why each assignment is not allowed.
     * After observing the error, you can comment the line out again to proceed or leave it to see all errors.
     */
    public static void exploreTypeSafety() {
        int myInt = 10;
        double myDouble = 20.5;
        char myChar = 'A';
        boolean myBoolean = true;
        String myString = "Hello";

        System.out.println("\nStarting with valid assignments:");
        System.out.println("myInt = " + myInt);
        System.out.println("myDouble = " + myDouble);
        System.out.println("myChar = " + myChar);
        System.out.println("myBoolean = " + myBoolean);
        System.out.println("myString = " + myString);

        System.out.println("\nNow, let's try some incompatible assignments (uncomment these one by one):");

        // Incompatible assignment 1: Trying to put a double into an int without a cast
        // myInt = myDouble; // What error do you see? Why?

        // Incompatible assignment 2: Trying to put a boolean into an int
        // myInt = myBoolean; // What error do you see? Why?

        // Incompatible assignment 3: Trying to put a String into a char
        // myChar = myString; // What error do you see? Why?

        // Incompatible assignment 4: Trying to put an int into a boolean
        // myBoolean = myInt; // What error do you see? Why?

        // Incompatible assignment 5: Trying to assign a char to a String directly (char is not a String)
        // myString = myChar; // This is also an error. String needs a char to be explicitly converted.

        // Note: Some languages are more flexible (dynamically typed) but Java is statically typed,
        // which helps catch these errors at compile time, preventing runtime issues.
    }
} 