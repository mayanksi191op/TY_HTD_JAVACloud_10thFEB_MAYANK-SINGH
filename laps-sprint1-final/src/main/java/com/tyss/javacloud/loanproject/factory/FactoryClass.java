package com.tyss.javacloud.loanproject.factory;

import com.tyss.javacloud.loanproject.dao.AdminDaoDeclaration;
import com.tyss.javacloud.loanproject.dao.AdminDaoImplementation;
import com.tyss.javacloud.loanproject.dao.CustomerDaoDeclaration;
import com.tyss.javacloud.loanproject.dao.CustomerDaoImplementation;
import com.tyss.javacloud.loanproject.dao.LadDaoDeclaration;
import com.tyss.javacloud.loanproject.dao.LadDaoImplementation;
import com.tyss.javacloud.loanproject.dao.LoginDaoDeclaration;
import com.tyss.javacloud.loanproject.dao.LoginDaoImplementation;
import com.tyss.javacloud.loanproject.services.AdminServicesDeclaration;
import com.tyss.javacloud.loanproject.services.AdminServicesImplementation;
import com.tyss.javacloud.loanproject.services.CustomerServicesDeclaration;
import com.tyss.javacloud.loanproject.services.CustomerServicesImplementation;
import com.tyss.javacloud.loanproject.services.LadServicesDeclaration;
import com.tyss.javacloud.loanproject.services.LadServicesImplementation;
import com.tyss.javacloud.loanproject.services.LoginServicesDeclaration;
import com.tyss.javacloud.loanproject.services.LoginServicesImplementation;

public class FactoryClass {
	
	public static CustomerServicesDeclaration getCustomerServices() {
		return new CustomerServicesImplementation();
	}
	
	public static CustomerDaoDeclaration getCustomerDao() {
		return new CustomerDaoImplementation();
	}
	
	public static AdminServicesDeclaration getAdminServices() {
		return new AdminServicesImplementation();
	}
	
	public static AdminDaoDeclaration getAdminDao() {
		return new AdminDaoImplementation();
	}
	
	public static LoginServicesDeclaration getLoginServices() {
		return new LoginServicesImplementation();
	}
	
	public static LoginDaoDeclaration getLoginDao() {
		return new LoginDaoImplementation();
	}
	
	public static LadServicesDeclaration getLadServices() {
		return new LadServicesImplementation();
	}
	
	public static LadDaoDeclaration getLadDao() {
		return new LadDaoImplementation();
	}
}
