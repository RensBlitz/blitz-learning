import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class CinemaRowRearrangeTest {
    @Test
    void rearrange_basic() {
        List<Integer> out = CinemaRowRearrange.rearrange(List.of(20,15,30,12));
        assertEquals(List.of(15,12,20,30), out);
    }
} 