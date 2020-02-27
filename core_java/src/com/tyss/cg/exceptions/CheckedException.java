package com.tyss.cg.exceptions;

import java.io.FileReader;
import java.util.Properties;

public class CheckedException {
	public static void main(String[] args) {
		Properties properties = new Properties();

		try {
			properties.load(new FileReader("application.properties"));
			// mandatory to use catch block and resolve when checked exception is caught.
			System.out.println(properties.getProperty("name"));
		} catch (Exception e) {
			System.out.println("Exception caught in try");
			e.printStackTrace();
		} finally {
			System.out.println("code in finally block");
		}
	}

}
