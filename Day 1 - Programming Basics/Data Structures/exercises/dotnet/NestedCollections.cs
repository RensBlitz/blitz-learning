using System.Collections.Generic;

namespace DataStructures.Exercises;

/// <summary>
/// Exercise 7: Nested Collections
///
/// This exercise focuses on working with more complex data structures by
/// nesting collections inside other collections. Nested collections are
/// essential for representing hierarchical or multi-dimensional data.
///
/// Learning objectives:
/// - Create and manipulate nested collections (lists of lists, dictionaries of lists, etc.)
/// - Understand appropriate use cases for nested data structures
/// - Access and modify elements in nested collections
/// - Iterate through multi-level collections
/// - Convert between different nested collection types
///
/// Note: This exercise uses xUnit tests for validation.
/// Run 'dotnet test' to check your implementation.
/// </summary>
public class NestedCollections
{
    /// <summary>
    /// This method demonstrates working with a list of lists (2D list).
    /// TODO: Implement the following:
    /// 1. Create a 3x3 matrix represented as a list of lists
    ///    with the following values:
    ///    [[1, 2, 3],
    ///     [4, 5, 6],
    ///     [7, 8, 9]]
    /// 2. Extract the middle row (second row)
    /// 3. Extract the diagonal elements [1, 5, 9]
    /// </summary>
    /// <returns>An array containing [matrix, middleRow, diagonal]</returns>
    public static object[] CreateNestedLists()
    {
        // TODO: Implement your solution here
        
        // 1. Create a 3x3 matrix as a list of lists
        List<List<int>> matrix = null!; // Replace with your implementation
        
        // 2. Extract the middle row
        List<int> middleRow = null!; // Replace with your implementation
        
        // 3. Extract the diagonal elements
        List<int> diagonal = null!; // Replace with your implementation
        
        return new object[] { matrix, middleRow, diagonal };
    }

    /// <summary>
    /// This method demonstrates working with a dictionary containing lists as values.
    /// TODO: Implement the following:
    /// 1. Create a dictionary where keys are department names and values are lists of employees
    /// 2. Add the following departments and employees:
    ///    - "Engineering": ["Alice", "Bob", "Charlie"]
    ///    - "Marketing": ["David", "Eve"]
    ///    - "HR": ["Frank"]
    /// 3. Add a new employee "Grace" to the "Marketing" department
    /// 4. Get all employees from "Engineering"
    /// 5. Count the total number of employees across all departments
    /// </summary>
    /// <returns>An array containing [departmentDictionary, engineeringTeam, totalEmployees]</returns>
    public static object[] CreateDictionaryOfLists()
    {
        // TODO: Implement your solution here
        
        // 1 & 2. Create a dictionary with lists of employees
        Dictionary<string, List<string>> departmentDictionary = null!; // Replace with your implementation
        
        // 3. Add a new employee to Marketing
        // Your code here
        
        // 4. Get all employees from Engineering
        List<string> engineeringTeam = null!; // Replace with your implementation
        
        // 5. Count total employees
        int totalEmployees = 0; // Replace with your implementation
        
        return new object[] { departmentDictionary, engineeringTeam, totalEmployees };
    }

    /// <summary>
    /// This method demonstrates working with a list of dictionaries.
    /// TODO: Implement the following:
    /// 1. Create a list of 3 person records, where each person is a dictionary
    ///    with the following keys: "name", "age", "city"
    /// 2. Add the following people:
    ///    - {"name": "Alice", "age": 25, "city": "New York"}
    ///    - {"name": "Bob", "age": 30, "city": "San Francisco"}
    ///    - {"name": "Charlie", "age": 22, "city": "New York"}
    /// 3. Find all people who live in "New York"
    /// 4. Calculate the average age of all people
    /// </summary>
    /// <returns>An array containing [people, newYorkers, averageAge]</returns>
    public static object[] CreateListOfDictionaries()
    {
        // TODO: Implement your solution here
        
        // 1 & 2. Create a list of person dictionaries
        List<Dictionary<string, object>> people = null!; // Replace with your implementation
        
        // 3. Find all people from New York
        List<Dictionary<string, object>> newYorkers = null!; // Replace with your implementation
        
        // 4. Calculate average age
        double averageAge = 0.0; // Replace with your implementation
        
        return new object[] { people, newYorkers, averageAge };
    }

    /// <summary>
    /// This method demonstrates working with nested dictionaries (a dictionary of dictionaries).
    /// TODO: Implement the following:
    /// 1. Create a nested dictionary representing a simple book inventory system
    ///    where the outer key is the genre, the inner key is the book title,
    ///    and the inner value is a dictionary with book details:
    ///    {"author": authorName, "year": publicationYear, "price": price}
    /// 2. Add the following books:
    ///    - "Fiction" -> "The Great Gatsby" -> {"author": "F. Scott Fitzgerald", "year": 1925, "price": 15.99}
    ///    - "Fiction" -> "1984" -> {"author": "George Orwell", "year": 1949, "price": 12.99}
    ///    - "Non-Fiction" -> "Sapiens" -> {"author": "Yuval Noah Harari", "year": 2011, "price": 18.99}
    /// 3. Get the details for "1984"
    /// 4. Get all fiction book titles
    /// 5. Calculate the total price of all books
    /// </summary>
    /// <returns>An array containing [bookInventory, book1984Details, fictionBooks, totalPrice]</returns>
    public static object[] CreateNestedDictionaries()
    {
        // TODO: Implement your solution here
        
        // 1 & 2. Create a nested dictionary of book inventory
        Dictionary<string, Dictionary<string, Dictionary<string, object>>> bookInventory = null!; // Replace with your implementation
        
        // 3. Get details for "1984"
        Dictionary<string, object> book1984Details = null!; // Replace with your implementation
        
        // 4. Get all fiction book titles
        List<string> fictionBooks = null!; // Replace with your implementation
        
        // 5. Calculate total price of all books
        double totalPrice = 0.0; // Replace with your implementation
        
        return new object[] { bookInventory, book1984Details, fictionBooks, totalPrice };
    }

    /// <summary>
    /// This method creates a complex data structure to represent a simple organization.
    /// TODO: Implement the following:
    /// 1. Create a representation of a company with departments, employees, and projects
    /// 2. The structure should be a dictionary where:
    ///    - Keys are department names (strings)
    ///    - Values are dictionaries with:
    ///      - "employees" -> list of employee dictionaries with "name", "position", and "salary"
    ///      - "projects" -> list of project dictionaries with "name", "budget", and "deadline"
    /// 3. Add at least 2 departments with 2+ employees each and 2+ projects each
    /// 4. Calculate the total salary budget for the entire company
    /// 5. Find all projects with a budget over a given threshold
    /// </summary>
    /// <param name="budgetThreshold">The minimum budget to include in high-budget projects</param>
    /// <returns>An array containing [companyStructure, totalSalary, highBudgetProjects]</returns>
    public static object[] CreateCompanyStructure(double budgetThreshold)
    {
        // TODO: Implement your solution here
        
        // 1 & 2 & 3. Create the company structure
        Dictionary<string, Dictionary<string, object>> companyStructure = null!; // Replace with your implementation
        
        // 4. Calculate total salary
        double totalSalary = 0.0; // Replace with your implementation
        
        // 5. Find high-budget projects
        List<Dictionary<string, object>> highBudgetProjects = null!; // Replace with your implementation
        
        return new object[] { companyStructure, totalSalary, highBudgetProjects };
    }
} 