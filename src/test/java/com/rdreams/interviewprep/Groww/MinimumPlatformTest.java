package com.rdreams.interviewprep.Groww;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumPlatformTest {
    MinimumPlatform obj = new MinimumPlatform();

    @Test
    public void calculateMinPatforms_TestCase01() {
        int[] at = new int[] {900, 940, 950, 1100, 1500, 1800};
        int[] dt = new int[] {910, 1200, 1120, 1130, 1900, 2000};
        int actualOutput = obj.calculateMinPatforms(at, dt);
        int expectedOutput = 3;
        assertEquals(actualOutput,expectedOutput);
    }

    @Test
    public void calculateMinPatforms_TestCase02() {
        int[] at = new int[] {900, 940};
        int[] dt = new int[] {910, 1200};
        int actualOutput = obj.calculateMinPatforms(at, dt);
        int expectedOutput = 1;
        assertEquals(actualOutput,expectedOutput);
    }
}
