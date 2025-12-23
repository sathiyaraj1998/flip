package org.collection;
import java.util.List;
import java.util.LinkedList;
public class Collectionq2 {
	public static void main(String[] args) {
		List<Integer> a=new LinkedList<>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(90);
		int indexOf=a.indexOf(10);
		System.out.println("first index value of 10="+indexOf);
		
		List<Integer> b=new LinkedList<>();
		b.add(10);
		b.add(20);
		b.add(30);
		b.add(90);
		b.add(10);
		b.add(10);
		b.add(40);
		b.add(50);
		
		int indexOf1=b.lastIndexOf(10);
		System.out.println("last index value of 10="+indexOf1);

		
		List<Integer> c=new LinkedList<>();
		c.add(10);
		c.add(20);
		c.add(30);
		c.add(90);
		c.add(10);
		c.add(10);
		c.add(40);
		c.add(50);
		
		int i=c.indexOf(50);
		System.out.println("index value of 50="+i);

		
		List<Integer> d=new LinkedList<>();
		d.add(10);
		d.add(20);
		d.add(30);
		d.add(90);
		d.add(10);
		d.add(10);
		d.add(40);
		d.add(50);
		
		int i1=d.indexOf(90);
		System.out.println("index value of 90="+i1);

		
	}

}
