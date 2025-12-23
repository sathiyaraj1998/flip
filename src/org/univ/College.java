package org.univ;

public class College extends University {
@Override
public void ug() {
System.out.println("bachelor of tamil");
}
@Override
	public void pg(){
	System.out.println("master of computer science");
}
public static void main(String[] args) {
	College c=new College();
	c.ug();
    c.pg();
}

	
}
