package com.banking.service.impl;

import com.banking.entity.Account;
import com.banking.repository.AccountRepository;
import com.banking.repository.UserRepository;
import com.banking.service.AccountService;
import com.banking.util.AccountUtil;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;
    private final AccountUtil accountUtil;
    private final UserRepository userRepository;

    @Autowired
    public AccountServiceImpl(AccountRepository accountRepository, UserRepository userRepository, AccountUtil accountUtil) {
        this.accountRepository = accountRepository;
        this.userRepository = userRepository;
        this.accountUtil = accountUtil;
    }

    @Override
    public List<Account> fetchUsersAccount() {
        User userDetails = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        com.banking.domain.User user = userRepository.findOneByLogin(userDetails.getUsername()).orElseThrow(RuntimeException::new);

        return accountRepository.fetchAllAccountByUserId(user.getId());
    }

    @Override
    public void createAccount(Account account) {
        account.setId(null);
        account.setAccountNumber(accountUtil.generateAccountNumber());
        account.setCreatedAt(LocalDateTime.now());
        account.setUpdatedAt(LocalDateTime.now());
        account.setBalance(0.0);

        User userDetails = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        com.banking.domain.User user = userRepository.findOneByLogin(userDetails.getUsername()).orElseThrow(RuntimeException::new);

        account.setUser(user);

        accountRepository.save(account);
    }
}
