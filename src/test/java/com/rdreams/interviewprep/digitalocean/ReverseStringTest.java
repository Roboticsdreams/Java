package com.rdreams.interviewprep.digitalocean;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseStringTest {
    ReverseString obj = new ReverseString();

    @Test
    public void reverseString_TestCase01() {
        String s = "RamaR";
        String actualOutput = obj.reverseString(s);
        String expectedOutput = "RamaR";
        assertEquals(expectedOutput, actualOutput);
    }
}
