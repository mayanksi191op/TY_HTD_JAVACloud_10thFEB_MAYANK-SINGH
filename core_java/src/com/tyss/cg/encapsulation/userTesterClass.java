package com.tyss.cg.encapsulation;

public class userTesterClass {
	
	private static User setUser(String username, String password, int userid) {
		return new User(username, password, userid);
	}
	
	/*2nd way
	 * public static User setUser(User user) { return new User(user.getPassword(),
	 * user.getUsername(), user.getUserId()); }
	 */
	
	public static void main(String[] args) {
		User user1=new User("Mike", "qwerty", 201);
		User user2=new User();
		
		user2.setPassword("Toby");
		user2.setUserId(123);
		user2.setUsername("Maki");
		
		System.out.println("UserName: "+user1.getUsername());
		System.out.println("userId: "+user1.getUserId());
		
		System.out.println(user2);
	}
}
