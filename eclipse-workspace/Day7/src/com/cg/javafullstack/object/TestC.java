package com.cg.javafullstack.object;

public class TestC {
	public static void main(String[] args) {
		
	
	Marker m=new Marker();
	m.cost=10;
	m.name="Camlin";
	
	Marker a=new Marker();
	a.cost=10;
	a.name="Camlin";
	
	System.out.println(a.equals(m));
			
	}
}
