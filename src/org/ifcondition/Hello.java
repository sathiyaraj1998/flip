package org.ifcondition;

public class Hello {
	public static void main(String[] args) {
		for(int i=1; i<=100; i++) {
	if(i==5) {
		break;
	}

	System.out.println(i);	
	}
	}
}




//i=1      1<=100true       sysout(1)         i=1+1=2
//i=2      2<=100true       sysout(2)         i=2+1=3
//i=3      3<=100true       sysout(3)         i=3+1=4
//i=4      4<=100true       sysout(4)         i=4+1=5
//i=5 is break terminated
//i=5      5<=100true       sysout(5)         i=5+1=6
//..
//...
//i=99     99<=100true      sysout(99)        i=99+1=100
//i=100    100<=100true 	sysout(100)       i=100+1=101
//i=101    101<=100false    terminated
