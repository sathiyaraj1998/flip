package org.polymorphism;

public class Employee {
private void empId(int id) {
	System.out.println("employee id="+id);
}
private void empId(String s) {
	System.out.println("employee name="+s);
}
private void empId(int a,char c,String b) {
	System.out.println("employee address="+a+c+b);
}
public static void main(String[] args) {
	Employee e=new Employee();
	e.empId(1234);
    e.empId("Sathya");
    e.empId(3,',' ,"alagapuram");
}

}
