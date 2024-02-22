package com.rdreams.interviewprep.Groww;

import java.util.ArrayList;
import java.util.List;

/*
Minimum Number of Platforms Required for a Railway/Bus Station

Given the arrival and departure times of all trains that reach a railway station,
the task is to find the minimum number of platforms required for the railway station
so that no train waits. We are given two arrays that represent the arrival and
departure times of trains that stop.

Examples:
Input: arr[] = {9:00, 9:40, 9:50, 11:00, 15:00, 18:00}, dep[] = {9:10, 12:00, 11:20, 11:30, 19:00, 20:00}
Output: 3
Explanation: There are at-most three trains at a time (time between 9:40 to 12:00)

Input: arr[] = {9:00, 9:40}, dep[] = {9:10, 12:00}
Output: 1
Explanation: Only one platform is needed.
 */
public class MinimumPlatform {
    public int calculateMinPatforms(int[] at, int[] dt) {
        int n = at.length;
        List<Integer> list = new ArrayList<>();
        int min = 0;
        for(int i =1; i<n; i++) {
            if (at[i] < dt[i-1]) {
                list.add(dt[i-1]);
            }
            for(Integer integer : new ArrayList<>(list)) {
                if (at[i] > integer) {
                    list.remove(integer);
                }
            }
            min = Math.max(min, list.size());
        }
        return min+1;
    }
}
