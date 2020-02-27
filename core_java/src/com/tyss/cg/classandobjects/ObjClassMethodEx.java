package com.tyss.cg.classandobjects;

import com.tyss.cg.methods.BasicArithematicOperation;

public class ObjClassMethodEx {
	public static void main(String[] args) {
		ObjClassMethodEx oEx = new ObjClassMethodEx();
		ObjClassMethodEx oEx1 = new ObjClassMethodEx();
		ObjClassMethodEx oEx2 = new ObjClassMethodEx();

		System.out.println(oEx.getClass()); // gives the fully qualified name of class. method is from Object class

		System.out.println(oEx);
		System.out.println("without using .toString() " + oEx1);
		System.out.println(oEx2);
		// int hashCode=oEx.hashCode();
		System.out.println(oEx.hashCode()); // gives the hashcode. returntype=int
		System.out.println("with .toString()" + oEx1.toString()); // converts .toString().
		System.out.println(oEx2.toString());
		System.out.println(oEx1.hashCode());
		System.out.println(oEx2.hashCode());
		System.out.println(oEx1.equals(oEx2)); // to do the comparision we use .equals(). returntype=boolean

		BasicArithematicOperation.add(9, 4);

	}

}
