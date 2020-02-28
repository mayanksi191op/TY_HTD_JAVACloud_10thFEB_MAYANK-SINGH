package com.cg.javafillstack.collection.set;
import java.util.*;

public abstract class ProductClass implements Comparable<ProductClass> {
	
	int id;
	String name;
	Double price;
	public ProductClass(int id, String name, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	
	

}
