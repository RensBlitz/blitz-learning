import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryCatalogueTest {
    @Test
    void addLookupRemove_cycle() {
        LibraryCatalogue lib = new LibraryCatalogue();
        lib.addBook("123","Dune");
        assertEquals("Dune", lib.lookup("123"));
        assertTrue( lib.removeBook("123"));
        assertNull( lib.lookup("123"));
    }
} 