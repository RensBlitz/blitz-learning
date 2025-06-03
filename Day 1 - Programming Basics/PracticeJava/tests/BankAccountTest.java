import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    @Test
    void depositWithdraw_flow() {
        BankAccount acc = new BankAccount("Rens",100);
        assertTrue(acc.deposit(50));
        assertFalse(acc.withdraw(200));
        assertTrue(acc.withdraw(120));
        assertEquals(30, acc.getBalance(), 0.001);
    }
} 