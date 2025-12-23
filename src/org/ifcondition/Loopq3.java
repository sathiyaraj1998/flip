package org.ifcondition;

public class Loopq3 {
	public static void main(String[] args) {
		for (int i=1;i<=3;i++) {
			for (int j=1; j<=i;j++) {
				System.out.println(j);
			}
		}
	}

}


//i=1    1<=3true      j=1      1<=1true   1+1=2
//                     j=2      2<=1false loop terminated     i=1+1=2
//i=2    2<=3true      j=1      1<=2true   1+1=2
//                     j=2      2<=2true   2+1=3
//                     j=3      3<=2false loop terminated      i=2+1=3
//i=3    3<=3true      j=1      1<=3true   1+1=2
//                     j=2      2<=3true   2+1=3
//                     j=3      3<=3true   3+1=4
//                     j=4      4<=3false  loop terminated
//i=4    4<=3 false    loop terminated