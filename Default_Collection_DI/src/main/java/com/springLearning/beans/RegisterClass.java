package com.springLearning.beans;

import java.util.List;

public class RegisterClass {

    private String classname;
    private List<Student> students;

    public RegisterClass(){
        System.out.println("default constructor for Register.");
    }

    public RegisterClass(String name, List<Student> students){
        System.out.println("parametrized constructor for Register.");
        this.classname=name;
        this.students=students;
    }

    public void printStudentRegister(){

        System.out.println("this is class "+classname+"Register");
        System.out.println("And Below are the Details of Students in class: ");
        students.forEach(System.out::println);
    }

}
