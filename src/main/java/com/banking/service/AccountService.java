package com.banking.service;

import com.banking.entity.Account;
import java.util.List;

public interface AccountService {
    List<Account> fetchUsersAccount();

    void createAccount(Account account);
}
