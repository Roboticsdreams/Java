package com.rdreams.interviewprep.vanenburg;

/*
write a code to print the missing number and only one repeated number in a array of length 100
with O(N) time complexity and O(1) space complexity
 */

public class MissingNumber {
    public int getMissingNumber(int[] num, int n) {
        int i = 0;
        int missing = 0;
        while(i<n) {
            if (num[i] != num[num[i]-1]) {
                swap(num, i, num[i]-1);
            }
            else {
                if(num[i] != i+1) {
                    missing = i+1;
                }
                i++;
            }
        }
        return missing;
    }

    public void swap(int[] num, int i, int j) {
        int temp = num[i];
        num[i] = num[j];
        num[j] = temp;
    }
}
