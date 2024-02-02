package com.rdreams.interviewquest.zemoso;

import java.util.*;

/*
Given an array of words, print all anagrams together.
For example, if the given array is {“cat”, “dog”, “tac”, “god”, “act”},
then output may be “cat tac act dog god”.
 */
public class AnagramSets {
    public  List<List<String>> getAnagramSets(List<String> list) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String s: list) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String newstr = Arrays.toString(chars);
            if (map.getOrDefault(newstr,null)== null) {
                List<String> strlist = new ArrayList<>();
                strlist.add(s);
                map.put(newstr, strlist);
            }
            else {
                List<String> strlist = map.get(newstr);
                strlist.add(s);
                map.put(newstr, strlist);
            }
        }
        List<List<String>> result = new ArrayList<>();
        for(Map.Entry<String,List<String>> iterator: map.entrySet()) {
            if(iterator.getValue().size() > 1) {
                result.add(iterator.getValue());
            }
        }
        return result;
    }
}
