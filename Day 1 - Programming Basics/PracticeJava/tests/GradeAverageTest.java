import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GradeAverageTest {
    @Test void average_basic(){
        assertEquals(75.0, GradeAverage.average(new int[]{60,90}), 0.001);
    }
    @Test void average_empty(){
        assertEquals(-1.0, GradeAverage.average(new int[]{}), 0.001);
    }
} 