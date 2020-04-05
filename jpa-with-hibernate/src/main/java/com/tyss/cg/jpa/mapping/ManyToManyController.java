package com.tyss.cg.jpa.mapping;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.cg.jpa.beans.EmployeeInfoBean;
import com.tyss.cg.jpa.beans.ProjectBean;

import lombok.extern.java.Log;

@Log
public class ManyToManyController {
	public static void main(String[] args) {
		
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	List<EmployeeInfoBean> employeeInfoBeans = new ArrayList<EmployeeInfoBean>();
	employeeInfoBeans.add(entityManager.find(EmployeeInfoBean.class, 2020001));
	employeeInfoBeans.add(entityManager.find(EmployeeInfoBean.class, 12345));
	employeeInfoBeans.add(entityManager.find(EmployeeInfoBean.class, 2020002));
	
	ProjectBean projectBean1 = new ProjectBean();
	projectBean1.setProjectId(1);
	projectBean1.setProjectName("UDAAN");
	projectBean1.setDuration("3-months");
	projectBean1.setProjectType("External");
	projectBean1.setEmployeeInfoBeanList(employeeInfoBeans);
	
	ProjectBean projectBean2 = new ProjectBean();
	projectBean2.setProjectId(2);
	projectBean2.setProjectName("PAN");
	projectBean2.setDuration("4-months");
	projectBean2.setProjectType("Internal");
	projectBean2.setEmployeeInfoBeanList(employeeInfoBeans);
	
	entityTransaction.begin();
	
	entityManager.persist(projectBean1);
	entityManager.persist(projectBean2);
	
	entityTransaction.commit();
	
	log.info("data entered for projects");
	
	entityManager.close();
	entityManagerFactory.close();
	
	}
}
