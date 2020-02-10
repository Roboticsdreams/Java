package com.interviewquest.cisco;

public class CiscoMain {
	public int validPalindrome(String s) {
		int result = s.length();
		s = s.replaceAll("[^a-zA-Z]", "");
		int n = s.length();
		if ( n > 1 ) {
			int s1end = n / 2;
			int s2start = (n + 1) / 2;
			if (n % 2 == 0) {
				s2start = (n + 2) / 2;
			}
			String s1 = s.substring(0, s1end);
			StringBuilder s2 = new StringBuilder(s.substring(s2start, n)).reverse();
			if (s1.equalsIgnoreCase(s2.toString())) {
				return result;
			}
		}
		return -1;
	}
}
