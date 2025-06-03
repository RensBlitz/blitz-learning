import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EvenOddGameTest {
    @Test void classify_even() { assertEquals("wizard", EvenOddGame.classify(4)); }
    @Test void classify_odd()  { assertEquals("orc",    EvenOddGame.classify(7)); }
} 