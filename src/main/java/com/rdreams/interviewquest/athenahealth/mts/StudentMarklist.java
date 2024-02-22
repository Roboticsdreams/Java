package com.rdreams.interviewquest.athenahealth.mts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentMarklist {
    public List<Student> getStudentList() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("alice", 494));
        studentList.add(new Student("zeena", 400));
        studentList.add(new Student("jasmin", 375));
        studentList.add(new Student("aliya", 400));
        studentList.add(new Student("samantha", 499));
        return studentList;
    }

    public void printStudentRankList(List<Student> stdList) {
        Collections.sort(stdList);
        int counter = 0;
        int previous_total = 0;
        int personcnt = 0;
        for(Student st: stdList) {
            if (st.getTotalmarks() != previous_total) {
                counter = counter + personcnt + 1;
                personcnt = 0;
            }
            else {
                personcnt++;
            }
            st.setRank(counter);
            System.out.println(st);
            previous_total = st.getTotalmarks();
        }
    }
}
