/**
 * DataStructures7: Nested Collections
 *
 * This exercise focuses on working with more complex data structures by
 * nesting collections inside other collections. Nested collections are
 * essential for representing hierarchical or multi-dimensional data.
 *
 * Learning objectives:
 * - Create and manipulate nested collections (lists of lists, maps of lists, etc.)
 * - Understand appropriate use cases for nested data structures
 * - Access and modify elements in nested collections
 * - Iterate through multi-level collections
 * - Convert between different nested collection types
 *
 * Note: This exercise uses assertions. Run with assertions enabled.
 */
import java.util.*;

public class NestedCollections {

    public static void main(String[] args) {
        System.out.println("DataStructures7: Nested Collections");

        try {
            testNestedLists();
            testMapOfLists();
            testListOfMaps();
            testNestedMaps();
            testComplexStructure();
            System.out.println("All tests passed! Your implementation is correct.");
        } catch (AssertionError e) {
            System.out.println("Test failed: " + e.getMessage());
        }
    }

    /**
     * This method demonstrates working with a list of lists (2D list).
     * TODO: Implement the following:
     * 1. Create a 3x3 matrix represented as a list of lists
     *    with the following values:
     *    [[1, 2, 3],
     *     [4, 5, 6],
     *     [7, 8, 9]]
     * 2. Extract the middle row (second row)
     * 3. Extract the diagonal elements [1, 5, 9]
     *
     * @return An array containing [matrix, middleRow, diagonal]
     */
    public static Object[] createNestedLists() {
        // TODO: Implement your solution here
        
        // 1. Create a 3x3 matrix as a list of lists
        List<List<Integer>> matrix = null; // Replace with your implementation
        
        // 2. Extract the middle row
        List<Integer> middleRow = null; // Replace with your implementation
        
        // 3. Extract the diagonal elements
        List<Integer> diagonal = null; // Replace with your implementation
        
        return new Object[]{matrix, middleRow, diagonal};
    }

    /**
     * This method demonstrates working with a map containing lists as values.
     * TODO: Implement the following:
     * 1. Create a map where keys are department names and values are lists of employees
     * 2. Add the following departments and employees:
     *    - "Engineering": ["Alice", "Bob", "Charlie"]
     *    - "Marketing": ["David", "Eve"]
     *    - "HR": ["Frank"]
     * 3. Add a new employee "Grace" to the "Marketing" department
     * 4. Get all employees from "Engineering"
     * 5. Count the total number of employees across all departments
     *
     * @return An array containing [departmentMap, engineeringTeam, totalEmployees]
     */
    public static Object[] createMapOfLists() {
        // TODO: Implement your solution here
        
        // 1 & 2. Create a map with lists of employees
        Map<String, List<String>> departmentMap = null; // Replace with your implementation
        
        // 3. Add a new employee to Marketing
        // Your code here
        
        // 4. Get all employees from Engineering
        List<String> engineeringTeam = null; // Replace with your implementation
        
        // 5. Count total employees
        int totalEmployees = 0; // Replace with your implementation
        
        return new Object[]{departmentMap, engineeringTeam, totalEmployees};
    }

    /**
     * This method demonstrates working with a list of maps.
     * TODO: Implement the following:
     * 1. Create a list of 3 person records, where each person is a map
     *    with the following keys: "name", "age", "city"
     * 2. Add the following people:
     *    - {"name": "Alice", "age": 25, "city": "New York"}
     *    - {"name": "Bob", "age": 30, "city": "San Francisco"}
     *    - {"name": "Charlie", "age": 22, "city": "New York"}
     * 3. Find all people who live in "New York"
     * 4. Calculate the average age of all people
     *
     * @return An array containing [people, newYorkers, averageAge]
     */
    public static Object[] createListOfMaps() {
        // TODO: Implement your solution here
        
        // 1 & 2. Create a list of person maps
        List<Map<String, Object>> people = null; // Replace with your implementation
        
        // 3. Find all people from New York
        List<Map<String, Object>> newYorkers = null; // Replace with your implementation
        
        // 4. Calculate average age
        double averageAge = 0.0; // Replace with your implementation
        
        return new Object[]{people, newYorkers, averageAge};
    }

