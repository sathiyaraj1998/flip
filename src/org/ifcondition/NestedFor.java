package org.ifcondition;

public class NestedFor {
public static void main(String[] args) {
	for (int i=1;i<=8;i++) {
		for (int j=1; j<=i;j++) {
			System.out.println(j);
		}
	}
}
}

// 1       2        a         b         c              d         
//i=1    1<=8      j=1      1<=1true   1+1=2 
//                 j=2      2<=1false loop terminated  i=1+1=2
//i=2    2<=8      j=1      1<=2true   1+1=2
//                 j=2      2<=2true   2+1=3
//                 j=3      3<=2false loop terminated  i=2+1=3
//i=3    3<=8      j=1      1<=3true   1+1=2
//                 j=2      2<=3true   2+1=3
//                 j=3      3<=3true   3+1=4
//                 j=4      4<=3false  loop terminated i=3+1=4
//...
//..
//i=8    8<=8      j=1      1<=8true   1+1=2
//                 j=2      2<=8true   2+1=3
//				   j=3      3<=8true   3+1=4
//                 j=4      4<=8true   4+1=3
//                 j=5      5<=8true   5+1=4
//                 j=6      6<=8true   6+1=4
//                 j=7      7<=8true   7+1=4
//                 j=8      8<=8true   8+1=4
//                 j=9      9<=8false   loop terminated  i=8+1=9
//i=9     9<=8false loop is terminated                 