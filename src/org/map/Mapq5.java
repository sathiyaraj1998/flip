package org.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class Mapq5 {
public static void main(String[] args) {
	Map<Integer, String> a=new HashMap<Integer,String>();
	a.put(10, "java");
	a.put(20, "sql"); 
	a.put(30, "oops");
	a.put(40, "Sql");
	a.put(50, "oracle");
	a.put(60, "DB");
	a.put(10, "selenium");
	a.put(50, "psql");
	a.put(40, "Hadoop");
	
	Collection<String> values = a.values();
	System.out.println(values);
	
	Set<Integer> keySet = a.keySet();
	System.out.println(keySet);
	
   Set<Entry<Integer,String>> entrySet = a.entrySet();
   
   for (Entry<Integer, String> entry : entrySet) {
	  System.out.println(entry); 
	  System.out.println(entry.getKey()+":"+entry.getValue());
}
    
}


}