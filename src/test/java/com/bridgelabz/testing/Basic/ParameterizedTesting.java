package com.bridgelabz.testing.Basic;

import com.bridgelabz.junit.Basic.ParameterizedTests;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ParameterizedTesting {
    ParameterizedTests parameterized;
    @BeforeEach
    void setUp() {
        parameterized = new ParameterizedTests();
    }

    @ParameterizedTest
    @CsvSource({
            "2, true",
            "4, true",
            "9, false",
            "10, true"
    })
    public void isEvenTest(int number, boolean expected) {
        assertEquals(expected, parameterized.isEven(number));
    }
}
