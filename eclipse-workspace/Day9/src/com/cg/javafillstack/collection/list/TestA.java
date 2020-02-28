package com.cg.javafillstack.collection.list;

import java.util.ArrayList;

public class TestA {
	public static void main(String[] args) {
		
		
		ArrayList al=new ArrayList();
		al.add(5);
		al.add('p');
		al.add("Mayank");
		al.add(2.5);
		
		/* for(int i=0; i<al.size(); i++)
		{
			Object r=al.get(i);
					System.out.println(r);
		} */
		
		for(Object r : al)
		{
			System.out.println(r);
		}
		
	}

}
