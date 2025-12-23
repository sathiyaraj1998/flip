package org.ifcondition;

public class ForLoop {
	public static void main(String[] args) {
		for (int i = 1; i<=3; i++) {
			for (int j = 1; j<=4; j++) {
				System.out.println(j);
			}
		}
	}

}

//1          2         a          b          c           d              4              
//i=1      1<=3true   j=1       1<=4true   sysout(1)   j=1+1=2    
//                    j=2       2<=4true   sysout(2)   j=2+1=3
//                    j=3       3<=4true   sysout(3)   j=3+1=4
//                    j=4       4<=4true   sysout(4)   j=4+1=5
//                    j=5       5<=4false   loop    terminated       i=1+1=2


//i=2      2<=3true   j=1       1<=4true   sysout(1)   j=1+1=2    
//                    j=2       2<=4true   sysout(2)   j=2+1=3
//                    j=3       3<=4true   sysout(3)   j=3+1=4
//                    j=4       4<=4true   sysout(4)   j=4+1=5
//                    j=5       5<=4false   loop    terminated       i=2+1=3
//...
//...
//i=3      3<=3true   j=1       1<=4true   sysout(1)   j=1+1=2    
//                    j=2       2<=4true   sysout(2)   j=2+1=3
//                    j=3       3<=4true   sysout(3)   j=3+1=4
//                    j=4       4<=4true   sysout(4)   j=4+1=5
//                    j=5       5<=4false   loop    terminated       i=3+1=4
//i=4      4<=3false  loop is terminated
