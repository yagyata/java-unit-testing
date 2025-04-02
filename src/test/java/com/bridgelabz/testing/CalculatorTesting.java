package com.bridgelabz.testing;

import com.bridgelabz.junit.Calculator;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTesting {

    //test method for add
    @Test
    public void addTest() {
        int result = Calculator.add(15, 32);
        int expected = 47;
        assertEquals(expected,result);
        assertEquals(22,Calculator.add(17,5));
    }

    //test method for subtract
    @Test
    public void subtractTest() {
        int result = Calculator.subtract(24,7);
        int expected = 17;
        assertEquals(expected, result);
    }

    //test method for multiply
    @Test
    public void multiplyTest() {
        int result = Calculator.multiply(7, 8);
        int expected = 56;
        assertEquals(expected, result);
    }

    //test method for divide
    @Test
    public void divideTest() {
        double result = Calculator.divide(21, 3);
        double expected = 7;
        assertEquals(expected, result, 0.0001);
    }

    @Test(expected = ArithmeticException.class)
    public void divideByZeroTest() {
        Calculator.divide(1, 0);
    }

}
