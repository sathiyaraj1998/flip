package org.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Setq5 {
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
	b.removeAll(c);
	System.out.println("remove Hash set values="+b);
	
	Set<Integer> b1=new LinkedHashSet<>();
	b1.add(10);
	b1.add(20);
	b1.add(30);
	b1.add(90);
	b1.add(10);
	b1.add(10);
	b1.add(40);
	b1.add(50);

	Set<Integer> d=new LinkedHashSet<>();
	d.add(10);
	d.add(20);
    d.add(60);
	d.add(50);
	d.add(40);
	d.add(70);
	d.add(80);
	d.add(90);
	d.add(100);
	d.add(30);
	b1.removeAll(d);
	System.out.println("removeAll linkedHash set values="+b1);
	
	
	Set<Integer> d1=new TreeSet<>();
	d1.add(10);
	d1.add(20);
	d1.add(30);
	d1.add(40);
	d1.add(50);
	d1.add(60);
	d1.add(70);
	d1.add(80);
	
	Set<Integer> c3=new TreeSet<>();
	c3.add(100);
	c3.add(200);
	c3.add(300);
	c3.add(400);
	c3.add(500);
	c3.add(600);
	c3.add(700);
	c3.add(800);
	c3.add(10);
	c3.add(30);
	d1.removeAll(c3);
	System.out.println("Tree set remove values="+d1);
}
}
