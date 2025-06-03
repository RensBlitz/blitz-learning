import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RainStreakCounterTest {
    @Test
    void longestStreak_sampleWeek() {
        boolean[] week = {true,true,false,true,true,true,false};
        assertEquals(3, RainStreakCounter.longestStreak(week));
    }
} 