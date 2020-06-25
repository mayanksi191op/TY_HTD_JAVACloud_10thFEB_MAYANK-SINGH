package com.tyss.javacloud.loanproject.beans;

import java.io.Serializable;

import lombok.Data;

@Data
@SuppressWarnings("serial")
public class EmployeeBean implements Serializable {
	
	private String username;
	private String email;
	private String password;
	private String firstname;
	private String lastname;
	private long phone;
	private String role;
	
	public EmployeeBean(String username, String email, String password, String firstname, String lastname,
			long phone, String role) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.phone = phone;
		this.role = role;
	}
}
