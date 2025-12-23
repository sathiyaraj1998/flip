package org.string1;

public class Stringq4 {
 public static void main(String[] args) {
	String a="Java";
	String a1="java";
	boolean equal=a.equals(a1);
	System.out.println("equal or not="+equal);
	
	String b="Java";
	String b1="Java";
	boolean equal1=b.equals(b1);
	System.out.println("equal or not="+equal1);
	
	
	String c="Social media";
	String c1="SocialMedia";
	boolean equal3=c.equals(c1);
	System.out.println("equal or not="+equal3);
	
	
	String d="Java";
	String d1="java";
	boolean equal4=d.equalsIgnoreCase(d1);
	System.out.println("equal or not="+equal4);

 
	String e="SeleniumTool";
	String e1="seleniumtool";
	boolean equal5=e.equals(e1);
	System.out.println("equal or not="+equal5);
 }
}
