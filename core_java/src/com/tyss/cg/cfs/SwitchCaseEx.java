package com.tyss.cg.cfs;

public class SwitchCaseEx {
	public static void main(String[] args) {
		String day="Friday";
		
		switch (day) {
		case "Monday":
			System.out.println("weekday");
			break;			//using break depends on requirement
		case "Tuesday":
			System.out.println("weekday");
			break;
		case "Wednesday":
			System.out.println("weekday");
			break;
		case "Thursday":
			System.out.println("weekday");
			break;
		case "Friday":
			System.out.println("weekday");
			break;
		case "Saturday":
			System.out.println("weekend");
			break;
		case "Sunday":
			System.out.println("weekend");
			break;
		default:
			System.out.println("Invalid day");
			break;					//if default is used at last using break or not doesnt effect
		}
	}
}
