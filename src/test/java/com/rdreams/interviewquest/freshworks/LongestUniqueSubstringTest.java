package com.rdreams.interviewquest.freshworks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestUniqueSubstringTest {

    LongestUniqueSubString obj = new LongestUniqueSubString();

    @Test
    void getLongestUniqueSubstr_Testcase01() {
        String s1 = "abcabcbb";
        int expectedOutput = 3;
        int actualOutput = obj.getMaxUniqueSubStr(s1);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void getLongestUniqueSubstr_Testcase02() {
        String s1 = "bbbbb";
        int expectedOutput = 1;
        int actualOutput = obj.getMaxUniqueSubStr(s1);
        assertEquals(expectedOutput, actualOutput);
    }
    
    @Test
    void getLongestUniqueSubstr_Testcase03() {
        String s1 = "pwwkew";
        int expectedOutput = 3;
        int actualOutput = obj.getMaxUniqueSubStr(s1);
        assertEquals(expectedOutput, actualOutput);
    }
}
