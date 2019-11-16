package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.Account;
import com.lti.repository.AccountRepository;

@Service("accountService")
public class AccountServiceImpl implements AccountService
{
	@Autowired
	AccountRepository repository;

	@Override
	public Account addAccount(Account a) 
	{
		Account a1=repository.addAccount(a);
		return a1;
	}

	@Override
	public List<Account> getAllAccounts()
	{
		
		List<Account> list=repository.findAllAccounts();
		return list;
	}

	@Override
	public Account getAccountById(int id) 
	{
		Account a=repository.findAccountById(id);
		return a;
	}
	
	

	

}
