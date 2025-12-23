package org.polymorphism;

public class Student {
	private void studentId(String a) {
		System.out.println("Student Name="+a);
	}
		private void studentId(double a) {
			System.out.println("Student pass ratio="+a);
		}
	private void studentId(int b,String a) {
				System.out.println("Student room="+b+a);
	}
	public static void main(String[] args) {
		Student s=new Student();
		s.studentId("sathya");
        s.studentId(74.44);	
        s.studentId(10, "B");
	}	
	

}
