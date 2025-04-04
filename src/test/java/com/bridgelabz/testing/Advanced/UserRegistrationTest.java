package com.bridgelabz.testing.Advanced;

import com.bridgelabz.junit.Advanced.UserRegistration;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserRegistrationTest {

    @Test
    void validUserRegistrationTest(){
        assertTrue(UserRegistration.registerUser("yagyata123", "yagyata_S@gmail.com", "passworD#234"));
    }

    @Test
    void invalidUsernameTest() {
        Exception e = assertThrows(IllegalArgumentException.class, () ->{
            UserRegistration.registerUser("Y@gyata", "yagyata1@gmail.com", "Password#123");
        });
        assertEquals("Invalid Username", e.getMessage());
    }

    @Test
    void invalidEmailTest() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> {
            UserRegistration.registerUser("yagyata_sharma", "yagyata.sharma.gmail.com", "Password@147");
        });
        assertEquals("Invalid Email", e.getMessage());
    }

    @Test
    void invalidPasswordTest() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> {
            UserRegistration.registerUser("yagyataSharma", "yagyata@gmail.com", "password");
        });
        assertEquals("Invalid Password", e.getMessage());
    }

    @Test
    void nullInputTest() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> {
            UserRegistration.registerUser(null, null, null);
        });
        assertEquals("Input cannot be null", e.getMessage());
    }

}
