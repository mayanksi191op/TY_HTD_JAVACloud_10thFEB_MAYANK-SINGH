package com.tyss.capgemini.loanproject.daotest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.tyss.capgemini.loanproject.dao.LadDaoImplementation;
import com.tyss.capgemini.loanproject.repository.Repository;

public class LadDaoTest {
	LadDaoImplementation implementation = new LadDaoImplementation();
	
	@Test
	void viewLoanProgramsTest() {
		Repository.UserTable();
		Boolean isBoolean = implementation.viewLoanPrograms();
		assertEquals(isBoolean, true);
	}
	
	@Test
	void ladReviewFormsTest1() {
		Repository.UserTable();
		Boolean isBoolean = implementation.ladReviewForms("AP03", "approved");
		assertEquals(isBoolean, true);
	}
	
	@Test
	void ladReviewFormsTest2() {
		Repository.UserTable();
		Boolean isBoolean = implementation.ladReviewForms("AP03", "rejected");
		assertEquals(isBoolean, true);
	}
	
	@Test
	void ladReviewFormsTest3() {
		Repository.UserTable();
		Boolean isBoolean = implementation.ladReviewForms("AP031", "approved");
		assertEquals(isBoolean, false);
	}
	
	@Test
	void ladViewFormsTest1() {
		Repository.UserTable();
		Boolean isBoolean = implementation.ladViewForms("Personal Loan");
		assertEquals(isBoolean, true);
	}
	
	@Test
	void ladViewFormsTest2() {
		Repository.UserTable();
		Boolean isBoolean = implementation.ladViewForms("asd loan");
		assertEquals(isBoolean, false);
	}
	
	@Test
	void requestedForms1() {
		Repository.UserTable();
		Boolean isBoolean = implementation.requestedForms();
		assertEquals(isBoolean, true);
	}
}
