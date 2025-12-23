package org.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Setq4 {
	public static void main(String[] args) {
		Set<Integer> b=new HashSet<>();
		b.add(10);
		b.add(20);
		b.add(30);
		b.add(90);
		b.add(10);
		b.add(10);
		b.add(40);
		b.add(50);
		
		Set<Integer> c=new HashSet<>();
		c.add(30);
		c.add(40);
		c.add(50);
		c.add(60);
		c.add(80);
		b.retainAll(c);
		System.out.println("common values="+b);
		
		
		Set<Integer> b1=new LinkedHashSet<>();
		b1.add(10);
		b1.add(20);
		b1.add(30);
		b1.add(90);
		b1.add(10);
		b1.add(10);
		b1.add(40);
		b1.add(50);
		
		Set<Integer> c1=new LinkedHashSet<>();
		c1.add(10);
		c1.add(20);
		c1.add(60);
		c1.add(50);
		c1.add(40);
		c1.add(70);
		c1.add(80);
		c1.add(90);
		b1.retainAll(c1);
		System.out.println("common values="+b1);
		
		Set<Integer> d=new TreeSet<>();
		d.add(10);
		d.add(20);
		d.add(30);
		d.add(40);
		d.add(50);
		d.add(60);
		d.add(70);
		d.add(80);
		d.add(200);
		d.add(800);

		
		Set<Integer> c3=new TreeSet<>();
		c3.add(100);
		c3.add(200);
		c3.add(300);
		c3.add(400);
		c3.add(500);
		c3.add(600);
		c3.add(700);
		c3.add(800);
		c3.add(40);
		c3.add(90);
		c3.add(30);
		d.retainAll(c3);
		System.out.println("common="+d);

		
	}

}
