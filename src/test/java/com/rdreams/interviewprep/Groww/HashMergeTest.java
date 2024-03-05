package com.rdreams.interviewprep.Groww;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HashMergeTest {
    HashMerge obj = new HashMerge();

    @Test
    public void getMergedHash_Testcase01 (){
        Map<String, Integer> map1 = new HashMap<>() ;
        map1.put("apple",3);
        map1.put("mango",5);
        Map<String, Integer> map2 = new HashMap<>() ;
        map2.put("apple",2);
        map2.put("orange",1);

        Map<String, Integer> expectedOutput = new HashMap<>();
        expectedOutput.put("apple",5);
        expectedOutput.put("mango",5);
        expectedOutput.put("orange",1);
        Map<String, Integer> actualOutput = obj.getMergedHash(map1,map2);
        assertEquals(actualOutput,expectedOutput);
    }
}
