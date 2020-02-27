package com.tyss.cg.threads;

public class PrintingMethodClass2 extends Thread {
	
	
	@Override
	public void run() {
		try {
			Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		for (int i = 1; i < 10; i++) {
			System.err.println("Printing value: " + i);
		}

	}
	/*
	 * public void run() { for (int i = 1; i < 10; i++) {
	 * System.err.println("Printing value: " + i); } }
	 */
}
