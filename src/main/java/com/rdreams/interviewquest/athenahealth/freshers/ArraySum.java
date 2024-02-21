package com.rdreams.interviewquest.athenahealth.freshers;

/*
Write a program to sum of all the elements in a given array.
 */
public class ArraySum {
    public int getSumOfArray(int[] nums) {
        int sum = 0;
        for(int i : nums) {
            sum += i;
        }
        return sum;
    }
}
