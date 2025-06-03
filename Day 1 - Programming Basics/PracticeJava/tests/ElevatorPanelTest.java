import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ElevatorPanelTest {
    @Test void negativeInvalid(){ assertFalse(ElevatorPanel.isValidFloor(-1)); }
    @Test void zeroValid()     { assertTrue (ElevatorPanel.isValidFloor(0)); }
    @Test void outOfRange()    { assertFalse(ElevatorPanel.isValidFloor(21)); }
} 