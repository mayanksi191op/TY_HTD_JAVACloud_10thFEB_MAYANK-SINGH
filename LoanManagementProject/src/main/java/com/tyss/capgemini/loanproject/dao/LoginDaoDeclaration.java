package com.tyss.capgemini.loanproject.dao;

public interface LoginDaoDeclaration {
	public void custLogin(String custUsername, String password);
	public void empLogin(String empUsername, String empPass);
	public void register(String occupation, String dob, String gender, String username, String userid, String email, String password, String firstname, String lastname, long phone, double accountBal);

}
