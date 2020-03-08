package com.tyss.cg.loanproject.controller;

import java.util.Scanner;

import com.tyss.cg.loanproject.beans.LoginBean;

public class LoginController {
	public static void main(String[] args) {
		LoginBean loginBean = new LoginBean();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the email");
		String email = scanner.nextLine();
		loginBean.setEmail(email);
		
		
		
	}
	
}
