package org.ifcondition;

public class Break {
	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			if(i==5) {
				break;
			}

	System.out.println(i);	
	}
		System.out.println("end");
	}
}



//i=1      1<=10true       sysout(1)         i=1+1=2
//i=2      2<=10true       sysout(2)         i=2+1=3
//i=3      3<=10true       sysout(3)         i=3+1=4
//i=4      4<=10true       sysout(4)         i=4+1=5
//i=5      5<=10true       sysout(5)         i=5+1=6
//..
//...
//i=10     10<=10true      sysout(10)        i=10+1
//i=11     11<=11false 	   terminated
