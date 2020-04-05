package com.tyss.cg.jpa.mapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.cg.jpa.beans.AddressBean;
import com.tyss.cg.jpa.beans.EmployeeInfoBean;
import com.tyss.cg.jpa.beans.PassportBean;
import com.tyss.cg.jpa.beans.ProjectBean;

public class BidirectionalMappingController {
	
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
	
		PassportBean passportBean = new PassportBean();
		passportBean.setPassportId("RS12345678VT");
		passportBean.setCountry("india");

		AddressBean addressBean = new AddressBean();
		addressBean.setAddressId(4);
		addressBean.setAddressLine1("Nanjappa Block");
		addressBean.setAddressLine2("Hulimavu");
		addressBean.setAddressType("Training Center");
		addressBean.setCity("Bengaluru");
		addressBean.setState("karnataka");
		addressBean.setCountry("india");
		addressBean.setZipCode(123456);
		
		ProjectBean projectBean = new ProjectBean();
		projectBean.setProjectId(9);
		projectBean.setProjectName("LI-FI");
		projectBean.setDuration("4-months");
		projectBean.setProjectType("External");
		
		EmployeeInfoBean employeeInfoBean = new EmployeeInfoBean();
		employeeInfoBean.setEmpid(2020005);
		employeeInfoBean.setName("Vikas");
		employeeInfoBean.setMailId("vikas,v@gmail.com");
		employeeInfoBean.setPassword("qwerty@123");
		employeeInfoBean.setBirthDate(LocalDate.of(1996, Month.OCTOBER, 05));
		employeeInfoBean.setJoining(LocalDate.of(2017, Month.JANUARY, 16));
		employeeInfoBean.setMobileNo(7689993260L);
		
		
		List<AddressBean> addressBeansList = new ArrayList<AddressBean>();
		addressBeansList.add(addressBean);
		
		List<ProjectBean> projectBeansList = new ArrayList<ProjectBean>();
		projectBeansList.add(projectBean);
		
		List<EmployeeInfoBean> employeeInfoBeanList = new ArrayList<EmployeeInfoBean>();
		employeeInfoBeanList.add(employeeInfoBean);
		
		passportBean.setEmployeeInfoBean(employeeInfoBean);
		addressBean.setEmployeeInfoBean(employeeInfoBean);
		projectBean.setEmployeeInfoBeanList(employeeInfoBeanList);
		
		employeeInfoBean.setAddressBeans(addressBeansList);
		employeeInfoBean.setPassportBean(passportBean);
		employeeInfoBean.setProjectBeans(projectBeansList);
		
		entityTransaction.begin();
		
		entityManager.persist(employeeInfoBean);
		
		entityTransaction.commit();
		
		entityManager.close();
		entityManagerFactory.close();
		
	}

}
