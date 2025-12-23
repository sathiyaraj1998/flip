package org.collection;

import java.util.ArrayList;
import java.util.List;

public class Collectionq6 {
	public static void main(String[] args) {
	    List<Integer> a=new ArrayList<>();
	    a.add(100);
		a.add(200);
		a.add(300);
		a.add(400);
		a.add(500);
		a.add(600);
		a.add(700);
		a.add(800);
	    a.set(2, 350);
	   
		System.out.println("replacing element="+a);

		List<Integer> c=new ArrayList<>();
		c.add(10);
		c.add(20);
		c.add(30);
		c.add(90);
		c.add(10);
		c.add(10);
		c.add(40);
		c.add(50);
		c.add(10);
		c.set(7, 90);
		System.out.println("7th replace value="+c);
	
		List<Integer> b=new ArrayList<>();
		b.add(10);
		b.add(20);
		b.add(30);
		b.add(90);
		b.add(10);
		b.add(10);
		b.add(40);
		b.add(50);
		b.add(30);
		b.set(0, 100);
		b.set(4,100);
		b.set(5, 100);
		System.out.println("10 is replace to="+b);
	}
	

}
