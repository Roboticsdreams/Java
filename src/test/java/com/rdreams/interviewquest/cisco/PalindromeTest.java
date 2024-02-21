package com.rdreams.interviewquest.cisco;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PalindromeTest {
    Palindrome obj = new Palindrome();

    @Test
    public void isValidPalindrome_TestCase01(){
        String  str = "MADAM";
        boolean actualOutput = obj.isValidPlaindrome(str);
        boolean expectedOutput = true;
        assertEquals(actualOutput,expectedOutput);
    }

    @Test
    public void isValidPalindrome_TestCase02(){
        String  str = "MADAMAD";
        boolean actualOutput = obj.isValidPlaindrome(str);
        boolean expectedOutput = false;
        assertEquals(actualOutput,expectedOutput);
    }

    @Test
    public void isValidPalindrome_TestCase03(){
        String  str = "M";
        boolean actualOutput = obj.isValidPlaindrome(str);
        boolean expectedOutput = false;
        assertEquals(actualOutput,expectedOutput);
    }
    @Test
    public void isValidPalindrome_TestCase04(){
        String  str = "RAMMAR";
        boolean actualOutput = obj.isValidPlaindrome(str);
        boolean expectedOutput = true;
        assertEquals(actualOutput,expectedOutput);
    }
}
