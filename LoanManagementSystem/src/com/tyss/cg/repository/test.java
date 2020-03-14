package com.tyss.cg.repository;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class test {
	
	
	static void test() {
		Users.UserTable();
		BeanClass bean1 = new BeanClass();
		Scanner scanner = new Scanner(System.in);
		HashMap< String, Object> hsHashMap= new LinkedHashMap<String, Object>();
		System.out.println("enter userid");
		String userid = scanner.nextLine();
		bean1.setUserid(userid);
		hsHashMap.put("userid",userid );
		Users.adminList.add(hsHashMap);
		
		for (int i = 0; i < Users.adminList.size(); i++) {
			System.out.println(Users.adminList.get(i));
		}
		
	}
	public static void main(String[] args) {
		test();
	}

}
