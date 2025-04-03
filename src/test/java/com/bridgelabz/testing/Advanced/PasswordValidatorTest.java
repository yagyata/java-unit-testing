package com.bridgelabz.testing.Advanced;

import com.bridgelabz.junit.Advanced.PasswordValidator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PasswordValidatorTest {

    @Test
    void shouldValidatePassword(){
        assertEquals(true, PasswordValidator.validatePassword("Yagyata123"));
    }
}
