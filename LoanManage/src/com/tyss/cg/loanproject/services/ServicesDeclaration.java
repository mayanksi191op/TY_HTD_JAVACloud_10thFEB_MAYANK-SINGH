package com.tyss.cg.loanproject.services;

public interface ServicesDeclaration {
	
	//Login Operations
		public void loginOperations();
		
		//Customer operations
		public void addCustomer();
		public void displayCustomer();
		public void deleteCustomer();
		public void updateCustomer();
		
		//Admin operations
		public void addAdmin();
		public void displayAdmin();
		public void deleteAdmin();
		public void updateAdmin();

	}