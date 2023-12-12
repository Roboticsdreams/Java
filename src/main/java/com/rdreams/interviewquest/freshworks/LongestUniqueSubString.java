package com.rdreams.interviewquest.freshworks;

import java.util.HashMap;
import java.util.Map;

public class LongestUniqueSubString {
    public int getMaxUniqueSubStr(String inputString) {
        Map<Character,Integer> map = new HashMap<>();
        char[] chars = inputString.toCharArray();
        int res = 0;
        int start = 0;
        for(int i=0; i<chars.length;i++){
            if (map.getOrDefault(chars[i],-1) == -1) {
                map.put(chars[i],i);
            }
            else {
                start = map.getOrDefault(chars[i],-1)+1;
                map.put(chars[i],i);
            }
            res = Math.max(res, (i-start+1));
        }
        return res;
    }
}