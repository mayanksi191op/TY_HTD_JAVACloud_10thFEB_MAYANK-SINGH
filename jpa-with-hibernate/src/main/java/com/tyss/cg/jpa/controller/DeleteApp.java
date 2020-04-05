package com.tyss.cg.jpa.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.cg.jpa.beans.EmployeeInfoBean;

import lombok.extern.java.Log;

@Log
public class DeleteApp {
	public static void main(String[] args) {
EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();		//toolfor transaction.
		entityTransaction.begin();
		
		EmployeeInfoBean  employeeInfoBean = entityManager.find(EmployeeInfoBean.class, 12345);
		
		log.info(employeeInfoBean.toString());
		entityManager.remove(employeeInfoBean);
		entityTransaction.commit();
		
		log.info("Employee data deleted");
		
		entityManager.close();
		entityManagerFactory.close();
	}

}
