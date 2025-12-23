package org.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class Mapq7 {
	public static void main(String[] args) {
		Map<String, String> d=new LinkedHashMap<>();
		d.put("student name=", "Sathya");
		d.put("phone", "9095594539");
		d.put("student id","22222");
		d.put("address", "erode");
		d.put("dob", "01.01.2000");
		d.put("gender", "female");
		d.put("mail", "mail@123");
		d.values();
	  System.out.println("key values only="+d);


		Map<String, String> d1=new LinkedHashMap<>();
		d1.put("student name=", "Siva");
		d1.put("phone", "123456789");
		d1.put("student id","4545");
		d1.put("address", "chennai");
		d1.put("dob", "01.01.2005");
		d1.put("gender", "male");
		d1.put("mail", "yahoo@1123");
		d1.values();
	System.out.println("key values only="+d1);

	}

}
