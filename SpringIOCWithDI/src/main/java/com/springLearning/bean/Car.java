package com.springLearning.bean;

public class Car {

    private String carName;
    private int modelNo;
    private Engine engine;

    public Car(){
        System.out.println("Inside default constructor of Car.");
    }

    public Car(String carName,int modelNo,Engine engine){
        this.carName=carName;
        this.modelNo=modelNo;
        this.engine=engine;
    }

    @Override
    public String toString() {
        return "Car info: "+carName+" Modle no: "+modelNo+ " Engine No.:"+ engine.getEngineModel();
    }

    public void printCarDetails(){
        System.out.println("Car name: "+carName);
        System.out.println("Car model: "+modelNo);
        System.out.println("Car engine model: "+engine.getEngineModel());
    }


}
