package com.lpu.AnnotationsApproach.BeanScopeCheck;

import com.lpu.XMLApproach.App;
import com.lpu.XMLApproach.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.prefs.AbstractPreferences;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext("com.lpu.AnnotationsApproach.BeanScopeCheck");
        PrototypeEmployee prototypeEmployee1=context.getBean(PrototypeEmployee.class);
        PrototypeEmployee prototypeEmployee2=context.getBean(PrototypeEmployee.class);
        System.out.println("Prototype");
        // Two different objects are created because it is prototype
        System.out.println(prototypeEmployee1);
        System.out.println(prototypeEmployee2);

        // Only one bean defination is created because bydefault spring treats every bean as singleton
        SingletonEmployee employee1=context.getBean(SingletonEmployee.class);
        SingletonEmployee employee2=context.getBean(SingletonEmployee.class);
        System.out.println("Singleton");
        System.out.println(employee1);
        System.out.println(employee2);


    }
}
