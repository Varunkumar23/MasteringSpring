package com.lpu.AnnotationsApproach.InitializationTypes;

import com.lpu.XMLApproach.App;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext("com.lpu.AnnotationsApproach.InitializationTypes");

        System.out.println("Context is started😎");

        // Bean is created only when getBean is called
//        LazyHeavyService lazyHeavyService=context.getBean(LazyHeavyService.class);
//        lazyHeavyService.work();


        // Bean is created at the time of loading only
        EarlyHeavyService earlyHeavyService=context.getBean(EarlyHeavyService.class);
        earlyHeavyService.work();

    }
}
