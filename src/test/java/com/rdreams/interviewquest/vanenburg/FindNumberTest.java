package com.rdreams.interviewquest.vanenburg;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindNumberTest {
    FindNumbers obj = new FindNumbers();
    @Test
    public void getNumbers_Testcase01() {
       obj.setNumbers(new int[] {1,5,4,1,3},5);
        String actualOutput = obj.toString();
        String expectedOutput = "missing number=2 and duplicate number=1";
       assertEquals(expectedOutput, actualOutput);
    }
}
