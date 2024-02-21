package com.rdreams.interviewquest.athenahealth.freshers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArraySumTest {
    ArraySum obj = new ArraySum();

    @Test
    public void getSumOfArray_TestCase01() {
        int[] nums = new int[] { 1, 2, 3, 4, 5};
        int actualOutput = obj.getSumOfArray(nums);
        int exceptedOutput = 15;
        assertEquals(actualOutput,exceptedOutput);
    }

}
