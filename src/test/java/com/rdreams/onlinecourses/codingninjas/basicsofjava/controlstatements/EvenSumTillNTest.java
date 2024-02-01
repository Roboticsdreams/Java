package com.rdreams.onlinecourses.codingninjas.basicsofjava.controlstatements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvenSumTillNTest {
    EvenSumTillN obj = new EvenSumTillN();

    @Test
    public void getEvenSumTillN_Testcase01() {
        int actualOutput = obj.getEvenSumTillN(6);
        int expectedOutput = 12;
        assertEquals(expectedOutput, actualOutput);
    }
}
