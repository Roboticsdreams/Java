package com.rdreams.onlinecourses.codingninjas.datastructureandalgo.strings;

/*
You are given a string 'STR'. You have to convert the first alphabet of each word in a string to UPPER CASE.

For example:
If the given string 'STR' = ”I am a student of the third year”
so you have to transform this string to ”I Am A Student Of The Third Year"
 */
public class ConvertString {
    public String convertString(String str) {
        StringBuilder s = new StringBuilder(str);
        s.setCharAt(0, Character.toUpperCase(s.charAt(0)));
        for(int i=1; i<str.length();i++) {
            if(s.charAt(i-1)==' '){
                s.setCharAt(i,Character.toUpperCase(s.charAt(i)));
            }
        }
        return s.toString();
    }
}
