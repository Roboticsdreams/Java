package com.rdreams.interviewquest.athenahealth.mts;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentMarklistTest {
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    StudentMarklist obj = new StudentMarklist();

    @BeforeEach
    public void setStreams() {
        System.setOut(new PrintStream(out));
    }

    @Test
    void testGetStudentList() {
        List<Student> expecList = new ArrayList<>();
        expecList.add(new Student("alice", 494));
        expecList.add(new Student("zeena", 400));
        expecList.add(new Student("jasmin", 375));
        expecList.add(new Student("aliya", 400));
        expecList.add(new Student("samantha", 499));
        List<Student> actualList = obj.getStudentList();
        assertArrayEquals(expecList.toArray(), actualList.toArray());
    }

    @Test
    void testPrintStudentRankList() {
        List<Student> stdList = obj.getStudentList();
        obj.printStudentRankList(stdList);
        String expected = "Student [name=samantha, totalmarks=499, rank=1]\r\n" + //
                "Student [name=alice, totalmarks=494, rank=2]\r\n" + //
                "Student [name=zeena, totalmarks=400, rank=3]\r\n" + //
                "Student [name=aliya, totalmarks=400, rank=3]\r\n" + //
                "Student [name=jasmin, totalmarks=375, rank=5]";
        assertEquals(expected, out.toString().trim());
    }

    @AfterEach
    public void restoreInitialStreams() {
        System.setOut(originalOut);
    }
}
