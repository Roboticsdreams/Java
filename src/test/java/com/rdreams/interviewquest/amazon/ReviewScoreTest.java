package com.rdreams.interviewquest.amazon;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class ReviewScoreTest {

    ReviewScore obj = new ReviewScore();

    @Test
    void findReviewScore_Testcase01() {
        String str = "GoodProductButScrapAfterWash";
        List<String> prohibitedWord = new ArrayList<>();
        prohibitedWord.add("crap");
        prohibitedWord.add("odpro");

        int expectedOutput = 15;
        int actualOutput = obj.findReviewScore(str, prohibitedWord);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void findReviewScore_Testcase02() {
        String str = "a";
        List<String> prohibitedWord = new ArrayList<>();
        prohibitedWord.add("a");

        int expectedOutput = 0;
        int actualOutput = obj.findReviewScore(str, prohibitedWord);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void findReviewScore_Testcase03() {
        String str = "Alpha";
        List<String> prohibitedWord = new ArrayList<>();
        prohibitedWord.add("a");

        int expectedOutput = 3;
        int actualOutput = obj.findReviewScore(str, prohibitedWord);
        assertEquals(expectedOutput, actualOutput);
    }
}
