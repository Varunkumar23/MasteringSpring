package com.lpu.AnnotationsApproach.InjectionTypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context= new AnnotationConfigApplicationContext("com.lpu.AnnotationsApproach.InjectionTypes");


        // We should not use this
        FieldInjection fieldInjection=context.getBean(FieldInjection.class);
        fieldInjection.show();

        // Should be used when we want to inject the optional dependency
        SetterInjection setterInjection=context.getBean(SetterInjection.class);
        setterInjection.show();


        // Should be preferred in almost every case
        ConstructorInjection constructorInjection=context.getBean(ConstructorInjection.class);
        constructorInjection.show();




    }
}
