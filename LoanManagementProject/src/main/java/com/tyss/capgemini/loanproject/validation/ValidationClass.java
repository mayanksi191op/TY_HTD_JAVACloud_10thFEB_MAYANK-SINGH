package com.tyss.capgemini.loanproject.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationClass {
	public boolean passValid(String pass) {
		Pattern pattern = Pattern.compile("((?=.*[a-z])(?=.*\\d)(?=.*[A-Z])(?=.*[@#$%!]).{8,40})");
		Matcher matcher = pattern.matcher(pass);
		return matcher.matches();
	}
	
	public boolean dateValid(String date) {
		return Pattern.matches("^[0-3]?[0-9]/[0-3]?[0-9]/(?:[0-9]{2})?[0-9]{2}$", date);
	}
	
	public boolean mailValid(String email) {
		Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\\\+]+(\\\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\\\.[A-Za-z0-9]+)*(\\\\.[A-Za-z]{2,})$");
		Matcher matcher = pattern.matcher(email);
		Boolean boolean2 = matcher.matches();
		return boolean2;
	}
	
	public static boolean usernameValid(String username) {
		Pattern pattern = Pattern.compile("[a-zA-Z0-9]{5,}");
		Matcher matcher = pattern.matcher(username);
		Boolean boolean1 = matcher.matches();
		return boolean1;
	}
}
