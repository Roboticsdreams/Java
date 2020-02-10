package com.codechallenges.techgig;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class TechWeekChallengeMain {

	public String uncommonBetweenCommon(int[] input1, int[] input2) {
		int i;
		String res = "";
		HashSet<Integer> setA = new HashSet<Integer>();
		HashSet<Integer> setB = new HashSet<Integer>();
		HashSet<Integer> result = new HashSet<Integer>();

		for (i = 0; i < input1.length; i++) {
			setA.add(input1[i]);
		}
		for (i = 0; i < input2.length; i++) {
			setB.add(input2[i]);
		}
		for (Integer el : setA) {
			if (!setB.contains(el)) {
				result.add(el);
			}
		}

		for (Integer el : setB) {
			if (!setA.contains(el)) {
				result.add(el);
			}
		}

		Iterator<Integer> iterator = result.iterator();
		while (iterator.hasNext()) {
			int temp = (int) iterator.next();
			res = res + "$" + temp;
		}
		return res.substring(1);
	}

	public String sentenceReverse(String input) {
		String strArray[] = input.split(" ");
		int n = strArray.length;
		String output = strArray[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			output += " " + strArray[i];
		}
		return output;
	}

	public int divideAndRule(int input, int[] input1) {
		Map<String, Integer> tot = new HashMap<String, Integer>();
		String str1, str2;
		int c = input;
		if (c > 2 && c <= 100) {
			int temp1 = 0, temp2, cnt = 0;
			for (int i = 0; i < (1 << c); i++) {
				cnt = 0;
				temp1 = 0;
				str1 = "";
				for (int j = 0; j < c; j++) {
					if ((i & (1 << j)) > 0) {
						temp1 += input1[j];
						str1 += input1[j] + " ";
						cnt++;
					}
				}
				if (cnt == c / 2) {
					if (tot.containsKey(str1)) {
						return 1;
					}
					tot.put(str1, temp1);
				}
			}

			Comparator<Map.Entry<String, Integer>> byMapValues = new Comparator<Map.Entry<String, Integer>>() {
				@Override
				public int compare(Map.Entry<String, Integer> left, Map.Entry<String, Integer> right) {
					return left.getValue().compareTo(right.getValue());
				}
			};

			List<Map.Entry<String, Integer>> sortmap = new ArrayList<Map.Entry<String, Integer>>();
			sortmap.addAll(tot.entrySet());
			Collections.sort(sortmap, byMapValues);

			str1 = "";
			for (Map.Entry<String, Integer> entry : sortmap) {
				str2 = entry.getKey();
				temp2 = entry.getValue();
				if (temp1 == temp2) {
					return 1;
				}
				temp1 = temp2;
				str1 = str2;
			}
		}
		return -1;
	}

	public int possibleMoves(int input1) {
		int output = input1 > 0 ? ((2 * input1) + 3) * (((2 * input1) + 3)) : 0;
		return output;
	}

	public String farmsDivision(int[] input) {
		int leftSum = 0, rightSum = 0, i, j;
		if (input.length <= 1)
			return "invalid";
		for (i = 0, j = input.length - 1; i <= j;) {
			if ((input[i] < 1) || (input[j] < 1))
				return "invalid";

			if (leftSum <= rightSum) {
				leftSum += input[i];
				i++;
			} else {
				rightSum += input[j];
				j--;
			}
		}
		return (rightSum == leftSum) ? "yes" : "no";
	}

	public int wordCount(String[][] input1, String input2) {
		StringBuilder temp = new StringBuilder();
		int k = input2.length();
		int n = input1[0].length;
		int i, j, p, q;
		HashSet<String> set = new HashSet<String>();
		if (k > n)
			return 0;

		for (i = 0; i < n - k + 1; i++) {
			for (j = 0; j < n - k + 1; j++) {

				for (p = i; p < k + i; p++) {
					temp.setLength(0);
					for (q = j; q < k + j; q++)
						temp.append(input1[p][q]);
					if (temp.toString().equals(input2) || temp.reverse().toString().equals(input2)) {
						set.add("[" + p + "][" + j + "]-[" + p + "][" + (q - 1) + "]");
					}
				}

				for (q = i; q < k + i; q++) {
					temp.setLength(0);
					for (p = j; p < k + j; p++)
						temp.append(input1[p][q]);
					if (temp.toString().equals(input2) || temp.reverse().toString().equals(input2)) {
						set.add("[" + j + "][" + q + "]-[" + (p - 1) + "][" + q + "]");
					}
				}

				temp.setLength(0);
				for (p = i, q = j; p < k + i && q < k + j; p++, q++) {
					temp.append(input1[p][q]);
				}
				if (temp.toString().equals(input2) || temp.reverse().toString().equals(input2)) {
					set.add("[" + p + "][" + j + "]-[" + p + "][" + q + "]");
				}
				temp.setLength(0);
				for (p = i, q = k + j - 1; p < k + i && q >= j; p++, q--) {
					temp.append(input1[p][q]);
				}
				if (temp.toString().equals(input2) || temp.reverse().toString().equals(input2)) {
					set.add("[" + p + "][" + (k + j - 1) + "]-[" + p + "][" + q + "]");
				}
			}
		}

		return set.size();
	}

	public int[] getJoinedPipes(int[] input) {
		int n = input.length;
		if (n <= 1) {
			return new int[] { 0 };
		}
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> res = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			list.add(input[i]);
		}

		while (list.size() >= 2) {
			Collections.sort(list);
			int temp = list.get(0) + list.get(1);
			res.add(temp);
			list.remove(0);
			list.remove(0);
			list.add(temp);
		}

		int[] result = new int[res.size()];
		int i = 0;
		for (int num : res) {
			result[i++] = num;
		}
		return result;
	}
	public int balancedStringOrNot(String input1) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < input1.length(); i++) {

			char ch = input1.charAt(i);
			if (ch == '(' || ch == '[' || ch == '{') {
				if (ch == '(') {
					stack.push(')');
				} else if (ch == '[') {
					stack.push(']');
				} else {
					stack.push('}');
				}
			} else if (ch == ')' || ch == ']' || ch == '}') {
				// nothing to match with
				if (stack.isEmpty()) {
					return -1;
				} else if (stack.pop() != ch) {
					return -1;
				}

			}
		}
		if (stack.isEmpty()) {
			return 1;
		} else {
			return -1;
		}
	}
}
