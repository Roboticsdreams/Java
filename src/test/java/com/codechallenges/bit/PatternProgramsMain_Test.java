package com.codechallenges.bit;

import static org.junit.Assert.*;

import org.junit.Test;

public class PatternProgramsMain_Test {

	PatternProgramsMain ppMain = new PatternProgramsMain();

	int input1 = 5;
	int input2 = -1;
	int input3 = 1001;

	@Test
	public void displaypattern01Test01() {
		String result[] = ppMain.displaypattern01(input1);
		String output[] = { "1 2 3 4 5", "1 2 3 4 5", "1 2 3 4 5", "1 2 3 4 5", "1 2 3 4 5" };
		assertArrayEquals(result, output);
	}
	@Test
	public void displaypattern01Test02() {
		String result[] = ppMain.displaypattern01(input2);
		String output[] = null;
		assertArrayEquals(result, output);
	}
	@Test
	public void displaypattern01Test03() {
		String result[] = ppMain.displaypattern01(input3);
		String output[] = null;
		assertArrayEquals(result, output);
	}

	@Test
	public void displaypattern02Test01() {
		String result[] = ppMain.displaypattern02(input1);
		String output[] = { "E D C B A", "E D C B A", "E D C B A", "E D C B A", "E D C B A" };
		assertArrayEquals(result, output);
	}
	@Test
	public void displaypattern02Test02() {
		String result[] = ppMain.displaypattern02(input2);
		String output[] = null;
		assertArrayEquals(result, output);
	}
	@Test
	public void displaypattern02Test03() {
		String result[] = ppMain.displaypattern02(input3);
		String output[] = null;
		assertArrayEquals(result, output);
	}


	@Test
	public void displaypattern03Test01() {
		String result[] = ppMain.displaypattern03(input1);
		String output[] = { "1 1 1 1 1", "2 2 2 2", "3 3 3", "4 4", "5" };
		assertArrayEquals(result, output);
	}
	@Test
	public void displaypattern03Test02() {
		String result[] = ppMain.displaypattern03(input2);
		String output[] = null;
		assertArrayEquals(result, output);
	}
	@Test
	public void displaypattern03Test03() {
		String result[] = ppMain.displaypattern03(input3);
		String output[] = null;
		assertArrayEquals(result, output);
	}
	
	@Test
	public void displaypattern04Test01() {
		String result[] = ppMain.displaypattern04(input1);
		String output[] = { "A B C D E", "A B C D", "A B C", "A B", "A" };
		assertArrayEquals(result, output);
	}
	@Test
	public void displaypattern04Test02() {
		String result[] = ppMain.displaypattern04(input2);
		String output[] = null;
		assertArrayEquals(result, output);
	}
	@Test
	public void displaypattern04Test03() {
		String result[] = ppMain.displaypattern04(input3);
		String output[] = null;
		assertArrayEquals(result, output);
	}
	
	@Test
	public void displaypattern05Test01() {
		String result[] = ppMain.displaypattern05(input1);
		String output[] = { "5 4 3 2 1", "5 4 3 2", "5 4 3", "5 4", "5" };
		assertArrayEquals(result, output);
	}
	@Test
	public void displaypattern05Test02() {
		String result[] = ppMain.displaypattern05(input2);
		String output[] = null;
		assertArrayEquals(result, output);
	}
	@Test
	public void displaypattern05Test03() {
		String result[] = ppMain.displaypattern05(input3);
		String output[] = null;
		assertArrayEquals(result, output);
	}

	@Test
	public void displaypattern06Test01() {
		String result[] = ppMain.displaypattern06(input1);
		String output[] = { "E D C B A", "E D C B", "E D C", "E D", "E" };
		assertArrayEquals(result, output);
	}
	@Test
	public void displaypattern06Test02() {
		String result[] = ppMain.displaypattern06(input2);
		String output[] = null;
		assertArrayEquals(result, output);
	}
	@Test
	public void displaypattern06Test03() {
		String result[] = ppMain.displaypattern06(input3);
		String output[] = null;
		assertArrayEquals(result, output);
	}

