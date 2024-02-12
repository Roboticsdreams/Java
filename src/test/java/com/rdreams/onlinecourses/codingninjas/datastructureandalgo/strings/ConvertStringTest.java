package com.rdreams.onlinecourses.codingninjas.datastructureandalgo.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConvertStringTest {
    ConvertString obj = new ConvertString();
    @Test
    public void getConvertString_TestCase01() {
        String expectedOutput = "D MAhGiRTWAb VbgGMnCNKY BVmGVbweFo JrOQXyIQuK RqLzyaMaN";
        String inputStr = "d mAhGiRTWAb vbgGMnCNKY bVmGVbweFo jrOQXyIQuK rqLzyaMaN";
        String actualOutput = obj.convertString(inputStr);
        assertEquals(expectedOutput, actualOutput);
    }

}
