package org.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Mapq1 {
public static void main(String[] args) {
	Map<Integer, String> a=new HashMap<>();
	a.put(10, "java");
	a.put(20, "sql");
	a.put(30, ".net");
	a.put(40, "Sql");
	a.put(50, "oracle");
	a.put(60, "selenium");
	a.put(10, "psql");
	a.put(50, "Hadoop");
	a.put(40, "HTML");
	a.values();
	System.out.println("create key values"+a);
	
	Map<Integer, Integer> b=new LinkedHashMap<>();
	b.put(10, 10);
	b.put(20, 20);
	b.put(30, 30);
	b.put(40, 40);
	b.put(50, 50);
	b.put(60, 60);
	b.put(10, 10);
	b.put(50, 50);
	b.put(40, 40);
	b.values();
	System.out.println("create key values"+b);
	
	Map<Character, String> c=new TreeMap<>();
	c.put('!', "hari");
	c.put('@', "vijay");
	c.put('#', "vino");
	c.put('$', "siva");
	c.put('%', "madhu");
	c.put('^', "riya");
	c.put('&', "kavi");
	c.put('*', "jeeva");
	c.values();
	System.out.println("create key values"+c);
	
	Map<String, String> d=new Hashtable<>();
	d.put("apple", "manualtesting");
	d.put("bat", "jira");
	d.put("cat", "jenkins");
	d.put("dog", "git");
	d.put("eat", "sql");
	d.put("fish", "regressiontesting");
	d.values();
	System.out.println("create key values"+d);
}
}
