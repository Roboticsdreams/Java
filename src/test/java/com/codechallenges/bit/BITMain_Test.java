package com.codechallenges.bit;

import static org.junit.Assert.*;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BITMain_Test {

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
		PatternProgramsMain ppmainMock = mock(PatternProgramsMain.class);
		when(ppmainMock.displaypattern01(anyInt()))
				.thenReturn(new String[] { "1 2 3 4 5", "1 2 3 4 5", "1 2 3 4 5", "1 2 3 4 5", "1 2 3 4 5" });
		when(ppmainMock.displaypattern02(anyInt()))
				.thenReturn(new String[] { "E D C B A", "E D C B A", "E D C B A", "E D C B A", "E D C B A" });
		when(ppmainMock.displaypattern03(anyInt()))
				.thenReturn(new String[] { "1 1 1 1 1", "2 2 2 2", "3 3 3", "4 4", "5" });
		when(ppmainMock.displaypattern04(anyInt()))
				.thenReturn(new String[] { "A B C D E", "A B C D", "A B C", "A B", "A" });
		when(ppmainMock.displaypattern05(anyInt()))
				.thenReturn(new String[] { "5 4 3 2 1", "5 4 3 2", "5 4 3", "5 4", "5" });
		when(ppmainMock.displaypattern06(anyInt()))
				.thenReturn(new String[] { "E D C B A", "E D C B", "E D C", "E D", "E" });
		when(ppmainMock.displaypattern07(anyInt()))
				.thenReturn(new String[] { "        1", "     1 2", "   1 2 3", " 1 2 3 4", "1 2 3 4 5" });
		when(ppmainMock.displaypattern08(anyInt()))
				.thenReturn(new String[] { "* * * * *", " * * * *", "   * * *", "     * *", "       *" });
		when(ppmainMock.displaypattern09(anyInt()))
				.thenReturn(new String[] { "1 2 3 4 5", " 1 2 3 4", "   1 2 3", "     1 2", "       1" });
		when(ppmainMock.displaypattern10(anyInt())).thenReturn(
				new String[] { "        *", "     * * *", "   * * * * *", " * * * * * * *", " * * * * * * * * *" });
		when(ppmainMock.displaypattern11(anyInt())).thenReturn(
				new String[] { "        A", "     B B B", "   C C C C C", " D D D D D D D", "E E E E E E E E E" });
		when(ppmainMock.displaypattern12(anyInt())).thenReturn(
				new String[] { "        1", "     1 2 3", "   1 2 3 4 5", " 1 2 3 4 5 6 7", "1 2 3 4 5 6 7 8 9" });
		when(ppmainMock.displaypattern13(anyInt())).thenReturn(
				new String[] { "        A", "     C B A", "   E D C B A", " G F E D C B A", "I H G F E D C B A" });
		when(ppmainMock.displaypattern14(anyInt())).thenReturn(
				new String[] { "        A", "     B A B", "   C B A B C", " D C B A B C D", "E D C B A B C D E" });
		when(ppmainMock.displaypattern15(anyInt())).thenReturn(
				new String[] { "* * * * * * * * *", " * * * * * * *", "   * * * * *", "     * * *", "       *" });
		when(ppmainMock.displaypattern16(anyInt())).thenReturn(
				new String[] { "9 9 9 9 9 9 9 9 9", " 7 7 7 7 7 7 7", "   5 5 5 5 5", "     3 3 3", "       1" });
		when(ppmainMock.displaypattern17(anyInt())).thenReturn(
				new String[] { "        1", "     3 3 3", "   5 5 5 5 5", " 7 7 7 7 7 7 7", "9 9 9 9 9 9 9 9 9" });
		when(ppmainMock.displaypattern18(anyInt()))
				.thenReturn(new String[] { "        A", "     B B", "   C C C", " D D D D", "E E E E E" });
		when(ppmainMock.displaypattern19(anyInt())).thenReturn(
				new String[] { "E E E E E E E E E", " D D D D D D D", "   C C C C C", "     B B B", "       A" });
		when(ppmainMock.displaypattern20(anyInt())).thenReturn(
				new String[] { "I I I I I I I I I", " G G G G G G G", "   E E E E E", "     C C C", "       A" });
		when(ppmainMock.displaypattern21(anyInt())).thenReturn(new String[] { "ABCDE", "ABCD", "ABC", "AB", "A" });
		when(ppmainMock.displaypattern22(anyInt())).thenReturn(
				new String[] { "*", "* *", "* * *", "* * * *", "* * * * *", "* * * *", "* * *", "* *", "*" });
		when(ppmainMock.displaypattern23(anyInt())).thenReturn(
				new String[] { "4", "4 3", "4 3 2", "4 3 2 1", "4 3 2 1 0", "4 3 2 1", "4 3 2", "4 3", "4" });
		when(ppmainMock.displaypattern24(anyInt())).thenReturn(
				new String[] { "4", "3 4", "2 3 4", "1 2 3 4", "0 1 2 3 4", "1 2 3 4", "2 3 4", "3 4", "4" });
		when(ppmainMock.displaypattern25(anyInt())).thenReturn(
				new String[] { "E", "E D", "E D C", "E D C B", "E D C B A", "E D C B", "E D C", "E D", "E" });
		when(ppmainMock.displaypattern26(anyInt())).thenReturn(
				new String[] { "E", "D E", "C D E", "B C D E", "A B C D E", "B C D E", "C D E", "D E", "E" });
		when(ppmainMock.displaypattern27(anyInt())).thenReturn(new String[] { "        *", "     * *", "   * * *",
				" * * * *", "* * * * *", " * * * *", "   * * *", "     * *", "       *" });
		when(ppmainMock.displaypattern28(anyInt())).thenReturn(new String[] { "        4", "     4 3", "   4 3 2",
				" 4 3 2 1", "4 3 2 1 0", " 4 3 2 1", "   4 3 2", "     4 3", "       4" });
		when(ppmainMock.displaypattern29(anyInt())).thenReturn(new String[] { "        4", "     3 4", "   2 3 4",
				" 1 2 3 4", "0 1 2 3 4", " 1 2 3 4", "   2 3 4", "     3 4", "       4" });
		when(ppmainMock.displaypattern30(anyInt())).thenReturn(new String[] { "        E", "     D E", "   C D E",
				" B C D E", "A B C D E", " B C D E", "   C D E", "     D E", "       E" });
		when(ppmainMock.displaypattern31(anyInt())).thenReturn(new String[] { "        E", "     E D", "   E D C",
				" E D C B", "E D C B A", " E D C B", "   E D C", "     E D", "       E" });
		when(ppmainMock.displaypattern32(anyString())).thenReturn(8.0);

		BITMain bMain = new BITMain();
		bMain.main();
		String expected = "Display Pattern 01 =[1 2 3 4 5, 1 2 3 4 5, 1 2 3 4 5, 1 2 3 4 5, 1 2 3 4 5]"
				+ System.getProperty("line.separator")
				+ "Display Pattern 02 =[E D C B A, E D C B A, E D C B A, E D C B A, E D C B A]"
				+ System.getProperty("line.separator") + "Display Pattern 03 =[1 1 1 1 1, 2 2 2 2, 3 3 3, 4 4, 5]"
				+ System.getProperty("line.separator") + "Display Pattern 04 =[A B C D E, A B C D, A B C, A B, A]"
				+ System.getProperty("line.separator") + "Display Pattern 05 =[5 4 3 2 1, 5 4 3 2, 5 4 3, 5 4, 5]"
				+ System.getProperty("line.separator") + "Display Pattern 06 =[E D C B A, E D C B, E D C, E D, E]"
				+ System.getProperty("line.separator")
				+ "Display Pattern 07 =[        1,       1 2,     1 2 3,   1 2 3 4, 1 2 3 4 5]"
				+ System.getProperty("line.separator")
				+ "Display Pattern 08 =[* * * * *,   * * * *,     * * *,       * *,         *]"
				+ System.getProperty("line.separator")
				+ "Display Pattern 09 =[1 2 3 4 5,   1 2 3 4,     1 2 3,       1 2,         1]"
				+ System.getProperty("line.separator")
				+ "Display Pattern 10 =[        *,       * * *,     * * * * *,   * * * * * * *, * * * * * * * * *]"
				+ System.getProperty("line.separator")
				+ "Display Pattern 11 =[        A,       B B B,     C C C C C,   D D D D D D D, E E E E E E E E E]"
				+ System.getProperty("line.separator")
				+ "Display Pattern 12 =[        1,       1 2 3,     1 2 3 4 5,   1 2 3 4 5 6 7, 1 2 3 4 5 6 7 8 9]"
				+ System.getProperty("line.separator")
				+ "Display Pattern 13 =[        A,       C B A,     E D C B A,   G F E D C B A, I H G F E D C B A]"
				+ System.getProperty("line.separator")
				+ "Display Pattern 14 =[        A,       B A B,     C B A B C,   D C B A B C D, E D C B A B C D E]"
				+ System.getProperty("line.separator")
				+ "Display Pattern 15 =[* * * * * * * * *,   * * * * * * *,     * * * * *,       * * *,         *]"
				+ System.getProperty("line.separator")
				+ "Display Pattern 16 =[9 9 9 9 9 9 9 9 9,   7 7 7 7 7 7 7,     5 5 5 5 5,       3 3 3,         1]"
				+ System.getProperty("line.separator")
				+ "Display Pattern 17 =[        1,       3 3 3,     5 5 5 5 5,   7 7 7 7 7 7 7, 9 9 9 9 9 9 9 9 9]"
				+ System.getProperty("line.separator")
				+ "Display Pattern 18 =[        A,       B B,     C C C,   D D D D, E E E E E]"
				+ System.getProperty("line.separator")
				+ "Display Pattern 19 =[E E E E E E E E E,   D D D D D D D,     C C C C C,       B B B,         A]"
				+ System.getProperty("line.separator")
				+ "Display Pattern 20 =[I I I I I I I I I,   G G G G G G G,     E E E E E,       C C C,         A]"
				+ System.getProperty("line.separator") + "Display Pattern 21 =[ABCDE, ABCD, ABC, AB, A]"
				+ System.getProperty("line.separator")
				+ "Display Pattern 22 =[*, * *, * * *, * * * *, * * * * *, * * * *, * * *, * *, *]"
				+ System.getProperty("line.separator")
				+ "Display Pattern 23 =[4, 4 3, 4 3 2, 4 3 2 1, 4 3 2 1 0, 4 3 2 1, 4 3 2, 4 3, 4]"
				+ System.getProperty("line.separator")
				+ "Display Pattern 24 =[4, 3 4, 2 3 4, 1 2 3 4, 0 1 2 3 4, 1 2 3 4, 2 3 4, 3 4, 4]"
				+ System.getProperty("line.separator")
				+ "Display Pattern 25 =[E, E D, E D C, E D C B, E D C B A, E D C B, E D C, E D, E]"
				+ System.getProperty("line.separator")
				+ "Display Pattern 26 =[E, D E, C D E, B C D E, A B C D E, B C D E, C D E, D E, E]"
				+ System.getProperty("line.separator")
				+ "Display Pattern 27 =[        *,       * *,     * * *,   * * * *, * * * * *,   * * * *,     * * *,       * *,         *]"
				+ System.getProperty("line.separator")
				+ "Display Pattern 28 =[        4,       4 3,     4 3 2,   4 3 2 1, 4 3 2 1 0,   4 3 2 1,     4 3 2,       4 3,         4]"
				+ System.getProperty("line.separator")
				+ "Display Pattern 29 =[        4,       3 4,     2 3 4,   1 2 3 4, 0 1 2 3 4,   1 2 3 4,     2 3 4,       3 4,         4]"
				+ System.getProperty("line.separator")
				+ "Display Pattern 30 =[        E,       D E,     C D E,   B C D E, A B C D E,   B C D E,     C D E,       D E,         E]"
				+ System.getProperty("line.separator")
				+ "Display Pattern 31 =[        E,       E D,     E D C,   E D C B, E D C B A,   E D C B,     E D C,       E D,         E]"
				+ System.getProperty("line.separator") 
				+ "Display Pattern 32 =8.0"
				+ System.getProperty("line.separator");
		assertEquals(expected, getOutput());
	}

}
