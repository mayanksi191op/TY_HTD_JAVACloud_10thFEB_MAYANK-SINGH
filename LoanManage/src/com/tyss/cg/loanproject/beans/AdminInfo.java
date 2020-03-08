package com.tyss.cg.loanproject.beans;

import java.io.Serializable;

import lombok.Data;

@SuppressWarnings("serial")
@Data
public class AdminInfo implements Serializable{
	private int adminid;
	private String email;
	private String password;
	private String username;
	private String firstname;
	private String lastname;
	private double phone; 
}
