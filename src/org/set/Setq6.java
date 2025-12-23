package org.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class Setq6 {
	public static void main(String[] args) {
		Set<String> d=new LinkedHashSet<>();
		d.add("student name=");
		d.add("phone");
		d.add("student id");
		d.add("address");
		d.add("dob");
		d.add("gender");
		d.add("mail");

		Set<String> d1=new LinkedHashSet<>();
		d1.add("Siva");
		d1.add("123456789");
		d1.add("4545");
		d1.add( "chennai");
		d1.add( "01.01.2005");
		d1.add( "male");
		d1.add("yahoo@1123");
		d.addAll(d1);
	System.out.println("student only="+d);
	}

}
