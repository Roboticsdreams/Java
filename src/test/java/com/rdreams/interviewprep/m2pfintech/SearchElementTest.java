package com.rdreams.interviewprep.m2pfintech;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchElementTest {
    SearchElement obj = new SearchElement();
    int[] array = { 1,3,5,2,4,6,8,7,9};

    @Test
    public void unsortedSearch1_TestCase01() {
        boolean actualOutput = obj.unsortedSearch1(array, 5);
        boolean expectedOutput = true;
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void unsortedSearch1_TestCase02() {
        boolean actualOutput = obj.unsortedSearch1(array, 10);
        boolean expectedOutput = false;
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void unsortedSearch2_TestCase01() {
        boolean actualOutput = obj.unsortedSearch2(array, 5);
        boolean expectedOutput = true;
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void unsortedSearch2_TestCase02() {
        boolean actualOutput = obj.unsortedSearch2(array, 10);
        boolean expectedOutput = false;
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void unsortedSearch3_TestCase01() {
        boolean actualOutput = obj.unsortedSearch3(array, 5);
        boolean expectedOutput = true;
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void unsortedSearch3_TestCase02() {
        boolean actualOutput = obj.unsortedSearch3(array, 10);
        boolean expectedOutput = false;
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void unsortedSearch4_TestCase01() {
        int actualOutput = obj.unsortedSearch4(array, 5);
        int expectedOutput = 5;
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void unsortedSearch4_TestCase02() {
        int actualOutput = obj.unsortedSearch4(array, 10);
        int expectedOutput = -1;
        assertEquals(expectedOutput, actualOutput);
    }
}
