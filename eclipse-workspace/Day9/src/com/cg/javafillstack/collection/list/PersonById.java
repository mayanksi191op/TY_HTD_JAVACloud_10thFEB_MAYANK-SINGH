package com.cg.javafillstack.collection.list;

import java.util.Comparator;

public class PersonById implements Comparator<Person>{
	
	public int compare(Person p1, Person p2)
	{
		if(p1.id > p2.id)
		{
			return 1;
		}
		else if(p1.id < p2.id)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}

}
