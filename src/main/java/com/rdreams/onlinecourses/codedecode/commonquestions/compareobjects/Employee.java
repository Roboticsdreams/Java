package com.rdreams.onlinecourses.codedecode.commonquestions.compareobjects;

public class Employee {
    private int id;
    private String name;
    private int age;
    private Address address;

    public Employee(int id, String name, int age, Address address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }
}
