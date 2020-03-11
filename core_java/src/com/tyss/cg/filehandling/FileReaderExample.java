package com.tyss.cg.filehandling;

import java.io.FileReader;

public class FileReaderExample {
	public static void main(String[] args) {
		try(FileReader fileReader=new FileReader("newFile.txt");){
			int charUnicode;
			while ((charUnicode = fileReader.read())!= -1) {
				System.out.println((char)charUnicode);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
