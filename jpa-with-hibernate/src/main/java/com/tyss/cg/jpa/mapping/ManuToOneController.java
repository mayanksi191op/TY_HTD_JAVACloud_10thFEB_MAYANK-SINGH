package com.tyss.cg.jpa.mapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.cg.jpa.beans.AddressBean;
import com.tyss.cg.jpa.beans.EmployeeInfoBean;

import lombok.extern.java.Log;

@Log
public class ManuToOneController {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		EmployeeInfoBean employeeInfoBean = entityManager.find(EmployeeInfoBean.class, 2020001);
		
		AddressBean addressBean1 = new AddressBean();
		addressBean1.setAddressId(1);
		addressBean1.setAddressType("Home");
		addressBean1.setAddressLine1("Hanumanth Nagar");
		addressBean1.setAddressLine2("Basavangudi");
		addressBean1.setCity("Bengalure");
		addressBean1.setState("Karnataka");
		addressBean1.setCountry("india");
		addressBean1.setZipCode(213456);
		addressBean1.setEmployeeInfoBean(employeeInfoBean);
		
		AddressBean addressBean2 = new AddressBean();
		addressBean2.setAddressId(2);
		addressBean2.setAddressType("Office");
		addressBean2.setAddressLine1("Phase-2");
		addressBean2.setAddressLine2("Basavangudi");
		addressBean2.setCity("Bengalure");
		addressBean2.setCountry("india");
		addressBean2.setState("Karnataka");
		addressBean2.setZipCode(213478);
		addressBean2.setEmployeeInfoBean(employeeInfoBean);
		
		entityTransaction.begin();
		entityManager.persist(addressBean1);
		entityManager.persist(addressBean2);
		entityTransaction.commit();
		
		log.info("address entered for the employees");
		entityManager.close();
		entityManagerFactory.close();
	}

}
