package com.tyss.cg.exceptions;

import java.io.FileReader;
import java.util.Properties;

public class ThrowsClassEx  {
	public static void main(String[] args) throws Exception {
	//public static void main(String[] args) throws IOException {	
		Properties properties=new Properties();
		//new Properties().load(new FileReader("application.properties"));
		properties.load(new FileReader("application.properties"));
		System.out.println(properties.getProperty("name"));
		System.out.println("Some name...");
		
	}

}
