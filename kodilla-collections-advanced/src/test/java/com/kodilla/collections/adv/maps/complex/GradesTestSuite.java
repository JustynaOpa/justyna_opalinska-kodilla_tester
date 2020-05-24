package com.kodilla.collections.adv.maps.complex;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GradesTestSuite {

    @Test
    public void shouldReturnAverage(){
        Grades grades = new Grades(5.0, 3.5, 4.0, 4.5);
        double result = grades.getAverage();
        assertEquals(4.25, result);

    }
}
