package com.lpu.AnnotationsApproach.PaymentTask;

import org.springframework.stereotype.Component;


public class CreditCard implements PaymentService {
    public void checkoutService(){
        System.out.println("Payment is done via credit card");
    }
}
