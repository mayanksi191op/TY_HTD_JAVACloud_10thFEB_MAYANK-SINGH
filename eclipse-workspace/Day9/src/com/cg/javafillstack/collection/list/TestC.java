package com.cg.javafillstack.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;



public class TestC {
	public static void main(String[] args) {

		ArrayList<Double> al=new ArrayList<Double>();
		al.add(2.4);
		al.add(3.5);
		al.add(7.9);
		al.add(9.0);

		/* for(int i=0; i<al.size(); i++)			//using for loop
		{
			Double d=al.get(i);
			System.out.println(d);
		} */



		/* for(double d: al)							//using for each loop
		{
			System.out.println(d);
		} */



		/* Iterator<Double> it=al.iterator();			//using Iterator
		while(it.hasNext())
		{
			Double d=it.next();
			System.out.println(d);
		}  */



		ListIterator<Double> lit = al.listIterator();		//Using ListIterator

		System.out.println("..........FWD");
		while(lit.hasNext())
		{
			Double d=lit.next();
			System.out.println(d);
		}

		System.out.println("........BACK");
		while(lit.hasPrevious())
		{
			double d=lit.previous();
			System.out.println(d);
		}



	}
}
