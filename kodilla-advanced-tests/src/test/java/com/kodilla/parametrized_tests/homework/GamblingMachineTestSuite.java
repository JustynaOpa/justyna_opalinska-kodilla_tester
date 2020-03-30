package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class GamblingMachineTestSuite {
    private GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/usersNumbers.csv", numLinesToSkip = 1)
    public void IsValidateNumberIsCorrect(Set<Integer> numbers, double expected) throws InvalidNumbersException{
       assertEquals(6,gamblingMachine.howManyWins(numbers));

    }
    @ParameterizedTest
    @CsvFileSource(resources = "/usersNumbersFalse.csv", numLinesToSkip = 1)
    public void IsValidateNumberIsIncorrect(Set<Integer> numbers, double expected) throws InvalidNumbersException{
        assertEquals(expected,gamblingMachine.howManyWins(numbers));

    }
//4 metody - prawdziwe 6cyfr - mniejsze od 1- puste -

}
