package com.rdreams.interviewquest.zemoso;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnagramSetsTest {
    AnagramSets obj = new AnagramSets();

    @Test
    public void getAnagramSets_Testcase01() {
        List<String> list = Arrays.asList("cat", "dog", "tac", "god", "act","arts");
        List<List<String>> actualOutput = obj.getAnagramSets(list);

        List<String> list1 = Arrays.asList("cat","tac","act");
        List<String> list2 = Arrays.asList("dog","god");
        List<List<String>> expectedOutput = Arrays.asList(list2,list1);
        assertEquals(expectedOutput, actualOutput);
    }
}
