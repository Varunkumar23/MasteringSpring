package com.lpu.SmartCoreBank.notification;

import org.springframework.stereotype.Service;

@Service
public class SMSNotificationService implements NotificationService{
    public void getNotificationService(){
        System.out.println("SMS Notification");
    }
}
