package com.rdreams.interviewquest.athenahealth.mts;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    @Test
    public void testEqualityWithItself() {
        Student obj = new Student();
        assertEquals(obj, obj);
    }

    @Test
    public void testEqualityWithNull() {
        Student obj = new Student();
        assertNotEquals(null, obj);
        assertNotEquals(obj,null);

    }

    @Test
    public void testEqualityWithDifferentClass() {
        Student stdobj = new Student();
        Object obj = new Object();
        assertNotEquals(stdobj, obj);
    }

    @Test
    public void testEqualityWithDifferentName() {
        Student p1 = new Student("student1", 100);
        Student p2 = new Student("student2", 100);
        assertNotEquals(p1, p2);
    }

    @Test
    public void testEqualityWithDifferentGender() {
        Student p1 = new Student("student1", 50);
        Student p2 = new Student("student1", 100);
        assertNotEquals(p1, p2);
    }

    @Test
    public void testEqualityWithDifferentRank() {
        Student p1 = new Student("student1", 100);
        p1.setRank(1);
        Student p2 = new Student("student1", 100);
        p2.setRank(2);
        assertNotEquals(p1, p2);
    }

    @Test
    public void testEqualityWithsameValue() {
        Student p1 = new Student("student1", 100);
        p1.setRank(1);
        Student p2 = new Student("student1", 100);
        p2.setRank(1);
        assertEquals(p1, p2);
    }

    @Test
    public void testEqualityWithNullandDifferentName() {
        Student p1 = new Student(null, 100);
        Student p2 = new Student("student1", 100);
        assertNotEquals(p1, p2);
    }

    @Test
    public void testEqualityWithNullNames() {
        Student p1 = new Student(null, 100);
        Student p2 = new Student(null, 100);
        assertEquals(p1, p2);
    }
}

