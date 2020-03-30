package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonsBMIValue {


    public static Stream<Arguments> provideValueForTesting(){
        return Stream.of(
                Arguments.of(1.68, 38, "Very severely underweight"),
                Arguments.of(1.55, 60, "Normal (healthy weight)"),
                Arguments.of(1.78, 138, "Obese Class III (Very severely obese)"),
                Arguments.of(1.80, 102, "Obese Class I (Moderately obese)"),
                Arguments.of(1.50, 40, "Underweight")
        );
    }
}
