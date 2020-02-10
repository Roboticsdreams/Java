package com.codechallenges.techgig;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrimeCodeChampMain_Test {

	PrimeCodeChampMain pccMain = new PrimeCodeChampMain();
	@Test
	public void gamecenterTest01() {
		String input[] = { "12#45#33", "94#54#23", "98#59#27" };
		String result[] = pccMain.gameCenter(input);
		String output[] = { "3#1" };
		assertArrayEquals(result, output);
	}

	@Test
	public void gamecenterTest02() {
		String input[] = { "12#45#33#27", "94#54#23#53", "98#59#27#62", "11#51#67#13" };
		String result[] = pccMain.gameCenter(input);
		String output[] = { "1#3", "1#4", "2#3", "2#4" };
		assertArrayEquals(result, output);
	}

}
