package com.practice;

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
	
	public static boolean simpleVal(String pass) {
		Pattern pattern = Pattern.compile("[a-zA-Z0-9_]{5,}");
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
		return Pattern.matches("\"^(1[0-2]|0[1-9])/(3[01]|[12][0-9]|0[1-9])/[0-9]{4}$", date);
	}
	
	public static boolean mailValid(String email) {
		Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\\\+]+(\\\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\\\.[A-Za-z0-9]+)*(\\\\.[A-Za-z]{2,})$");
		Matcher matcher = pattern.matcher(email);
		Boolean boolean2 = matcher.matches();
		return boolean2;
	}
	public static void main(String[] args) {
		map();
		System.out.println(simpleVal("abcgdfshgctsj"));
		System.out.println(simpleVal("aA9_asdasdas"));
		System.out.println(simpleVal("+*,aABCDasdasd9"));
		System.out.println("------------------------");
		System.out.println(passValid("Qwerty@123"));
		System.out.println(passValid("qwerty@123"));
		System.out.println(dateValid("12/05/1996"));
		System.out.println(dateValid("30/03/2060"));
		System.out.println(dateValid("31/02/2020"));
		System.out.println(dateValid("13/04/2020"));
	}
}
