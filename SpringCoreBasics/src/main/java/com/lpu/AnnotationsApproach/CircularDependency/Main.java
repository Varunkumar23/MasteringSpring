package com.lpu.AnnotationsApproach.CircularDependency;

import com.lpu.XMLApproach.App;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        //In this particular implementation it will throw an error because we are performing constructor injections to create a we need b and tp create b we need a so that this will create a endless loop
        // But setter injections works fine because dependency is added later

        ApplicationContext context=new AnnotationConfigApplicationContext("com.lpu.AnnotationsApproach.CircularDependency");


    }
}
