package com.kodilla.parametrized_tests;

import com.kodilla.parametrized_tests.homework.UserValidator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserValidatorTestSuite {
    private UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @CsvSource()
    public void IsValidateUsernameIsCorrect(String username, String expected){
        assertEquals(expected, userValidator.validateUsername(username));

    }

}
