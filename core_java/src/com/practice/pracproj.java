package com.practice;

import java.sql.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class pracproj {
	static void map() {
		HashMap<String, Object> hs = new LinkedHashMap<String, Object>();
		hs.put("Abc", "AD01");
		System.out.println(((String) hs.get("Abc")).toLowerCase());
	}
	
	public static boolean usernameVal(String pass) {
		Pattern pattern = Pattern.compile("[a-zA-Z0-9]{5,}");
		Matcher matcher = pattern.matcher(pass);
		Boolean boolean1 = matcher.matches();
		return boolean1;
	}
	public static boolean passValid(String pass) {
		Pattern pattern = Pattern.compile("((?=.*[a-z])(?=.*\\d)(?=.*[A-Z])(?=.*[@#$%!]).{6,20})");
		Matcher matcher = pattern.matcher(pass);
		Boolean boolean1 = matcher.matches();
		return boolean1;
	}
	
	public static boolean dateValid(String date) {
		return Pattern.matches("^[0-3]?[0-9]/[0-3]?[0-9]/(?:[0-9]{2})?[0-9]{2}$", date);
	}
	
	public static boolean mailValid(String email) {
		Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\\\+]+(\\\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\\\.[A-Za-z0-9]+)*(\\\\.[A-Za-z]{2,})$");
		Matcher matcher = pattern.matcher(email);
		Boolean boolean2 = matcher.matches();
		return boolean2;
	}
	
	public static void Date() {
		String date1 = "11/12/1996";
		String date2 = "15/11/2020";
		String[] date1arr = date1.split("/");
		for (int i = 0; i < date1arr.length; i++) {
			System.out.println(date1arr[i]);
		}
		int date1int = Integer.parseInt(date1arr[2]);
		System.out.println(date1int);
		
	}
	public static void main(String[] args) {
		map();
//		System.out.println(usernameVal("Mayanksi191"));
	//	System.out.println(usernameVal("aA9_asdasdas"));
//		System.out.println(usernameVal("+*,aABCDasdasd9"));
//		System.out.println("------------------------");
		System.out.println(passValid("mayanksi191@gmail.com"));
		System.out.println(passValid("qwerty@123"));
//		System.out.println(dateValid("12/05/1996"));
//		System.out.println(dateValid("30/03/2060"));
//		System.out.println(dateValid("31/02/2020"));
//		System.out.println(dateValid("13/04/2020"));
		
		
		
	}
}
