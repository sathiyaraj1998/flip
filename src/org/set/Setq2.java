package org.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class Setq2 {
public static void main(String[] args) {
	Set<Integer> a=new LinkedHashSet<>();
	a.add(10);
	a.add(20);
	a.add(30);
	a.add(90);
	a.add(10);
	a.add(10);
	a.add(40);
	a.add(50);
	a.addAll(a);
	System.out.println("set"+a);
	
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
	b.add(505);
	b.add(605);
	b.addAll(b);
	System.out.println("set"+b);
	
	
	Set<Integer> c=new LinkedHashSet<>();
	c.add(100);
	c.add(200);
	c.add(300);
	c.add(400);
	c.add(500);
	c.add(600);
	c.add(700);
	c.add(100);
	c.add(300);
	c.add(500);
	c.addAll(c);
	System.out.println("set list="+c);
}
}
