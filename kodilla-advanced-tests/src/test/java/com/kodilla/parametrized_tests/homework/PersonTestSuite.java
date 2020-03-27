package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTestSuite {


    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.PersonsBMIValue#provideValueForTesting")
    public void shouldCalculateBMI(double input, String expected){

        List<String> result = PersonsBMIValue.provideValueForTesting()
                .map(u->u.toString())
                .collect(Collectors.toList());
        System.out.println(result);



        assertEquals(result, expected);
    }
}
