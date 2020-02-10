package com.codechallenges.techgig;

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
import org.mockito.Mockito;

public class TechgigMain_Test {

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
		BeginnerCodeChampMain bccmainMock = mock(BeginnerCodeChampMain.class);
		when(bccmainMock.findingMoves(anyInt())).thenReturn(49);
		
		MasterCodeChampMain mccmainMock = mock(MasterCodeChampMain.class);
		when(mccmainMock.bengaluruMetroRoutes(anyInt(), anyInt(), Mockito.any(int[][].class))).thenReturn(210);
		
		PrimeCodeChampMain pccmainMock = mock(PrimeCodeChampMain.class);
		when(pccmainMock.gameCenter(Mockito.any(String[].class))).thenReturn(new String[] {"3#1"});
		
		TechWeekChallengeMain techmainMock = mock(TechWeekChallengeMain.class);
		when(techmainMock.uncommonBetweenCommon(Mockito.any(int[].class), Mockito.any(int[].class))).thenReturn("1$2$6$7");
		when(techmainMock.sentenceReverse(anyString())).thenReturn("dog bites Man");
		TechgigMain tMain= new TechgigMain();
		tMain.main();
		
		String bccMainexpected="Finding Moves =49"+ System.getProperty("line.separator");
		String mccMainexpected="Bengaluru Metro Routes =210"+ System.getProperty("line.separator");
		String pccMainexpected="Game Center =[3#1]"+System.getProperty("line.separator");
		String techMainexpected="Uncommon Between Common =1$2$6$7"+System.getProperty("line.separator")
		+"Sentence Reverse =dog bites Man"+System.getProperty("line.separator");
		String expected  = bccMainexpected  + mccMainexpected + pccMainexpected + techMainexpected;
		assertEquals(expected, getOutput());
		
		
	}

}
