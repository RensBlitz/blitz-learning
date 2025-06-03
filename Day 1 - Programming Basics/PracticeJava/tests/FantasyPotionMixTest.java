import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FantasyPotionMixTest {
    @Test
    void ingredientVolumes_750ml() {
        int[] v = exercises.FantasyPotionMix.ingredientVolumes(750);
        assertArrayEquals(new int[]{225, 375, 150}, v);
    }
} 