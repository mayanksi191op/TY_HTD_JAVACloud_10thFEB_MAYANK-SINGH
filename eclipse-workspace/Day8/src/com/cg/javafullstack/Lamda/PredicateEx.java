package com.cg.javafullstack.Lamda;
import java.util.function.Predicate;

public class PredicateEx {
	public static void main(String[] args) {
		
		 Predicate <Double> p=(a) -> a>25.5;
		boolean ex=p.test(15.2);
		System.out.println("Exam result is "+ex); 
		
		Predicate <Integer> r=(a) -> a%2==0;
		boolean res= r.test(15);
		System.out.println("Result is "+res);
		
	}

}
