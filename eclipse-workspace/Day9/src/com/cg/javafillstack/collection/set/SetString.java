package com.cg.javafillstack.collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class SetString {

	public static void main(String[] args) {
		HashSet<String> hs= new HashSet<String>();

		hs.add("manu");
		hs.add("Kavya");
		hs.add("Puneet");
		hs.add("Himani");

		Iterator<String> it=hs.iterator();
		while(it.hasNext())
		{
			String s=it.next();
			System.out.println(s);
		}
	}

}
