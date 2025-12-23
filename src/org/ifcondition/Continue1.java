package org.ifcondition;

public class Continue1 {
	public static void main(String[] args) {
		for (int i = 5; i <=10; i++) {
           //      1			2       3
		  //initialization;condition;increase
			if (i==5) {
				continue;
				//jump statements
			}
			System.out.println(i);
			//bussiness logic
		}
		System.out.println("end");
	}

}



//i=5       5<=10true  		sysout(5)		     i=5+1=6
//i=6       6<=10true 		sysout(6)		     i=6+1=7
//i=7       7<=10true 		sysout(7)		     i=7+1=8
//i=8       8<=10true 		sysout(8)            i=8+1=9
//i=9       9<=10true 		sysout(9)            i=9+1=10
//i=10       10<=10true     sysout(10)           i=10+1=11
//i=11      11<=10false ----->terminated




