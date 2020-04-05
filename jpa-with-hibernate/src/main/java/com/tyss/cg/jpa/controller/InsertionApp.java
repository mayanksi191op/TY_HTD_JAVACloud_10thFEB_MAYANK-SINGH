package com.tyss.cg.jpa.controller;

import java.time.LocalDate;
import java.time.Month;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.cg.jpa.beans.EmployeeInfoBean;

import lombok.extern.java.Log;

@Log
public class InsertionApp {
	public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");
	
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();		//toolfor transaction.
	entityTransaction.begin();
	
	
	EmployeeInfoBean employeeInfoBean = new EmployeeInfoBean();
	employeeInfoBean.setEmpid(12345);
	employeeInfoBean.setName("Mayank");
	employeeInfoBean.setMailId("mayanksi191@gmail.com");
	employeeInfoBean.setPassword("qwerty");
	employeeInfoBean.setBirthDate(LocalDate.of(1996, Month.OCTOBER, 05));
	employeeInfoBean.setJoining(LocalDate.of(2017, Month.JANUARY, 16));
	employeeInfoBean.setMobileNo(7681093266l);
	
	entityManager.persist(employeeInfoBean);
	entityTransaction.commit();
	
	log.info("Employee data inserted");
	
	entityManagerFactory.close();
	entityManager.close();
	
	}
}
