package com.rdreams.interviewprep.digitalocean;

public class ReverseString {
    public String reverseString(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = str.toCharArray();
        for(int i=chars.length-1;i>=0;i--)
            stringBuilder.append(chars[i]);
        return stringBuilder.toString();
    }
}