    /**
     * This method demonstrates working with nested maps (a map of maps).
     * TODO: Implement the following:
     * 1. Create a nested map representing a simple book inventory system
     *    where the outer key is the genre, the inner key is the book title,
     *    and the inner value is a map with book details:
     *    {"author": authorName, "year": publicationYear, "price": price}
     * 2. Add the following books:
     *    - "Fiction" -> "The Great Gatsby" -> {"author": "F. Scott Fitzgerald", "year": 1925, "price": 15.99}
     *    - "Fiction" -> "1984" -> {"author": "George Orwell", "year": 1949, "price": 12.99}
     *    - "Non-Fiction" -> "Sapiens" -> {"author": "Yuval Noah Harari", "year": 2011, "price": 18.99}
     * 3. Get the details for "1984"
     * 4. Get all fiction book titles
     * 5. Calculate the total price of all books
     *
     * @return An array containing [bookInventory, book1984Details, fictionBooks, totalPrice]
     */
    public static Object[] createNestedMaps() {
        // TODO: Implement your solution here
        
        // 1 & 2. Create a nested map of book inventory
        Map<String, Map<String, Map<String, Object>>> bookInventory = null; // Replace with your implementation
        
        // 3. Get details for "1984"
        Map<String, Object> book1984Details = null; // Replace with your implementation
        
        // 4. Get all fiction book titles
        List<String> fictionBooks = null; // Replace with your implementation
        
        // 5. Calculate total price of all books
        double totalPrice = 0.0; // Replace with your implementation
        
        return new Object[]{bookInventory, book1984Details, fictionBooks, totalPrice};
    }

    /**
     * This method creates a complex data structure to represent a simple organization.
     * TODO: Implement the following:
     * 1. Create a representation of a company with departments, employees, and projects
     * 2. The structure should be a map where:
     *    - Keys are department names (strings)
     *    - Values are maps with:
     *      - "employees" -> list of employee maps with "name", "position", and "salary"
     *      - "projects" -> list of project maps with "name", "budget", and "deadline"
     * 3. Add at least 2 departments with 2+ employees each and 2+ projects each
     * 4. Calculate the total salary budget for the entire company
     * 5. Find all projects with a budget over a given threshold
     *
     * @param budgetThreshold The minimum budget to include in high-budget projects
     * @return An array containing [companyStructure, totalSalary, highBudgetProjects]
     */
    public static Object[] createCompanyStructure(double budgetThreshold) {
        // TODO: Implement your solution here
        
        // 1 & 2 & 3. Create the company structure
        Map<String, Map<String, Object>> companyStructure = null; // Replace with your implementation
        
        // 4. Calculate total salary
        double totalSalary = 0.0; // Replace with your implementation
        
        // 5. Find high-budget projects
        List<Map<String, Object>> highBudgetProjects = null; // Replace with your implementation
        
        return new Object[]{companyStructure, totalSalary, highBudgetProjects};
    }

    private static void testNestedLists() {
        Object[] results = createNestedLists();
        
        assert results != null : "The returned array should not be null.";
        assert results.length == 3 : "The array should contain 3 elements.";
        
        // Test matrix
        assert results[0] instanceof List : "First element should be a List.";
        List<?> matrix = (List<?>) results[0];
        assert matrix.size() == 3 : "Matrix should have 3 rows.";
        for (Object row : matrix) {
            assert row instanceof List : "Each row should be a List.";
            assert ((List<?>) row).size() == 3 : "Each row should have 3 elements.";
        }
        
        // Check some specific values in the matrix
        assert ((List<?>)((List<?>) matrix).get(0)).get(0).equals(1) : "Element at [0][0] should be 1.";
        assert ((List<?>)((List<?>) matrix).get(1)).get(1).equals(5) : "Element at [1][1] should be 5.";
        assert ((List<?>)((List<?>) matrix).get(2)).get(2).equals(9) : "Element at [2][2] should be 9.";
        
        // Test middle row
        assert results[1] instanceof List : "Second element should be a List.";
        List<?> middleRow = (List<?>) results[1];
        assert middleRow.size() == 3 : "Middle row should have 3 elements.";
        assert middleRow.get(0).equals(4) : "First element of middle row should be 4.";
        assert middleRow.get(1).equals(5) : "Second element of middle row should be 5.";
        assert middleRow.get(2).equals(6) : "Third element of middle row should be 6.";
        
        // Test diagonal
        assert results[2] instanceof List : "Third element should be a List.";
        List<?> diagonal = (List<?>) results[2];
        assert diagonal.size() == 3 : "Diagonal should have 3 elements.";
        assert diagonal.get(0).equals(1) : "First element of diagonal should be 1.";
        assert diagonal.get(1).equals(5) : "Second element of diagonal should be 5.";
        assert diagonal.get(2).equals(9) : "Third element of diagonal should be 9.";
    }

