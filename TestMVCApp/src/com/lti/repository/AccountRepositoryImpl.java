package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.model.Account;

@Repository("accountRepository")
public class AccountRepositoryImpl implements AccountRepository
{
	@PersistenceContext
	EntityManager em;
	
	@Transactional
	@Override
	public Account addAccount(Account a) 
	{
		// TODO Auto-generated method stub
		
		a=em.merge(a);
		em.persist(a);
		return a;
	}

	@Override
	public void updateAccount(Account a)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAccount(Account a) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public Account findAccountById(int id) 
	{
		Account a=em.find(Account.class,new Integer(id));
		return a;
	}

	@Override
	public List<Account> findAllAccounts() 
	{
		// TODO Auto-generated method stub
		return null;
	}

	
}
