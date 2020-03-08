package com.tyss.cg.collections;

import java.util.HashMap;

import com.tyss.cg.encapsulation.User;
import com.tyss.cg.encapsulation.userTesterClass;

public class UserHashMap {
	public static void main(String[] args) {
		//UserHashMap userHashMap = new UserHashMap();
		HashMap<String, User> userHashMap = new HashMap<String, User>();
		User user1=new User();
		User user2=new User();
		User user3=new User();
		User user4=new User();
		
		user1.setUserId(2020001);
		user1.setUsername("Pandit");
		user1.setPassword("qwerty@123");
		
		user2.setUserId(2020002);
		user2.setUsername("ramesh");
		user2.setPassword("qwerty@123");

		user3.setUserId(2020003);
		user3.setUsername("suresh");
		user3.setPassword("qwerty@123");
		
		user4.setUserId(2020004);
		user4.setUsername("garib");
		user4.setPassword("qwerty@123");
		
		userHashMap.put("1st-User", user1);
		userHashMap.put("2nd-User", user2);
		userHashMap.put("3rd-User", user3);
		userHashMap.put("4th-User", user4);
		
		//Retrieval of users
		System.out.println("userHashMap after data insertion");
		System.out.println(userHashMap);
		System.out.println("+++++++++++++++++++++++++++++++++++");
		
		//Update of user data
		user4.setPassword("qwerty12345");
		userHashMap.put("4th-User", user4);
		
		//Retrieval of users after update
		System.out.println("userHashMap after data upgradation");
		System.out.println(userHashMap);
		System.out.println("+++++++++++++++++++++++++++++++++++");
		
		//Deletion of User
		userHashMap.remove("3rd-User");
		
		//Retrieval of Users after Deletion
		System.out.println("userHashMap after data deletion");
		System.out.println(userHashMap);
		System.out.println("++++++++++++++++++++++++++++++++++++");
		
		
	}
}
