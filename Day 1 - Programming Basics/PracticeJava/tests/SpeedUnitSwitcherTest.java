import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SpeedUnitSwitcherTest {
    @Test void kmhToMps(){ assertEquals(10.0, SpeedUnitSwitcher.kmhToMps(36.0), 0.001); }
    @Test void mpsToKmh(){ assertEquals(36.0, SpeedUnitSwitcher.mpsToKmh(10.0), 0.001); }
} 