package com.tyss.cg.loanproject.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.tyss.cg.loanproject.beans.AdminInfoBean;
import com.tyss.cg.loanproject.beans.CustomerInfoBean;

public class ServicesImpl implements ServicesDeclaration {
	Scanner scanner = new Scanner(System.in);
	List<AdminInfoBean> adminlist = new ArrayList<AdminInfoBean>();
	List<CustomerInfoBean> customerlist = new ArrayList<CustomerInfoBean>();
	CustomerInfoBean customerInfoBean;
	// AdminInfoBean adminInfoBean = new AdminInfoBean();
	AdminInfoBean adminInfoBean;

	@Override
	public void addAdmin() {
		// AdminInfoBean adminInfoBean;
		System.out.println("Enter the number of entries: ");
		int entry = scanner.nextInt();
		scanner.nextLine();
		for (int i = 0; i < entry; i++) {
			System.out.println("Enter the details of Admin " + (i + 1));
			System.out.println("Enter the AdminId: ");
			int adminid = Integer.parseInt(scanner.nextLine());
			// adminInfoBean.setAdminid(adminid);
			System.out.println("Enter the Email: ");
			String email = scanner.nextLine();
			// adminInfoBean.setEmail(email);
			System.out.println("Enter the Password: ");
			String password = scanner.nextLine();
			// adminInfoBean.setPassword(password);
			System.out.println("Enter the Username: ");
			String username = scanner.nextLine();
			// adminInfoBean.setUsername(username);
			System.out.println("Enter 10 digit Phone number: ");
			int phonenumber = Integer.parseInt(scanner.nextLine());
			// adminInfoBean.setPhonenumber(phonenumber);
			System.out.println("Enter the First Name: ");
			String firstname = scanner.nextLine();
			// adminInfoBean.setFirstname(firstname);
			System.out.println("Enter the Last Name: ");
			String lastname = scanner.nextLine();
			// adminInfoBean.setLastname(lastname);

			adminInfoBean = new AdminInfoBean(adminid, email, password, username, firstname, lastname, phonenumber);
			adminlist.add(adminInfoBean);
//			adminlist.add(adminInfoBean);
//			for (AdminInfoBean adminInfoBean2 : adminlist) {
//				System.out.println(adminlist);
//			}
		}
	}

	@Override
	public void displayAdmin() {
		if (adminlist.isEmpty() != true) {
//			for (AdminInfoBean adminInfoBean : adminlist) {
//				System.out.println(adminInfoBean);
//			}
			for (int i = 0; i < adminlist.size(); i++) {
				System.out.println(adminlist.get(i));
			}
		} else
			System.out.println("no data found");
	}

	@Override
	public void deleteAdmin() {
		int count = 0;
		System.out.println("Enter userid: ");
		int adminid = scanner.nextInt();
		scanner.nextLine();
		if (adminlist.isEmpty() != true) {

			for (AdminInfoBean adminInfoBean : adminlist) {
				if (adminInfoBean.getAdminid() == adminid) {
					System.out.println(adminInfoBean.getAdminid());
					adminlist.remove(adminInfoBean);
					count++;
					break;
				}
			}

//				for (int i = 0; i < adminlist.size(); i++) {
//					adminlist.get(i);
//					if(adminInfoBean.getAdminid()==adminid) {
//						System.out.println(adminInfoBean.getAdminid());
//						adminlist.remove(adminInfoBean);
//						break;
//					} 
//					

			if (count > 0)
				System.out.println("Admin removed");
			else
				System.out.println("Admin not found");
		} else {
			System.out.println("Empty list");
		}
	}

	@Override
	public void updateAdmin() {
		System.out.println("enter the adminid of admin you want to updat: ");
		int id = scanner.nextInt();
		if (adminlist.isEmpty() != true) {
			for (AdminInfoBean adminInfoBean : adminlist) {
				if (adminInfoBean.getAdminid() == id) {
					System.out.println("what do you want to update for this admin?");
					System.out.println("1> AdminId");
					System.out.println("2> Email");
					System.out.println("3> Password");
					System.out.println("4> Username");
					System.out.println("5> PhoneNumber");
					System.out.println("6> First Name");
					System.out.println("7> Last Name");
					int choice = scanner.nextInt();
					switch (choice) {
					case 1:
						System.out.println("enter the new id");
						int adminid = scanner.nextInt();
						adminInfoBean.setAdminid(adminid);
						break;

					case 2:
						System.out.println("Enter the Email: ");
						String email = scanner.nextLine();
						adminInfoBean.setEmail(email);
						break;

					case 3:
						System.out.println("Enter the Password: ");
						String password = scanner.nextLine();
						adminInfoBean.setPassword(password);
						break;

					case 4:
						System.out.println("Enter the Username: ");
						String username = scanner.nextLine();
						adminInfoBean.setUsername(username);
						break;

					case 5:
						System.out.println("Enter 10 digit Phone number: ");
						int phonenumber = Integer.parseInt(scanner.nextLine());
						adminInfoBean.setPhonenumber(phonenumber);
						break;

					case 6:
						System.out.println("Enter the First Name: ");
						String firstname = scanner.nextLine();
						adminInfoBean.setFirstname(firstname);
						break;

					case 7:
						System.out.println("Enter the Last Name: ");
						String lastname = scanner.nextLine();
						adminInfoBean.setLastname(lastname);
						break;

					default:
						System.out.println("wrong choice");
						break;
					}
				}
			}
		}
	}

	@Override
	public void displayCustomer() {
		if (customerlist.isEmpty() == false) {
			for (int i = 0; i < customerlist.size(); i++) {
				System.out.println(customerlist.get(i));
			}
		} else
			System.out.println("no data found");

	}

	@Override
	public void addCustomer() {

		System.out.println("Please mention  number of entries: ");
		int entry = scanner.nextInt();
		scanner.nextLine();

		for (int i = 0; i < entry; i++) {
			customerInfoBean = new CustomerInfoBean();
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
		int count = 0;
		if (customerlist.isEmpty() != true) {

			for (CustomerInfoBean customerInfoBean : customerlist) {
				if (customerInfoBean.getCustomerid() == id) {
					System.out.println(customerInfoBean.getCustomerid());
					customerlist.remove(customerInfoBean);
					count++;
					break;
				}
			}
			if (count > 0) {
				System.out.println("Customer removed");
			} else
				System.out.println("Customer not found");
		} else
			System.out.println("empty db");
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