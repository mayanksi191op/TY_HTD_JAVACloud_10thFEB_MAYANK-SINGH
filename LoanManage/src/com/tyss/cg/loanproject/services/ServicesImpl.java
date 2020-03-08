package com.tyss.cg.loanproject.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.tyss.cg.loanproject.beans.AdminInfoBean;
import com.tyss.cg.loanproject.beans.CustomerInfoBean;

public class ServicesImpl implements ServicesDeclaration {
	Scanner scanner = new Scanner(System.in);
	List<AdminInfoBean> adminlist =new ArrayList<AdminInfoBean>();
	List<CustomerInfoBean> customerlist = new ArrayList<CustomerInfoBean>();
	CustomerInfoBean customerInfoBean = new CustomerInfoBean();
	AdminInfoBean adminInfoBean = new AdminInfoBean();
	
	@Override
	public void addAdmin() {
		System.out.println("Enter the number of entries: ");
		int entry=scanner.nextInt();
		scanner.nextLine();
		for(int i=0; i<entry; i++) {
			System.out.println("Enter the details of Admin "+ (i+1));
			System.out.println("Enter the AdminId: ");
			int adminid = Integer.parseInt(scanner.nextLine());
			adminInfoBean.setAdminid(adminid);
			System.out.println("Enter the Email: ");
			String email = scanner.nextLine();
			adminInfoBean.setEmail(email);
			System.out.println("Enter the Password: ");
			String password = scanner.nextLine();
			adminInfoBean.setPassword(password);
			System.out.println("Enter the Username: ");
			String username = scanner.nextLine();
			adminInfoBean.setUsername(username);
			System.out.println("Enter 10 digit Phone number: ");
			int phone = Integer.parseInt(scanner.nextLine());
			adminInfoBean.setPhonenumber(phone);
			System.out.println("Enter the First Name: ");
			String firstname = scanner.nextLine();
			adminInfoBean.setFirstname(firstname);
			System.out.println("Enter the Last Name: ");
			String lastname = scanner.nextLine();
			adminInfoBean.setLastname(lastname);
			
			adminlist.add(adminInfoBean);
		}
	}

	@Override
	public void displayAdmin() {
		List<AdminInfoBean> list=new ArrayList<AdminInfoBean>();
		if(list.isEmpty()!=true) {
			for (AdminInfoBean adminInfoBean : list) {
				System.out.println(adminInfoBean);
			}
		} else System.out.println("no data found");
	}

	@Override
	public void deleteAdmin() {
		System.out.println("Enter the AdminId");
		int adminid= scanner.nextInt();
		if(adminlist.isEmpty()!=true) {
		for(int i=0; i<adminlist.size(); i++) {
			if(adminInfoBean.getAdminid()==adminid) {
				adminlist.remove(adminInfoBean);
				
				for(int j=0; j<adminlist.size(); j++) {
					System.out.println(adminlist);
				} 
				
				
			} else System.out.println("data not found");
		}
		}else System.out.println("list is empty");
	}

	@Override
	public void updateAdmin() {
		// TODO Auto-generated method stub

	}
	
	
	@Override
	public void displayCustomer() {
		if(customerlist.isEmpty()==false) {
			for (CustomerInfoBean customerInfoBean1 : customerlist) {
				System.out.println(customerInfoBean1);
			}
		} else System.out.println("no data found");
		
	}

	@Override
	public void addCustomer() {

		System.out.println("Please mention  number of entries: ");
		int entry = scanner.nextInt();
		scanner.nextLine();

		for (int i = 0; i < entry; i++) {
			
			System.out.println("Enter the details of customer: " + (i + 1));

			System.out.println("Enter the CustomerId: ");
			int customerid = Integer.parseInt(scanner.nextLine());
			customerInfoBean.setCustomerid(customerid);
			System.out.println("Enter the Email: ");
			String email = scanner.nextLine();
			customerInfoBean.setEmail(email);
			System.out.println("Enter the Password: ");
			String password = scanner.nextLine();
			customerInfoBean.setPassword(password);
			System.out.println("Enter the Username: ");
			String username = scanner.nextLine();
			customerInfoBean.setUsername(username);
			System.out.println("Enter the First Name: ");
			String firstname = scanner.nextLine();
			customerInfoBean.setFirstname(firstname);
			System.out.println("Enter the Last Name: ");
			String lastname = scanner.nextLine();
			customerInfoBean.setLastname(lastname);
			System.out.println("Enter the Open Date of birth: ");
			String dateofbirth = scanner.nextLine();
			customerInfoBean.setDateofbirth(dateofbirth);
			System.out.println("Enter 10 digit Phone number: ");
			int phone = Integer.parseInt(scanner.nextLine());
			customerInfoBean.setPhonenumber(phone);
			System.out.println("Enter the Bank Branch: ");
			String bankbranch = scanner.nextLine();
			customerInfoBean.setBankbranch(bankbranch);
			System.out.println("Enter the Account number: ");
			String accountnum = scanner.nextLine();
			customerInfoBean.setAccountnum(accountnum);
			System.out.println("Enter the Open Date: ");
			String opendate = scanner.nextLine();
			customerInfoBean.setOpendate(opendate);

			customerlist.add(customerInfoBean);

		}
	}

	@Override
	public void deleteCustomer() {
		System.out.println("enter the CustomerId: ");
		int id = scanner.nextInt();
		scanner.nextLine();
		if(customerlist.isEmpty()==false) {
		for(int i=0; i<customerlist.size(); i++) {
			if(customerInfoBean.getCustomerid()==id) {
				customerlist.remove(customerInfoBean);
			} else System.out.println("data not found");
		}
		}else System.out.println("empty db");
	}

	@Override
	public void updateCustomer() {
		// TODO Auto-generated method stub

	}

	@Override
	public void loginOperations() {
		// TODO Auto-generated method stub

	}

}
