import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SimpleCarTest {
    @Test
    void description_basic() {
        SimpleCar c = new SimpleCar("Tesla","Model 3",2024);
        assertEquals("2024 Tesla Model 3", c.description());
    }
} 