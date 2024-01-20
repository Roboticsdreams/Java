package com.rdreams.interviewquest.amazon;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MaxPairsTest {
      MaxPairs obj = new MaxPairs();

    @Test
    void getMaxPairs_Testcase01() {
        Integer[] frontend = {1, 2, 3};
        Integer[] backend = {1, 2, 1};
        int expectedOutput = 2;
        int actualOutput = obj.getMaxPairs(frontend, backend);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void getMaxPairs_Testcase02() {
        Integer[] frontend = {1};
        Integer[] backend = {1};
        int expectedOutput = 0;
        int actualOutput = obj.getMaxPairs(frontend, backend);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void getMaxPairs_Testcase03() {
        Integer[] frontend = {2};
        Integer[] backend = {1};
        int expectedOutput = 1;
        int actualOutput = obj.getMaxPairs(frontend, backend);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void getMaxPairs_Testcase04() {
        Integer[] frontend = {};
        Integer[] backend = {};
        int expectedOutput = 0;
        int actualOutput = obj.getMaxPairs(frontend, backend);
        assertEquals(expectedOutput, actualOutput);
    }  
}
