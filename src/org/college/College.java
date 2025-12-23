package org.college;

public class College extends Student {
	public void collegeName() {
		System.out.println("college name= avs college");
	}
	public void collegeCode() {
		System.out.println("college code=1234");
	}
    public void collegeRank() {
		System.out.println("college rank=11");
	}
    public static void main(String[] args) {
		College c=new College();
		c.collegeName();
		c.collegeCode();
		c.collegeRank();
		c.studentName();
		c.studentDept();
		c.studentId();
		c.depName();
		c.hostelName();
		
	}
}
