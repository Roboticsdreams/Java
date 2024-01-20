package com.rdreams.interviewquest.zemoso;

import java.util.stream.Collectors;
import java.util.stream.Stream;


/*
How to calculate the Fibonacci series of a given number using Java 8 streams.

Example 1:
Input: s = 10
Output: 0,1,1,2,3,5,8,13,21,34
Explanation: The fibonacci series for limit 10.
*/

public class FibnoacciSeries {
    public String getFibnoacciSeries (int n) {
       return Stream.iterate(new int[] { 0, 1}, t -> new int [] { t[1], t[0]+t[1]})
               .limit(n)
               .map(t -> t[0])
               .map(String::valueOf)
               .collect(Collectors.joining(","));
    }
}
