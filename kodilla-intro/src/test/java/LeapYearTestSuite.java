import org.junit.Test;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.*;

public class LeapYearTestSuite {

    LeapYear year = new LeapYear();

    @Test
    public void testLeapYear(){

        boolean result = year.leapYear(2020);
        boolean result1 = year.leapYear(2019);
        assertTrue(result);
        assertFalse(result1);

    }
    @ParameterizedTest
    @ValueSource(ints = {2020, 2016, 2012, 2008, 2004, 2000, 1996, 0, 4, 16})
    public void shouldReturnTrueForLeapYears(int years){
        boolean result = year.leapYear(years);
        assertTrue(result);

    }
    @ParameterizedTest
    @ValueSource(ints ={2019, 2, -3, -11, 99, 5, 2541, 18, 2017})
    public void shouldReturnFalseForLeapYears(int number){
        boolean result1 = year.leapYear(number);
        assertFalse(result1);
    }
}
