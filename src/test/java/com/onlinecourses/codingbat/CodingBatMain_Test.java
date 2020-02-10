package com.onlinecourses.codingbat;

import static org.junit.Assert.*;
import static org.mockito.Matchers.anyBoolean;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.onlinecourses.codingbat.Warmup;

public class CodingBatMain_Test {

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
		Warmup warmupMock = mock(Warmup.class);
		when(warmupMock.sleepIn(anyBoolean(), anyBoolean())).thenReturn(true);
		when(warmupMock.monkeyTrouble(anyBoolean(), anyBoolean())).thenReturn(true);
		when(warmupMock.sumDouble(anyInt(), anyInt())).thenReturn(3);
		when(warmupMock.diff21(anyInt())).thenReturn(2);
		when(warmupMock.max1020(anyInt(), anyInt())).thenReturn(19);

		CodingBatMain cbm = new CodingBatMain();
		cbm.main();
		String expected = "Sleep In =true" + System.getProperty("line.separator") 
		+ "Monkey Trouble =true" + System.getProperty("line.separator") 
		+ "Sum Double =3" + System.getProperty("line.separator")
		+ "Diff 21 =2" + System.getProperty("line.separator") 
		+ "Max 1020 =19" + System.getProperty("line.separator");
		assertEquals(expected, getOutput());
	}
}
