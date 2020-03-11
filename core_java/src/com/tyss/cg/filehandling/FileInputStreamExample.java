package com.tyss.cg.filehandling;

import java.io.FileInputStream;

public class FileInputStreamExample {			//we go for it when we have any image or media data having byte data.
	public static void main(String[] args) {
		try(FileInputStream fileInputStream = new FileInputStream("Image.jpg")) {
			int imgCode = 0;
			while((imgCode = fileInputStream.read()) != -1) {
				System.out.println(imgCode);
			}
			fileInputStream.read();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
