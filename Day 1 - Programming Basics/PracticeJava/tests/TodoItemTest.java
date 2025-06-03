import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class TodoItemTest {
    @Test
    void overdue_and_toggle() {
        TodoItem t = new TodoItem("Finish report",
                LocalDate.now().minusDays(1));
        assertTrue(t.isOverdue(LocalDate.now()));
        t.toggleCompleted();
        assertTrue(t.isCompleted());
    }
} 