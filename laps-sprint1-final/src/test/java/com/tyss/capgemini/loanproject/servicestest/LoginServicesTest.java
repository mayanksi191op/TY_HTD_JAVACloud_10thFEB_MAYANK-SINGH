package com.tyss.capgemini.loanproject.servicestest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.tyss.javacloud.loanproject.exceptions.DateLimitException;
import com.tyss.javacloud.loanproject.exceptions.InvalidCredentialException;
import com.tyss.javacloud.loanproject.exceptions.InvalidDateFormatException;
import com.tyss.javacloud.loanproject.exceptions.InvalidEmailException;
import com.tyss.javacloud.loanproject.exceptions.InvalidPasswordException;
import com.tyss.javacloud.loanproject.exceptions.InvalidPhoneException;
import com.tyss.javacloud.loanproject.repository.Repository;
import com.tyss.javacloud.loanproject.services.LoginServicesImplementation;

public class LoginServicesTest {
	LoginServicesImplementation implementation = new LoginServicesImplementation();

	@Test
	void custLoginTest1() {
		Repository.userTable();
		try {
			Boolean isBoolean = implementation.custLogin("manoj19123", "pass6");
			assertEquals(isBoolean, true);
		} catch (Exception e) {

			assertThrows(InvalidCredentialException.class, () -> {
				implementation.custLogin("manoj191", "pass6");
			});
		}
	}

	@Test
	void custLoginTest2() {
		Repository.userTable();
		try {
			Boolean isBoolean = implementation.custLogin("manojqwe191", "pass6");
			assertEquals(isBoolean, true);
		} catch (Exception e) {

			assertThrows(InvalidCredentialException.class, () -> {
				implementation.custLogin("manojqwe191", "pass6");
			});
		}
	}

	@Test
	void empLoginTest1() {
		Repository.userTable();
		try {
			Boolean isBoolean = implementation.empLogin("mayank191", "pass1");
			assertEquals(isBoolean, true);
		} catch (Exception e) {
			assertThrows(InvalidCredentialException.class, () -> {
				implementation.empLogin("mayank191", "pass1");
			});
		}
	}

	@Test
	void empLoginTest2() {
		Repository.userTable();
		try {
			Boolean isBoolean = implementation.empLogin("mayank191123", "pass1");
			assertEquals(isBoolean, true);
		} catch (Exception e) {
			assertThrows(InvalidCredentialException.class, () -> {
				implementation.empLogin("mayank191123", "pass1");
			});
		}
	}

	@Test
	void empLoginTest3() {
		Repository.userTable();
		try {
			Boolean isBoolean = implementation.empLogin("saswat191", "pass11");
			assertEquals(isBoolean, true);
		} catch (Exception e) {
			assertThrows(InvalidCredentialException.class, () -> {
				implementation.empLogin("saswat191", "pass11");
			});
		}
	}

	@Test
	void registerTest1() {
		Repository.userTable();
		try {
			Boolean isBoolean = implementation.register("businessman", "5/10/1996", "male", "Mayank123",
					"mayank123@gmail.com", "Qwerty@123", "Mayank", "Singh", 7681093264L, 50000.0);
			assertEquals(isBoolean, true);
		} catch (DateLimitException e) {
			assertThrows(DateLimitException.class, () -> {
				implementation.register("businessman", "5/10/1996", "male", "Mayank123",
						"mayank123@gmail.com", "Qwerty@123", "Mayank", "Singh", 7681093264L, 50000.0);
			});
		} catch (InvalidPhoneException e) {
			assertThrows(InvalidPhoneException.class, () -> {
				implementation.register("businessman", "5/10/1996", "male", "Mayank123", 
						"mayank123@gmail.com", "Qwerty@123", "Mayank", "Singh", 7681093264L, 50000.0);
			});
		} catch (InvalidDateFormatException e) {
			assertThrows(InvalidPhoneException.class, ()->{
				implementation.register("businessman", "5/10/1996", "male", "Mayank123", "mayank123@gmail.com", "Qwerty@123", "Mayank", "Singh", 7681093264L, 50000.0);
			});
		} catch (InvalidPasswordException e) {
			assertThrows(InvalidPasswordException.class, ()->{
				implementation.register("businessman", "5/10/1996", "male", "Mayank123", "mayank123@gmail.com", "Qwerty@123", "Mayank", "Singh", 7681093264L, 50000.0);
			});
		} catch (InvalidEmailException e) {
			assertThrows(InvalidEmailException.class, ()->{
				implementation.register("businessman", "5/10/1996", "male", "Mayank123", "mayank123@gmail.com", "Qwerty@123", "Mayank", "Singh", 7681093264L, 50000.0);
			});
		}
	}

