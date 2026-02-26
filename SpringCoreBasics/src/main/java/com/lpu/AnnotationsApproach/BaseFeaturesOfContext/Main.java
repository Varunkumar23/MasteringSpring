package com.lpu.AnnotationsApproach.BaseFeaturesOfContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.lpu");
        Employee employee = context.getBean(Employee.class);
        Employee employee1 = context.getBean(Employee.class);
        Employee employee2 = context.getBean(Employee.class);

        System.out.println(employee);
        System.out.println(employee1);
        System.out.println(employee);

        // To check weather a bean defination exists or not
        System.out.println(context.containsBean("singletonEmployee"));

        // To check the number od beans in the IOC Container
        System.out.println(context.getBeanDefinitionCount());

        //To see the names of bean definations
        String[] names = context.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }

    }
}
