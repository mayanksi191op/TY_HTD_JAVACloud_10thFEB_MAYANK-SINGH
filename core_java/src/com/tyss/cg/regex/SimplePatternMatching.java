package com.tyss.cg.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimplePatternMatching {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("\\d"); // cant use new to create obj so we use this as only constructor is
													// private. 
												// "\\d" -> accepts only one digit.
		Matcher matcher = pattern.matcher("1");
		System.out.println(matcher.matches());
	}

}
