import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WeatherSensorTest {
    @Test
    void averageTemp_basic() {
        WeatherSensor w = new WeatherSensor();
        w.record(10); w.record(14); w.record(16);
        assertEquals(40/3.0, w.averageTemp(), 0.001);
    }
} 