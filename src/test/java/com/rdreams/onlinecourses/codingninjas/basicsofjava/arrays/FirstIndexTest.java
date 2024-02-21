package com.rdreams.onlinecourses.codingninjas.basicsofjava.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstIndexTest {
    FirstIndex obj = new FirstIndex();

    @Test
    public void getFirstIndex_TestCase01() {
        int[] nums= new int[] {7,5,3,11,3,43,1,1};
        int target = 3;
        int actualOutput = obj.getFirstIndex(nums,target);
        int expectedOutput = 2;
        assertEquals(actualOutput,expectedOutput);
    }

    @Test
    public void getFirstIndex_TestCase02() {
        int[] nums= new int[] {7,5,3,11,3,43,1,1};
        int target = 10;
        int actualOutput = obj.getFirstIndex(nums,target);
        int expectedOutput = -1;
        assertEquals(actualOutput,expectedOutput);
    }
}
