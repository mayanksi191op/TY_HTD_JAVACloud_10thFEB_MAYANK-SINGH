package com.tyss.cg.jpa.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

//import org.apache.log4j.LogManager;
//import org.apache.log4j.Logger;

import com.tyss.cg.jpa.beans.EmployeeInfoBean;

import lombok.extern.java.Log;

@Log
public class ReadApp {
	public static void main(String[] args) {
		
		Logger logger = LogManager.getLogger(ReadApp.class);
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();		//toolfor transaction.
		entityTransaction.begin();
		
		EmployeeInfoBean employeeInfoBean = entityManager.find(EmployeeInfoBean.class, 12345);
		//log.info(employeeInfoBean.toString());
		logger.warn(employeeInfoBean.toString());
		
		entityManager.close();
		entityManagerFactory.close();
	}
}
