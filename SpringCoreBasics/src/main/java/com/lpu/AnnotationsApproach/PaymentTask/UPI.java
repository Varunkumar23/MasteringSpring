package com.lpu.AnnotationsApproach.PaymentTask;

import org.springframework.stereotype.Component;

public class UPI implements PaymentService {
    public void checkoutService(){
        System.out.println("Payment is done via UPI");

    }
}
