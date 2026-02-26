package com.lpu.AnnotationsApproach.PaymentTask;

import com.lpu.XMLApproach.App;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
        checkoutService c=context.getBean(checkoutService.class);
        c.pay();
    }
}
