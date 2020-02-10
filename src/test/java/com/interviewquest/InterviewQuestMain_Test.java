package com.interviewquest;

import static org.junit.Assert.*;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.interviewquest.cisco.CiscoMain;
import com.interviewquest.freshworks.FreshworksMain;

public class InterviewQuestMain_Test {

	private final PrintStream systemOut = System.out;
	private ByteArrayOutputStream testOut;

	@Before
	public void setUpOutput() {
		testOut = new ByteArrayOutputStream();
		System.setOut(new PrintStream(testOut));
	}

	private String getOutput() {
		return testOut.toString();
	}

	@After
	public void restoreSystemInputOutput() {
		System.setOut(systemOut);
	}

	@Test
	public void test() {
		CiscoMain cmMock = mock(CiscoMain.class);
		when(cmMock.validPalindrome(anyString())).thenReturn(5);
		
		FreshworksMain fmMock = mock(FreshworksMain.class);
		when(fmMock.flames(anyString(),anyString())).thenReturn("e");
		when(fmMock.sumofArray(any(), anyInt())).thenReturn("[3,4][2,5][1,6]");
		
		InterviewQuestMain iqmain= new InterviewQuestMain();
		iqmain.main();

		String expected = "Validate Palindrome =5" + System.getProperty("line.separator")
		+ "Flames =e"+System.getProperty("line.separator")
		+ "Sum of Arrays =[3,4][2,5][1,6]"+System.getProperty("line.separator");
		assertEquals(expected, getOutput());
	}

}
