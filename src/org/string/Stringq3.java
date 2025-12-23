package org.string;

public class Stringq3 {
	public static void main(String[] args) {
		String a= new  String("java");
		String b=new   String("program");
		String c=new String("javaprogram");
	    System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		System.out.println(System.identityHashCode(c));
		System.out.println("non literal");
	}

}
