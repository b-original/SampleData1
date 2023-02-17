package com.springLearning.beans;

public class Address {

    private int areaCode;
    private String address;

    public Address(){
        //System.out.println("Default constructor for Address.");
    }

    public Address(int areaCode, String address){
        System.out.println("parametrized constructor for Address.");
        this.areaCode=areaCode;
        this.address=address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAreaCode(int areaCode) {
        this.areaCode = areaCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "areaCode=" + areaCode +
                ", address='" + address + '\'' +
                '}';
    }
}
