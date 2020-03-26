package com.tyss.capgemini.loanproject.controller;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.tyss.capgemini.loanproject.factory.FactoryClass;
//import com.tyss.capgemini.loanproject.repository.Repository;

public class CustomerController {

	public static void custController(String custUsername) {
		// Repository.UserTable();
		Logger logger = LogManager.getLogger(CustomerController.class);
		boolean exit = false;
		while (exit != true) {
			logger.info("Customer Operations:-");
			logger.info("1> Loan Programs:");
			logger.info("2> Apply for loan: ");
			logger.info("3> Pay Loan: ");
			logger.info("4> change password: ");
			logger.info("5> Check Balance: ");
			logger.info("6> Logout");
			logger.info("Enter your choice: ");
			int choice = Login.scanner.nextInt();
			Login.scanner.nextLine();
			switch (choice) {
			case 1:
				FactoryClass.getCustomerServices().viewLoanPrograms();
				break;

			case 2:
				try {
					logger.info("enter the applicationId: ");
					String applicationId = Login.scanner.nextLine();
					logger.info("enter the loan account number: ");
					String accountNo = Login.scanner.nextLine();
					logger.info("enter the Applicant First Name: ");
					String applicantFirstName = Login.scanner.nextLine();
					logger.info("enter the Middle Name: ");
					String applicantMiddleName = Login.scanner.nextLine();
					logger.info("enter the Last Name");
					String applicantLastName = Login.scanner.nextLine();
					logger.info("enter the Co-Applicant First Name: ");
					String coapplicantFirstName = Login.scanner.nextLine();
					logger.info("enter the Middle Name");
					String coapplicantMiddleName = Login.scanner.nextLine();
					logger.info("enter the Last Name");
					String coapplicantLastName = Login.scanner.nextLine();
					logger.info("enter the Date of Birth: ");
					String dateOfBirth = Login.scanner.nextLine();
					logger.info("enter the Loan Type");
					String loanChoice = Login.scanner.nextLine();
					logger.info("enter the Branch Code");
					String branchCode = Login.scanner.nextLine();
					logger.info("enter the Branch Name");
					String branchName = Login.scanner.nextLine();
					logger.info("enter the open date");
					String openDate = Login.scanner.nextLine();
					logger.info("enter the Request Date");
					String requestDate = Login.scanner.nextLine();
					logger.info("SUBMIT    (or)    CANCEL");
					String sub = Login.scanner.nextLine();
					FactoryClass.getCustomerServices().loanApplicationForm(applicationId, accountNo, applicantFirstName,
							applicantMiddleName, applicantLastName, dateOfBirth, coapplicantFirstName, coapplicantMiddleName,
							coapplicantLastName, loanChoice, branchCode, branchName, openDate, requestDate, sub);
				} catch (Exception e) {
					System.err.println(e);
				}
				break;

			case 3:
				try {
					logger.info("Your current balance is: ");
					FactoryClass.getCustomerServices().checkBalance(custUsername);
					logger.info("Loan to be paid: ");
					FactoryClass.getCustomerServices().checkLoan(custUsername);
					logger.info("Enter the amount to pay: ");
					Double loanPay = Login.scanner.nextDouble();
					Login.scanner.nextLine();
					FactoryClass.getCustomerServices().payLoan(custUsername, loanPay);
					logger.info("New Balance is: ");
					FactoryClass.getCustomerServices().checkBalance(custUsername);
				} catch (Exception e) {
					System.err.println(e);
				}
				break;
				
			case 4:
				try {
					logger.info("enter the new password: ");
					String newPass = Login.scanner.nextLine();
					FactoryClass.getCustomerServices().changePassword(custUsername, newPass);
				} catch (Exception e) {
					System.err.println(e);
				}
				break;

			case 5:
				FactoryClass.getCustomerServices().checkBalance(custUsername);
				break;

			case 6:
				exit = true;
				break;   

			default:
				logger.info("Invalid Option");
				break;
			}
		}
	}
}
