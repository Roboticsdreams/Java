package com.rdreams.interviewquest.cisco;

/*
Write a program to check the given string is valid palindrome.
Input: MADAM, Output: true
Input: OVER, Output: false
 */

public class Palindrome {
    public boolean isValidPlaindrome(String str) {
        int n = str.length();
        str = str.replaceAll("[^a-zA-Z]", "");
        if (n>1) {
            int s1_end = n /2;
            int s2_start = (n+1)/2;
            String s1 = str.substring(0, s1_end);
            StringBuilder s2 = new StringBuilder(str.substring(s2_start, n)).reverse();
            return s1.equalsIgnoreCase(s2.toString());
        }
        return false;
    }
}
