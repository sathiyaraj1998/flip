package org.collection;

import java.util.ArrayList;
import java.util.List;

public class Collectionq8 {
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
    List<Integer> b=new ArrayList<>();
	b.add(30);
	b.add(40);
	b.add(50);
	b.add(60);
	b.add(80);
    a.removeAll(b);
	System.out.println("remove all element="+a);

	
	List<Integer> c=new ArrayList<>();
	c.add(10);
	c.add(20);
	c.add(30);
	c.add(90);
	c.add(10);
	c.add(10);
	c.add(40);
	c.add(50);
    List<Integer> d=new ArrayList<>();
	d.add(10);
	d.add(20);
	d.add(60);
	d.add(50);
	d.add(40);
	d.add(70);
	d.add(80);
	d.add(90);
     d.removeAll(c);
	System.out.println("remove all element="+d);
	
    List<Integer> e=new ArrayList<>();
	e.add(10);
	e.add(20);
	e.add(30);
	e.add(40);
	e.add(50);
	e.add(60);
	e.add(70);
	e.add(80);
	e.add(90);
    List<Integer> f=new ArrayList<>();
	f.add(100);
	f.add(200);
	f.add(300);
	f.add(400);
	f.add(500);
	f.add(600);
	f.add(700);
	f.add(800);
    f.removeAll(e);
	System.out.println("remove all element="+f);

	

}
}
