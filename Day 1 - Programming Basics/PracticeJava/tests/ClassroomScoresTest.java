import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClassroomScoresTest {
    @Test
    void analyse_basic() {
        double[] r = ClassroomScores.analyse(new int[]{70, 80, 90});
        assertAll(
            () -> assertEquals(70, r[0], 0.001),
            () -> assertEquals(90, r[1], 0.001),
            () -> assertEquals(80, r[2], 0.001)
        );
    }
} 