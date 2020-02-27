package com.tyss.cg.threads;

public class ComputerSystem2 extends Thread {
	PrintingApplication printingApplication;

	public ComputerSystem2(PrintingApplication localPrintingApplication) {
		this.printingApplication = localPrintingApplication;
	}

	@Override
	synchronized public void run() {
		System.err.println(">>>> Printing from ComputerSystem2");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		printingApplication.printingDocuments("SomeOtherDocument.pdf", 10);

	}
}
