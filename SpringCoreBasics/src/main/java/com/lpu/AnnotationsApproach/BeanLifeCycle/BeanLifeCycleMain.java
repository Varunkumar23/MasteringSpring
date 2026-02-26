package com.lpu.AnnotationsApproach.BeanLifeCycle;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanLifeCycleMain {
    public static void main(String[] args) {
        ConfigurableApplicationContext context=new AnnotationConfigApplicationContext("com.lpu");
        BeanLifeCycle beanLifeCycle=context.getBean(BeanLifeCycle.class);
        context.close();
    }
}
