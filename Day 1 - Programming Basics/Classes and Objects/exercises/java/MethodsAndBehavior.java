/**
 * Exercise 3: Methods and Behavior
 * 
 * This exercise focuses on implementing methods that define object behavior.
 * 
 * Learning objectives:
 * - Understand how to define methods that modify object state
 * - Learn to implement methods that perform calculations based on object state
 * - Practice creating methods that return both primitive values and objects
 * 
 * Note: This exercise uses assertions. Run with the -ea flag:
 * java -ea MethodsAndBehavior
 */
public class MethodsAndBehavior {
    
    public static void main(String[] args) {
        System.out.println("Exercise 3: Methods and Behavior");
        
        try {
            // Test the BankAccount class
            testBankAccountClass();
            
            System.out.println("All tests passed! Your implementation is correct.");
        } catch (AssertionError e) {
            System.out.println("Test failed: " + e.getMessage());
        }
    }
    
    /**
     * Tests the BankAccount class implementation.
     */
    private static void testBankAccountClass() {
        // Test account creation
        BankAccount account1 = new BankAccount("John Doe", 1000.0, "Savings");
        assert account1.getAccountHolder().equals("John Doe") : "Account holder name should be 'John Doe'";
        assert account1.getBalance() == 1000.0 : "Initial balance should be 1000.0";
        assert account1.getAccountType().equals("Savings") : "Account type should be 'Savings'";
        
        // Test deposit method
        boolean depositResult = account1.deposit(500.0);
        assert depositResult : "Deposit should return true for a valid amount";
        assert account1.getBalance() == 1500.0 : "Balance should be 1500.0 after depositing 500.0";
        
        depositResult = account1.deposit(-100.0);
        assert !depositResult : "Deposit should return false for a negative amount";
        assert account1.getBalance() == 1500.0 : "Balance should remain unchanged after invalid deposit";
        
        // Test withdraw method
        boolean withdrawResult = account1.withdraw(300.0);
        assert withdrawResult : "Withdraw should return true if sufficient funds";
        assert account1.getBalance() == 1200.0 : "Balance should be 1200.0 after withdrawing 300.0";
        
        withdrawResult = account1.withdraw(-50.0);
        assert !withdrawResult : "Withdraw should return false for a negative amount";
        assert account1.getBalance() == 1200.0 : "Balance should remain unchanged after invalid withdrawal";
        
        withdrawResult = account1.withdraw(2000.0);
        assert !withdrawResult : "Withdraw should return false if insufficient funds";
        assert account1.getBalance() == 1200.0 : "Balance should remain unchanged if insufficient funds";
        
        // Test transfer method
        BankAccount account2 = new BankAccount("Jane Smith", 500.0, "Checking");
        
        boolean transferResult = account1.transfer(account2, 400.0);
        assert transferResult : "Transfer should return true if sufficient funds";
        assert account1.getBalance() == 800.0 : "Source account balance should be 800.0 after transfer";
        assert account2.getBalance() == 900.0 : "Target account balance should be 900.0 after transfer";
        
        transferResult = account1.transfer(account2, -100.0);
        assert !transferResult : "Transfer should return false for a negative amount";
        assert account1.getBalance() == 800.0 : "Source account should remain unchanged after invalid transfer";
        assert account2.getBalance() == 900.0 : "Target account should remain unchanged after invalid transfer";
        
        transferResult = account1.transfer(account2, 1000.0);
        assert !transferResult : "Transfer should return false if insufficient funds";
        assert account1.getBalance() == 800.0 : "Source account should remain unchanged if insufficient funds";
        assert account2.getBalance() == 900.0 : "Target account should remain unchanged if insufficient funds";
        
        transferResult = account1.transfer(null, 100.0);
        assert !transferResult : "Transfer should return false if target account is null";
        assert account1.getBalance() == 800.0 : "Balance should remain unchanged if target account is null";
        
        // Test getAccountSummary method
        String expectedSummary = "Account Holder: John Doe, Type: Savings, Balance: $800.00";
        assert account1.getAccountSummary().equals(expectedSummary) : "Account summary is incorrect";
        
        expectedSummary = "Account Holder: Jane Smith, Type: Checking, Balance: $900.00";
        assert account2.getAccountSummary().equals(expectedSummary) : "Account summary is incorrect";
    }
}

/**
 * Represents a bank account with basic banking operations.
 * 
 * TODO: Implement this class with the following:
 * - Fields for accountHolder (String), balance (double), and accountType (String)
 * - A constructor that initializes all fields
 * - Getter methods for all fields (no setters needed)
 * - deposit(double amount): Adds the amount to the balance if amount > 0, returns true if successful
 * - withdraw(double amount): Subtracts the amount from the balance if amount > 0 and balance is sufficient, returns true if successful
 * - transfer(BankAccount target, double amount): Transfers amount from this account to target if amount > 0 and balance is sufficient, returns true if successful
 * - getAccountSummary(): Returns a formatted summary string with account details in the format:
 *   "Account Holder: [name], Type: [type], Balance: $[balance formatted to 2 decimal places]"
 */
// TODO: Create the BankAccount class here 