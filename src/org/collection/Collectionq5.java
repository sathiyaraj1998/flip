package org.collection;

import java.util.ArrayList;
import java.util.List;

public class Collectionq5 {
public static void main(String[] args) {
	List<Integer> a=new ArrayList<>();
	a.add(10);
	a.add(20);
	a.add(30);
	a.add(40);
	a.add(50);
	a.add(60);
    a.add(2, 50);
	System.out.println("add value element="+a);	
	
	List<Integer> b=new ArrayList<>();
	b.add(10);
	b.add(20);
	b.add(30);
	b.add(40);
	b.add(50);
    b.add(60);
    b.add(30);
	b.add(40);
	b.add(50);
    b.add(9, 70);
	System.out.println("add last list element="+b);

	List<Integer> c=new ArrayList<>();
	c.add(10);
	c.add(20);
	c.add(30);
	c.add(40);
	c.add(50);
    c.add(60);
    c.add(30);
	c.add(40);
	c.add(50);
    c.add(8, 80);
  
	System.out.println("add 8Th  element="+c);
	
	
	List<Integer> d=new ArrayList<>();
	d.add(10);
	d.add(20);
	d.add(30);
	d.add(40);
	d.add(50);
    d.add(60);
    d.add(30);
	d.add(40);
	d.add(50);
    d.add(9, 100);
	System.out.println("add last list element="+d);


}
}
