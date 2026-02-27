package com.lpu.SmartCoreBank.notification;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import javax.annotation.PreDestroy;

@Service
@Primary
public class EmailNotificationService implements NotificationService{
    public void getNotificationService(){
        System.out.println("Email Notification");
    }
}
