package com.lpu.JavaBasedConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        //So in this implementation we actually controlled when a bean creation should be created basically manually
        //First from the main it goes to the AppConfig.class file and finds @Configuration and @ComponentScan and registers all the beans into the container then everything is asusual

        ApplicationContext context =new AnnotationConfigApplicationContext(AppConfig.class);
        Car car=context.getBean(Car.class);
        car.drive();

        Engine engine=context.getBean(Engine.class);
        System.out.println(engine);

    }
}
