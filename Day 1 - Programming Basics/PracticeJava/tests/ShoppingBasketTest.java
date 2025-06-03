import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class ShoppingBasketTest {
    @Test
    void join_basic() {
        assertEquals("milk, eggs, bread",
                ShoppingBasket.join(List.of("milk", "eggs", "bread")));
    }
} 