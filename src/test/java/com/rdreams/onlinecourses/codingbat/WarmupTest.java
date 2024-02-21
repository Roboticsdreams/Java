package com.rdreams.onlinecourses.codingbat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WarmupTest {

    Warmup wup = new Warmup();

    @Test
    public void sleepInTest() {
        assertTrue(wup.sleepIn(false, false));
        assertFalse(wup.sleepIn(true, false));
        assertTrue(wup.sleepIn(false, true));
        assertTrue(wup.sleepIn(true, true));
    }

    @Test
    public void monkeyTroubleTest() {
        assertTrue(wup.monkeyTrouble(true, true));
        assertTrue(wup.monkeyTrouble(false, false));
        assertFalse(wup.monkeyTrouble(true, false));
        assertFalse(wup.monkeyTrouble(false, true));
    }

    @Test
    public void sumDoubleTest() {
        assertEquals(3, wup.sumDouble(1, 2));
        assertEquals(5, wup.sumDouble(3, 2));
        assertEquals(8, wup.sumDouble(2, 2));
        assertEquals(-1, wup.sumDouble(-1, 0));
        assertEquals(12, wup.sumDouble(3, 3));
        assertEquals(0, wup.sumDouble(0, 0));
        assertEquals(1, wup.sumDouble(0, 1));
        assertEquals(7, wup.sumDouble(3, 4));
    }

    @Test
    public void diff21Test() {
        assertEquals(2, wup.diff21(19));
        assertEquals(11, wup.diff21(10));
        assertEquals(0, wup.diff21(21));
        assertEquals(2, wup.diff21(22));
        assertEquals(8, wup.diff21(25));
        assertEquals(18, wup.diff21(30));
        assertEquals(21, wup.diff21(0));
        assertEquals(20, wup.diff21(1));
        assertEquals(19, wup.diff21(2));
        assertEquals(22, wup.diff21(-1));
        assertEquals(23, wup.diff21(-2));
        assertEquals(58, wup.diff21(50));
    }

    @Test
    public void max1020Test() {
        assertEquals(19, wup.max1020(11, 19));
        assertEquals(19, wup.max1020(19, 11));
        assertEquals(11, wup.max1020(11, 9));
        assertEquals(0, wup.max1020(0, 0));
        assertEquals(0, wup.max1020(9, 21));
        assertEquals(0, wup.max1020(21, 67));
        assertEquals(10, wup.max1020(10, 21));
        assertEquals(10, wup.max1020(21, 10));
        assertEquals(11, wup.max1020(9, 11));
        assertEquals(10, wup.max1020(23, 10));
        assertEquals(20, wup.max1020(20, 10));
        assertEquals(20, wup.max1020(7, 20));
        assertEquals(17, wup.max1020(17, 16));
    }
}
