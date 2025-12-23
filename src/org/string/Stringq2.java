package org.string;

public class Stringq2 {
public static void main(String[] args) {
	String a= new  String("selenium");
	String b=new   String("seleinum");
    System.out.println(System.identityHashCode(a));
	System.out.println(System.identityHashCode(b));
}
}
