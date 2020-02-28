package com.cg.javafillstack.collection.list;

public class Product implements Comparable<Product> {
	
	int num;
	String name;
	int price;
	public Product(int num, String name, int price) {
		super();
		this.num = num;
		this.name = name;
		this.price = price;
	}
	
	//To sort with respect to price
	/*
	public int compareTo(Product p)
	{
		if(this.price > p.price)
		{
			return 1;
		}
		else if(this.price < p.price)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}   */
	
	/*
	//To sort with respect with id
	public int compareTo(Product p)
	{
		if(this.num>p.num)
		{
			return 1;
		}
		else if(this.num<p.num)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	} */
	
	public int compareTo(Product p)
	{
		int val = this.name.compareTo(p.name);
		return val;
	}
	

}
