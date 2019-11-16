package com.lti.service;

import java.util.List;

import com.lti.model.Account;

public interface AccountService 
{
	
	public Account addAccount(Account a);
	public List<Account> getAllAccounts();
	public Account getAccountById(int id);

}
