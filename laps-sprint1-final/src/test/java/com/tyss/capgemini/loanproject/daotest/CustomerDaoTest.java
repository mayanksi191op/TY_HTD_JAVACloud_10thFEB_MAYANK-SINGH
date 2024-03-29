package com.tyss.capgemini.loanproject.daotest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.tyss.javacloud.loanproject.dao.CustomerDaoImplementation;
import com.tyss.javacloud.loanproject.repository.Repository;

public class CustomerDaoTest {
	
	CustomerDaoImplementation implementation = new CustomerDaoImplementation();

	@Test
	void viewLoanProgram() {
		Repository.userTable();
		Boolean isTruBoolean = implementation.viewLoanPrograms();
		assertEquals(isTruBoolean, true);
	}
	
	@Test
	void changePasswordTest1() {
		Repository.userTable();
		Boolean istrueBoolean = implementation.changePassword("manoj191", "Qwerty@123");
		assertEquals(istrueBoolean, true);
	}
	
	@Test
	void changePasswordTest2() {
		Repository.userTable();
		Boolean isfalseBoolean = implementation.changePassword("Manoj191", "qwerty123");
		assertEquals(isfalseBoolean, false);
	}
	
	@Test
	void checkBalanceTest1() {
		Repository.userTable();
		Boolean isBoolean = implementation.checkBalance("manoj191");
		assertEquals(isBoolean, true);
	}
	
	@Test
	void checkBalanceTest2() {
		Repository.userTable();
		Boolean isBoolean = implementation.checkBalance("maasdnoj191");
		assertEquals(isBoolean, false);
	}
	
	@Test
	void payLoanTest1() {
		Repository.userTable();
		Boolean isBoolean = implementation.payLoan("manoj191", 500D);
		assertEquals(isBoolean, true);
	}
	
	@Test
	void payLoanTest2() {
		Repository.userTable();
		Boolean isBoolean = implementation.payLoan("Manoj191", 500D);
		assertEquals(isBoolean, false);
	}
	
	@Test
	void payLoanTest3() {
		Repository.userTable();
		Boolean isBoolean = implementation.payLoan("manoj191", 100000D);
		assertEquals(isBoolean, true);
	}
	
	@Test
	void checkLoanTest1() {
		Repository.userTable();
		Boolean isBoolean = implementation.checkLoan("manoj191");
		assertEquals(isBoolean, true);
	}
	
	@Test
	void checkLoanTest2() {
		Repository.userTable();
		Boolean isBoolean = implementation.checkLoan("Manoj191");
		assertEquals(isBoolean, false);
	}
	
	@Test
	void loanApplicationForm1() {
		Repository.userTable();
		Boolean isBoolean = implementation.loanApplicationForm("AP198", "BNI12345", "pankaj.p@gmail.com", "Pankaj", "", "Tripathy", "14/12/1995", "Ranjan", "Singh", "Ranjup", "House Loan", "BNI123421412", "Kanchipuram", "1233");
		assertEquals(isBoolean, true);
	}
	
	@Test
	void loanApplicationForm2() {
		Repository.userTable();
		Boolean isBoolean = implementation.loanApplicationForm("AP198", "BNI12345", "pankaj.p@gmail.com", "Pankaj", "", "Tripathy", "14/12/1995", "", "", "", "House Loan", "BNI123421412", "Kanchipuram", "1233");
		assertEquals(isBoolean, true);
	}
	
	@Test
	void loanApplicationForm3() {
		Repository.userTable();
		Boolean isBoolean = implementation.loanApplicationForm("AP1234", "BNI12345", "anand.p@gmail.com", "Anand", "Singh", "", "14/12/1995", "Ranjan", "Singh", "Ranjup", "House Loan", "BNI123421412", "Kanchipuram", "1231");
		assertEquals(isBoolean, true);
	}
	
	
	@Test
	void usernameExists1() {
		Repository.userTable();
		Boolean isBoolean = implementation.usernameExists("asd");
		assertEquals(isBoolean, false);
	}
	
	@Test
	void usernameExists2() {
		Repository.userTable();
		Boolean isBoolean = implementation.usernameExists("manoj191");
		assertEquals(isBoolean, true);
	}
	
	@Test
	void loanTypes1() {
		Repository.userTable();
		Boolean isBoolean = implementation.loanTypes();
		assertEquals(isBoolean, true);
	}
	
	@Test
	void loanTypes2() {
		Repository.userTable();
		Boolean isBoolean = implementation.loanTypes();
		assertEquals(isBoolean, true);
	}
	
	
	@Test
	void viewApplicationsTest1() {
		Repository.userTable();
		Boolean boolean1 = implementation.viewApplications("manoj191");
		assertEquals(boolean1, true);
	}
	
	@Test
	void emailExistsTest1() {
		Repository.userTable();
		Boolean boolean1 = implementation.emailExists("manoj.p@gmail.com");
		assertEquals(boolean1, false);
	}
	
	@Test
	void emailExistsTest2() {
		Repository.userTable();
		Boolean boolean1 = implementation.emailExists("manoj.p@gmail.com");
		assertEquals(boolean1, false);
	}
	
	@Test
	void usernameExistsTest1() {
		Repository.userTable();
		Boolean boolean1 = implementation.usernameExists("manoj191");
		assertEquals(boolean1, true);
	}
	
	@Test
	void usernameExistsTest2() {
		Repository.userTable();
		Boolean boolean1 = implementation.usernameExists("asdasd");
		assertEquals(boolean1, false);
	}
	
	@Test
	void fetchMailTest1() {
		Repository.userTable();
		String string = implementation.fetchMail("manoj191");
		assertEquals(string, "manoj.p@gmail.com");
	}
	
	@Test
	void fetchMailTest2() {
		Repository.userTable();
		String string = implementation.fetchMail("asdasd");
		assertEquals(string, "asdasd");
	}
}
