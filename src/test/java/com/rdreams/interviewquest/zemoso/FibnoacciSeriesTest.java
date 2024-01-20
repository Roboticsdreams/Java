package com.rdreams.interviewquest.zemoso;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibnoacciSeriesTest {
    FibnoacciSeries obj = new FibnoacciSeries();

    @Test
    void getFibnoacciSeries_Testcase01() {
        String expectedOutput = "0,1,1,2,3,5,8,13,21,34";
        String actualOutput = obj.getFibnoacciSeries(10);
        assertEquals(expectedOutput, actualOutput);
    }
}