	@Test
	void registerTest2() {
		Repository.userTable();
		try {
			Boolean isBoolean = implementation.register("businessman", "5-10-1996", "male", "Mayank123",
					"mayank123@gmail.com", "Qwerty@123", "Mayank", "Singh", 7681093264L, 50000.0);
			assertEquals(isBoolean, true);
		} catch (DateLimitException e) {
			assertThrows(DateLimitException.class, () -> {
				implementation.register("businessman", "5-10-1996", "male", "Mayank123",
						"mayank123@gmail.com", "Qwerty@123", "Mayank", "Singh", 7681093264L, 50000.0);
			});
		} catch (InvalidPhoneException e) {
			assertThrows(InvalidPhoneException.class, () -> {
				implementation.register("businessman", "5-10-1996", "male", "Mayank123",
						"mayank123@gmail.com", "Qwerty@123", "Mayank", "Singh", 7681093264L, 50000.0);
			});
		} catch (InvalidDateFormatException e) {
			assertThrows(InvalidDateFormatException.class, ()->{
				implementation.register("businessman", "5-10-1996", "male", "Mayank123",  "mayank123@gmail.com", "Qwerty@123", "Mayank", "Singh", 7681093264L, 50000.0);
			});
		} catch (InvalidPasswordException e) {
			assertThrows(InvalidPasswordException.class, ()->{
				implementation.register("businessman", "5-10-1996", "male", "Mayank123",  "mayank123@gmail.com", "Qwerty@123", "Mayank", "Singh", 7681093264L, 50000.0);
			});
		} catch (InvalidEmailException e) {
			assertThrows(InvalidEmailException.class, ()->{
				implementation.register("businessman", "5-10-1996", "male", "Mayank123",  "mayank123@gmail.com", "Qwerty@123", "Mayank", "Singh", 7681093264L, 50000.0);
			});
		}
	}
	
	@Test
	void registerTest3() {
		Repository.userTable();
		try {
			Boolean isBoolean = implementation.register("businessman", "5/10/1996", "male", "Mayank123", 
					"mayank123@gmail.com", "Qwerty@123", "Mayank", "Singh", 76093264L, 50000.0);
			assertEquals(isBoolean, true);
		} catch (DateLimitException e) {
			assertThrows(DateLimitException.class, () -> {
				implementation.register("businessman", "5/10/1996", "male", "Mayank123", 
						"mayank123@gmail.com", "Qwerty@123", "Mayank", "Singh", 76093264L, 50000.0);
			});
		} catch (InvalidPhoneException e) {
			assertThrows(InvalidPhoneException.class, () -> {
				implementation.register("businessman", "5/10/1996", "male", "Mayank123",
						"mayank123@gmail.com", "Qwerty@123", "Mayank", "Singh", 76093264L, 50000.0);
			});
		} catch (InvalidDateFormatException e) {
			assertThrows(InvalidPhoneException.class, ()->{
				implementation.register("businessman", "5/10/1996", "male", "Mayank123", "mayank123@gmail.com", "Qwerty@123", "Mayank", "Singh", 76093264L, 50000.0);
			});
		} catch (InvalidPasswordException e) {
			assertThrows(InvalidPasswordException.class, ()->{
				implementation.register("businessman", "5/10/1996", "male", "Mayank123", "mayank123@gmail.com", "Qwerty@123", "Mayank", "Singh", 76093264L, 50000.0);
			});
		} catch (InvalidEmailException e) {
			assertThrows(InvalidEmailException.class, ()->{
				implementation.register("businessman", "5/10/1996", "male", "Mayank123",  "mayank123@gmail.com", "Qwerty@123", "Mayank", "Singh", 76093264L, 50000.0);
			});
		}
	}
	
	@Test
	void registerTest4() {
		Repository.userTable();
		try {
			Boolean isBoolean = implementation.register("businessman", "5/10/1996", "male", "Mayank123", 
					"mayank123@gmail.com", "Qwerty123", "Mayank", "Singh", 7611093264L, 50000.0);
			assertEquals(isBoolean, true);
		} catch (DateLimitException e) {
			assertThrows(DateLimitException.class, () -> {
				implementation.register("businessman", "5/10/1996", "male", "Mayank123", 
						"mayank123@gmail.com", "Qwerty123", "Mayank", "Singh", 7611093264L, 50000.0);
			});
		} catch (InvalidPhoneException e) {
			assertThrows(InvalidPhoneException.class, () -> {
				implementation.register("businessman", "5/10/1996", "male", "Mayank123", 
						"mayank123@gmail.com", "Qwerty123", "Mayank", "Singh", 7611093264L, 50000.0);
			});
		} catch (InvalidDateFormatException e) {
			assertThrows(InvalidPhoneException.class, ()->{
				implementation.register("businessman", "5/10/1996", "male", "Mayank123",  "mayank123@gmail.com", "Qwerty123", "Mayank", "Singh", 7611093264L, 50000.0);
			});
		} catch (InvalidPasswordException e) {
			assertThrows(InvalidPasswordException.class, ()->{
				implementation.register("businessman", "5/10/1996", "male", "Mayank123",  "mayank123@gmail.com", "Qwerty123", "Mayank", "Singh", 7611093264L, 50000.0);
			});
		} catch (InvalidEmailException e) {
			assertThrows(InvalidEmailException.class, ()->{
				implementation.register("businessman", "5/10/1996", "male", "Mayank123",  "mayank123@gmail.com", "Qwerty123", "Mayank", "Singh", 7611093264L, 50000.0);
			});
		}
	}
	
	

}
