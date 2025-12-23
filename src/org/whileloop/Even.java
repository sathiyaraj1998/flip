package org.whileloop;

public class Even {
	public static void main(String[] args) {
		for (int i = 1; i <=15; i++) {
			if (i%2!=0) {
				System.out.println(i);
			}
       }
		System.out.println("odd numbers ");
	}


}



//i=1    1<=15true    1%2!=0true  sysout(1)   i=1+1=2
//i=2    2<=15true    2$2!=0false terminate   i=2+1=3
//'''
//...
//i=15    15<=15true  15%2!=0true  sysout(15)   i=15+1=16
//i=16    16<=15false     loop terminated