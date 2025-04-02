package com.bridgelabz.testing;

import com.bridgelabz.junit.Calculator;
import com.bridgelabz.junit.StringUtils;
import org.junit.Test;

import static org.junit.Assert.*;

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
