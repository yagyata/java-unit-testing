package com.bridgelabz.testing;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class ParameterizedTesting {
    @ParameterizedTest
    @ValueSource(ints = {2,4,6,7,9})
    void isEvenTest(int num) {
        assertTrue(num % 2 == 0 || num % 2 ==1);
    }
}
