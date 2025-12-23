package org.polymorphism;

public class CompanyInfo {
	private void companyName(String a) {
		System.out.println("company name="+a);
	}
	private void companyName(int a) {
		System.out.println("company Id="+a);

	}
	private void companyName(String a,double c) {
		System.out.println("employee ratio="+a+c);

	}
	public static void main(String[] args) {
		CompanyInfo cc=new CompanyInfo();
		cc.companyName("wipro");
		cc.companyName(1234);
		cc.companyName("sathya", 73.44);
	}
	

}
