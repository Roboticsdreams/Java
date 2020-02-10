package com.codechallenges.techgig;

import java.util.HashMap;
import java.util.Map;

public class PrimeCodeChampMain {
	/*
	Game Center
	You and your friend go to a game arcade where you choose to play the lucky pick game. In the game, there is a square grid and on each block some money is placed on it. When a player chooses a block, the machine randomly chooses a block from the available neighbouring and the chosen block (consider 8 neighbourhood). The player is awarded the money that is placed on the block that the machine selects. Your friend needs help choosing the block.Your job is to return the block position(s) that will maximize the minimum amount your friend will win for sure. If there are more than one such block positions then output must return all these positions.

	Input Format 
	You will be given a function which contains single argument representing the Grid Description(in the form of string array) {N rows each containing N numbers separated by '#', each number representing the amount of money put on that block}

	Output Format
	You need to return the array of string containing the position(s) of a block choosing which will give the maximum amount of money which your friend will definitely win.

	Sample Test Case 1
	Sample Input
	3
	12#45#33 94#54#23 98#59#27
	Sample Output
	3#1
	Explanation
	In the above example, if he selects the block (3,1), then under the best case, he could win is 98 and under the worst case the maximum he could win is 54. In such scenario, the worst case of block (3,1) gives your friend more money than the worst case of other blocks

	Sample Test Case 2
	Sample Input
	4
	12#45#33#27 94#54#23#53 98#59#27#62 11#51#67#13
	Sample Output
	1#3 1#4 2#3 2#4
	Explanation                                     
	Note: If the output array contains multiple strings(block's positions), all the positions must be in the row-wise traversal order. In Example 2, the output is {1#3,1#4,2#3,2#4}. If yourfunction is returning an arraythat has same elements (block's position) but in the different order, then the output array will be incorrect. 
	 */
	public String[] gameCenter(String[] input1) {

		int n = input1.length;
		int i, j, tempmin;
		int start1, start2, end1, end2;
		String temp = "";
		String[][] str = new String[n][n];
		Map<String, Integer> map = new HashMap<String, Integer>();

		for (i = 0; i < n; i++) {
			str[i] = input1[i].split("#");
		}

		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				tempmin = Integer.parseInt(str[i][j]);
				start1 = i - 1 < 0 ? 0 : i - 1;
				end1 = i + 1 > n - 1 ? n - 1 : i + 1;
				start2 = j - 1 < 0 ? 0 : j - 1;
				end2 = j + 1 > n - 1 ? n - 1 : j + 1;

				for (int loop1 = start1; loop1 <= end1; loop1++) {
					for (int loop2 = start2; loop2 <= end2; loop2++) {
						if (tempmin > Integer.parseInt(str[loop1][loop2])) {
							tempmin = Integer.parseInt(str[loop1][loop2]);
						}
					}
				}

				map.put(i + 1 + "#" + (j + 1), tempmin);
			}
		}
		int max = map.values().stream().max(Integer::compare).get();
		for (Map.Entry<String, Integer> m : map.entrySet()) {
			if (m.getValue().equals(max))
				temp += m.getKey() + "=";
		}

		String[] result = temp.split("=");
		return result;
	}
}
