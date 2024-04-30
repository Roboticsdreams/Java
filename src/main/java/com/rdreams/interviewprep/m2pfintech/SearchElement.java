package com.rdreams.interviewprep.m2pfintech;

import java.util.Arrays;
import java.util.function.IntPredicate;

public class SearchElement {
    public boolean unsortedSearch1(int[] array, int num) {
        for(int n:array) {
            if (n==num) {
                return true;
            }
        }
        return false;
    }

    public boolean unsortedSearch2(int[] array, int num) {
        return recursiveSearch(array,array.length-1, num);
    }

    public boolean recursiveSearch(int[] array, int index, int num) {
        if (index < 0 ){
            return false;
        }
        if (array[index] == num) {
            return true;
        }
        else {
            return recursiveSearch(array, index-1, num);
        }
    }

    public boolean unsortedSearch3(int[] array, int num) {
        IntPredicate checkNum = (x) -> { if (x == num) return true; return false;};
        return Arrays.stream(array).anyMatch(checkNum);
    }

    public int unsortedSearch4(int[] array, int num) {
        return Arrays.stream(array).filter(x -> num==x).findAny().orElse(-1);
    }
}
