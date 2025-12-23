package org.exception;

public class Exceptionq3 {
public static void main(String[] args) {
	try {
		System.out.println("5");			//1st print 
		int data=5/0;                       //check condtion
	}
	catch (ArithmeticException e) {         //exception check true
		System.out.println("2");            //print 2nd
		System.exit(123);                   //terminate the program
	}
finally {
	System.out.println("3");                //print 3rd
}
	System.out.println("4");                //print 5th
}
}

