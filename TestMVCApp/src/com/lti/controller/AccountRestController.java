package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.model.Account;
import com.lti.service.AccountService;

@RestController
public class AccountRestController {

	@Autowired
	AccountService service;
	
	@RequestMapping(value="/account",method = RequestMethod.GET)
	public Account getAccount()
	{
		Account a=service.getAccountById(1);
		return a;
	}
	
	
	@PostMapping("/addAccountJSON")
	public String addAccount(@RequestBody Account a)
	{
		Account a1=service.addAccount(a);
		
		if(a1!=null)
		{
			return "Success";
		}
		else
		{
			return "Failure";
		}
	}

}
