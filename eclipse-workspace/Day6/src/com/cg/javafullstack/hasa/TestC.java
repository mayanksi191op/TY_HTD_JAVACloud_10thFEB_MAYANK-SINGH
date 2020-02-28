package com.cg.javafullstack.hasa;

public class TestC {

	public static void main(String[] args) {
		Singer.p.cost=100;
		Singer.p.draw();
		Singer s=new Singer();
		s.sing();
		s.age=18;
		System.out.println("cost of pen is "+Singer.p.cost);
		System.out.println("age of singer is "+s.age);
	}
}
