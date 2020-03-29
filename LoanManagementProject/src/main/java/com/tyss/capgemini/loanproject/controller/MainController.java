package com.tyss.capgemini.loanproject.controller;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class MainController {
	public static void main(String[] args) {
		Logger logger = LogManager.getLogger(MainController.class);
		logger.info("******** W E L C O M E ********");
		logger.info("********      TO       ********");
		logger.info("********   BBI LOANS   ********");
		Login.loginController();
	}
}
