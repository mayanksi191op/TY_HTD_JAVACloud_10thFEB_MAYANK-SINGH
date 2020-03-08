package com.tyss.cg.loanproject.beans;

import java.io.Serializable;

import lombok.Data;

@Data
@SuppressWarnings("serial")
public class LoginBean implements Serializable{
	private Integer userid;
	private String username;
	private String password;
	private String email;
	private String type;

}
