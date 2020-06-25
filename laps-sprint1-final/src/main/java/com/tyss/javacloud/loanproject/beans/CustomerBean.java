package com.tyss.javacloud.loanproject.beans;

import java.io.Serializable;

import lombok.Data;

@SuppressWarnings("serial")
@Data
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
	
}
