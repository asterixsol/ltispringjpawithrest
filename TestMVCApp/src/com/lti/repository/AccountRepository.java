package com.lti.repository;

import java.util.List;

import com.lti.model.Account;

public interface AccountRepository 
{
	
	public Account addAccount(Account a);
	public void updateAccount(Account a);
	public void deleteAccount(Account a);
	public Account findAccountById(int id);
	public List<Account> findAllAccounts();

}
