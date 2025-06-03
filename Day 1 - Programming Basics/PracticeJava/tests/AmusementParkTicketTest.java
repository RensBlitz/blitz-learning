import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AmusementParkTicketTest {
    @Test void childFree()  { assertEquals(0.0, AmusementParkTicket.computePrice(10, 25)); }
    @Test void adultPays()  { assertEquals(25.0, AmusementParkTicket.computePrice(30, 25)); }
    @Test void seniorFree() { assertEquals(0.0, AmusementParkTicket.computePrice(70, 25)); }
} 