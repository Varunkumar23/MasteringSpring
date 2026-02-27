package com.lpu.SmartCoreBank.repository;

import com.lpu.SmartCoreBank.model.Account;

public interface AccountRepository {

    Account save(Account account);

    Account findById(int id);

}