package org.polymorphism;

public class Phone {
	private void phoneInfo(String a) {
System.out.println("phone name="+a);		
	}
private void phoneInfo(int a) {
		System.out.println("phone emei no="+a);
	}
private void phoneInfo(String c,int a) {
	System.out.println("os name="+c+a);
	
}
public static void main(String[] args) {
	Phone p=new Phone();
	p.phoneInfo("Motorola");
	p.phoneInfo(123456789);
	p.phoneInfo("android",15);
}


}
