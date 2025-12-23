package org.whileloop;

public class Odd {
	public static void main(String[] args) {
		for (int i = 1; i <=15; i++) {
			if (i%2==0) {
				System.out.println(i);
			}
		}
		System.out.println("even numbers 1 to 15");
	}

}



//i=1    1<=15true    1%2==0false   loop terminated  i=1+1=2
//i=2    2<=15true    2%2==0true   sysout(2)   i=2+1=3
//i=3    3<=15true    3%2==0false   loop terminated  i=3+1=4
//'''
//...
//i=14    14<=15true    14%2==0true   sysout(14)   i=14+1=15
//i=15    15<=15true    15%2!=0false   loop terminated i=15+1=16
//i=16    16<=15false     loop terminated