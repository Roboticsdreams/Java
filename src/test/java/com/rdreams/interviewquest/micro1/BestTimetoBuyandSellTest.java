package com.rdreams.interviewquest.micro1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BestTimetoBuyandSellTest {
    BestTimetoBuyandSell obj = new BestTimetoBuyandSell();

    @Test
    public void getMaxProfit_Testcase01() {
        int[] nums = new int[] {7,1,5,3,6,4};
        int actualOutput = obj.maxProfit(nums);
        int expectedOutput = 5;
        assertEquals(actualOutput,expectedOutput);
    }

    @Test
    public void getMaxProfit_Testcase02() {
        int[] nums = new int[] {4,3,2,1};
        int actualOutput = obj.maxProfit(nums);
        int expectedOutput = 0;
        assertEquals(actualOutput,expectedOutput);
    }
}
