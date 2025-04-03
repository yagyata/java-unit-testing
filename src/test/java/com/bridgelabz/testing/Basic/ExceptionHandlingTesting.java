package com.bridgelabz.testing.Basic;

import com.bridgelabz.junit.Basic.ExceptionHandling;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class ExceptionHandlingTesting {

    @Test
    public void divideTest() {
        assertEquals(5, ExceptionHandling.divide(20,4));
    }

    @Test
    public void testException() {
        assertThrows(ArithmeticException.class, () -> ExceptionHandling.divide(20,0));
    }


}
