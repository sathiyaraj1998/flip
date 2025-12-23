package org.string1;

public class Stringq7 {
public static void main(String[] args) {
	String a="Software Testing";
	String ss=a.replace("Software", "Automation");
	System.out.println("replace="+ss);
	
	String a1="Welcome to java class";
	String ss1=a1.replace("java", "python");
	System.out.println("replace="+ss1);

	String c="Welcome to java class";
	String ss2=c.replace(" ", "#");
	System.out.println("replace="+ss2);
	
	String d="Testingtool24@gmail.com";
	String ss3=d.replace("gmail", "yahoo");
	System.out.println("replace="+ss3);
	
	String e="3-53-2m,Balamurugan,Thanjavur,pincode-613001";
	String ss4=e.replace(",pincode-613001", ".");
	System.out.println("replace="+ss4);

}
}
