package com.lpu.AnnotationsApproach.PaymentTask;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class Config {
    
    @Bean
    public PaymentService UPI(){
        return new UPI();
    }
    
    @Bean
    @Primary
    public PaymentService CreditCard(){
        return new CreditCard();
    }

    @Bean
    public checkoutService checkout(PaymentService paymentService){
        return new checkoutService(paymentService);
    }
}
