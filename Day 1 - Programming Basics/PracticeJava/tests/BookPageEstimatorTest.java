
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BookPageEstimatorTest {
    @Test
    void estimatePages_ninetyMinutes() {
        assertEquals(60.0, BookPageEstimator.estimatePages(40, 90), 0.001);
    }
} 