import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SimpleDungeonCrawlerTest {
    @Test
    void simulate_basic() {
        String[] a = {"hit", "potion", "hit", "hit"};
        assertEquals(4, SimpleDungeonCrawler.simulate(a));
    }
} 