package org.whileloop;

public class DoWhileq9 {
	public static void main(String[] args) {
		int a=1;
		do {
			if (a%2!=0) {
				System.out.println(a);
					
			}
			a++;
			
		} while (a<=15);
		System.out.println("odd numbers");
	}

}



//a=1      1%2!=0true      sysout(1)     1+1=2       1<=15true
//a=2      2%2!=0false     loop terminate  2+1=3     2<=15true
//a=3      3%2!=0true      sysout(3)     3+1=4       3<=15true
//..
//...
//a=15     15%2!=0true     sysout(15)    15+1=16     16<15false loop terminated