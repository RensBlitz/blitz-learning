import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PizzaPlannerTest {
    @Test
    void pizzasNeeded_example() {
        assertEquals(3, PizzaPlanner.pizzasNeeded(7, 3)); // 21 slices  3 pizzas
    }
} 