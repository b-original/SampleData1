package com.springLearning.main;

import com.springLearning.beans.RegisterClass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

    public static void main(String[] args) {
        String [] files=new String[]{"configXMLs/register.xml","configXMLs/Students.xml"};
        ApplicationContext appConfig= new ClassPathXmlApplicationContext(files);
        RegisterClass class11= (RegisterClass) appConfig.getBean("register");
        class11.printStudentRegister();

    }
}
