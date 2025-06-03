import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PetTest {
    @Test
    void speak_dog() {
        assertEquals("Woof!", new Pet("Rex","dog",2).speak());
    }
    @Test
    void speak_unknown() {
        assertEquals("...", new Pet("Mystery","dragon",500).speak());
    }
} 