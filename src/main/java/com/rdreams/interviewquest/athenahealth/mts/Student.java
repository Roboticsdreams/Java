package com.rdreams.interviewquest.athenahealth.mts;

public class Student implements Comparable<Student> {
    private String name;
    private int totalmarks;
    private int rank;

    public int getTotalmarks() {
        return totalmarks;
    }

    public Student(String name, int totalmarks) {
        this.name = name;
        this.totalmarks = totalmarks;
    }

    public Student() {
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public int compareTo(Student stdobj) {
        if (this.getTotalmarks() > stdobj.getTotalmarks()) {
            return -1;
        } else if (this.getTotalmarks() < stdobj.getTotalmarks()) {
            return 1;
        }
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (totalmarks != other.totalmarks)
            return false;
        return rank == other.rank;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", totalmarks=" + totalmarks + ", rank=" + rank + "]";
    }

}
