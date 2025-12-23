package org.bank;

public class AxisBank extends BankInfo{
	private void deposit() {
		System.out.println("deposit amount=500");

	}
	public static void main(String[] args) {
		AxisBank ax=new AxisBank();
		ax.deposit();
		ax.saving();
		ax.fixed();
	}

}
