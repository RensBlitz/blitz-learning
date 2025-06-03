import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TemperatureSpreadTest {
    @Test
    void spreadAndAverage_basic() {
        double[] result = TemperatureSpread.spreadAndAverage(18.0, 10.0);
        assertAll(
            () -> assertEquals(8.0, result[0], 0.001),
            () -> assertEquals(14.0, result[1], 0.001)
        );
    }
} 