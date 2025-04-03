package com.bridgelabz.junit.Basic;

public class StringUtils {
    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }

    public static boolean isPalindrome(String str) {
        String reverseStr = reverse(str);
        return str.equalsIgnoreCase(reverseStr);
    }

    public static String toUpperCase(String str) {
        return str.toUpperCase();
    }
}
