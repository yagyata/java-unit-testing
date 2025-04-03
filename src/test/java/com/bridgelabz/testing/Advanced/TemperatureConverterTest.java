package com.bridgelabz.testing.Advanced;

import com.bridgelabz.junit.Advanced.TemperatureConverter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemperatureConverterTest {

    @Test
    void celsiusToFahrenheitTest() {
        assertEquals(98.6, TemperatureConverter.celsiusToFahrenheit(37), 0.01);
    }

    @Test
    void fahrenheitToCelsiusTest() {
        assertEquals(37, TemperatureConverter.fahrenheitToCelsius(98.6), 0.01);
    }

}
