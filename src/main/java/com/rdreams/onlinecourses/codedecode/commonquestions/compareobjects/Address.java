package com.rdreams.onlinecourses.codedecode.commonquestions.compareobjects;

public class Address implements Comparable<Address>{
    private String Streetname;
    private int pincode;

    public Address(String streetname, int pincode) {
        this.Streetname = streetname;
        this.pincode = pincode;
    }

    public int getPincode() {
        return pincode;
    }


    @Override
    public int compareTo(Address o) {
        return  this.pincode-o.getPincode() ;
    }
}
