package com.rdreams.interviewquest.crayondata;

import java.util.HashMap;
import java.util.Map;

/*
Write a program to check given two files are equal,
but the given constraint is each file is 10GB text files
consider this scenario and write your code accordingly.
 */

public class MatchFile {
    public boolean isFileMatch(String file1, String file2) {
        if (file1 == null || file2 == null) {
            return false;
        }
        else {
            Map<String, Integer> map = getMap(file1);
            String[] file2str = file2.split(" ");
            for (String s: file2str) {
                if (map.getOrDefault(s, -1) == -1) {
                    return  false;
                }
                else {
                    int count = map.get(s);
                    if (count <= 1) {
                        map.remove(s);
                    }
                    else {
                        map.put(s,count-1);
                    }
                }
            }
            return map.isEmpty();
        }
    }

    public Map<String, Integer> getMap(String file) {
        String[] str = file.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (String s: str) {
            if (map.getOrDefault(s, -1) == -1) {
                map.put(s,1);
            }
            else {
                map.put(s,map.getOrDefault(s,-1)+1);
            }
        }
        return map;
    }
}
