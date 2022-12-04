package com.example.springopenapi.service;

import com.example.springopenapi.models.Account;
import com.example.springopenapi.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    @Autowired
    AccountRepository accountRepository;

    public Account addAccount(Account account){
        return accountRepository.save(account);
    }

    public List<Account> listAccount(){
        return  accountRepository.findAll();
    }

}
