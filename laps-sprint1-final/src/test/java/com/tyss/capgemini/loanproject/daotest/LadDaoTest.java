package com.tyss.capgemini.loanproject.daotest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.tyss.javacloud.loanproject.dao.LadDaoImplementation;
import com.tyss.javacloud.loanproject.repository.Repository;

public class LadDaoTest {
	LadDaoImplementation implementation = new LadDaoImplementation();
	
	@Test
	void viewLoanProgramsTest() {
		Repository.userTable();
		Boolean isBoolean = implementation.viewLoanPrograms();
		assertEquals(isBoolean, true);
	}
	
	@Test
	void ladReviewFormsTest1() {
		Repository.userTable();
		Boolean isBoolean = implementation.ladReviewForms("3", "approved");
		assertEquals(isBoolean, true);
	}
	
	@Test
	void ladReviewFormsTest2() {
		Repository.userTable();
		Boolean isBoolean = implementation.ladReviewForms("3", "rejected");
		assertEquals(isBoolean, true);
	}
	
	@Test
	void ladReviewFormsTest3() {
		Repository.userTable();
		Boolean isBoolean = implementation.ladReviewForms("AP031", "approved");
		assertEquals(isBoolean, false);
	}
	
	@Test
	void ladViewFormsTest1() {
		Repository.userTable();
		Boolean isBoolean = implementation.ladViewForms("Personal Loan");
		assertEquals(isBoolean, true);
	}
	
	@Test
	void ladViewFormsTest2() {
		Repository.userTable();
		Boolean isBoolean = implementation.ladViewForms("asd loan");
		assertEquals(isBoolean, false);
	}
	
	@Test
	void requestedForms1() {
		Repository.userTable();
		Boolean isBoolean = implementation.requestedForms();
		assertEquals(isBoolean, true);
	}
	
	@Test
	void loanTypesTest1() {
		Repository.userTable();
		Boolean boolean1 = implementation.loanTypes();
		assertEquals(boolean1, true);
	}
	
	@Test
	void loanTypes2Test1() {
		Repository.userTable();
		String string = implementation.loanTypes("1");
		assertEquals(string, "House Loan");
	}
	
	@Test
	void loanTypes2Test2() {
		Repository.userTable();
		String string = implementation.loanTypes("2");
		assertEquals(string, "House Construction Loan");
	}
	
	@Test
	void applicationExistsTest1() {
		Repository.userTable();
		Boolean boolean1 = implementation.applicationExist("1");
		assertEquals(boolean1, false);
	}
	
	@Test
	void applicationExistsTest2() {
		Repository.userTable();
		Boolean boolean1 = implementation.applicationExist("asdasd");
		assertEquals(boolean1, false);
	}
	
}
