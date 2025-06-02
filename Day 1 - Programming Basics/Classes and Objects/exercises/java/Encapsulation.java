/**
 * Exercise 4: Encapsulation
 * 
 * This exercise focuses on applying encapsulation principles to protect data integrity.
 * 
 * Learning objectives:
 * - Understand the concept of encapsulation
 * - Learn to use access modifiers (private, public)
 * - Practice validating data in setters to maintain object integrity
 * 
 * Note: This exercise uses assertions. Run with the -ea flag:
 * java -ea Encapsulation
 */
public class Encapsulation {
    
    public static void main(String[] args) {
        System.out.println("Exercise 4: Encapsulation");
        
        try {
            // Test the Employee class
            testEmployeeClass();
            
            System.out.println("All tests passed! Your implementation is correct.");
        } catch (AssertionError e) {
            System.out.println("Test failed: " + e.getMessage());
        }
    }
    
    /**
     * Tests the Employee class implementation.
     */
    private static void testEmployeeClass() {
        // Test constructor and getters
        Employee employee1 = new Employee("Alice Johnson", 30, 55000.0, "Engineering");
        assert employee1.getName().equals("Alice Johnson") : "Name should be 'Alice Johnson'";
        assert employee1.getAge() == 30 : "Age should be 30";
        assert employee1.getSalary() == 55000.0 : "Salary should be 55000.0";
        assert employee1.getDepartment().equals("Engineering") : "Department should be 'Engineering'";
        
        // Test invalid constructor values (should use default values)
        Employee invalidEmployee = new Employee("", -5, -1000.0, null);
        assert invalidEmployee.getName().equals("Unknown") : "Invalid name should default to 'Unknown'";
        assert invalidEmployee.getAge() == 18 : "Invalid age should default to 18";
        assert invalidEmployee.getSalary() == 30000.0 : "Invalid salary should default to 30000.0";
        assert invalidEmployee.getDepartment().equals("General") : "Invalid department should default to 'General'";
        
        // Test valid setter values
        employee1.setName("Alice Smith");
        assert employee1.getName().equals("Alice Smith") : "Name should be updated to 'Alice Smith'";
        
        employee1.setAge(31);
        assert employee1.getAge() == 31 : "Age should be updated to 31";
        
        employee1.setSalary(60000.0);
        assert employee1.getSalary() == 60000.0 : "Salary should be updated to 60000.0";
        
        employee1.setDepartment("Product");
        assert employee1.getDepartment().equals("Product") : "Department should be updated to 'Product'";
        
        // Test invalid setter values (should not change existing values)
        employee1.setName("");
        assert employee1.getName().equals("Alice Smith") : "Name should not change with invalid input";
        
        employee1.setName(null);
        assert employee1.getName().equals("Alice Smith") : "Name should not change with null input";
        
        employee1.setAge(15);
        assert employee1.getAge() == 31 : "Age should not change if less than minimum age (18)";
        
        employee1.setAge(71);
        assert employee1.getAge() == 31 : "Age should not change if greater than maximum age (70)";
        
        employee1.setSalary(-5000.0);
        assert employee1.getSalary() == 60000.0 : "Salary should not change with negative input";
        
        employee1.setSalary(200000.0);
        assert employee1.getSalary() == 60000.0 : "Salary should not change if greater than maximum (150000.0)";
        
        employee1.setDepartment("");
        assert employee1.getDepartment().equals("Product") : "Department should not change with empty input";
        
        employee1.setDepartment(null);
        assert employee1.getDepartment().equals("Product") : "Department should not change with null input";
        
        // Test raiseSalary method
        boolean raiseResult = employee1.raiseSalary(10.0);
        assert raiseResult : "Raise should be successful with valid percentage";
        assert employee1.getSalary() == 66000.0 : "Salary should be 66000.0 after 10% raise (60000 * 1.1)";
        
        raiseResult = employee1.raiseSalary(-5.0);
        assert !raiseResult : "Raise should fail with negative percentage";
        assert employee1.getSalary() == 66000.0 : "Salary should not change with invalid raise";
        
        raiseResult = employee1.raiseSalary(200.0);
        assert !raiseResult : "Raise should fail with percentage over 100";
        assert employee1.getSalary() == 66000.0 : "Salary should not change with invalid raise";
        
        // Test employeeInfo method
        String expectedInfo = "Employee: Alice Smith, Age: 31, Department: Product, Salary: $66000.00";
        assert employee1.getEmployeeInfo().equals(expectedInfo) : "Employee info is incorrect";
    }
}

/**
 * Represents an employee with proper encapsulation and data validation.
 * 
 * TODO: Implement this class with the following:
 * - Private fields for name (String), age (int), salary (double), and department (String)
 * - A constructor that initializes all fields with data validation
 * - Getter and setter methods for all fields with appropriate validation:
 *   - name: Cannot be null or empty (default "Unknown")
 *   - age: Must be between 18 and 70 (default 18)
 *   - salary: Must be positive and less than 150000.0 (default 30000.0)
 *   - department: Cannot be null or empty (default "General")
 * - raiseSalary(double percentage): Increases salary by the given percentage if between 0 and 100, returns true if successful
 * - getEmployeeInfo(): Returns a string with formatted employee information:
 *   "Employee: [name], Age: [age], Department: [department], Salary: $[salary formatted to 2 decimal places]"
 */
// TODO: Create the Employee class here 