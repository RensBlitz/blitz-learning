import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VatCalculatorTest {
    @Test
    void addVat_basic() {
        assertEquals(121.0, VatCalculator.addVat(100.0, 21.0), 0.001);
    }
} 