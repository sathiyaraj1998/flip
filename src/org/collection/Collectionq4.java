package org.collection;

import java.util.ArrayList;
import java.util.List;

public class Collectionq4 {
	public static void main(String[] args) {
		List<Integer> a=new ArrayList<>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		a.add(60);
	    a.remove(1);
		System.out.println("remove element="+a);
	
		
		List<Integer> b=new ArrayList<>();
		b.add(10);
		b.add(20);
		b.add(30);
		b.add(40);
		b.add(50);
		b.add(60);
		b.add(10);
	    b.remove(0);
	    b.remove(5);
		System.out.println("remove element="+b);
		
		List<Integer> c=new ArrayList<>();
		c.add(10);
		c.add(20);
		c.add(30);
		c.add(90);
		c.add(10);
		c.add(10);
		c.add(40);
	    c.remove(6);
		System.out.println("remove element="+c);
	
	}
}
