package com.rdreams.onlinecourses.codingninjas.basicsofjava.basic_io;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AreaofRectangleTest {
    AreaofRectangle obj = new AreaofRectangle();

    @Test
    void getArea_Testcase01() {
        int expectedOutput = 10;
        int actualOutput = obj.getArea(5,2);
        assertEquals(expectedOutput, actualOutput);
    }
}
