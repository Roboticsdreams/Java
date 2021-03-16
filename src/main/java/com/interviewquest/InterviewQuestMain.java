package com.interviewquest;

import java.io.PrintStream;

import com.interviewquest.cisco.CiscoMain;
import com.interviewquest.freshworks.FreshworksMain;

public class InterviewQuestMain {

	PrintStream out = System.out;
	CiscoMain cisco = new CiscoMain();
	FreshworksMain freshworks = new FreshworksMain();

	public void main() {
		System.out.println("Validate Palindrome =" + cisco.validPalindrome("Madam"));
		System.out.println("Flames =" + freshworks.flames("raman", "seetha"));
		System.out.println("Sum of Arrays =" + freshworks.sumofArray(new int[] { 1, 2, 3, 4, 5, 6 }, 7));
	}
}
