package com.lti.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Account 
{
	@Id @GeneratedValue
	int id;
	
	String name;
	String email;
	String password;
	float balance;
	
	public Account()
	{
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public Account(int id, String name, String email, String password, float balance) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", balance="
				+ balance + "]";
	}
	
	

}
