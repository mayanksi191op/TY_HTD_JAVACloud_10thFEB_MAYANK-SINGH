package com.tyss.capgemini.loanproject.daotest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.tyss.capgemini.loanproject.dao.AdminDaoImplementation;
import com.tyss.capgemini.loanproject.repository.Repository;

public class AdminDaoTest {
	AdminDaoImplementation implementation = new AdminDaoImplementation();

	@Test
	void deleteLoanTest1() {
		Repository.UserTable();
		Boolean isBoolean = implementation.deleteLoan("Payday Loan");
		assertEquals(isBoolean, true);
	}
	@Test
	void deleteLoanTest2() {
		Repository.UserTable();
		Boolean isBoolean = implementation.deleteLoan("asdasdsd Loan");
		assertEquals(isBoolean, false);
	}
	
	@Test
	void loanUpdateTest1() {
		Repository.UserTable();
		Boolean isBoolean = implementation.loanUpdate("House Loan", 1, "Garib Loan");
		assertEquals(isBoolean, true);
	}
	
	@Test
	void loanUpdateTest2() {
		Repository.UserTable();
		Boolean isBoolean = implementation.loanUpdate("asdasd", 1, "Garib Loan");
		assertEquals(isBoolean, false);
	}
	
	@Test
	void loanUpdateTest3() {
		Repository.UserTable();
		Boolean isBoolean = implementation.loanUpdate("House Loan", 5, "Garib Loan");
		assertEquals(isBoolean, true);
	}
	
	@Test
	void viewLoanProgramsTest1() {
		Repository.UserTable();
		Boolean isBoolean = implementation.viewLoanPrograms();
		assertEquals(isBoolean, true);
	}
	
	@Test
	void insertLoanTest1() {
		Repository.UserTable();
		Boolean isBoolean = implementation.insertLoan("House Loan2", "12 months", "10%");
		assertEquals(isBoolean, true);
	}
	
	@Test
	void approvedFormsTest1() {
		Repository.UserTable();
		Boolean isBoolean = implementation.approvedForms();
		assertEquals(isBoolean, true);
	}

	@Test
	void rejectedFormsTest1() {
		Repository.UserTable();
		Boolean isBoolean = implementation.rejectedForms();
		assertEquals(isBoolean, true);
	}
	
	@Test
	void requestedFormsTest1() {
		Repository.UserTable();
		Boolean isBoolean = implementation.requestedForms();
		assertEquals(isBoolean, true);
	}
	
	@Test
	void viewClientsTest1() {
		Repository.UserTable();
		Boolean isBoolean = implementation.viewClients();
		assertEquals(isBoolean, true);
	}
	
	@Test
	void addClientsTest1() {
		Repository.UserTable();
		Boolean isBoolean = implementation.addClients("AP01");
		assertEquals(isBoolean, true);
	}
	
	@Test
	void addClientsTest2() {
		Repository.UserTable();
		Boolean isBoolean = implementation.addClients("asdasd");
		assertEquals(isBoolean, false);
	}
}
