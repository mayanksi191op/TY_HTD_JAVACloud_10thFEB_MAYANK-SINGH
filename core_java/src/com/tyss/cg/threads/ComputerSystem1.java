package com.tyss.cg.threads;

public class ComputerSystem1 extends Thread{
	PrintingApplication printingApplication;
	
	public ComputerSystem1(PrintingApplication localPrintingApplication) {
		this.printingApplication=localPrintingApplication;
	}
	
	@Override
	synchronized public void run() {
		System.err.println(">>>> Printing from ComputerSystem1");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		printingApplication.printingDocuments("AnyDocument.pdf", 10);
		
	}
	
}
