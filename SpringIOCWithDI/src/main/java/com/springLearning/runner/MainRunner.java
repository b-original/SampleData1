package com.springLearning.runner;

import com.springLearning.bean.Car;
import com.springLearning.bean.CarContainer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainRunner {

    public static void main(String[] args) {

        //ApplicationContext appConfig= new ClassPathXmlApplicationContext("car-engine.xml");
        //Car car= (Car) appConfig.getBean("car");
        //car.printCarDetails();

        System.out.println("Here we are creating cars array and passing it through IOC using DI.");
        ApplicationContext appConfig= new ClassPathXmlApplicationContext("cars-spring.xml");
        CarContainer ccr= (CarContainer) appConfig.getBean("cars");
        ccr.printListOfCars();
    }
}
