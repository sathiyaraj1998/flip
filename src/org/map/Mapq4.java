package org.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Mapq4 {
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
for (Integer key: a.keySet()) {
	System.out.println("enhance for loop="+key+a.get(key));
}
System.out.println("\n");
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

for (Integer k1: b.keySet()) {
	System.out.println("enhance key="+k1+"value="+b.get(k1));
}
System.out.println("\n");
Map<Character, Integer> c=new TreeMap<>();
c.put('!', 10);
c.put('@', 20);
c.put('#', 30);
c.put('$', 40);
c.put('%', 50);
c.put('^', 60);
c.put('&', 10);
c.put('*', 50);
c.put('(', 40);
for (Character k2: c.keySet()) {
	System.out.println("enhance key="+k2+"value="+c.get(k2));
}
System.out.println("\n");
Map<String, String> d=new Hashtable<>();
d.put("ant", "Selenium");
d.put("egg", "framework");
d.put("dog","oracle");
d.put("camel", "java");
d.put("deer", "jira");
d.put("bot", "db");
for (String k3: d.keySet()) {
	System.out.println("enhance key="+k3+"value="+d.get(k3));
}



}
}
