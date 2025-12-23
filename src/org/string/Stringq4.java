package org.string;

public class Stringq4 {
public static void main(String[] args) {
	String a="java";
	String b="program";
	String c="javaprogram";
	System.out.println(System.identityHashCode(a));
	System.out.println(System.identityHashCode(b));
	System.out.println(System.identityHashCode(c));
}
}
