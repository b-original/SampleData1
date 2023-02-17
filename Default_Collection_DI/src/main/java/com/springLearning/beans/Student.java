package com.springLearning.beans;

public class Student {

    private String stName;
    private int stRollNo;
    private Address address;

    public Student(){
       // System.out.println("Default constructor for Student.");
    }

    public Student(String name,int stRollNo, Address address){
        System.out.println("parametrized constructor for Student.");
        this.address=address;
        this.stName=name;
        this.stRollNo=stRollNo;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    public void setStRollNo(int stRollNo) {
        this.stRollNo = stRollNo;
    }
    public void setStName(String stName) {
        this.stName = stName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stName='" + stName + '\'' +
                ", stRollNo=" + stRollNo +
                ", address=" + address +
                '}';
    }
}
