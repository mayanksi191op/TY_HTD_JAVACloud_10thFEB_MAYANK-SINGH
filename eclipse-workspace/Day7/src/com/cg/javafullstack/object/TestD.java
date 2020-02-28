package com.cg.javafullstack.object;

//import java.rmi.server.RemoteObjectInvocationHandler;

public class TestD {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Remote r= new Remote();
		r.cost=100;
		r.name="LG";
		
		Remote t=(Remote)r.clone();
		
		System.out.println("Cost "+t.cost);
		System.out.println("Name "+t.name);
		
		
	}
}
