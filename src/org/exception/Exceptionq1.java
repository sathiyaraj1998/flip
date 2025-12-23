package org.exception;

public class Exceptionq1 {
public static void main(String[] args) {
	try {
		System.out.println("1");  //1stprint 1
		int sum=9/0;
		System.out.println("2");
	} catch (ArithmeticException e) {//check right solution
		System.out.println("3");//2nd print 3
	}
	catch (Exception e) {
		System.out.println("4");
	}
	finally {
		System.out.println("5"); //print 3rd 5
	}
}
}
