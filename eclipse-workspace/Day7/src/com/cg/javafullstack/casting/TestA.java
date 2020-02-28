package com.cg.javafullstack.casting;

public class TestA {
	public static void main(String[] args) {


		Animal a=new Cow();    //Up-Casting
		a.eat();
		Cow c=(Cow) a;		   //Down-Casting
		c.drink();
		c.eat();

	}


}
