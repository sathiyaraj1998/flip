package org.exception;

public class Exceptionq4 {
	public static void main(String[] args) {
		try {
			System.out.println("1");   //1st print
			int a=5/0;              //check condition
		}
		catch (ArithmeticException e) {
			//solution right
			System.out.println("e");//print 
			
		}
       try {
    	   Throwable obj=new Throwable("Welcome");    //conditon
			
			throw obj;
		} 
		catch (Throwable obj) {     //check condition
			System.out.println("8"); //print
		}
	finally {
		System.out.println("3");    //print
	}
		System.out.println("4");    //print
}
}
