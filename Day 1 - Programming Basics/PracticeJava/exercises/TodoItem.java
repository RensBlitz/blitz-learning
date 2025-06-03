import java.time.LocalDate;

public class TodoItem {
    private final String title;
    private final LocalDate dueDate;
    private boolean completed;

    public TodoItem(String title, LocalDate dueDate) {
        // TODO
        throw new UnsupportedOperationException("Not yet implemented");
    }
    public void toggleCompleted() {
        // TODO
        throw new UnsupportedOperationException("Not yet implemented");
    }
    public boolean isCompleted() { return completed; }

    public boolean isOverdue(LocalDate now) {
        // TODO
        throw new UnsupportedOperationException("Not yet implemented");
    }
} 