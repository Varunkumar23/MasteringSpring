package com.lpu.SmartCoreBank.service;

import com.lpu.SmartCoreBank.audit.AuditService;
import com.lpu.SmartCoreBank.model.Account;
import com.lpu.SmartCoreBank.notification.NotificationService;
import com.lpu.SmartCoreBank.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class AccountService {

    private final AccountRepository accountRepository;
    private final AuditService auditService;
    private final NotificationService notificationService;

    @Autowired
    public AccountService(AccountRepository accountRepository, AuditService auditService, @Qualifier("emailNotificationService") NotificationService notificationService) {
        this.accountRepository = accountRepository;
        this.auditService = auditService;
        this.notificationService = notificationService;
    }



    @PostConstruct
    public void init() {
        System.out.println("AccountService Initialized");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("AccountService Destroyed");
    }

    public void createAccount(int id, String name, long balance){
        accountRepository.save(new Account(id,name,balance));
    }

    public void deposit(int id, long amount){
        Account account=accountRepository.findById(id);
        account.setBalance(account.getBalance()+amount);

    }








}
