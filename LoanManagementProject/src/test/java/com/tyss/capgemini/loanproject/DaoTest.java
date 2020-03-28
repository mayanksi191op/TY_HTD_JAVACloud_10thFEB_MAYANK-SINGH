package com.tyss.capgemini.loanproject;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.tyss.capgemini.loanproject.dao.DAOImplementation;
import com.tyss.capgemini.loanproject.exceptions.InvalidPasswordException;
import com.tyss.capgemini.loanproject.services.ServicesImplementation;

public class DaoTest {
	DAOImplementation daoImplementation = new DAOImplementation();
	ServicesImplementation implementation = new ServicesImplementation();

	@Test
	void changePasswordTest1() {
		try {
			Boolean istrueBoolean = implementation.changePassword("Praveen123@", "qwerty");
			assertEquals(istrueBoolean, true);
		} catch (Exception e) {
			assertThrows(InvalidPasswordException.class, () -> {
				implementation.changePassword("Praveen123", "qwerty");
			});
		}
		//		Boolean istrueBoolean = implementation.changePassword("Praveen123", "qwerty@123");
		//		assertEquals(istrueBoolean, true);
	}
	
	@Test
	void changePasswordTest2() {
		try {
			Boolean istrueBoolean = implementation.changePassword("Praveen123@", "qwerty");
			assertEquals(istrueBoolean, true);
		} catch (Exception e) {
			assertThrows(InvalidPasswordException.class, () -> {
				implementation.changePassword("Praveen123", "Qwerty@123");
			});
		}
		//		Boolean istrueBoolean = implementation.changePassword("Praveen123", "qwerty@123");
		//		assertEquals(istrueBoolean, true);
	}
}
