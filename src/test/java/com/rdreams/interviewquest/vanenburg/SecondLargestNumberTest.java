package com.rdreams.interviewquest.vanenburg;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SecondLargestNumberTest {
    SecondLargestNumber obj = new SecondLargestNumber();

    @Test
    public void getSecondLargestNumber_TestCase01() {
        int[] nums = new int[] {1,9,3,2,5,3,7,3,6,9,9};
        int actualOutput = obj.getSecondLargestNumber(nums);
        int expectedOutput = 7;
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void getSecondLargestNumber_TestCase02() {
        int[] nums = new int[] {9,9,9,9};
        int actualOutput = obj.getSecondLargestNumber(nums);
        int expectedOutput = -1;
        assertEquals(expectedOutput, actualOutput);
    }
}
