package com.codechallenges.techgig;

import static org.junit.Assert.*;

import org.junit.Test;

public class MasterCodeChampMain_Test {

	MasterCodeChampMain mccMain = new MasterCodeChampMain();
	
	@Test
	public void bengaluruMetroRoutesTest01() {
		int input1 = 7;
		int input2 = 9;
		int input3[][] = { { 1, 4, 30 }, { 5, 1, 100 }, { 1, 7, 40 }, { 5, 6, 60 }, { 2, 3, 10 }, { 3, 4, 20 },
				{ 2, 6, 200 }, { 4, 6, 300 }, { 6, 7, 50 } };
		int result = mccMain.bengaluruMetroRoutes(input1, input2, input3);
		int output = 210;
		assertEquals(result, output);
	}

	@Test
	public void test2() {
		int input1 = 8;
		int input2 = 8;
		int input3[][] = { { 1, 5, 20 }, { 1, 3, 40 }, { 3, 5, 10 }, { 5, 7, 5 }, { 1, 7, 100 }, { 2, 6, 75 },
				{ 7, 3, 70 }, { 4, 8, 80 } };
		int result = mccMain.bengaluruMetroRoutes(input1, input2, input3);
		int output = 0;
		assertEquals(result, output);
	}
	
	@Test
	public void test3() {
		int input1 = 2;
		int input2 = 8;
		int input3[][] = { { 1, 5, 20 }, { 1, 3, 40 }, { 3, 5, 10 }, { 5, 7, 5 }, { 1, 7, 100 }, { 2, 6, 75 },
				{ 7, 3, 70 }, { 4, 8, 80 } };
		int result = mccMain.bengaluruMetroRoutes(input1, input2, input3);
		int output = 0;
		assertEquals(result, output);
	}
	
	@Test
	public void test4() {
		int input1 = 1001;
		int input2 = 8;
		int input3[][] = { { 1, 5, 20 }, { 1, 3, 40 }, { 3, 5, 10 }, { 5, 7, 5 }, { 1, 7, 100 }, { 2, 6, 75 },
				{ 7, 3, 70 }, { 4, 8, 80 } };
		int result = mccMain.bengaluruMetroRoutes(input1, input2, input3);
		int output = 0;
		assertEquals(result, output);
	}

}
