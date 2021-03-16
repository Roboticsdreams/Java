package com.onlinecourses.hackerrank.interviewpreparationkit;

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
import org.mockito.Mockito;

public class InterviewPreparationKitMain_Test {

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
		IPKWarmup warmupMock = mock(IPKWarmup.class);
		when(warmupMock.sockMerchant(anyInt(), Mockito.any(int[].class))).thenReturn(3);
		when(warmupMock.countingValleys(anyInt(), anyString())).thenReturn(1);
		when(warmupMock.jumpingOnClouds(any())).thenReturn(1);
		when(warmupMock.repeatedString(anyString(),anyInt())).thenReturn(7L);

		InterviewPreparationKitMain ipkm = new InterviewPreparationKitMain();
		ipkm.main();
		String expected = "Sock Merchant =3" + System.getProperty("line.separator") 
		+ "Counting Valleys =1"	+ System.getProperty("line.separator")
		+ "Jumping on the clouds =4"	+ System.getProperty("line.separator")
		+ "Repeated String =7"	+ System.getProperty("line.separator");
		assertEquals(expected, getOutput());
	}

}
