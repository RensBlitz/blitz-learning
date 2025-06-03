import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

class LeaderboardTest {
    @Test
    void topThree_basic() {
        List<Map<String,Object>> players = List.of(
            Map.of("name","A","points",90),
            Map.of("name","B","points",70),
            Map.of("name","C","points",80),
            Map.of("name","D","points",95)
        );
        List<String> top = Leaderboard.topThree(players);
        assertEquals("1. D (95)", top.get(0));
        assertEquals(3, top.size());
    }
} 