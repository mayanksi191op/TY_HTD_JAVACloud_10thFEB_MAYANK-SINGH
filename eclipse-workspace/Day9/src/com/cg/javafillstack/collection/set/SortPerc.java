package com.cg.javafillstack.collection.set;

import java.util.Comparator;

public class SortPerc implements Comparator<Student> {
	
	
	
	public int compare(Student s1, Student s2)
	{
		if(s1.perc>s2.perc) {
			return 1;
		}
		else if(s1.perc>s2.perc)
		{
			return -1;
		}
		else 
			{
			return 0;
			}
	}
	
	
	

}
