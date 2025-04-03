package com.bridgelabz.testing.Advanced;

import static org.junit.jupiter.api.Assertions.*;

import com.bridgelabz.junit.Advanced.DateFormatter;
import org.junit.jupiter.api.*;

import java.text.ParseException;

public class DateFormatterTest {
    DateFormatter dateFormatter;
    @BeforeEach
    void setUp() {
        dateFormatter = new DateFormatter();
    }
    @Test
    public void testValidFormatDate() throws ParseException {
        assertEquals("07-08-2023", dateFormatter.formatDate("2023-08-07"));
        assertEquals("11-11-2022", dateFormatter.formatDate("2022-11-11"));
    }

    @Test
    public void testInvalidDate() {
        assertThrows(IllegalArgumentException.class, () -> dateFormatter.formatDate("12-14-2023"), "Invalid Date");
    }

    @Test
    public void testInvalidDateFormat() {
        assertThrows(IllegalArgumentException.class, () -> dateFormatter.formatDate("12/02/2002"),"Invalid date format");
    }
}