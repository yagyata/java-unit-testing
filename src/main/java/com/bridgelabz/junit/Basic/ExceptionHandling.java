package com.bridgelabz.junit.Basic;

public class ExceptionHandling {
    public static int divide(int a, int b) {
        if(b==0) {
            throw new ArithmeticException("Can't be divided by zero.");
        }
        return a/b;
    }
}
