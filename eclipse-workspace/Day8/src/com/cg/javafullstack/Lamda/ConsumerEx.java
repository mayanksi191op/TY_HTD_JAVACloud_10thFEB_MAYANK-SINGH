package com.cg.javafullstack.Lamda;
import java.util.function.Consumer;

public class ConsumerEx {
	public static void main(String[] args) {
		
		Student s=new Student();
		s.name = "Divya";
		s.age= 55;
		
		Consumer<Student> c=st -> {
			System.out.println("Name is "+st.name);
			System.out.println("Age is "+st.age);
			
		};
		c.accept(s);
	}

}
