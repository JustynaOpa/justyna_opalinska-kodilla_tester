package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Set;

public class GamblingMachineTestSuite {
    private GamblingMachine gamblingMachine = new GamblingMachine();




    //@ParameterizedTest
    //@CsvFileSource(resources = "/numbersWithValidateNumbers.csv", numLinesToSkip = 1)
    //public void IsValidateNumberIsCorrect(Set<Integer> numbers){
     // assertFalse(gamblingMachine.validateNumbers(numbers));

    //}
    //@ParameterizedTest
    //@CsvFileSource(resources = "/trueNumbersWithValidateNumbers.csv", numLinesToSkip = 1)
    //public void IsValidateNumberIsCorrect(Set<Integer> numbers){
      //  assertTrue(gamblingMachine.validateNumbers(numbers));

    //}

}
