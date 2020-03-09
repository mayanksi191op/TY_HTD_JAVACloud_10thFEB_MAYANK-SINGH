package com.tyss.cg.loanproject.beans;

import java.io.Serializable;

import lombok.Data;

@SuppressWarnings("serial")
@Data
public class AdminInfoBean implements Serializable {
	private int adminid;
	private String email;
	private String password;
	private String username;
	private String firstname;
	private String lastname;
	private int phonenumber;
	
	public AdminInfoBean(int adminid, String email, String password, String username, String firstname, String lastname,
			int phonenumber) {
		super();
		this.adminid = adminid;
		this.email = email;
		this.password = password;
		this.username = username;
		this.firstname = firstname;
		this.lastname = lastname;
		this.phonenumber = phonenumber;
	}

	@Override
	public String toString() {
		return "AdminId: " + adminid + "| Username: " + username + "| password: " + password + "| Email: " + email
				+ "| FirstName: " + firstname + "| Lastname: " + lastname + "| PhoneNumber: " + phonenumber;
	}
	
	
	
	
}
