package com.bridgelabz.testing;

import com.bridgelabz.junit.ExceptionHandling;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExceptionHandlingTesting {

    @Test
    public void divideTest() {
        assertEquals(5, ExceptionHandling.divide(20,4));
    }

    @Test(expected = ArithmeticException.class)
    public void divideByZeroTest() {
        ExceptionHandling.divide(20,0);
    }
}
