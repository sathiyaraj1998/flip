package org.collection;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import java.util.List;

public class Collectionq1 {
	public static void main(String[] args) {
		List<Integer> a=new ArrayList<>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(90);
		a.add(10);
		a.add(10);
		a.add(40);
		a.add(50);
		System.out.println("Arraylist size="+a.size());
		
		
		
		List<Integer> b=new LinkedList<>();
		b.add(100);
		b.add(200);
		b.add(300);
		b.add(400);
		b.add(500);
		b.add(600);
		b.add(700);
		System.out.println("Linked list size="+b.size());
		
		List<Integer> c=new Vector<>();
		c.add(105);
		c.add(205);
		c.add(305);
		c.add(405);
		c.add(505);
		c.add(605);
		c.add(670);
		c.add(705);
		c.add(805);
		System.out.println("vector size="+c.size());
	
		List<Integer> d=new LinkedList<>();
		d.add(100);
		d.add(200);
		d.add(300);
		d.add(400);
		d.add(500);
		d.add(600);
		d.add(700);
		System.out.println("Linked list size="+d.size());
		
	
	System.out.println("-------------------\n\n");
	
	
	}
	

}
