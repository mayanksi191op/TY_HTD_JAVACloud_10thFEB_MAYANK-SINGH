package com.tyss.cg.jpa.mapping;

import java.time.LocalDate;
import java.time.Month;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.cg.jpa.beans.EmployeeInfoBean;
import com.tyss.cg.jpa.beans.PassportBean;

import lombok.extern.java.Log;

@Log
public class OneToOneController {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
//		EmployeeInfoBean employeeInfoBean = new EmployeeInfoBean();
//		employeeInfoBean.setEmpid(2020002);
//		employeeInfoBean.setName("Manoj");
//		employeeInfoBean.setMailId("manoj.r@gmail.com");
//		employeeInfoBean.setPassword("qwerty");
//		employeeInfoBean.setBirthDate(LocalDate.of(1994, Month.FEBRUARY, 7));
//		employeeInfoBean.setJoining(LocalDate.of(2019, Month.JANUARY, 17));
//		employeeInfoBean.setMobileNo(7861827256L);
//		employeeInfoBean.setSalary(23456.7);
		
		EmployeeInfoBean employeeInfoBean = entityManager.find(EmployeeInfoBean.class,  12345);

		PassportBean passportBean = new PassportBean();
		passportBean.setPassportId("IN7867333134STZ");
		passportBean.setCountry("India");
		passportBean.setEmployeeInfoBean(employeeInfoBean);

		entityTransaction.begin();

		//entityManager.persist(employeeInfoBean);
		entityManager.persist(passportBean);

		log.info("Data entered into both tables...");

		entityTransaction.commit();

		entityManager.close();
		entityManagerFactory.close();
	}
}
