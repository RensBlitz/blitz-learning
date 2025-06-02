/**
 * Exercise 6: Composition
 * 
 * This exercise focuses on building complex objects by composing them from simpler objects.
 * 
 * Learning objectives:
 * - Understand how to use composition to create complex objects
 * - Learn how to establish relationships between classes
 * - Practice implementing classes that contain other objects
 * 
 * Note: This exercise uses assertions. Run with the -ea flag:
 * java -ea Composition
 */
public class Composition {
    
    public static void main(String[] args) {
        System.out.println("Exercise 6: Composition");
        
        try {
            // Test the Address and Customer classes
            testAddressAndCustomerClasses();
            
            System.out.println("All tests passed! Your implementation is correct.");
        } catch (AssertionError e) {
            System.out.println("Test failed: " + e.getMessage());
        }
    }
    
    /**
     * Tests the Address and Customer classes implementation.
     */
    private static void testAddressAndCustomerClasses() {
        // Test creating an address
        Address address1 = new Address("123 Main St", "Apt 4B", "New York", "NY", "10001");
        assert address1.getStreet().equals("123 Main St") : "Street should be '123 Main St'";
        assert address1.getUnit().equals("Apt 4B") : "Unit should be 'Apt 4B'";
        assert address1.getCity().equals("New York") : "City should be 'New York'";
        assert address1.getState().equals("NY") : "State should be 'NY'";
        assert address1.getZipCode().equals("10001") : "Zip code should be '10001'";
        
        // Test formatted address
        String expectedFormat = "123 Main St, Apt 4B\nNew York, NY 10001";
        assert address1.getFormattedAddress().equals(expectedFormat) : "Formatted address is incorrect";
        
        // Test address without a unit
        Address address2 = new Address("456 Oak Ave", "", "Chicago", "IL", "60601");
        expectedFormat = "456 Oak Ave\nChicago, IL 60601";
        assert address2.getFormattedAddress().equals(expectedFormat) : "Formatted address without unit is incorrect";
        
        // Test creating a customer with an address
        Customer customer1 = new Customer("John Smith", "jsmith@example.com", "555-123-4567", address1);
        assert customer1.getName().equals("John Smith") : "Customer name should be 'John Smith'";
        assert customer1.getEmail().equals("jsmith@example.com") : "Customer email should be 'jsmith@example.com'";
        assert customer1.getPhone().equals("555-123-4567") : "Customer phone should be '555-123-4567'";
        assert customer1.getAddress() != null : "Customer address should not be null";
        assert customer1.getAddress().getCity().equals("New York") : "Customer address city should be 'New York'";
        
        // Test customer summary
        String expectedSummary = "Customer: John Smith\nContact: jsmith@example.com, 555-123-4567\nAddress: 123 Main St, Apt 4B\nNew York, NY 10001";
        assert customer1.getCustomerSummary().equals(expectedSummary) : "Customer summary is incorrect";
        
        // Test changing customer address
        customer1.setAddress(address2);
        assert customer1.getAddress().getCity().equals("Chicago") : "Customer address city should be updated to 'Chicago'";
        expectedSummary = "Customer: John Smith\nContact: jsmith@example.com, 555-123-4567\nAddress: 456 Oak Ave\nChicago, IL 60601";
        assert customer1.getCustomerSummary().equals(expectedSummary) : "Customer summary with new address is incorrect";
        
        // Test changing address properties
        address2.setStreet("789 Pine St");
        assert customer1.getAddress().getStreet().equals("789 Pine St") : "Changes to address should affect the customer";
        
        // Test defensive copying
        Address addressCopy = customer1.getAddressCopy();
        assert addressCopy != customer1.getAddress() : "Address copy should be a different object";
        assert addressCopy.getStreet().equals("789 Pine St") : "Address copy should have the same data";
        
        // Test that changes to the copy don't affect the original
        addressCopy.setStreet("999 Modified St");
        assert customer1.getAddress().getStreet().equals("789 Pine St") : "Changes to address copy should not affect the customer";
        
        // Test creating a customer with null address
        Customer customer2 = new Customer("Jane Doe", "jdoe@example.com", "555-987-6543", null);
        assert customer2.getAddress() == null : "Customer address should be null";
        expectedSummary = "Customer: Jane Doe\nContact: jdoe@example.com, 555-987-6543\nAddress: No address provided";
        assert customer2.getCustomerSummary().equals(expectedSummary) : "Customer summary with null address is incorrect";
        
        // Test getAddressCopy with null address
        assert customer2.getAddressCopy() == null : "Address copy should be null if original is null";
    }
}

/**
 * Represents a physical address.
 * 
 * TODO: Implement this class with the following:
 * - Private fields for street, unit, city, state, and zipCode (all Strings)
 * - A constructor that initializes all fields
 * - Getter and setter methods for all fields
 * - A getFormattedAddress() method that returns a properly formatted address string:
 *   - If unit is not empty: "[street], [unit]\n[city], [state] [zipCode]"
 *   - If unit is empty: "[street]\n[city], [state] [zipCode]"
 */
// TODO: Create the Address class here

/**
 * Represents a customer that has an address.
 * 
 * TODO: Implement this class with the following:
 * - Private fields for name, email, phone (all Strings), and address (Address object)
 * - A constructor that initializes all fields
 * - Getter and setter methods for all fields
 * - A getAddressCopy() method that returns a defensive copy of the address
 *   (or null if the address is null)
 * - A getCustomerSummary() method that returns a formatted summary string:
 *   - If address is not null: "Customer: [name]\nContact: [email], [phone]\nAddress: [formatted address]"
 *   - If address is null: "Customer: [name]\nContact: [email], [phone]\nAddress: No address provided"
 */
// TODO: Create the Customer class here 