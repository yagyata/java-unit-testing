package com.bridgelabz.testing.Basic;

import com.bridgelabz.junit.Basic.StringUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringUtilsTesting {
    @Test
    public void reverseTest() {
        assertEquals("olleh", StringUtils.reverse("hello"));
    }

    @Test
    public void isPalindromeTest() {
        assertEquals(true, StringUtils.isPalindrome("racecar"));
    }

    @Test
    public void toUpperCaseTest() {
        assertEquals("YAGYATA", StringUtils.toUpperCase("yagyata"));
    }
}
