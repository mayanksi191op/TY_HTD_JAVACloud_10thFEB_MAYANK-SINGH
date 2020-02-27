package com.tyss.cg.threads;

public class ComputerSystem3 extends Thread {
	PrintingApplication printingApplication;
	
	public ComputerSystem3(PrintingApplication localPrintingApplication) {
		this.printingApplication=localPrintingApplication;
	}
	
	@Override
	synchronized public void run() {
		System.err.println(">>>> Printing from ComputerSystem3");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		printingApplication.printingDocuments("OtherDocument.pdf", 10);
		
	}
}
