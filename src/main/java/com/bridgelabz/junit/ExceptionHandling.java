package com.bridgelabz.junit;

public class ExceptionHandling {
    public static int divide(int a, int b) {
        if(b==0) {
            throw new ArithmeticException("Can't be divided by zero.");
        }
        return a/b;
    }
}
