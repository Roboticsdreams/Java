package com.rdreams.interviewquest.vanenburg;

/*
write a code to print the second-largest number in a given unsorted array with duplicates in O(n) complexity
input : [1,6,3,2,1,3,5,9,7,9,9]
output : 7
 */

public class SecondLargestNumber {
    public int getSecondLargestNumber(int[] nums) {
        int max = Integer.MIN_VALUE;
        int secondmax = max;

        for(int num : nums) {
            if (max < num) {
                secondmax = max;
                max = num;
            }
            else if (max > num && secondmax < num) {
                secondmax = num;
            }
        }
        if (secondmax == Integer.MIN_VALUE) {
            return  -1;
        }
        return secondmax;
    }
}
