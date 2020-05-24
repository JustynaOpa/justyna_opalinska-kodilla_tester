package com.kodilla.inheritance;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTestSuite {

    @Test
    public void shouldReturnNumberOfSeatsAndNumbersOfWheels(){
        Car car = new Car(4,5);
        int result = car.getSeats();
        int result2 = car.getWheels();
        assertEquals(5, result);
        assertEquals(4, result2);
    }
}
