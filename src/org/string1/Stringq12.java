package org.string1;

public class Stringq12 {
	public static void main(String[] args) {
		String a="Welcome to java class";
		String[] split=a.split(" ");
		for (String string:split) {
		System.out.println("split type="+string);
		}
		System.out.println("----------------\n");
		
		String b="Welcome to java class";
		String[] split1=b.split("l");
		for (String string1:split1) {
		System.out.println("split type="+string1);
		}
	}

}
