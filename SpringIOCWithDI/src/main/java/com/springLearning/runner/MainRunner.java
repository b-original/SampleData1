package com.springLearning.runner;

import com.springLearning.bean.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainRunner {

    public static void main(String[] args) {
        ApplicationContext appConfig= new ClassPathXmlApplicationContext("car-engine.xml");
        Car car= (Car) appConfig.getBean("car");
        car.printCarDetails();
    }
}
