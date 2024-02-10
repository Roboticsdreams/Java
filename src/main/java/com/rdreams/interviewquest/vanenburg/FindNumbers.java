package com.rdreams.interviewquest.vanenburg;

/*
write a code to print the missing number and only one repeated number in a array of length 100
with O(N) time complexity and O(1) space complexity
input: [1,100,98,96,34,67,98.....2]
output : missing number = 99 and duplicate number = 98
 */

public class FindNumbers {
    private int missingnumber;
    private int duplicatenumber;

    public void setNumbers(int[] nums, int n) {
        int sumofarrays = 0;

        for(int i :nums){
            sumofarrays += i;
        }

        int i = 0;
        while(i<n) {
            if(nums[i] != nums[nums[i]-1]) {
                swap(nums, i, nums[i]-1);
            }
            else {
                if (nums[i] != i+1) {
                    this.missingnumber = i+1;
                }
                i++;
            }
        }
        int sumofnumbers= (n *(n+1))/2;
        this.duplicatenumber = sumofarrays+missingnumber-sumofnumbers;
    }

    public void swap(int[] num, int i, int j) {
        int temp = num[i];
        num[i] = num[j];
        num[j] = temp;
    }

    @Override
    public String toString() {
        return "missing number="+this.missingnumber + " and duplicate number="+this.duplicatenumber;
    }
}
