package com.rdreams.interviewquest.athenahealth.freshers;

import java.util.HashSet;
import java.util.Set;

/*
Write a program to remove duplicate and get unique elements in a given array.
 */
public class UniqueElements {
    public Set<Integer> getUniqueElements(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i:nums) {
            set.add(i);
        }
        return  set;
    }
}
