package com.interviewquest.cisco;

import static org.junit.Assert.*;

import org.junit.Test;

public class CiscoMain_Test {

	CiscoMain cm = new CiscoMain();

	@Test
	public void validPalindrome_TestCase01() {
		String s = "A";
		int actualOutput = cm.validPalindrome(s);
		int expectedOutput = -1;
		assertEquals(actualOutput, expectedOutput);
	}
	@Test
	public void validPalindrome_TestCase02() {
		String s = "Ma<D>Am";
		int actualOutput = cm.validPalindrome(s);
		int expectedOutput = 7;
		assertEquals(actualOutput, expectedOutput);
	}
	@Test
	public void validPalindrome_TestCase03() {
		String s = "murder for a jar of red rum";
		int actualOutput = cm.validPalindrome(s);
		int expectedOutput = 27;
		assertEquals(actualOutput, expectedOutput);
	}
	@Test
	public void validPalindrome_TestCase04() {
		String s = "A man, a plan, a canal: Panama";
		int actualOutput = cm.validPalindrome(s);
		int expectedOutput = 30;
		assertEquals(actualOutput, expectedOutput);
	}
	@Test
	public void validPalindrome_TestCase05() {
		String s = "race a car";
		int actualOutput = cm.validPalindrome(s);
		int expectedOutput = -1;
		assertEquals(actualOutput, expectedOutput);
	}

}
