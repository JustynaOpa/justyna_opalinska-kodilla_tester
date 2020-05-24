import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoopsTestSuite {

    @Test
    public void testSuma() {
        Loops loops = new Loops();
        int[] values = new int[]{2, 5, 8, 12, 41, 22, 18, 5};
        int expected = values.length;
        int result = loops.Suma(values);
        assertEquals(expected, result);
    }
}
