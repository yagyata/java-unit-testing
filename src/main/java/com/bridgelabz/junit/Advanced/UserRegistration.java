package com.bridgelabz.junit.Advanced;

public class UserRegistration {
    public static boolean registerUser(String userName, String email, String password) {
        String userNameRegex = "^[A-Za-z]+[a-zA-Z0-9_]{5,15}$";
        String emailRegex = "^[a-zA-Z0-9]+([._*%+-]?[a-zA-Z0-9]+)*@[a-zA-Z0-9-]+\\.[a-zA-Z]{2,}$";
        String passwordRegex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$!%*?&])[A-Za-z\\d@$#!%*?&]{8,}$";

        if(userName == null || email == null || password == null){
            throw new IllegalArgumentException("Input cannot be null");
        }

        if(!userName.matches(userNameRegex)) {
            throw new IllegalArgumentException("Invalid Username");
        }

        if(!email.matches(emailRegex)) {
            throw new IllegalArgumentException("Invalid Email");
        }

        if(!password.matches(passwordRegex)) {
            throw new IllegalArgumentException("Invalid Password");
        }

        return true;
    }
}
