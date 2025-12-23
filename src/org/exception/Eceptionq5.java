package org.exception;

import java.io.EOFException;
import java.io.IOException;

public class Eceptionq5 {
	public static void main(String[] args) {
		try {
			System.out.println("1");      
			int value=2/0;               
			}
		
		catch (NullPointerException e) {
			System.out.println("null pointer");
		}
		catch (ArithmeticException e) {     
			System.out.println("arithmetic");         
		}
		
		catch (Exception e) {
		    System.out.println("exception");
			}
		
	}

}
