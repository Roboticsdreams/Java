package com.rdreams.interviewquest.syncari;

import java.util.*;

/*
Find pairs with given sum in list of integers
arr = [8, 7, 2, 5, 3, 1]
target = 10
Result = [8,2,7,3]
*/

public class FindPairs {
    public List<Integer> getFindingPairs(List<Integer> elements,int target) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer i : elements) {
            int key = target - i;
            if (map.getOrDefault(key, -1) == -1) {
                map.put(i,key);
            }
            else {
                result.add(key);
                result.add(i);
                map.remove(i);
            }
        }
        return  result;
    }
}
