package com.tyss.cg.loops;

public class ForLoopEx {
	public static void main(String[] args) {
		// int i=0;
		int k=0;
		int l=0;

		System.out.println("+++++++++++LOOP 1+++++++");
		for (int j = 0; j < 10; j++) {
			System.out.println(j + 1);
		}
		
//		for ( ; ; ) {
//			System.out.println(1);
//		}
		
		System.out.println("+++++++++LOOP 2++++++++");
		for( ; k<10; k++)
		{
			System.out.println((k+1) *12);
		}
		
		
		System.out.println("+++++++++LOOP 3+++++++++");
		for( ; l<10; )
		{
			System.out.println((l+1)*12);
			l++;
		}
	}

}
