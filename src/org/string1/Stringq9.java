package org.string1;

public class Stringq9 {
public static void main(String[] args) {
	String a="Welcome to java class";
	boolean start=a.startsWith("Welcome");
	System.out.println("starts with="+start);

	String b="Selenium tool";
	boolean start1=b.startsWith("Welcome");
	System.out.println("starts with="+start1);
	
	
	String c="Welcome to java class";
	boolean end=c.endsWith("class");
	System.out.println("ends with="+end);
	
	String d="Welcome to java class";
	boolean start2=d.endsWith("java");
	System.out.println("ends with="+start2);

	String e="Welcome to java class";
	boolean empty=e.isEmpty();
	System.out.println("empty with="+empty);
	
	String f="";
	boolean empty1=f.isEmpty();
	System.out.println("empty with="+empty1);
}
}
