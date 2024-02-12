package com.rdreams.onlinecourses.codingninjas.datastructureandalgo.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinearSearchTest {
    LinearSearch obj = new LinearSearch();

    @Test
    public void  getIndexFromLinearSearch_TestCase01() {
        int[] arr = new int[] {6,7,8,4,1};
        int n = arr.length;
        int num = 4;
        int actualOutput = obj.getIndexFromLinearSearch(arr,num,n);
        int expectedOutput = 3;
        assertEquals(actualOutput,expectedOutput);
    }

    @Test
    public void  getIndexFromLinearSearch_TestCase02() {
        int[] arr = new int[] {6,7,8,4,1};
        int n = arr.length;
        int num = 9;
        int actualOutput = obj.getIndexFromLinearSearch(arr,num,n);
        int expectedOutput = -1;
        assertEquals(actualOutput,expectedOutput);
    }
}
