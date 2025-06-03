import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BusSeatsTest {
    @Test
    void firstFree_basic() {
        boolean[] seats = new boolean[40];
        seats[0] = true; seats[1] = true; // occupied
        assertEquals(2, BusSeats.firstFree(seats));
    }
} 