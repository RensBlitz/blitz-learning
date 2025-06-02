/**
 * Exercise 5: Object References
 * 
 * This exercise focuses on understanding object references and identity in Java.
 * 
 * Learning objectives:
 * - Understand the difference between primitive values and object references
 * - Learn how object references work in method parameters and assignments
 * - Practice working with object equality vs. identity
 * 
 * Note: This exercise uses assertions. Run with the -ea flag:
 * java -ea ObjectReferences
 */
public class ObjectReferences {
    
    public static void main(String[] args) {
        System.out.println("Exercise 5: Object References");
        
        try {
            // Test the Person class
            testPersonClass();
            
            System.out.println("All tests passed! Your implementation is correct.");
        } catch (AssertionError e) {
            System.out.println("Test failed: " + e.getMessage());
        }
    }
    
    /**
     * Tests the Person class implementation.
     */
    private static void testPersonClass() {
        // Test creating a person
        Person person1 = new Person("Emma", 28);
        assert person1.getName().equals("Emma") : "Name should be 'Emma'";
        assert person1.getAge() == 28 : "Age should be 28";
        
        // Test creating another person with the same data
        Person person2 = new Person("Emma", 28);
        
        // Test equality vs. identity
        assert !person1.equals(null) : "A person should not equal null";
        assert person1.equals(person1) : "A person should equal itself";
        assert person1.equals(person2) : "Persons with the same data should be equal";
        assert person2.equals(person1) : "Equals should be symmetric";
        assert person1 != person2 : "Different objects should have different references";
        
        Person person3 = new Person("David", 35);
        assert !person1.equals(person3) : "Persons with different data should not be equal";
        
        // Test reference assignment
        Person person4 = person1;
        assert person4 == person1 : "After assignment, references should be identical";
        assert person4.equals(person1) : "References to the same object should be equal";
        
        // Test updating through a reference
        person4.setName("Emma Watson");
        assert person1.getName().equals("Emma Watson") : "Updating through one reference should affect the original object";
        assert person4.getName().equals("Emma Watson") : "Both references should see the updated name";
        
        // Clone test
        Person clonedPerson = person1.clone();
        assert clonedPerson != person1 : "Cloned person should be a different object";
        assert clonedPerson.equals(person1) : "Cloned person should have equal data to the original";
        assert clonedPerson.getName().equals("Emma Watson") : "Cloned person should have the same name";
        assert clonedPerson.getAge() == 28 : "Cloned person should have the same age";
        
        // Verify changing clone doesn't affect original
        clonedPerson.setName("Emma Stone");
        clonedPerson.setAge(33);
        assert person1.getName().equals("Emma Watson") : "Changing clone should not affect original";
        assert person1.getAge() == 28 : "Changing clone should not affect original";
        
        // Test method passing by reference
        modifyPerson(person1);
        assert person1.getAge() == 29 : "Age should be increased after method call";
        assert !person1.getName().equals("Modified") : "Name should not be changed (should be immutable)";
        
        // Test creating a person using values from another person - defensive copy
        Person person5 = new Person(clonedPerson);
        assert person5.getName().equals("Emma Stone") : "New person should copy the source person's name";
        assert person5.getAge() == 33 : "New person should copy the source person's age";
        assert person5 != clonedPerson : "New person should be a different object";
        assert person5.equals(clonedPerson) : "New person should equal the source person based on data";
        
        // Test changing the source after copy
        clonedPerson.setName("Different");
        clonedPerson.setAge(40);
        assert person5.getName().equals("Emma Stone") : "Changing source after copy should not affect the copy";
        assert person5.getAge() == 33 : "Changing source after copy should not affect the copy";
    }
    
    /**
     * Helper method to demonstrate how object references behave as method parameters.
     * This should increment the person's age by 1 but should not change their name.
     */
    private static void modifyPerson(Person person) {
        person.setAge(person.getAge() + 1);
        // The next line should not affect the actual object due to immutability
        person.setName("Modified");
    }
}

/**
 * Represents a person with name and age.
 * The name should be treated as immutable once set.
 * 
 * TODO: Implement this class with the following:
 * - Private fields for name (String) and age (int)
 * - A constructor that takes name and age
 * - A copy constructor that takes another Person object and creates a new instance with the same values
 * - Getter methods for all fields
 * - A setter for age (which can change)
 * - A setter for name that only changes the name if it hasn't been set already (simulating immutability)
 * - An equals() method that compares two Person objects based on their name and age values
 * - A clone() method that creates and returns a new Person with the same name and age
 */
// TODO: Create the Person class here 