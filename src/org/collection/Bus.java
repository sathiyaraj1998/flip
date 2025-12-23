package org.collection;

import java.util.ArrayList;
import java.util.List;

public class Bus {
	public static void main(String[] args) {
		List<Integer> a=new ArrayList<>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		 
		try {
			System.out.println(a.get(6));
		} catch (IndexOutOfBoundsException e) {
			System.out.println("success");
		
		}
		finally {
			System.out.println("end");
		}
		System.out.println(a);
		
	}

}
