package com.interviewquest.freshworks;

import java.util.HashMap;
import java.util.Map;

public class FreshworksMain {
	public String flames(String name1, String name2) {
		Map<Character, Integer> map = new HashMap<>();

		for (char c : name1.toCharArray()) {
			if (map.containsKey(c)) {
				Integer val = map.get(c);
				map.put(c, val + 1);
			} else {
				map.put(c, 1);
			}
		}
		StringBuilder str = new StringBuilder();
		int counter = 0;
		for (char c : name2.toCharArray()) {
			if (map.containsKey(c)) {
				Integer val = map.get(c);
				if (val == 1) {
					map.remove(c);
				} else {
					map.put(c, val - 1);
				}
			} else {
				str.append(c);
				counter++;
			}
		}
		for (Character key : map.keySet()) {
			int len = map.get(key);
			if (len > 1) {
				for (int i = 0; i < len; i++) {
					str.append(key);
				}
				counter += len;
			} else {
				counter++;
				str.append(key);
			}

		}

		String flamesstr = "flames";
		while (flamesstr.length() != 1) {
			int temp = counter % flamesstr.length();
			if (temp == 0) {
				flamesstr = flamesstr.substring(0, flamesstr.length() - 1);
			} else {
				flamesstr = flamesstr.substring(temp) + flamesstr.substring(0, temp - 1);
			}
		}
		return flamesstr;
	}
	
	public String sumofArray(int[] array, int sum) {
		StringBuilder result = new StringBuilder();
		 Map<Integer,Integer> map= new HashMap<>();
		 for (int i=0;i<array.length;i++){
		     int key = sum - array[i];
		     if(map.containsKey(key)) {
		         result.append("["+key +","+array[i]+"]");
		     }
		     else {
		         map.put(array[i],1);
		     }
		 }	 
		return result.toString();
	}

}
