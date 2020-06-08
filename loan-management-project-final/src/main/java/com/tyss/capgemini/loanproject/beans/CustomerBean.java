package com.tyss.capgemini.loanproject.beans;

import java.io.Serializable;

import lombok.Data;

@Data
@SuppressWarnings("serial")
public class CustomerBean implements Serializable{
	private String username;
	private String email;
	private String password;
	private String firstname;
	private String lastname;
	private long phone;
	private double accountBal;
	private String role;
	private double loanAmount;
	
	public CustomerBean(String username, String email, String password, String firstname, String lastname,
			long phone, String role, double accountBal, double loanAmount) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.phone = phone;
		this.role = role;
		this.accountBal = accountBal;
		this.loanAmount = loanAmount;
	}
}
