package com.codechallenges;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codechallenges.bit.BITMain;
import com.codechallenges.techgig.TechgigMain;

public class CodeChallengesMain_Test {

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
		BITMain bitMain = new BITMain();
		TechgigMain techgigMain = new TechgigMain();
		bitMain.main();
		techgigMain.main();

		String bitMainexpected = "Display Pattern 01 =[1 2 3 4 5, 1 2 3 4 5, 1 2 3 4 5, 1 2 3 4 5, 1 2 3 4 5]"
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
				+ System.getProperty("line.separator") + "Display Pattern 32 =8.0"
				+ System.getProperty("line.separator");

		String techgigMainexpected = "Finding Moves =49" + System.getProperty("line.separator")
				+ "Bengaluru Metro Routes =210" + System.getProperty("line.separator") 
				+ "Game Center =[3#1]" + System.getProperty("line.separator") 
				+ "Uncommon Between Common =1$2$6$7" + System.getProperty("line.separator")
				+ "Sentence Reverse =dog bites Man"+ System.getProperty("line.separator");

		String expected = bitMainexpected + techgigMainexpected;
		assertEquals(expected, getOutput());
	}

}