	@Test
	public void displaypattern07Test01() {
		String result[] = ppMain.displaypattern07(input1);
		String output[] = { "        1", "      1 2", "    1 2 3", "  1 2 3 4", "1 2 3 4 5" };
		assertArrayEquals(result, output);
	}
	@Test
	public void displaypattern07Test02() {
		String result[] = ppMain.displaypattern07(input2);
		String output[] = null;
		assertArrayEquals(result, output);
	}
	@Test
	public void displaypattern07Test03() {
		String result[] = ppMain.displaypattern07(input3);
		String output[] = null;
		assertArrayEquals(result, output);
	}

	@Test
	public void displaypattern08Test01() {
		String result[] = ppMain.displaypattern08(input1);
		String output[] = { "* * * * *", "  * * * *", "    * * *", "      * *", "        *" };
		assertArrayEquals(result, output);
	}
	@Test
	public void displaypattern08Test02() {
		String result[] = ppMain.displaypattern08(input2);
		String output[] = null;
		assertArrayEquals(result, output);
	}
	@Test
	public void displaypattern08Test03() {
		String result[] = ppMain.displaypattern08(input3);
		String output[] = null;
		assertArrayEquals(result, output);
	}

	@Test
	public void displaypattern09Test01() {
		String result[] = ppMain.displaypattern09(input1);
		String output[] = { "1 2 3 4 5", "  1 2 3 4", "    1 2 3", "      1 2", "        1" };
		assertArrayEquals(result, output);
	}
	@Test
	public void displaypattern09Test02() {
		String result[] = ppMain.displaypattern09(input2);
		String output[] = null;
		assertArrayEquals(result, output);
	}
	@Test
	public void displaypattern09Test03() {
		String result[] = ppMain.displaypattern09(input3);
		String output[] = null;
		assertArrayEquals(result, output);
	}

	@Test
	public void displaypattern10Test01() {
		String result[] = ppMain.displaypattern10(input1);
		String output[] = { "        *", "      * * *", "    * * * * *", "  * * * * * * *", "* * * * * * * * *" };
		assertArrayEquals(result, output);
	}
	@Test
	public void displaypattern10Test02() {
		String result[] = ppMain.displaypattern10(input2);
		String output[] = null;
		assertArrayEquals(result, output);
	}
	@Test
	public void displaypattern10Test03() {
		String result[] = ppMain.displaypattern10(input3);
		String output[] = null;
		assertArrayEquals(result, output);
	}

	@Test
	public void displaypattern11Test01() {
		String result[] = ppMain.displaypattern11(input1);
		String output[] = { "        A", "      B B B", "    C C C C C", "  D D D D D D D", "E E E E E E E E E" };
		assertArrayEquals(result, output);
	}
	@Test
	public void displaypattern11Test02() {
		String result[] = ppMain.displaypattern11(input2);
		String output[] = null;
		assertArrayEquals(result, output);
	}
	@Test
	public void displaypattern11Test03() {
		String result[] = ppMain.displaypattern11(input3);
		String output[] = null;
		assertArrayEquals(result, output);
	}

	@Test
	public void displaypattern12Test01() {
		String result[] = ppMain.displaypattern12(input1);
		String output[] = { "        1", "      1 2 3", "    1 2 3 4 5", "  1 2 3 4 5 6 7", "1 2 3 4 5 6 7 8 9" };
		assertArrayEquals(result, output);
	}
	@Test
	public void displaypattern12Test02() {
		String result[] = ppMain.displaypattern12(input2);
		String output[] = null;
		assertArrayEquals(result, output);
	}
	@Test
	public void displaypattern12Test03() {
		String result[] = ppMain.displaypattern12(input3);
		String output[] = null;
		assertArrayEquals(result, output);
	}

	@Test
	public void displaypattern13Test01() {
		String result[] = ppMain.displaypattern13(input1);
		String output[] = { "        A", "      C B A", "    E D C B A", "  G F E D C B A", "I H G F E D C B A" };
		assertArrayEquals(result, output);
	}
	@Test
	public void displaypattern13Test02() {
		String result[] = ppMain.displaypattern13(input2);
		String output[] = null;
		assertArrayEquals(result, output);
	}
	@Test
	public void displaypattern13Test03() {
		String result[] = ppMain.displaypattern13(input3);
		String output[] = null;
		assertArrayEquals(result, output);
	}

