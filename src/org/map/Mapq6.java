package org.map;

import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Mapq6 {
public static void main(String[] args) {
	Map<String, String> c=new TreeMap<>();
	c.put("employee name", "hari");
	Map<String, Integer> c1=new TreeMap<>();
	c1.put("phone", 909559453);
	Map<String,Integer> c2=new TreeMap<>();
	c2.put("employee id",1234);
	Map<String, String> c3=new TreeMap<>();
	c3.put("address", "salem");
	Map<String, String> c4=new TreeMap<>();
	c4.put("date of birth","20.04.1998");
	Map<String, String> c5=new TreeMap<>();
	c5.put("gender", "male");
	Map<String, Integer> c6=new TreeMap<>();
	c6.put("salary", 50000);
	c.values();c5.values();c6.values();
	c1.values();c2.values();c3.values();c4.values();
	System.out.println("Employee details"+c+c1+c2+c3+c4+c5+c6);
	
	
	Map<String, String> d=new LinkedHashMap<>();
	d.put("employee name=", "Sathya");
	d.put("phone", "9095594539");
	d.put("employee id","22222");
	d.put("address", "erode");
	d.put("dob", "01.01.2000");
	d.put("gender", "female");
	d.put("salary", "45000");
	d.values();
  System.out.println("key values only="+d);


	Map<String, String> d1=new LinkedHashMap<>();
	d1.put("employee name=", "Siva");
	d1.put("phone", "123456789");
	d1.put("employee id","4545");
	d1.put("address", "chennai");
	d1.put("dob", "01.01.2005");
	d1.put("gender", "male");
	d1.put("salary", "65000");
	d1.values();
System.out.println("key values only="+d1);

}
}
