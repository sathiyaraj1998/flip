package org.exception;

public class Exceptionq2 {

      private void x1() {
    	  x2();
    	  System.out.println("1");      //print 5th
      }		
      private void x2() {
    	  x3();
    	  System.out.println("2");         //print 7th
      }
      private void x3() {
      System.out.println("3");         //1st print
      try {  							
		int sum=4/0;                   //2nd check condtion 
		System.out.println("4");        
	} catch (ArithmeticException e) {  //condtion true
		System.out.println("5");       //print 3rd
	}
      System.out.println("7");         //print 4th
	}
      public static void main(String[] args) {
		Exceptionq2 ee=new Exceptionq2();
		ee.x1();
	}
}