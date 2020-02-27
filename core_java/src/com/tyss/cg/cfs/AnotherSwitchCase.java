package com.tyss.cg.cfs;

public class AnotherSwitchCase {
	public static void main(String[] args) {

		int dayNum = 2; // we can give only short,byte,int,char and string values to switch
		switch (dayNum) {
		case 1:
			System.out.println("monday");
			break;
		case 2:
			System.out.println("tuesday");
			break;
		case 3:
			System.out.println("wednesday");
			break;
		case 4:
			System.out.println("thursday");
			break;
		case 5:
			System.out.println("friday");
			break;
		case 6:
			System.out.println("saturday");
			break;
		case 7:
			System.out.println("sunday");
			break;

		default:
			System.out.println("Invalid");
			break;
		}
	}

}

//switch will always go for equality while if-else can go for equality as well as it can check the conditions as well.
//if we want to chk for particular values we can use switch or if we have range we go for if else.
