package org.whileloop;

public class WhileLoopq7 {
public static void main(String[] args) {
	int a=1;
	while (a<=20) {
		if (a%2==0) {
			
		
		System.out.println(a);
		}
		a++;
	}
	System.out.println("even");
}
}



//a=1    1<=20true    1%2==0false  if loop terminated   a=1+1=2
//a=2    2<=20true    2%2==0true    sysout(2)           a=2+1=3
//a=3    3<=20true    3%2==0false  if loop terminated   a=3+1=4
//a=4    4<=20true    4%2==0true    sysout(4)
//...
//...
//a=20   20<=20true   20%2==0true   sysout(20)          a=20+1=21
//a=21   21<=20 false while loop terminated