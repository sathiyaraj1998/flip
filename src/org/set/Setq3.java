package org.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Setq3 {
	public static void main(String[] args) {
		Set<Integer> b=new LinkedHashSet<>();
		b.add(105);
		b.add(205);
		b.add(305);
		b.add(405);
		b.add(505);
		b.add(605);
		b.add(605);
		b.add(705);
		b.add(805);
		for (Integer integer : b) {
			System.out.println("enhanced for loop="+integer);
		}
		System.out.println("\n");
			Set<Integer> c=new TreeSet<>();
			c.add(10);
			c.add(20);
			c.add(30);
			c.add(40);
			c.add(50);
			c.add(60);
			c.add(70);
			c.add(80);
			c.add(90);
			c.add(10);
			c.add(20);
			for (Integer integer1 : c) {
				System.out.println("enhanced for loop="+integer1);
			
		}
			System.out.println("\n");
			
			Set<Integer> c1=new HashSet<>();
			c1.add(10);
			c1.add(20);
			c1.add(30);
			c1.add(40);
			c1.add(50);
			c1.add(60);
			c1.add(70);
			c1.add(80);
			c1.add(90);
			c1.add(10);
			c1.add(20);
			for (Integer integer3 : c1) {
				System.out.println("enhanced for loop="+integer3);
			
		}
			System.out.println("\n");
	}
	}

