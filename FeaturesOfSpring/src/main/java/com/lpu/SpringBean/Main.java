package com.lpu.SpringBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext("com.lpu");
        Mobile mobile=context.getBean(Mobile.class);
        mobile.makeCall();

    }
}
