import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankFeeSimulatorTest {
    @Test
    void fee_percentHigher() {
        // 1000 * 2% = 20 > min 5
        assertEquals(980.0, BankFeeSimulator.applyMonthlyFee(1000, 2, 5), 0.001);
    }
    @Test
    void fee_minHigher() {
        // 100 * 2% = 2 < 5
        assertEquals(95.0, BankFeeSimulator.applyMonthlyFee(100, 2, 5), 0.001);
    }
} 