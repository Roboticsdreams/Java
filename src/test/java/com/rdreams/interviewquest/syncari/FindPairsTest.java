package com.rdreams.interviewquest.syncari;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindPairsTest {

    FindPairs obj = new FindPairs();

    @Test
    void getFindingPairs_Testcase01() {
        List<Integer> expectedOutput = Arrays.asList(1,9,3,7);
        List<Integer> list = Arrays.asList(1,3,9,8,5,7);
        int target = 10;
        List<Integer> actualOutput = obj.getFindingPairs(list, target);
        assertEquals(expectedOutput, actualOutput);
    }
}
