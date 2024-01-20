package com.rdreams.interviewquest.zemoso;

import java.util.*;

/*
Given list of strings need to be sorted based on length of string.

Example 1:
Input:  ["C++","C","Python","Java","Kotlin"]
Output: ["C","C++","Java","Python","Kotlin"]
Explanation: list of strings sorted based on length of the string.
 */

public class sortListOfStrings {
    public List<String> sortListBasedOnLength(List<String> listOfStrings) {
        List<String> result = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for(String s: listOfStrings){
            map.put(s,s.length());
        }
        List<Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());
        list.forEach((courses) -> result.add(courses.getKey()));
        return result;
    }
}
