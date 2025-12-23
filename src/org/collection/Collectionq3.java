package org.collection;
import java.util.*;
public class Collectionq3 {
	public static void main(String[] args) {
		List<Integer> a=new ArrayList<>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
	    a.add(60);
	    int get=a.get(2);
		System.out.println("2nd index in the element="+get);
		
		 List<Integer> b=new ArrayList<>();
		    b.add(100);
			b.add(200);
			b.add(300);
			b.add(400);
			b.add(500);
			b.add(600);
			b.add(700);
			b.add(800);
			int get1=b.get(4);
			System.out.println("4th index value="+get1);
			
			
			 List<Integer> b1=new ArrayList<>();
			    b1.add(105);
				b1.add(205);
				b1.add(305);
				b1.add(405);
				b1.add(505);
				b1.add(605);
				b1.add(705);
				b1.add(805);
				int get2=b1.get(7);
				System.out.println("7th index value="+get2);
				
				
				List<Integer> b2=new ArrayList<>();
				    b2.add(105);
					b2.add(205);
					b2.add(305);
					b2.add(405);
					b2.add(505);
					b2.add(605);
					b2.add(705);
					b2.add(805);
					for (int i = 0; i<b2.size(); i++) {
				System.out.println("for loop index="+i+"value="+b2.get(i));
					}
					
					List<Integer> b3=new ArrayList<>();
				    b3.add(105);
					b3.add(205);
					b3.add(305);
					b3.add(405);
					b3.add(505);
					b3.add(605);
					b3.add(705);
					b3.add(805);
			    for (Integer integer : b3) {
					System.out.println("enhance for loop"+integer);
				}
}
}