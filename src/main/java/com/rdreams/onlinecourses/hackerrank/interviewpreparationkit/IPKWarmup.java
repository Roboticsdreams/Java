package com.rdreams.onlinecourses.hackerrank.interviewpreparationkit;

import java.util.HashMap;
import java.util.Stack;

public class IPKWarmup {
    public int sockMerchant(int n, int[] ar) {
        int result = 0;
        Integer hashvalue;
        if (n > 1 && n <= 100) {
            HashMap<Integer, Integer> hm = new HashMap<>();
            for (int i = 0; i < n; i++) {
                if (!hm.containsKey(ar[i])) {
                    hm.put(ar[i], 1);
                    hashvalue = 0;
                } else {
                    hashvalue = hm.get(ar[i]);
                    Integer intkey = ar[i];
                    Integer intval = hashvalue + 1;
                    hm.put(intkey, intval);
                }
                if ((hashvalue + 1) % 2 == 0) {
                    result++;
                }
            }
        }
        return result;
    }

    public int countingValleys(String s) {
        int result = 0;
        Stack<Character> stack = new Stack<>();
        char[] stringToCharArray = s.toCharArray();
        for (char ar : stringToCharArray) {
            if (stack.isEmpty()) {
                if (ar == 'D') {
                    result++;
                }
                stack.push(ar);
            } else if (stack.peek() == ar) {
                stack.push(ar);
            } else {
                stack.pop();
            }
        }
        return result;
    }

    public int jumpingOnClouds(int[] c) {
        int jumps = 0;
        int i = 0, n = c.length;
        while (i < n - 3) {
            i += (c[i + 2] == 0) ? 2 : 1;
            jumps++;
        }
        jumps++;
        return jumps;
    }

    public long repeatedString(String s, long n) {
        long result;
        int divisor = s.length();
        long quotient = n / divisor;
        long remainder = n % divisor;
        int fullcounter = 0;
        int remaindercounter = 0;
        for (int i = 0; i < divisor; i++) {
            if (s.charAt(i) == 'a') {
                fullcounter++;
                if (i < remainder) {
                    remaindercounter++;
                }
            }
        }
        result = (quotient * fullcounter) + remaindercounter;
        return result;
    }
}

