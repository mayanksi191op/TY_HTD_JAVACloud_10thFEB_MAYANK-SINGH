package com.tyss.capgemini.loanproject.controller;




import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.tyss.capgemini.loanproject.factory.FactoryClass;
//import com.tyss.capgemini.loanproject.repository.Repository;

public class CustomerController {

	public static void custController(String userid) {
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
				FactoryClass.getServices().viewLoanPrograms();
				break;

			case 2:
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
				FactoryClass.getServices().loanApplicationForm(applicationId, accountNo, applicantFirstName,
						applicantMiddleName, applicantLastName, coapplicantFirstName, coapplicantMiddleName,
						coapplicantLastName, loanChoice, branchCode, branchName, openDate, requestDate, sub);
				break;

			case 3:
				logger.info("Your current balance is: ");
				FactoryClass.getServices().checkBalance(userid);
				logger.info("Loan to be paid: ");
				FactoryClass.getServices().checkLoan(userid);
				logger.info("Enter the amount to pay: ");
				double loanPay = Login.scanner.nextDouble();
				Login.scanner.nextLine();
				FactoryClass.getServices().payLoan(userid, loanPay);
				logger.info("New Balance is: ");
				FactoryClass.getServices().checkBalance(userid);
				
				break;
				
			case 4:
				logger.info("enter the new password: ");
				String newPass = Login.scanner.nextLine();
				FactoryClass.getServices().changePassword(userid, newPass);
				break;

			case 5:
				FactoryClass.getServices().checkBalance(userid);
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
