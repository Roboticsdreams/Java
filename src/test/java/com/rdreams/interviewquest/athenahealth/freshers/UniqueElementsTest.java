package com.rdreams.interviewquest.athenahealth.freshers;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UniqueElementsTest {
    UniqueElements obj = new UniqueElements();

    @Test
    public void getUniqueElements_TestCase01() {
        int[] nums = new int[] { 1, 2, 3, 1, 2, 3};
        String actualOutput = obj.getUniqueElements(nums).toString();
        String exceptedOutput = Arrays.toString(new int[] {1,2,3});
        assertEquals(actualOutput,exceptedOutput);
    }
}
