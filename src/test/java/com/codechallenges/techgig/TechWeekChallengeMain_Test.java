package com.codechallenges.techgig;

import static org.junit.Assert.*;

import org.junit.Test;

public class TechWeekChallengeMain_Test {
	TechWeekChallengeMain techMain = new TechWeekChallengeMain();
	
	@Test
	public void uncommonBetweenCommonTest() {
		int inp1[] = {1,2,3,4,5};
		int inp2[] = {3,4,5,6,7};
		String result;
		result = techMain.uncommonBetweenCommon(inp1,inp2);
		String output =  "1$2$6$7";
		assertEquals(result, output);
	}

	public void sentenceReverseTest() {
		String input = "Man bites dog";
		String result = techMain.sentenceReverse(input);
		String output = "dog bites Man";
		assertEquals(result, output);
	}
	@Test
	public void divideAndRuleTest01() {
		int[] input = { 1, 2, 3, 4, 5 };
		int result = techMain.divideAndRule(5, input);
		int output = 1;
		assertEquals(result, output);
	}
	
	@Test
	public void divideAndRuleTest02() {
		int[] input = { 1,1,1,1,1 };
		int result = techMain.divideAndRule(5, input);
		int output = 1;
		assertEquals(result, output);
	}
	
	@Test
	public void divideAndRuleTest03() {
		int[] input = {0,1};
		int result = techMain.divideAndRule(2, input);
		int output = -1;
		assertEquals(result, output);
	}
	@Test
	public void divideAndRuleTest04() {
		int[] input = {0,1,3};
		int result = techMain.divideAndRule(105, input);
		int output = -1;
		assertEquals(result, output);
	}

	@Test
	public void possibleMovesTest01() {
		int input = 0;
		int result = techMain.possibleMoves(input);
		int output = 0;
		assertEquals(result, output);
	}
	@Test
	public void possibleMovesTest02() {
		int input = 1;
		int result = techMain.possibleMoves(input);
		int output = 25;
		assertEquals(result, output);
	}
	@Test
	public void possibleMovesTest03() {
		int input = 2;
		int result = techMain.possibleMoves(input);
		int output = 49;
		assertEquals(result, output);
	}

	@Test
	public void farmsDivisionTest01() {
		int[] input = { 1, 2, 3, 4, 5, 5 };
		String result = techMain.farmsDivision(input);
		String output = "yes";
		assertEquals(result, output);
	}

	@Test
	public void farmsDivisionTest02() {
		int[] input = { 2, 2 };
		String result = techMain.farmsDivision(input);
		String output = "yes";
		assertEquals(result, output);
	}

	@Test
	public void farmsDivisionTest03() {
		int[] input = { 2, 5 };
		String result = techMain.farmsDivision(input);
		String output = "no";
		assertEquals(result, output);
	}

	@Test
	public void farmsDivisionTest04() {
		int[] input = { 1, 3, -1 };
		String result = techMain.farmsDivision(input);
		String output = "invalid";
		assertEquals(result, output);
	}
	@Test
	public void farmsDivisionTest05() {
		int[] input = { -1,3 };
		String result = techMain.farmsDivision(input);
		String output = "invalid";
		assertEquals(result, output);
	}
	@Test
	public void farmsDivisionTest06() {
		int[] input = { 1 };
		String result = techMain.farmsDivision(input);
		String output = "invalid";
		assertEquals(result, output);
	}

	@Test
	public void wordCountTest01() {
		String[][] input1 = new String[][] { { "A", "A", "K" }, { "A", "S", "K" }, { "A", "K", "K" } };
		String input2 = "ASK";
		int result = techMain.wordCount(input1, input2);
		int output = 4;
		assertEquals(result, output);
	}

	@Test
	public void wordCountTest02() {
		String[][] input1 = new String[][] { { "A", "S" }, { "S", "T" } };
		String input2 = "AS";
		int result = techMain.wordCount(input1, input2);
		int output = 2;
		assertEquals(result, output);
	}

	@Test
	public void wordCountTest03() {
		String[][] input1 = new String[][] { { "A", "S" }, { "S", "T" } };
		String input2 = "AST";
		int result = techMain.wordCount(input1, input2);
		int output = 0;
		assertEquals(result, output);
	}
	@Test
	public void wordCountTest04() {
		String[][] input1 = new String[][] { { "E", "D", "E", "E", "E" }, { "D", "I", "S", "K", "E" },
				{ "E", "S", "E", "E", "E" }, { "E", "C", "E", "E", "E" }, { "E", "E", "E", "E", "E" } };
		String input2 = "DISK";
		int result = techMain.wordCount(input1, input2);
		int output = 1;
		assertEquals(result, output);
	}

	@Test
	public void getJoinedPipesTest01() {
		int[] input = {4,2,3,6};
		int[] result = techMain.getJoinedPipes(input);
		int[] output = {5,9,15};
		assertArrayEquals(result, output);
	}
	
	@Test
	public void getJoinedPipesTest02() {
		int[] input = {1};
		int[] result = techMain.getJoinedPipes(input);
		int[] output = {0};
		assertArrayEquals(result, output);
	}
	
	@Test
	public void getJoinedPipesTest03() {
		int[] input = {2,1};
		int[] result = techMain.getJoinedPipes(input);
		int[] output = {3};
		assertArrayEquals(result, output);
	}
	
	@Test
	public void getJoinedPipesTest04() {
		int[] input =  {5,4,7,3,1,4};;
		int[] result = techMain.getJoinedPipes(input);
		int[] output = {4, 8, 9, 15, 24};
		assertArrayEquals(result, output);
	}


	@Test
	public void balancedStringOrNotTest01() {
		String input1 = "{A}";
		int result = techMain.balancedStringOrNot(input1);
		int output = 1;
		assertEquals(result, output);
	}
	
	@Test
	public void balancedStringOrNotTest02() {
		String input1 = "a}";
		int result = techMain.balancedStringOrNot(input1);
		int output = -1;
		assertEquals(result, output);
	}
	
	@Test
	public void balancedStringOrNotTest03() {
		String input1 = "ab{c[()]}";
		int result = techMain.balancedStringOrNot(input1);
		int output = 1;
		assertEquals(result, output);
	}

	@Test
	public void balancedStringOrNotTest04() {
		String input1 = "{a]";
		int result = techMain.balancedStringOrNot(input1);
		int output = -1;
		assertEquals(result, output);
	}

	@Test
	public void balancedStringOrNotTest05() {
		String input1 = "{a";
		int result = techMain.balancedStringOrNot(input1);
		int output = -1;
		assertEquals(result, output);
	}
}
