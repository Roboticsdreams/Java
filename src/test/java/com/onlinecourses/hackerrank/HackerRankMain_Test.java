package com.onlinecourses.hackerrank;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.onlinecourses.hackerrank.interviewpreparationkit.InterviewPreparationKitMain;

public class HackerRankMain_Test {

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

		InterviewPreparationKitMain ipkm = new InterviewPreparationKitMain();
		ipkm.main();
		String expected = "Sock Merchant =3" + System.getProperty("line.separator") 
		+ "Counting Valleys =1"	+ System.getProperty("line.separator")
		+ "Jumping on the clouds =4"	+ System.getProperty("line.separator")
		+ "Repeated String =7"	+ System.getProperty("line.separator");
		assertEquals(expected, getOutput());
	}
}