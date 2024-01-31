package com.rdreams.interviewprep.vanenburg;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MissingNumberTest {
    MissingNumber obj = new MissingNumber();
    @Test
    public void getMissingNumber_Testcase01() {
       int actualOutput = obj.getMissingNumber(new int[] {1,5,4,1,3},5);
       int expectedOutput = 2;
       assertEquals(expectedOutput, actualOutput);
    }
}
