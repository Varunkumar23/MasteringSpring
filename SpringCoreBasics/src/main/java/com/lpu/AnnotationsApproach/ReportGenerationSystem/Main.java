package com.lpu.AnnotationsApproach.ReportGenerationSystem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext("com.lpu.AnnotationsApproach.ReportGenerationSystem");
        ReportController reportController=context.getBean(ReportController.class);
        reportController.useService();

        System.out.println(context.getBeanDefinitionCount());

        String[] beans=context.getBeanDefinitionNames();

        for(String name:beans){
            System.out.println(name);
        }
    }
}
