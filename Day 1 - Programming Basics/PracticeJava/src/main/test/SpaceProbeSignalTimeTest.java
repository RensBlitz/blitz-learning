import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SpaceProbeSignalTimeTest {
    @Test
    void roundTripSeconds_moonDistance() {
        double expected = 768_800.0 / 299_792.0;   // ≈ 2.565 s
        assertEquals(expected, SpaceProbeSignalTime.roundTripSeconds(384_400.0), 0.0001);
    }
} 