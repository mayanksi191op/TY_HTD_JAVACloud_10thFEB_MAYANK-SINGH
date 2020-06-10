package com.tyss.capgemini.loanproject.daotest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.tyss.capgemini.loanproject.dao.AdminDaoImplementation;
import com.tyss.capgemini.loanproject.repository.Repository;

public class AdminDaoTest {
	AdminDaoImplementation implementation = new AdminDaoImplementation();

	@Test
	void deleteLoanTest1() {
		Repository.userTable();
		Boolean isBoolean = implementation.deleteLoan("Personal Loan");
		assertEquals(isBoolean, true);
	}
	@Test
	void deleteLoanTest2() {
		Repository.userTable();
		Boolean isBoolean = implementation.deleteLoan("asdasdsd Loan");
		assertEquals(isBoolean, false);
	}
	
	@Test
	void loanUpdateTest1() {
		Repository.userTable();
		Boolean isBoolean = implementation.loanUpdate("House Loan", 1, "Garib Loan");
		assertEquals(isBoolean, true);
	}
	
	@Test
	void loanUpdateTest2() {
		Repository.userTable();
		Boolean isBoolean = implementation.loanUpdate("asdasd", 1, "Garib Loan");
		assertEquals(isBoolean, false);
	}
	
	@Test
	void loanUpdateTest3() {
		Repository.userTable();
		Boolean isBoolean = implementation.loanUpdate("House Loan", 5, "Garib Loan");
		assertEquals(isBoolean, true);
	}
	
	@Test
	void viewLoanProgramsTest1() {
		Repository.userTable();
		Boolean isBoolean = implementation.viewLoanPrograms();
		assertEquals(isBoolean, true);
	}
	
	@Test
	void insertLoanTest1() {
		Repository.userTable();
		Boolean isBoolean = implementation.insertLoan("House Loan2", "12 months", "10%");
		assertEquals(isBoolean, true);
	}
	
	@Test
	void approvedFormsTest1() {
		Repository.userTable();
		Boolean isBoolean = implementation.approvedForms();
		assertEquals(isBoolean, true);
	}

	@Test
	void rejectedFormsTest1() {
		Repository.userTable();
		Boolean isBoolean = implementation.rejectedForms();
		assertEquals(isBoolean, true);
	}
	
	@Test
	void requestedFormsTest1() {
		Repository.userTable();
		Boolean isBoolean = implementation.requestedForms();
		assertEquals(isBoolean, true);
	}
	
	@Test
	void viewClientsTest1() {
		Repository.userTable();
		Boolean isBoolean = implementation.viewClients();
		assertEquals(isBoolean, true);
	}
	
	@Test
	void addClientsTest1() {
		Repository.userTable();
		Boolean isBoolean = implementation.addClients("AP01", "manuqw@gmail.com", "qwerty@123A", "mayank", "singh", "8787878787");
		assertEquals(isBoolean, true);
	}
	
	@Test
	void addClientsTest2() {
		Repository.userTable();
		Boolean isBoolean = implementation.addClients("AP02", "naruto@gmail.com", "qwerty@123", "Naruto", "Uzumaki", "7234232434");
		assertEquals(isBoolean, true);
	}
	
	@Test
	void updateType1() {
		Repository.userTable();
		String iString = implementation.updateType("Personal Loan", "asdasd");
		assertEquals(iString, "asdasd");
	}
	
	@Test
	void updateType2() {
		Repository.userTable();
		String iString = implementation.updateType("wqeqwe", "asdasd");
		assertEquals(iString, null);
	}
	
	@Test
	void updateTimePeriodTest1() {
		Repository.userTable();
		Boolean boolean1 = implementation.updateTimePeriod("Personal Loan", "23");
		assertEquals(boolean1, true);
	}
	
	@Test
	void updateTimePeriodTest2() {
		Repository.userTable();
		Boolean boolean1 = implementation.updateTimePeriod("asdasdasd", "23");
		assertEquals(boolean1, false);
	}
	
	@Test
	void updateInterestRateTest1() {
		Repository.userTable();
		Boolean boolean1 = implementation.updateRates("Personal Loan", "12");
		assertEquals(boolean1, true);
	}
	
	@Test
	void updateInterestRateTest2() {
		Repository.userTable();
		Boolean boolean1 = implementation.updateRates("asdasdasd", "12");
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
	void emailExistsTest1() {
		Repository.userTable();
		Boolean boolean1 = implementation.emailExists("manoj.p@gamil.com");
		assertEquals(boolean1, true);
	}
	
	@Test
	void emailExistsTest2() {
		Repository.userTable();
		Boolean boolean1 = implementation.emailExists("asdasd");
		assertEquals(boolean1, true);
	}
}
