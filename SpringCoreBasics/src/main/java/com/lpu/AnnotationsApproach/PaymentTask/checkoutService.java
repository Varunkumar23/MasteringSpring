package com.lpu.AnnotationsApproach.PaymentTask;

public class checkoutService {
    private final PaymentService paymentService;

    public checkoutService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void pay(){
        System.out.println("Paying...............");
        paymentService.checkoutService();
    }
}
