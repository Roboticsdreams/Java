package com.rdreams.onlinecourses.codingninjas.basicsofjava.controlstatements;

/*
You have been given a number 'N'. Your task is to find the sum of all even numbers from 1 to 'N' (both inclusive).

Example :
Given 'N' : 6
Sum of all even numbers till 'N' will be : 2 + 4 + 6 = 12
 */
public class EvenSumTillN {
    public int getEvenSumTillN(int n) {
        int result = 0;
        for(int i=2;i<=n;i +=2){
            result += i;
        }
        return result;
    }
}