	@Test
	public void displaypattern14Test01() {
		String result[] = ppMain.displaypattern14(input1);
		String output[] = { "        A", "      B A B", "    C B A B C", "  D C B A B C D", "E D C B A B C D E" };
		assertArrayEquals(result, output);
	}
	@Test
	public void displaypattern14Test02() {
		String result[] = ppMain.displaypattern14(input2);
		String output[] = null;
		assertArrayEquals(result, output);
	}
	@Test
	public void displaypattern14Test03() {
		String result[] = ppMain.displaypattern14(input3);
		String output[] = null;
		assertArrayEquals(result, output);
	}

	@Test
	public void displaypattern15Test01() {
		String result[] = ppMain.displaypattern15(input1);
		String output[] = { "* * * * * * * * *", "  * * * * * * *", "    * * * * *", "      * * *", "        *" };
		assertArrayEquals(result, output);
	}
	@Test
	public void displaypattern15Test02() {
		String result[] = ppMain.displaypattern15(input2);
		String output[] = null;
		assertArrayEquals(result, output);
	}
	@Test
	public void displaypattern15Test03() {
		String result[] = ppMain.displaypattern15(input3);
		String output[] = null;
		assertArrayEquals(result, output);
	}

	@Test
	public void displaypattern16Test01() {
		String result[] = ppMain.displaypattern16(input1);
		String output[] = { "9 9 9 9 9 9 9 9 9", "  7 7 7 7 7 7 7", "    5 5 5 5 5", "      3 3 3", "        1" };
		assertArrayEquals(result, output);
	}
	@Test
	public void displaypattern16Test02() {
		String result[] = ppMain.displaypattern16(input2);
		String output[] = null;
		assertArrayEquals(result, output);
	}
	@Test
	public void displaypattern16Test03() {
		String result[] = ppMain.displaypattern16(input3);
		String output[] = null;
		assertArrayEquals(result, output);
	}

	@Test
	public void displaypattern17Test01() {
		String result[] = ppMain.displaypattern17(input1);
		String output[] = { "        1", "      3 3 3", "    5 5 5 5 5", "  7 7 7 7 7 7 7", "9 9 9 9 9 9 9 9 9" };
		assertArrayEquals(result, output);
	}
	@Test
	public void displaypattern17Test02() {
		String result[] = ppMain.displaypattern17(input2);
		String output[] = null;
		assertArrayEquals(result, output);
	}
	@Test
	public void displaypattern17Test03() {
		String result[] = ppMain.displaypattern17(input3);
		String output[] = null;
		assertArrayEquals(result, output);
	}

	@Test
	public void displaypattern18Test01() {
		String result[] = ppMain.displaypattern18(input1);
		String output[] = { "        A", "      B B", "    C C C", "  D D D D", "E E E E E" };
		assertArrayEquals(result, output);
	}
	@Test
	public void displaypattern18Test02() {
		String result[] = ppMain.displaypattern18(input2);
		String output[] = null;
		assertArrayEquals(result, output);
	}
	@Test
	public void displaypattern18Test03() {
		String result[] = ppMain.displaypattern18(input3);
		String output[] = null;
		assertArrayEquals(result, output);
	}

	@Test
	public void displaypattern19Test01() {
		String result[] = ppMain.displaypattern19(input1);
		String output[] = { "E E E E E E E E E", "  D D D D D D D", "    C C C C C", "      B B B", "        A" };
		assertArrayEquals(result, output);
	}
	@Test
	public void displaypattern19Test02() {
		String result[] = ppMain.displaypattern19(input2);
		String output[] = null;
		assertArrayEquals(result, output);
	}
	@Test
	public void displaypattern19Test03() {
		String result[] = ppMain.displaypattern19(input3);
		String output[] = null;
		assertArrayEquals(result, output);
	}

