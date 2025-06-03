import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PlantWateringScheduleTest {
    @Test void mondayTrue() { assertTrue( PlantWateringSchedule.shouldWater("Monday") ); }
    @Test void fridayFalse(){ assertFalse(PlantWateringSchedule.shouldWater("Friday")); }
} 