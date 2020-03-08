package com.tyss.cg.collections;

import java.util.LinkedList;

import com.tyss.cg.encapsulation.User;

public class UserLinkedList {
	public static void main(String[] args) {
		LinkedList<User> userLinkedList = new LinkedList<User>();
		
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
		
		
		//User Insertion
		userLinkedList.add(user1);
		userLinkedList.add(user2);
		
		userLinkedList.addFirst(user3);
		userLinkedList.addLast(user4);
		
		//Retrieval of User
		for(User user : userLinkedList) {
			System.out.println(user);
		}
		
		System.out.println("++++++++++++++++++++++++++++++");
		
		//Retrieval of data using peek
		System.out.println("Retrieval of data using peek: "+ userLinkedList.peek());
		System.out.println("Retrieval of data using peek: "+ userLinkedList.peekLast());
		System.out.println("++++++++++++++++++++++++++++++");
		
		//Retrieval and removal of user
		System.out.println("Retrieval and removal of user: " + userLinkedList.poll());
		System.out.println(userLinkedList);
		System.out.println("++++++++++++++++++++++++++++++");
		
		//Retrieval of users after poll()
		for(User user: userLinkedList) {
			System.out.println(user);
		}
		System.out.println("++++++++++++++++++++++++++++++");
	}
}
