package com.rdreams.interviewprep.Groww;

import java.util.HashMap;
import java.util.Map;

/*
How to merge two given hashmap and if given key already exists then sum up the counts.

Example:
Input:
Map1 = { "apple": 3, "mango":5}
Map2 = { "apple": 2, "orange": 1}

Output:
Map = { "apple": 5, "mango":5, "orange":1};
 */
public class HashMerge {
    public Map<String, Integer> getMergedHash(Map<String, Integer> mapinput1, Map<String, Integer> mapinput2) {
        Map<String, Integer> result = new HashMap<>(mapinput1);

        for(Map.Entry<String,Integer> map:mapinput2.entrySet()) {
            if(result.getOrDefault(map.getKey(),-1) == -1) {
                result.put(map.getKey(), map.getValue());
            }
            else {
                result.merge(map.getKey(),map.getValue(),Integer::sum);
            }
        }
        return result;
    }
}
