package com.rdreams.onlinecourses.codedecode.commonquestions.compareobjects;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeCompareTest {
    Employee e1 = new Employee(1, "tom", 20, new Address("street1", 99));
    Employee e2 = new Employee(2, "jerry", 25, new Address("street2", 43));
    Employee e3 = new Employee(3, "code", 22, new Address("street3", 21));
    Employee e4 = new Employee(4, "decode", 24, new Address("street4", 67));

    @Test
    public void AgeSorting_TestCase01() {
        List<Employee> actualOutput = new ArrayList<>();
        actualOutput.add(e1);
        actualOutput.add(e2);
        actualOutput.add(e3);
        actualOutput.add(e4);
        actualOutput.sort(new AgeComparator());

        List<Employee> expectedOutput = new ArrayList<>();
        expectedOutput.add(e1);
        expectedOutput.add(e3);
        expectedOutput.add(e4);
        expectedOutput.add(e2);
        assertEquals(actualOutput,expectedOutput);
    }

    @Test
    public void NameSorting_TestCase02() {
        List<Employee> actualOutput = new ArrayList<>();
        actualOutput.add(e1);
        actualOutput.add(e2);
        actualOutput.add(e3);
        actualOutput.add(e4);
        actualOutput.sort(new NameComparator());

        List<Employee> expectedOutput = new ArrayList<>();
        expectedOutput.add(e3);
        expectedOutput.add(e4);
        expectedOutput.add(e2);
        expectedOutput.add(e1);
        assertEquals(actualOutput,expectedOutput);
    }

    @Test
    public void AddressSorting_TestCase03() {
        List<Employee> actualOutput = new ArrayList<>();
        actualOutput.add(e1);
        actualOutput.add(e2);
        actualOutput.add(e3);
        actualOutput.add(e4);
        actualOutput.sort(new AddressComparator());

        List<Employee> expectedOutput = new ArrayList<>();
        expectedOutput.add(e3);
        expectedOutput.add(e2);
        expectedOutput.add(e4);
        expectedOutput.add(e1);
        assertEquals(actualOutput,expectedOutput);
    }

}
