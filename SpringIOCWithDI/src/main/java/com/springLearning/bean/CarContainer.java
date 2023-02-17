package com.springLearning.bean;

import java.util.Arrays;

public class CarContainer {

    private Car[] cars;

    public CarContainer(){
        System.out.println("This example is for showing passing different type of dependencies.");
        System.out.println("like: primitive,Secondary(object),Arrays{primitive/seconderary}, collection");
    }

    public CarContainer(Car[] cars){
        System.out.println("Using constructor arg call in xml.");
        this.cars=cars;

    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    public Car[] getCars() {
        return this.cars;
    }

    public void printListOfCars(){
        Arrays.stream(getCars()).forEach(System.out::println);
    }
}
