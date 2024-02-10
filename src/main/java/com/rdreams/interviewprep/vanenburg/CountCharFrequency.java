package com.rdreams.interviewprep.vanenburg;
import java.util.*;

/*
write a code to print the names and the count of given character in that names.
input : { "John","Honey","Assa"} and match character = a
output ; { "Assa", 2 };
 */

public class CountCharFrequency {
    public Map<String,Integer> getCharacterCounts(String[] names, char inputchar) {
        Map<String,Integer> map = new HashMap<>();
        for(String name:names) {
            String newname = name.toLowerCase();
            int charcount = 0;
            for(char c:newname.toCharArray()) {
                if(c == inputchar) {
                    charcount++;
                }
            }
            if(charcount > 0) {
                map.put(name,charcount);
            }
        }
        return map;
    }
}
