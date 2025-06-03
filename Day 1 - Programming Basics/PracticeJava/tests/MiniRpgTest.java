import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MiniRpgTest {
    @Test
    void battle_simple() {
        MiniRpg.Character hero = new MiniRpg.Character("Hero", 10, 4);
        MiniRpg.Character monster = new MiniRpg.Character("Goblin", 8, 3);
        String winner = MiniRpg.battle(hero, monster);
        assertEquals("Hero", winner);
        assertTrue(hero.isAlive());
        assertFalse(monster.isAlive());
    }
} 