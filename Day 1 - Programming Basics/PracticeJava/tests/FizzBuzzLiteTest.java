import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzLiteTest {
    @Test
    void generate_correctSequence() {
        List<String> seq = FizzBuzzLite.generate();
        assertEquals(20, seq.size());
        assertEquals("Fizz", seq.get(2));   // 3  Fizz
        assertEquals("4",    seq.get(3));
        assertEquals("Fizz", seq.get(5));   // 6
    }
} 