package com.rdreams.interviewprep.freshworks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FLAMESTest {
    FLAMES obj = new FLAMES();

    @Test
    public void getFlames_TestCase01() {
        String s1 = "AJAY";
        String s2 = "PRIYA";
        String actualOutput = obj.getFLAMES(s1,s2);
        String expectedOutput = "F";
        assertEquals(expectedOutput, actualOutput);
    }
}
