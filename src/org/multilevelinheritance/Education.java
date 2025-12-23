package org.multilevelinheritance;

public class Education extends Arts{
	public void ug() {
		System.out.println("ug= sathya under gradute");
	}
	public void pg() {
		System.out.println("pg= raj post gradute");
	}
	public static void main(String[] args) {
		Education e=new Education();
		e.ug();
		e.pg();
		e.bsc();
		e.bEd();
		e.bA();
		e.bBa();
		e.bE();
		e.bTech();
		e.physiyo();
		e.dental();
		e.mbbs();
		
	}

}
