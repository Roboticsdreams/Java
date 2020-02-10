package com.codechallenges.techgig;

public class BeginnerCodeChampMain {

	/*
	Chess Championship 
	Germany is organizing a world level chess championship. Various players participated in the tournament all over the world. Each player is assigned a different puzzle to solve related to chess only. In the final level, they are planning to give a single puzzle to solve to both of the contestants. Assuming that the king starts on some square of an infinite chessboard. In the puzzle of chess, the king can move to any neighboring square horizontally, vertically, or diagonally. In this puzzle, the king takes one move extra after n number of moves. You have to find that in how many different squares can the king be after n moves?

			a	b	c 	d 	e 	f 	g 	h 	
		8	[]	[]	[]	[]	[]	[]	[]	[]	8
		7	[]	[]	[]	[]	[]	[]	[]	[]	7
		6	[]	[]	[]	[]	[]	[]	[]	[]	6
		5	[]	[]	[]	[x]	[x]	[x]	[]	[]	5
		4	[]	[]	[]	[x]	[K]	[x]	[]	[]	4
		3	[]	[]	[]	[x]	[x]	[x]	[]	[]	3
		2	[]	[]	[]	[]	[]	[]	[]	[]	2
		1	[]	[]	[]	[]	[]	[]	[]	[]	1
			a	b	c 	d 	e 	f 	g 	h 	

	Input Format
	Your function will have one integer(n) depicting the number of moves taken by the king in the starting position

	Output Format
	Output will be the total number of different squares king can cover after n moves 

	Sample Test Case
	Sample Input
	2
	Sample Output
	49

	Explanation
			a	b	c 	d 	e 	f 	g 	h 	
		8	[]	[]	[]	[]	[]	[]	[]	[]	8
		7	[]	[x]	[x]	[x]	[x]	[x]	[x]	[x]	7
		6	[]	[x]	[x]	[x]	[x]	[x]	[x]	[x]	6
		5	[]	[x]	[x]	[x]	[x]	[x]	[x]	[x]	5
		4	[]	[x]	[x]	[x]	[K]	[x]	[x]	[x]	4
		3	[]	[x]	[x]	[x]	[x]	[x]	[x]	[x]	3
		2	[]	[x]	[x]	[x]	[x]	[x]	[x]	[x]	2
		1	[]	[x]	[x]	[x]	[x]	[x]	[x]	[x]	1
			a	b	c 	d 	e 	f 	g 	h 	
	 */

	public int findingMoves(int n) {
		int result = 1;
		for (int i = 1; i <= (n + 1); i++) {
			result = result + (i * 8);
		}
		return result;
	}

}
