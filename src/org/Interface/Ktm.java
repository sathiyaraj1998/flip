package org.Interface;

public class Ktm implements Bike{

	@Override
	public void cost() {
		System.out.println("cost=2,50000");
		
	}

	@Override
	public void speed() {
		System.out.println("speed=150km");
	}
	public static void main(String[] args) {
		Ktm k=new Ktm();
		k.cost();
		k.speed();
		k.insurance();
	}

	@Override
	public void insurance() {
		System.out.println("insuarnce=10000");
		
	}
	

}
