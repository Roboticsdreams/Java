package com.rdreams.interviewquest.freshworks;

/*
Given a string s, find the length of the longest substring without repeating characters.
Example 1:
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

Example 2:
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

Example 3:
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.

Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
*/

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestUniqueSubstringTest {

    LongestUniqueSubString obj = new LongestUniqueSubString();

    @Test
    public void getLongestUniqueSubstr_Testcase01() {
        String s1 = "abcabcbb";
        int expectedOutput = 3;
        int actualOutput = obj.getMaxUniqueSubStr(s1);
        assertEquals(expectedOutput, actualOutput);
    }
    @Test
    public void getLongestUniqueSubstr_Testcase02() {
        String s1 = "bbbbb";
        int expectedOutput = 1;
        int actualOutput = obj.getMaxUniqueSubStr(s1);
        assertEquals(expectedOutput, actualOutput);
    }
    @Test
    public void getLongestUniqueSubstr_Testcase03() {
        String s1 = "pwwkew";
        int expectedOutput = 3;
        int actualOutput = obj.getMaxUniqueSubStr(s1);
        assertEquals(expectedOutput, actualOutput);
    }
}
