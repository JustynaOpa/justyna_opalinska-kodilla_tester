package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class GamblingMachineTestSuite {
    private GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/usersNumbers.csv", numLinesToSkip = 1)
    public void isValidateNumberIsCorrect(String string) throws InvalidNumbersException {
        String[] table = string.split(" ");

        Set<Integer> data = new HashSet<>();

        for (String number : table) {
            data.add(Integer.parseInt(number));
        }

        int count = gamblingMachine.howManyWins(data);
        boolean result = count >= 0 && count <= 6;
        assertTrue(result);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/usersNumbersFalse.csv", numLinesToSkip = 1)
    public void isValidateNumberIsNotCorrect(String string) throws InvalidNumbersException {
        String[] table = string.split(" ");

        Set<Integer> wrongData = new HashSet<>();

        for (String number : table) {
            wrongData.add(Integer.parseInt(number));
        }

        try {
            int count = gamblingMachine.howManyWins(wrongData);
            
        } catch (InvalidNumbersException e) {
            assertEquals("Wrong numbers provided", e.getMessage());
        }

    }

}
