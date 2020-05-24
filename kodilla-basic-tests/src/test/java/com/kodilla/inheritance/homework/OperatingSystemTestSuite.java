package com.kodilla.inheritance.homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OperatingSystemTestSuite {

    @Test
    public void shouldReturnYear(){
        OperatingSystem os = new OperatingSystem(2020);
        int result = os.getYear();
        assertEquals(2020, result);
    }
}
