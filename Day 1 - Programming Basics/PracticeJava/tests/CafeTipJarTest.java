import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CafeTipJarTest {
    @Test
    void totalWithTip_standardCase() {
        double result = exercises.CafeTipJar.totalWithTip(18.0, 12.0);
        assertEquals(20.16, result, 0.001);
    }
} 