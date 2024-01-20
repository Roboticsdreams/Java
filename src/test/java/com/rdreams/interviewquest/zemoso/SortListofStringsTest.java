package com.rdreams.interviewquest.zemoso;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortListofStringsTest {
    sortListOfStrings obj = new sortListOfStrings();

    @Test
    void sortListBasedonLength_Testcase01() {
        List<String> strlist = Arrays.asList("C++","C","Python","Java","Kotlin");
        List<String> actualOutput = obj.sortListBasedOnLength(strlist);
        List<String> expectedOutput = Arrays.asList("C","C++","Java","Python","Kotlin");
        assertEquals(expectedOutput, actualOutput);
    }
}
