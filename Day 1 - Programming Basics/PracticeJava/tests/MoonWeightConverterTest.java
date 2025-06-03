import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MoonWeightConverterTest {
    @Test
    void toMoonWeight_example() {
        assertEquals(9.9, MoonWeightConverter.toMoonWeight(60), 0.001);
    }
} 