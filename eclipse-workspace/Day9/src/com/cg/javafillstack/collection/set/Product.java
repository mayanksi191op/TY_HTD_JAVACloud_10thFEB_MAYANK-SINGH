package com.cg.javafillstack.collection.set;
import java.util.*;

public abstract class Product implements Comparable<Product> {
	int id;
	String name;
	double price;
	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		
		public int compareTo(Product p)
		{
			if(this.id>p.id)
			{
				return 1;
			}
			else if(this.id<p.id)
			{
				return -1;
			}
			else 
			{ 
				return 0;
			}
		}
	}
	

}
