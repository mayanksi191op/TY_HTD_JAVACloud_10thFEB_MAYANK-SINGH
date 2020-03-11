package com.tyss.cg.filehandling;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class SetPropertiesExample {
	public static void main(String[] args) throws IOException {
		Properties properties = new Properties();
		
		properties.put("batch", "Java Cloud");
		properties.put("Tech", "Web Basics, Java-Full Stack, Java Frameworks");
		properties.put("batchStrength", "28");
		
		properties.store(new FileWriter("batch.properties"), "Batch Details");
		
		System.out.println("file is created");
	}

}
