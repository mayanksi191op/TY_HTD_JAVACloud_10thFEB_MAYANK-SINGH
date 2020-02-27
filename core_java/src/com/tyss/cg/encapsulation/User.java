package com.tyss.cg.encapsulation;

public class User {
	private String username;
	private String password;
	private Integer userId;
	
	
	
	public User(String username, String password, Integer userId) {
		super();
		this.username = username;
		this.password = password;
		this.userId = userId;
	}
	
	public User() {
		
	}
	
	public String getUsername() {			//generate using alt=shift+S
		return username;
	}										//we can or cant have getPassword.
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {			
		return password;
	}	
	
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", userId=" + userId + "]";
	}
	
	

}