    private static void testMapOfLists() {
        Object[] results = createMapOfLists();
        
        assert results != null : "The returned array should not be null.";
        assert results.length == 3 : "The array should contain 3 elements.";
        
        // Test department map
        assert results[0] instanceof Map : "First element should be a Map.";
        Map<?, ?> departmentMap = (Map<?, ?>) results[0];
        assert departmentMap.size() == 3 : "Map should have 3 departments.";
        assert departmentMap.containsKey("Engineering") : "Map should contain 'Engineering'.";
        assert departmentMap.containsKey("Marketing") : "Map should contain 'Marketing'.";
        assert departmentMap.containsKey("HR") : "Map should contain 'HR'.";
        
        // Test department lists
        assert departmentMap.get("Engineering") instanceof List : "Department value should be a List.";
        assert ((List<?>) departmentMap.get("Engineering")).size() == 3 : "Engineering should have 3 employees.";
        assert ((List<?>) departmentMap.get("Marketing")).size() == 3 : "Marketing should have 3 employees.";
        assert ((List<?>) departmentMap.get("HR")).size() == 1 : "HR should have 1 employee.";
        
        // Check specific employees
        assert ((List<?>) departmentMap.get("Marketing")).contains("Grace") : "Marketing should contain 'Grace'.";
        
        // Test engineering team
        assert results[1] instanceof List : "Second element should be a List.";
        List<?> engineeringTeam = (List<?>) results[1];
        assert engineeringTeam.size() == 3 : "Engineering team should have 3 employees.";
        assert engineeringTeam.contains("Alice") : "Engineering team should contain 'Alice'.";
        assert engineeringTeam.contains("Bob") : "Engineering team should contain 'Bob'.";
        assert engineeringTeam.contains("Charlie") : "Engineering team should contain 'Charlie'.";
        
        // Test total employees
        assert results[2] instanceof Integer : "Third element should be an Integer.";
        int totalEmployees = (Integer) results[2];
        assert totalEmployees == 7 : "Total employees should be 7.";
    }

    private static void testListOfMaps() {
        Object[] results = createListOfMaps();
        
        assert results != null : "The returned array should not be null.";
        assert results.length == 3 : "The array should contain 3 elements.";
        
        // Test people list
        assert results[0] instanceof List : "First element should be a List.";
        List<?> people = (List<?>) results[0];
        assert people.size() == 3 : "People list should have 3 elements.";
        for (Object person : people) {
            assert person instanceof Map : "Each person should be a Map.";
            Map<?, ?> personMap = (Map<?, ?>) person;
            assert personMap.containsKey("name") : "Person should have 'name' key.";
            assert personMap.containsKey("age") : "Person should have 'age' key.";
            assert personMap.containsKey("city") : "Person should have 'city' key.";
        }
        
        // Test New Yorkers
        assert results[1] instanceof List : "Second element should be a List.";
        List<?> newYorkers = (List<?>) results[1];
        assert newYorkers.size() == 2 : "New Yorkers list should have 2 elements.";
        for (Object person : newYorkers) {
            assert person instanceof Map : "Each New Yorker should be a Map.";
            assert ((Map<?, ?>) person).get("city").equals("New York") : "New Yorker should have city 'New York'.";
        }
        
        // Test average age
        assert results[2] instanceof Double : "Third element should be a Double.";
        double averageAge = (Double) results[2];
        assert Math.abs(averageAge - 25.67) < 0.01 : "Average age should be around 25.67.";
    }

