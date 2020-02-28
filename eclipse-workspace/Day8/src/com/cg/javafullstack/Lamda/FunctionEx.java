package com.cg.javafullstack.Lamda;
import java.util.function.Function;

public class FunctionEx {
	public static void main(String[] args) {
		
		Function<Integer, Double> f = (r) -> 3.142*r*r;
		double res=f.apply(5);
		System.out.println("result is "+res);
	}

}
