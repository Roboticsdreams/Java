package com.rdreams.onlinecourses.codingninjas.basicsofjava.arrays;

/*
Problem Statement

Take an array with n elements with possibly duplicate elements as the input.
The task is to find the index of the first occurrences of the element x in the array and,
 if it not present, return -1.

Sample Input:
7 5 3 11 3 43 1 1
3

Sample Output:
2

Explanation:
3 is present twice in the input array and the first time it appears is at index 2.
*/
public class FirstIndex {
    public int getFirstIndex(int[] arr, int target) {

        for(int i=0; i< arr.length;i++) {
            if(arr[i] == target){
                return i;
            }
        }

        return -1;
    }
}
