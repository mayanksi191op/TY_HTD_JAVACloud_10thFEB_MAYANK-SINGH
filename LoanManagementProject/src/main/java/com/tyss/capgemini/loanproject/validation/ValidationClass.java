package com.tyss.capgemini.loanproject.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationClass {
	public boolean passValid(String pass) {
		Pattern pattern = Pattern.compile("((?=.*[a-z])(?=.*\\d)(?=.*[A-Z])(?=.*[@#$%!]).{6,20})");
		Matcher matcher = pattern.matcher(pass);
		Boolean boolean1 = matcher.matches();
		return boolean1;
	}
	
	public boolean dateValid(String date) {
		return Pattern.matches("\"^(1[0-2]|0[1-9])/(3[01]|[12][0-9]|0[1-9])/[0-9]{4}$", date);
	}
	
	public boolean mailValid(String email) {
		Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\\\+]+(\\\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\\\.[A-Za-z0-9]+)*(\\\\.[A-Za-z]{2,})$");
		Matcher matcher = pattern.matcher(email);
		Boolean boolean2 = matcher.matches();
		return boolean2;
	}
}
