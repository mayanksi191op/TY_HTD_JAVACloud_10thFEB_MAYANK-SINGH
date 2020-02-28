package com.cg.javafillstack.collection.list;
import java.util.ArrayList;
import java.util.Collections;

public class TestD {
	public static void main(String[] args) {
		
	
	ArrayList<Double> al=new ArrayList<Double>();
	al.add(5.6);
	al.add(9.4);
	al.add(2.9);
	al.add(6.3);
	al.add(3.2);
	Collections.sort(al);   					//Sorting method from collection interface
	
	for(int i=0; i<al.size(); i++)
	{
		Double d=al.get(i);
		System.out.println(d);
	}
	
	
	}

}
