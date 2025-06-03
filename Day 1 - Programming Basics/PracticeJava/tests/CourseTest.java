import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CourseTest {
    @Test
    void enrolDrop_flow() {
        Course c = new Course("Java 101");
        assertTrue(c.enrol("Alice"));
        assertFalse(c.enrol("Alice"));   // already enrolled
        assertEquals(1, c.getEnrolmentCount());
        assertTrue(c.drop("Alice"));
        assertEquals(0, c.getEnrolmentCount());
    }
} 