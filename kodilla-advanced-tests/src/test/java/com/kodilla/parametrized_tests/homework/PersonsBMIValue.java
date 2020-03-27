package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonsBMIValue {

    public static Stream<Arguments> provideValueForTesting(){
        return Stream.of(
                Arguments.of(new Person(1.68, 38), 13.5),
                Arguments.of(new Person(1.55, 60), 25.0),
                Arguments.of(new Person(1.78, 138), 43.6),
                Arguments.of(new Person(1.80, 102), 31.5),
                Arguments.of(new Person(1.50, 40), 17.8)
        );
    }
}
