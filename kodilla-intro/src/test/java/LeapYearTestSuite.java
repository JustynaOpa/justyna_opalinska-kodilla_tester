import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
public class LeapYearTestSuite {

    @Test
    public void testLeapYear(){
        LeapYear leapYear = new LeapYear();
        boolean result = leapYear.leapYear(2020);
        boolean result1 = leapYear.leapYear(2019);
        assertTrue(result);
        assertFalse(result1);

    }
}
