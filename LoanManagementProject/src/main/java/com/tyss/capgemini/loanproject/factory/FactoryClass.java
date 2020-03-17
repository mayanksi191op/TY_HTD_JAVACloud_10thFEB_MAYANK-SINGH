package com.tyss.capgemini.loanproject.factory;

import com.tyss.capgemini.loanproject.dao.DAODeclaration;
import com.tyss.capgemini.loanproject.dao.DAOImplementation;
import com.tyss.capgemini.loanproject.services.ServicesDeclaration;
import com.tyss.capgemini.loanproject.services.ServicesImplementation;

public class FactoryClass {
	public static ServicesDeclaration getServices() {
		return new ServicesImplementation();
	}
	
	public static DAODeclaration getDAO() {
		return new DAOImplementation();
	}
}
