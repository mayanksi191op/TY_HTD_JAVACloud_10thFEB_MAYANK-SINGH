package com.tyss.cg.threads;

public class PrintingValues extends Thread {
	public static void main(String[] args) { 		//inconsistent data comes when thread runs parallely.
		System.out.println("+++++++Application started+++++++");
		
		
		PrintingMethodClass1 printingMethodClass1=new PrintingMethodClass1();
		//Thread thread = new Thread(new PrintingMethodClass1()); //or we can do this.
		try {
		printingMethodClass1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		new PrintingMethodClass1().start();			//to call the run method
		
		
		Thread thread = new Thread(new PrintingMethodClass2());
		try {
			thread.join();
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		thread.start();
		
		
		try {
		Thread.sleep(1500);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		System.out.println("++++++++Application ended++++++++");
	}
}