	@Test
	public void displaypattern20Test01() {
		String result[] = ppMain.displaypattern20(input1);
		String output[] = { "I I I I I I I I I", "  G G G G G G G", "    E E E E E", "      C C C", "        A" };
		assertArrayEquals(result, output);
	}
	@Test
	public void displaypattern20Test02() {
		String result[] = ppMain.displaypattern20(input2);
		String output[] = null;
		assertArrayEquals(result, output);
	}
	@Test
	public void displaypattern20Test03() {
		String result[] = ppMain.displaypattern20(input3);
		String output[] = null;
		assertArrayEquals(result, output);
	}

	@Test
	public void displaypattern21Test01() {
		String result[] = ppMain.displaypattern21(input1);
		String output[] = { "ABCDE", "ABCD", "ABC", "AB", "A" };
		assertArrayEquals(result, output);
	}
	@Test
	public void displaypattern21Test02() {
		String result[] = ppMain.displaypattern21(input2);
		String output[] = null;
		assertArrayEquals(result, output);
	}
	@Test
	public void displaypattern21Test03() {
		String result[] = ppMain.displaypattern21(input3);
		String output[] = null;
		assertArrayEquals(result, output);
	}

	@Test
	public void displaypattern22Test01() {
		String result[] = ppMain.displaypattern22(input1);
		String output[] = { "*", "* *", "* * *", "* * * *", "* * * * *", "* * * *", "* * *", "* *", "*" };
		assertArrayEquals(result, output);
	}
	@Test
	public void displaypattern22Test02() {
		String result[] = ppMain.displaypattern22(input2);
		String output[] = null;
		assertArrayEquals(result, output);
	}
	@Test
	public void displaypattern22Test03() {
		String result[] = ppMain.displaypattern22(input3);
		String output[] = null;
		assertArrayEquals(result, output);
	}

	@Test
	public void displaypattern23Test01() {
		String result[] = ppMain.displaypattern23(input1);
		String output[] = { "4", "4 3", "4 3 2", "4 3 2 1", "4 3 2 1 0", "4 3 2 1", "4 3 2", "4 3", "4" };
		assertArrayEquals(result, output);
	}
	@Test
	public void displaypattern23Test02() {
		String result[] = ppMain.displaypattern23(input2);
		String output[] = null;
		assertArrayEquals(result, output);
	}
	@Test
	public void displaypattern23Test03() {
		String result[] = ppMain.displaypattern23(input3);
		String output[] = null;
		assertArrayEquals(result, output);
	}

	@Test
	public void displaypattern24Test01() {
		String result[] = ppMain.displaypattern24(input1);
		String output[] = { "4", "3 4", "2 3 4", "1 2 3 4", "0 1 2 3 4", "1 2 3 4", "2 3 4", "3 4", "4" };
		assertArrayEquals(result, output);
	}
	@Test
	public void displaypattern24Test02() {
		String result[] = ppMain.displaypattern24(input2);
		String output[] = null;
		assertArrayEquals(result, output);
	}
	@Test
	public void displaypattern24Test03() {
		String result[] = ppMain.displaypattern24(input3);
		String output[] = null;
		assertArrayEquals(result, output);
	}

	@Test
	public void displaypattern25Test01() {
		String result[] = ppMain.displaypattern25(input1);
		String output[] = { "E", "E D", "E D C", "E D C B", "E D C B A", "E D C B", "E D C", "E D", "E" };
		assertArrayEquals(result, output);
	}
	@Test
	public void displaypattern25Test02() {
		String result[] = ppMain.displaypattern25(input2);
		String output[] = null;
		assertArrayEquals(result, output);
	}
	@Test
	public void displaypattern25Test03() {
		String result[] = ppMain.displaypattern25(input3);
		String output[] = null;
		assertArrayEquals(result, output);
	}

	@Test
	public void displaypattern26Test01() {
		String result[] = ppMain.displaypattern26(input1);
		String output[] = { "E", "D E", "C D E", "B C D E", "A B C D E", "B C D E", "C D E", "D E", "E" };
		assertArrayEquals(result, output);
	}
	@Test
	public void displaypattern26Test02() {
		String result[] = ppMain.displaypattern26(input2);
		String output[] = null;
		assertArrayEquals(result, output);
	}
	@Test
	public void displaypattern26Test03() {
		String result[] = ppMain.displaypattern26(input3);
		String output[] = null;
		assertArrayEquals(result, output);
	}

