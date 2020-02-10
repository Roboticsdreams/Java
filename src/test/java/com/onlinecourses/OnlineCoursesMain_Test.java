package com.onlinecourses;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.onlinecourses.codingbat.CodingBatMain;
import com.onlinecourses.hackerrank.HackerRankMain;

public class OnlineCoursesMain_Test {

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
		CodingBatMain cbm = new CodingBatMain();
		HackerRankMain hrm = new HackerRankMain();
		cbm.main();
		hrm.main();

		String cbmexpected = "Sleep In =true" + System.getProperty("line.separator") 
		+ "Monkey Trouble =true" + System.getProperty("line.separator") 
		+ "Sum Double =3" + System.getProperty("line.separator")
		+ "Diff 21 =2" + System.getProperty("line.separator") 
		+ "Max 1020 =19" + System.getProperty("line.separator");
		
		String hrmexpected = "Sock Merchant =3" + System.getProperty("line.separator") 
		+ "Counting Valleys =1"	+ System.getProperty("line.separator")
		+ "Jumping on the clouds =4"	+ System.getProperty("line.separator")
		+ "Repeated String =7"	+ System.getProperty("line.separator");	

		String expected = cbmexpected + hrmexpected;		
		assertEquals(expected, getOutput());
	}
}