    private static void testNestedMaps() {
        Object[] results = createNestedMaps();
        
        assert results != null : "The returned array should not be null.";
        assert results.length == 4 : "The array should contain 4 elements.";
        
        // Test book inventory
        assert results[0] instanceof Map : "First element should be a Map.";
        Map<?, ?> bookInventory = (Map<?, ?>) results[0];
        assert bookInventory.size() == 2 : "Book inventory should have 2 genres.";
        assert bookInventory.containsKey("Fiction") : "Book inventory should contain 'Fiction'.";
        assert bookInventory.containsKey("Non-Fiction") : "Book inventory should contain 'Non-Fiction'.";
        
        // Test fiction books
        Map<?, ?> fiction = (Map<?, ?>) bookInventory.get("Fiction");
        assert fiction.size() == 2 : "Fiction should have 2 books.";
        assert fiction.containsKey("The Great Gatsby") : "Fiction should contain 'The Great Gatsby'.";
        assert fiction.containsKey("1984") : "Fiction should contain '1984'.";
        
        // Test book details
        Map<?, ?> book1984 = (Map<?, ?>) fiction.get("1984");
        assert book1984.get("author").equals("George Orwell") : "1984 author should be 'George Orwell'.";
        assert book1984.get("year").equals(1949) : "1984 year should be 1949.";
        assert ((Double) book1984.get("price")) == 12.99 : "1984 price should be 12.99.";
        
        // Test 1984 details
        assert results[1] instanceof Map : "Second element should be a Map.";
        Map<?, ?> book1984Details = (Map<?, ?>) results[1];
        assert book1984Details.size() == 3 : "1984 details should have 3 entries.";
        assert book1984Details.get("author").equals("George Orwell") : "1984 author should be 'George Orwell'.";
        
        // Test fiction books list
        assert results[2] instanceof List : "Third element should be a List.";
        List<?> fictionBooks = (List<?>) results[2];
        assert fictionBooks.size() == 2 : "Fiction books list should have 2 elements.";
        assert fictionBooks.contains("The Great Gatsby") : "Fiction books should contain 'The Great Gatsby'.";
        assert fictionBooks.contains("1984") : "Fiction books should contain '1984'.";
        
        // Test total price
        assert results[3] instanceof Double : "Fourth element should be a Double.";
        double totalPrice = (Double) results[3];
        assert Math.abs(totalPrice - 47.97) < 0.01 : "Total price should be 47.97.";
    }

    private static void testComplexStructure() {
        Object[] results = createCompanyStructure(50000.0);
        
        assert results != null : "The returned array should not be null.";
        assert results.length == 3 : "The array should contain 3 elements.";
        
        // Test company structure
        assert results[0] instanceof Map : "First element should be a Map.";
        Map<?, ?> companyStructure = (Map<?, ?>) results[0];
        assert companyStructure.size() >= 2 : "Company structure should have at least 2 departments.";
        
        // Check employees and projects for each department
        int employeeCount = 0;
        int projectCount = 0;
        
        for (Object departmentObj : companyStructure.values()) {
            Map<?, ?> department = (Map<?, ?>) departmentObj;
            assert department.containsKey("employees") : "Department should have 'employees' key.";
            assert department.containsKey("projects") : "Department should have 'projects' key.";
            
            List<?> employees = (List<?>) department.get("employees");
            List<?> projects = (List<?>) department.get("projects");
            
            assert employees.size() >= 2 : "Department should have at least 2 employees.";
            assert projects.size() >= 2 : "Department should have at least 2 projects.";
            
            employeeCount += employees.size();
            projectCount += projects.size();
            
            // Check employee structure
            for (Object employeeObj : employees) {
                Map<?, ?> employee = (Map<?, ?>) employeeObj;
                assert employee.containsKey("name") : "Employee should have 'name' key.";
                assert employee.containsKey("position") : "Employee should have 'position' key.";
                assert employee.containsKey("salary") : "Employee should have 'salary' key.";
            }
            
            // Check project structure
            for (Object projectObj : projects) {
                Map<?, ?> project = (Map<?, ?>) projectObj;
                assert project.containsKey("name") : "Project should have 'name' key.";
                assert project.containsKey("budget") : "Project should have 'budget' key.";
                assert project.containsKey("deadline") : "Project should have 'deadline' key.";
            }
        }
        
        assert employeeCount >= 4 : "Company should have at least 4 employees.";
        assert projectCount >= 4 : "Company should have at least 4 projects.";
        
        // Test total salary
        assert results[1] instanceof Double : "Second element should be a Double.";
        double totalSalary = (Double) results[1];
        assert totalSalary > 0 : "Total salary should be positive.";
        
        // Test high budget projects
        assert results[2] instanceof List : "Third element should be a List.";
        List<?> highBudgetProjects = (List<?>) results[2];
        
        // Check that all high budget projects have budget > threshold
        for (Object projectObj : highBudgetProjects) {
            Map<?, ?> project = (Map<?, ?>) projectObj;
            double budget = (Double) project.get("budget");
            assert budget >= 50000.0 : "High budget project should have budget >= 50000.0.";
        }
    }
} 