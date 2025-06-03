import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TinyEncryptionTest {
    @Test
    void shiftCipher_simple() {
        assertEquals("Uifsf", TinyEncryption.shiftCipher("There", 1));
    }
} 