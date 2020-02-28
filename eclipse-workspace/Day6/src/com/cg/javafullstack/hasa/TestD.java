package com.cg.javafullstack.hasa;

public class TestD {
	public static void main(String[] args) {
		
	
	Browser b=new Browser();
	Gmail g1=new Gmail();
	Gdrive d=new Gdrive();
	
	b.open(g1);
	b.open(d);
	}
}
