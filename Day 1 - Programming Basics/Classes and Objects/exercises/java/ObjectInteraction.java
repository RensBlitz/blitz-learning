/**
 * Exercise 8: Object Interaction
 * 
 * This exercise focuses on how objects interact with each other.
 * 
 * Learning objectives:
 * - Understand how to model interactions between multiple objects
 * - Learn to design classes that collaborate with each other
 * - Practice implementing a simple object-oriented system
 * 
 * Note: This exercise uses assertions. Run with the -ea flag:
 * java -ea ObjectInteraction
 */
public class ObjectInteraction {
    
    public static void main(String[] args) {
        System.out.println("Exercise 8: Object Interaction");
        
        try {
            // Test the library system classes
            testLibrarySystem();
            
            System.out.println("All tests passed! Your implementation is correct.");
        } catch (AssertionError e) {
            System.out.println("Test failed: " + e.getMessage());
        }
    }
    
    /**
     * Tests the library system classes implementation.
     */
    private static void testLibrarySystem() {
        // Create books
        Book book1 = new Book("1984", "George Orwell", "9780451524935");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "9780060935467");
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565");
        
        // Test book properties
        assert book1.getTitle().equals("1984") : "Book title should be '1984'";
        assert book1.getAuthor().equals("George Orwell") : "Book author should be 'George Orwell'";
        assert book1.getIsbn().equals("9780451524935") : "Book ISBN should be '9780451524935'";
        assert !book1.isCheckedOut() : "New book should not be checked out";
        
        // Create library members
        LibraryMember member1 = new LibraryMember("101", "Alice Johnson");
        LibraryMember member2 = new LibraryMember("102", "Bob Smith");
        
        // Test member properties
        assert member1.getId().equals("101") : "Member ID should be '101'";
        assert member1.getName().equals("Alice Johnson") : "Member name should be 'Alice Johnson'";
        assert member1.getBorrowedBooks().length == 0 : "New member should have no borrowed books";
        
        // Create library with books
        Library library = new Library("Central Library");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        
        // Test library properties
        assert library.getName().equals("Central Library") : "Library name should be 'Central Library'";
        assert library.getBookCount() == 3 : "Library should have 3 books";
        
        // Register members
        library.registerMember(member1);
        library.registerMember(member2);
        assert library.getMemberCount() == 2 : "Library should have 2 members";
        
        // Test checkout and return
        boolean checkoutResult = library.checkoutBook(member1, book1);
        assert checkoutResult : "Checkout should be successful";
        assert book1.isCheckedOut() : "Book should be checked out";
        assert member1.getBorrowedBooks().length == 1 : "Member should have 1 borrowed book";
        assert member1.getBorrowedBooks()[0] == book1 : "Member's borrowed book should be book1";
        
        // Test checkout of already checked out book
        checkoutResult = library.checkoutBook(member2, book1);
        assert !checkoutResult : "Cannot checkout a book that is already checked out";
        assert member2.getBorrowedBooks().length == 0 : "Member2 should have no borrowed books";
        
        // Checkout another book
        checkoutResult = library.checkoutBook(member1, book2);
        assert checkoutResult : "Checkout should be successful";
        assert book2.isCheckedOut() : "Book2 should be checked out";
        assert member1.getBorrowedBooks().length == 2 : "Member should have 2 borrowed books";
        
        // Return a book
        boolean returnResult = library.returnBook(member1, book1);
        assert returnResult : "Return should be successful";
        assert !book1.isCheckedOut() : "Book should not be checked out after return";
        assert member1.getBorrowedBooks().length == 1 : "Member should have 1 borrowed book after return";
        assert member1.getBorrowedBooks()[0] == book2 : "Member's remaining borrowed book should be book2";
        
        // Test returning book not borrowed by this member
        returnResult = library.returnBook(member2, book2);
        assert !returnResult : "Cannot return a book not borrowed by this member";
        assert book2.isCheckedOut() : "Book should still be checked out";
        
        // Checkout by another member
        checkoutResult = library.checkoutBook(member2, book1);
        assert checkoutResult : "Checkout should be successful after book return";
        assert book1.isCheckedOut() : "Book should be checked out again";
        assert member2.getBorrowedBooks().length == 1 : "Member2 should have 1 borrowed book";
        
        // Test finding books
        Book foundBook = library.findBookByTitle("1984");
        assert foundBook == book1 : "Should find book by title";
        
        foundBook = library.findBookByTitle("Nonexistent Book");
        assert foundBook == null : "Should return null for nonexistent book";
        
        // Find borrowed books
        Book[] aliceBooks = library.getBorrowedBooks(member1);
        assert aliceBooks.length == 1 : "Alice should have 1 borrowed book";
        assert aliceBooks[0] == book2 : "Alice's borrowed book should be book2";
        
        Book[] bobBooks = library.getBorrowedBooks(member2);
        assert bobBooks.length == 1 : "Bob should have 1 borrowed book";
        assert bobBooks[0] == book1 : "Bob's borrowed book should be book1";
        
        // Test finding members
        LibraryMember foundMember = library.findMemberById("101");
        assert foundMember == member1 : "Should find member by ID";
        
        foundMember = library.findMemberById("999");
        assert foundMember == null : "Should return null for nonexistent member";
    }
}

/**
 * Represents a book in the library.
 * 
 * TODO: Implement this class with the following:
 * - Private fields for title, author, isbn (all Strings), and checkedOut (boolean)
 * - A constructor that initializes title, author, and isbn. The checkedOut field should start as false.
 * - Getter methods for all fields
 * - Methods to check out and return the book (update the checkedOut status)
 */
// TODO: Create the Book class here

/**
 * Represents a library member who can borrow books.
 * 
 * TODO: Implement this class with the following:
 * - Private fields for id, name (both Strings), and borrowedBooks (an array of Book objects)
 * - A constructor that initializes id and name. The borrowedBooks array should start empty.
 * - Getter methods for all fields
 * - Method to borrow a book (adds to borrowedBooks array)
 * - Method to return a book (removes from borrowedBooks array)
 * - Method to check if member has a specific book
 */
// TODO: Create the LibraryMember class here

/**
 * Represents a library that manages books and members.
 * 
 * TODO: Implement this class with the following:
 * - Private fields for name (String), books and members (arrays of Book and LibraryMember objects)
 * - A constructor that initializes the name and empty arrays for books and members
 * - Methods to add books and register members
 * - Methods to get the count of books and members
 * - Methods to find books by title and members by ID
 * - Method to checkout a book (connects a book to a member if available)
 * - Method to return a book (disconnects a book from a member)
 * - Method to get all books borrowed by a specific member
 */
// TODO: Create the Library class here 