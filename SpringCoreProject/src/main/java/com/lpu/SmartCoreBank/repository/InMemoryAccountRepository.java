package com.lpu.SmartCoreBank.repository;

import com.lpu.SmartCoreBank.model.Account;

import java.util.HashMap;
import java.util.Map;

public class InMemoryAccountRepository implements AccountRepository {

    HashMap<Integer, Account> accounts = new HashMap<>();

    @Override
    public Account save(Account account) {
        accounts.put(account.getId(), account);
        System.out.println("Acccount creation successfull");
        return account;
    }

    @Override
    public Account findById(int id) {
        for (Map.Entry<Integer, Account> entry : accounts.entrySet()) {
            if (entry.getKey() == id) {
                return entry.getValue();
            }
        }
        return null;
    }
}
