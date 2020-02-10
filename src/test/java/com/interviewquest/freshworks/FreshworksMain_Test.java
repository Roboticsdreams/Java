package com.interviewquest.freshworks;

import static org.junit.Assert.*;

import org.junit.Test;

public class FreshworksMain_Test {
	
	FreshworksMain fm = new FreshworksMain();

	@Test
	public void flames_Testcase01() {
		String name1 = "raman";
		String name2 = "Seetha";
		String actualOutput = fm.flames(name1, name2);
		String expectedOutput = "e";
		assertEquals(actualOutput, expectedOutput);		
	}
	@Test
	public void flames_Testcase02() {
		String name1 = "palanisamy";
		String name2 = "devi";
		String actualOutput = fm.flames(name1, name2);
		String expectedOutput = "a";
		assertEquals(actualOutput, expectedOutput);		
	}

	@Test
	public void sumofArray_Testcase01() {
		int[] array = new int[] {1,2,3,4,5,6};
		int sum = 7;
		String actualOutput = fm.sumofArray(array, sum);
		String expectedOutput = "[3,4][2,5][1,6]";
		assertEquals(actualOutput, expectedOutput);		
	}
}
