package org.constructor;

public class Constructorq1 {
	
		public Constructorq1() {
			this("Vino");                //print
			System.out.println("Default constructor");  //4th print
		}
		public Constructorq1(int id) {   //2nd check
			this(4000.3434f);            //print value
			System.out.println(id);
		}
		public Constructorq1(String name) {
			this(10);                    //print
			System.out.println(name);
		}
		public Constructorq1(float sal) {
			System.out.println("float="+sal); //1st
		} 
		public static void main(String[] args) {
			Constructorq1 c=new Constructorq1();
			
		}
}
