package com.rdreams.interviewquest.crayondata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MatchFileTest {
    MatchFile obj = new MatchFile();

    @Test
    public void  isFileMatch_TestCase01() {
        String s1 = "Hai, hello this test file this is test";
        String s2 = "Hai, hello this test file this is test";
        boolean actualOutput = obj.isFileMatch(s1,s2);
        boolean expectedOutput = true;
        assertEquals(actualOutput,expectedOutput);
    }

    @Test
    public void  isFileMatch_TestCase02() {
        String s1 = "Hai, hello this test file";
        String s2 = null;
        boolean actualOutput = obj.isFileMatch(s1,s2);
        boolean expectedOutput = false;
        assertEquals(actualOutput,expectedOutput);
    }

    @Test
    public void  isFileMatch_TestCase03() {
        String s1 = null;
        String s2 = null;
        boolean actualOutput = obj.isFileMatch(s1,s2);
        boolean expectedOutput = false;
        assertEquals(actualOutput,expectedOutput);
    }

    @Test
    public void  isFileMatch_TestCase04() {
        String s1 = "Hai, hello this not test file";
        String s2 = "Hai, hello this test file";
        boolean actualOutput = obj.isFileMatch(s1,s2);
        boolean expectedOutput = false;
        assertEquals(actualOutput,expectedOutput);
    }
}
