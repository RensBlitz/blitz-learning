import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Map;

class VowelCounterTest {
    @Test
    void count_basic() {
        Map<Character,Integer> m = VowelCounter.count("Hello World");
        assertEquals(1, m.get('e'));
        assertEquals(1, m.get('o'));
    }
} 