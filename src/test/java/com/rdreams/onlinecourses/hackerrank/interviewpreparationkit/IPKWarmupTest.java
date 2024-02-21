package com.rdreams.onlinecourses.hackerrank.interviewpreparationkit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class IPKWarmupTest {
    IPKWarmup wm = new IPKWarmup();

    @Test
    public void sockMerchant_TestCase01() {
        int n = 1;
        int[] arr = new int[] { 1 };
        int actualOutput = wm.sockMerchant(n, arr);
        int expectedOutput = 0;
        assertEquals(actualOutput, expectedOutput);
    }

    @Test
    public void sockMerchant_TestCase02() {
        int n = 101;
        int[] arr = new int[] { 1 };
        int actualOutput = wm.sockMerchant(n, arr);
        int expectedOutput = 0;
        assertEquals(actualOutput, expectedOutput);
    }

    @Test
    public void sockMerchant_TestCase03() {
        int n = 10;
        int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int actualOutput = wm.sockMerchant(n, arr);
        int expectedOutput = 0;
        assertEquals(actualOutput, expectedOutput);
    }

    @Test
    public void sockMerchant_TestCase04() {
        int n = 8;
        int[] arr = new int[] { 1, 1, 1, 1, 1, 1, 1, 1 };
        int actualOutput = wm.sockMerchant(n, arr);
        int expectedOutput = 4;
        assertEquals(actualOutput, expectedOutput);
    }

    @Test
    public void sockMerchant_TestCase05() {
        int n = 10;
        int[] arr = new int[] { 10, 20, 20, 10, 10, 30, 50, 10, 20, 20 };
        int actualOutput = wm.sockMerchant(n, arr);
        int expectedOutput = 4;
        assertEquals(actualOutput, expectedOutput);
    }

    @Test
    public void countingValleys_TestCase01() {
        int n = 2;
        String str = "UB";
        int actualOutput = wm.countingValleys(n, str);
        int expectedOutput = 0;
        assertEquals(actualOutput, expectedOutput);
    }

    @Test
    public void countingValleys_TestCase02() {
        int n = 8;
        String str = "UDUDUD";
        int actualOutput = wm.countingValleys(n, str);
        int expectedOutput = 0;
        assertEquals(actualOutput, expectedOutput);
    }

    @Test
    public void countingValleys_TestCase03() {
        int n = 8;
        String str = "UUUUDDDD";
        int actualOutput = wm.countingValleys(n, str);
        int expectedOutput = 0;
        assertEquals(actualOutput, expectedOutput);
    }

    @Test
    public void countingValleys_TestCase04() {
        int n = 8;
        String str = "UDDDUDUUU";
        int actualOutput = wm.countingValleys(n, str);
        int expectedOutput = 1;
        assertEquals(actualOutput, expectedOutput);
    }

    @Test
    public void countingValleys_TestCase05() {
        int n = 12;
        String str = "DDUUDDUDUUUD";
        int actualOutput = wm.countingValleys(n, str);
        int expectedOutput = 2;
        assertEquals(actualOutput, expectedOutput);
    }

    @Test
    public void jumpingOnClouds_TestCase01() {
        int[] arr = new int[] { 0 };
        int actualOutput = wm.jumpingOnClouds(arr);
        int expectedOutput = 1;
        assertEquals(actualOutput, expectedOutput);
    }

    @Test
    public void jumpingOnClouds_TestCase02() {
        int[] arr = new int[] { 0, 0, 0, 1, 1, 1 };
        int actualOutput = wm.jumpingOnClouds(arr);
        int expectedOutput = 3;
        assertEquals(actualOutput, expectedOutput);
    }

    @Test
    public void jumpingOnClouds_TestCase03() {
        int[] arr = new int[] { 0, 0, 0, 0, 0, 0 };
        int actualOutput = wm.jumpingOnClouds(arr);
        int expectedOutput = 3;
        assertEquals(actualOutput, expectedOutput);
    }

    @Test
    public void jumpingOnClouds_TestCase04() {
        int[] arr = new int[] { 0, 0, 1, 0, 0, 1, 0 };
        int actualOutput = wm.jumpingOnClouds(arr);
        int expectedOutput = 4;
        assertEquals(actualOutput, expectedOutput);
    }

    @Test
    public void jumpingOnClouds_TestCase05() {
        int[] arr = new int[] { 0, 0, 0, 0, 1, 0 };
        int actualOutput = wm.jumpingOnClouds(arr);
        int expectedOutput = 3;
        assertEquals(actualOutput, expectedOutput);
    }

    @Test
    public void repeatedString_TestCase01() {
        long n = 10L;
        String s = "bcb";
        long actualOutput = wm.repeatedString(s, n);
        long expectedOutput = 0L;
        assertEquals(actualOutput, expectedOutput);
    }

    @Test
    public void repeatedString_TestCase02() {
        long n = 10L;
        String s = "abcdef";
        long actualOutput = wm.repeatedString(s, n);
        long expectedOutput = 2L;
        assertEquals(actualOutput, expectedOutput);
    }

    @Test
    public void repeatedString_TestCase03() {
        long n = 2L;
        String s = "bcda";
        long actualOutput = wm.repeatedString(s, n);
        long expectedOutput = 0L;
        assertEquals(actualOutput, expectedOutput);
    }

    @Test
    public void repeatedString_TestCase04() {
        long n = 10L;
        String s = "aba";
        long actualOutput = wm.repeatedString(s, n);
        long expectedOutput = 7L;
        assertEquals(actualOutput, expectedOutput);
    }

    @Test
    public void repeatedString_TestCase05() {
        long n = 1000000000000L;
        String s = "a";
        long actualOutput = wm.repeatedString(s, n);
        long expectedOutput = 1000000000000L;
        assertEquals(actualOutput, expectedOutput);
    }
}
