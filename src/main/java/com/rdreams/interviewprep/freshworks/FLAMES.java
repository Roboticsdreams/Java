package com.rdreams.interviewprep.freshworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Write a program to implement FLAMES game
Input: Player1 = AJAY, Player2 = PRIYA
Output: F
 */
public class FLAMES {
    public String getFLAMES(String name1, String name2) {
        char[] flames = new char[]{'F','L','A','M','E','S'};
        char[] charname1 = name1.toCharArray();
        char[] charname2 = name2.toCharArray();
        Arrays.sort(charname1);
        Arrays.sort(charname2);
        List<Character> chars = getIntersection(charname1,charname2);
        int rc = chars.size();
        int fc = flames.length-1;
        int l = 1, i = 0;
        while (i >= 0) {
            if (l==rc) {
                for (int k = i; k < flames.length-1; k++) {
                    flames[k] = flames[k + 1];
                }
                flames[flames.length-1] = '0';
                fc--;
                i--;
                l = 0;
            }
            if (i==fc) {
                i = -1;
            }
            if(fc == 0) {
                break;
            }
            l++;
            i++;
        }
        return flames[0]+"";
    }

    public List<Character> getIntersection(char[] name1, char[] name2) {
        int n1 = name1.length;
        int n2 = name2.length;
        int i = 0, j = 0;
        List<Character> list = new ArrayList<>();
        while (i<n1 && j<n2) {
            if (name1[i] == name2[j]) {
                i++;
                j++;
            } else if (name1[i] < name2[j]) {
                list.add(name1[i]);
                i++;
            }
            else {
                list.add(name2[j]);
                j++;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String s1 = "raja";
        String s2 = "rani";
        FLAMES f = new FLAMES();
        System.out.println(f.getFLAMES(s1,s2));
    }
}
