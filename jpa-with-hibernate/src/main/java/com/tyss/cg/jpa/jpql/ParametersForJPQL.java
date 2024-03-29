package com.tyss.cg.jpa.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.tyss.cg.jpa.beans.EmployeeInfoBean;

import lombok.extern.java.Log;

@Log
public class ParametersForJPQL {		//dynamic way to do query  instead of ? we use : here
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		//		Query query = entityManager.createQuery("from EmployeeInfoBean eib order by eib eib.empid desc");
		//		List<EmployeeInfoBean> employeeInfoBeans = query.getResultList();	}

		TypedQuery<EmployeeInfoBean> query = entityManager.createQuery("from EmployeeInfoBean eib"+ " where eib.empid = :empid", EmployeeInfoBean.class);
		
		query.setParameter("empid", 2020001);
		
		List<EmployeeInfoBean> employeeInfoBeans = query.getResultList();

		for (EmployeeInfoBean employeeInfoBean : employeeInfoBeans) {
			log.info(employeeInfoBean.toString());
		}

		entityManager.close();
		entityManagerFactory.close();
	}

}
