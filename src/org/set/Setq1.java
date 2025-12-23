package org.set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Setq1 {
	public static void main(String[] args) {
		Set<Integer> a=new HashSet<>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		a.add(60);
		a.add(70);
		a.add(80);
		a.add(90);
		a.add(10);
		a.add(20);
		a.size();
		System.out.println("Hash set="+a);

		Set<Integer> b=new LinkedHashSet<>();
		b.add(10);
		b.add(20);
		b.add(30);
		b.add(40);
		b.add(50);
		b.add(60);
		b.add(70);
		b.add(80);
		b.add(90);
		b.add(10);
		b.add(20);
		b.size();
		System.out.println("Linked Hash set="+b);
		
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
		c.size();
		System.out.println("Tree set="+c);


	}

}
