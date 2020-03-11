package com.tyss.cg.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
	public static void main(String[] args) throws IOException{
		try(FileWriter fileWriter = new FileWriter("newFile.txt");) {
			//fileWriter.write("file is being created...");
			fileWriter.write("this is the filewriter example of writing data...");
			System.out.println("data has been written in file");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
