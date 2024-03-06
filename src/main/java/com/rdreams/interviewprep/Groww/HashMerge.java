package com.rdreams.interviewprep.Groww;

import java.util.HashMap;
import java.util.Map;

/*
How to Join or Merge Two Maps in Java, If duplicate key present then sum of the values.
Example:
Input:
Map 1 = { apple: 3, mango : 2 }
Map 2 = { orange:3, apple: 2 }

Output:
Map = { apple: 5, mango : 2, orange: 3 }
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
