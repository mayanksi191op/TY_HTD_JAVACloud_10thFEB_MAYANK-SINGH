package com.tyss.cg.loanproject.controller;


import com.tyss.cg.loanproject.services.ServicesImpl;

public class CustomerController {
	public static void main(String[] args) {
		ServicesImpl servicesImpl = new ServicesImpl();
		servicesImpl.addCustomer();
		servicesImpl.displayCustomer();
		servicesImpl.deleteCustomer();
		//servicesImpl.addCustomer();
	}
}
