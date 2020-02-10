package com.codechallenges.techgig;

import static org.junit.Assert.*;

import org.junit.Test;

public class BeginnerCodeChampMain_Test {

	BeginnerCodeChampMain bccMain = new BeginnerCodeChampMain();

	@Test
	public void findingMovesTest() {
		int output = bccMain.findingMoves(2);
		int expected = 49;
		assertEquals(expected, output);
	}
}
