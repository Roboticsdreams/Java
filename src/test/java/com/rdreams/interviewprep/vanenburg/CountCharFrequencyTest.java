package com.rdreams.interviewprep.vanenburg;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountCharFrequencyTest {
    CountCharFrequency obj = new CountCharFrequency();

    @Test
    public void getCharacterCounts_TestCase01() {
        String[] names = new String[] { "John","Honey","Assa"};
        Map<String,Integer> actualOutput = obj.getCharacterCounts(names,'a');
        Map<String,Integer> expectedOutput = new HashMap<>();
        expectedOutput.put("Assa",2);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void getCharacterCounts_TestCase02() {
        String[] names = new String[] { "John","Honey","Assa"};
        Map<String,Integer> actualOutput = obj.getCharacterCounts(names,'x');
        Map<String,Integer> expectedOutput = new HashMap<>();
        assertEquals(expectedOutput, actualOutput);
    }
}
