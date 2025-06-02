/**
 * Exercise 1: Basic Class Structure
 * 
 * This exercise focuses on creating a simple class with fields and methods.
 * 
 * Learning objectives:
 * - Understand how to define a class with fields
 * - Learn to create a constructor to initialize object state
 * - Practice implementing simple instance methods
 * 
 * Note: This exercise uses assertions. Run with the -ea flag:
 * java -ea BasicClassStructure
 */
public class BasicClassStructure {
    
    public static void main(String[] args) {
        System.out.println("Exercise 1: Basic Class Structure");
        
        try {
            // Test the Book class
            testBookClass();
            
            System.out.println("All tests passed! Your implementation is correct.");
        } catch (AssertionError e) {
            System.out.println("Test failed: " + e.getMessage());
        }
    }
    
    /**
     * Tests the Book class implementation.
     */
    private static void testBookClass() {
        // Test book creation and getters
        Book book1 = new Book("The Hobbit", "J.R.R. Tolkien", 295);
        assert book1.getTitle().equals("The Hobbit") : "Book title getter returned incorrect value";
        assert book1.getAuthor().equals("J.R.R. Tolkien") : "Book author getter returned incorrect value";
        assert book1.getPages() == 295 : "Book pages getter returned incorrect value";
        
        // Test book summary method
        String expectedSummary = "The Hobbit by J.R.R. Tolkien, 295 pages";
        assert book1.getSummary().equals(expectedSummary) : "Book summary is incorrect";
        
        // Test another book instance
        Book book2 = new Book("1984", "George Orwell", 328);
        assert book2.getTitle().equals("1984") : "Book title getter returned incorrect value";
        assert book2.getAuthor().equals("George Orwell") : "Book author getter returned incorrect value";
        assert book2.getPages() == 328 : "Book pages getter returned incorrect value";
        
        expectedSummary = "1984 by George Orwell, 328 pages";
        assert book2.getSummary().equals(expectedSummary) : "Book summary is incorrect";
        
        // Test isLongBook method
        assert !book1.isLongBook() : "The Hobbit should not be considered a long book";
        assert book2.isLongBook() : "1984 should be considered a long book";
        
        Book shortBook = new Book("Short Story", "Anonymous", 50);
        assert !shortBook.isLongBook() : "A 50-page book should not be considered a long book";
        
        Book longBook = new Book("War and Peace", "Leo Tolstoy", 1225);
        assert longBook.isLongBook() : "War and Peace should be considered a long book";
    }
}

/**
 * TODO: Implement a class that represents a book in a catalog system.
 * Consider what properties a book needs and how to present its information.
 *
 * Requirements:
 * - Create a class named Book with:
 *   - Private fields for: title (String), author (String), pages (int)
 *   - A constructor that initializes all fields
 *   - Getter methods for all fields
 *   - A getSummary() method that returns a string in format: "Title by Author, Pages pages"
 *   - An isLongBook() method that returns true if the book has more than 300 pages
 *
 */
class Book {
    // TODO: Implement your solution here
} 