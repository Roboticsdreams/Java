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
        char[] charname1 = name1.toCharArray();
        char[] charname2 = name2.toCharArray();
        Arrays.sort(charname1);
        Arrays.sort(charname2);
        List<Character> chars = getIntersection(charname1,charname2);
        int charcount = chars.size();

        String flames = "FLAMES";
        StringBuilder sb = new StringBuilder(flames);

        while(sb.length()!=1)
        {
            int val = charcount % sb.length();
            String temp;

            if(val!=0) {
                temp = sb.substring(val)+sb.substring(0, val-1);
            }
            else {
                temp = sb.substring(0, sb.length()-1);
            }
            sb = new StringBuilder(temp);
        }
        return sb.toString();
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
}
