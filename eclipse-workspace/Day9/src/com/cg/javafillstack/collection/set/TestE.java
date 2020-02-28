package com.cg.javafillstack.collection.set;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class TestE {
	public static void main(String[] args) {
		
	
	
	TreeSet<Product> ts=new TreeSet<Product>();
	Product p1=new Product(5, "Soap", 50 );
	Product p2=new Product(1, "Towel", 60);
	Product p3=new Product(2, "Shirt", 600);
	Product p4=new Product(3, "Bottle", 30);
	Collections.sort(ts);
	
	Iterator<Product> it=ts.iterator();
	while(it.hasNext())
	{
		Product p=it.next();
		System.out.println(p.id);
		System.out.println(p.name);
		System.out.println(p.price);
	}
	
}
	}
	

