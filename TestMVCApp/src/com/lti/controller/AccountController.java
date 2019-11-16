package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lti.model.Account;
import com.lti.service.AccountService;

@Controller
public class AccountController
{
	@Autowired
	AccountService service;
	
	
	@RequestMapping(value="/addAccount",method=RequestMethod.POST)
	public ModelAndView addAccount(@RequestParam String name,@RequestParam String email,@RequestParam String password,@RequestParam float balance)
	{
		ModelAndView model=null;
		
		Account a=new Account();
		a.setName(name);
		a.setEmail(email);
		a.setPassword(password);
		a.setBalance(balance);
		
		Account a1=service.addAccount(a);
		
		if(a1!=null)
		{
			model=new ModelAndView("accountAdded");
			model.addObject("account",a1);
		}
		else
		{
			model=new ModelAndView("accountFail");
			
		}
		
		return model;
		
	}

}
