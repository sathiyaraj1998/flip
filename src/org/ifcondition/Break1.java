package org.ifcondition;

public class Break1 {
public static void main(String[] args) {
	for (int i=5; i<=100;i++) {
		if(i==5) {
			break;
		}
		System.out.println(i);
	}
	System.out.println("end");
		
}
}

//
//i=5      5<=100true       sysout(5)         i=5+1=6
//i=6      6<=100true       sysout(6)         i=6+1=7
//..
//...
//i=99     99<=100true      sysout(99)        i=99+1=100
//i=100    100<=100true 	sysout(100)       i=100+1=101
//i=101    101<=100false    terminated