	@Test
	public void displaypattern27Test01() {
		String result[] = ppMain.displaypattern27(input1);
		String output[] = { "        *", "      * *", "    * * *", "  * * * *", "* * * * *", "  * * * *", "    * * *",
				"      * *", "        *" };
		assertArrayEquals(result, output);
	}
	@Test
	public void displaypattern27Test02() {
		String result[] = ppMain.displaypattern27(input2);
		String output[] = null;
		assertArrayEquals(result, output);
	}
	@Test
	public void displaypattern27Test03() {
		String result[] = ppMain.displaypattern27(input3);
		String output[] = null;
		assertArrayEquals(result, output);
	}

	@Test
	public void displaypattern28Test01() {
		String result[] = ppMain.displaypattern28(input1);
		String output[] = { "        4", "      4 3", "    4 3 2", "  4 3 2 1", "4 3 2 1 0", "  4 3 2 1", "    4 3 2",
				"      4 3", "        4" };
		assertArrayEquals(result, output);
	}
	@Test
	public void displaypattern28Test02() {
		String result[] = ppMain.displaypattern28(input2);
		String output[] = null;
		assertArrayEquals(result, output);
	}
	@Test
	public void displaypattern28Test03() {
		String result[] = ppMain.displaypattern28(input3);
		String output[] = null;
		assertArrayEquals(result, output);
	}

	@Test
	public void displaypattern29Test01() {
		String result[] = ppMain.displaypattern29(input1);
		String output[] = { "        4", "      3 4", "    2 3 4", "  1 2 3 4", "0 1 2 3 4", "  1 2 3 4", "    2 3 4",
				"      3 4", "        4" };
		assertArrayEquals(result, output);
	}
	@Test
	public void displaypattern29Test02() {
		String result[] = ppMain.displaypattern29(input2);
		String output[] = null;
		assertArrayEquals(result, output);
	}
	@Test
	public void displaypattern29Test03() {
		String result[] = ppMain.displaypattern29(input3);
		String output[] = null;
		assertArrayEquals(result, output);
	}

	@Test
	public void displaypattern30Test01() {
		String result[] = ppMain.displaypattern30(input1);
		String output[] = { "        E", "      D E", "    C D E", "  B C D E", "A B C D E", "  B C D E", "    C D E",
				"      D E", "        E" };
		assertArrayEquals(result, output);
	}
	@Test
	public void displaypattern30Test02() {
		String result[] = ppMain.displaypattern30(input2);
		String output[] = null;
		assertArrayEquals(result, output);
	}
	@Test
	public void displaypattern30Test03() {
		String result[] = ppMain.displaypattern30(input3);
		String output[] = null;
		assertArrayEquals(result, output);
	}

	@Test
	public void displaypattern31Test01() {
		String result[] = ppMain.displaypattern31(input1);
		String output[] = { "        E", "      E D", "    E D C", "  E D C B", "E D C B A", "  E D C B", "    E D C",
				"      E D", "        E" };
		assertArrayEquals(result, output);
	}
	@Test
	public void displaypattern31Test02() {
		String result[] = ppMain.displaypattern31(input2);
		String output[] = null;
		assertArrayEquals(result, output);
	}
	@Test
	public void displaypattern31Test03() {
		String result[] = ppMain.displaypattern31(input3);
		String output[] = null;
		assertArrayEquals(result, output);
	}
	
	@Test
	public void displaypattern32Test01() {
		String input = "abc";
		String result = Double.toString(ppMain.displaypattern32(input));
		String output = "8.0";
		assertEquals(result, output);
	}
	
	@Test
	public void displaypattern32Test02() {
		String input = "zest";
		String result = Double.toString(ppMain.displaypattern32(input));
		String output = "1512.0";
		assertEquals(result, output);
	}
	@Test
	public void displaypattern32Test03() {
		String input = "kin@";
		String result = Double.toString(ppMain.displaypattern32(input));
		String output = "120.0";
		assertEquals(result, output);
	}
}
