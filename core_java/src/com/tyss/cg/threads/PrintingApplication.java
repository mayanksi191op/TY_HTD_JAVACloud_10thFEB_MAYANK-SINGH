package com.tyss.cg.threads;

public class PrintingApplication {
	public void printingDocuments(String document, int numOfCopies) {
		for (int i = 0; i < numOfCopies; i++) {
			System.out.println(">>Printing " + document + " # " + i);
		}
	}
}
