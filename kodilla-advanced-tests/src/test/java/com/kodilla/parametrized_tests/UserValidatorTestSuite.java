package com.kodilla.parametrized_tests;

import com.kodilla.parametrized_tests.homework.UserValidator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class UserValidatorTestSuite {
    private UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @ValueSource( strings = {"A2809", "Iva_12", "Bon22"})
    public void IsValidateUsernameIsCorrect(String username){
        assertTrue(userValidator.validateUsername(username));

    }
    @ParameterizedTest
    @ValueSource( strings = {"", "I", "B*"})
    public void IsValidateUsernameIsIncorrect(String username){
        assertFalse(userValidator.validateUsername(username));

    }
    @ParameterizedTest
    @ValueSource( strings = {"Eva12@poczta.pl", "Domi22_@poczta.com"})
    public void IsValidateEmailIsCorrect(String email){
        assertTrue(userValidator.validateEmail(email));

    }
    @ParameterizedTest
    @ValueSource( strings = {"Eva12@poczta", "Domi22_poczta.com"})
    public void IsValidateEmailIsIncorrect(String email) {
        assertFalse(userValidator.validateEmail(email));
    }

}
