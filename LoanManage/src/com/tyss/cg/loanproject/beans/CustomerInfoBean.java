package com.tyss.cg.loanproject.beans;

import java.io.Serializable;

import lombok.Data;

@Data
@SuppressWarnings("serial")
public class CustomerInfoBean implements Serializable{
	private int customerid;
	private String email;
	private String password;
	private String username;
	private String firstname;
	private String lastname;
	private int phonenumber;
	private String dateofbirth;
	private String bankbranch;
	private String accountnum;
	private String opendate;
	
	@Override
	public String toString() {
		return "CustomerId: " + customerid + "| Username: " + username + "| Email: " + email
				+ "| Password: " + password + "| Firstname: " + firstname + "| Lastname: " + lastname + "| PhoneNumber: "
				+ phonenumber + "| DateOfBirth: " + dateofbirth + "| BankBranch: " + bankbranch + "| AccountNumber: "
				+ accountnum + "| OpenDate: " + opendate ;
	}
}
