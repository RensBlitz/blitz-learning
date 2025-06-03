import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HelloHeroTest {
    @Test void greet_basic(){ assertEquals("Welcome, Alex!", HelloHero.greet("Alex")); }
} 