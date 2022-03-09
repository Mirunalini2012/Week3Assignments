package org_college;


public class AxisBank extends Bankinfo {
	
	public void deposit()
	{
		System.out.println("Axis Bank Method Deposit");	
	}


	public static void main(String[] args) {
		AxisBank bank = new AxisBank();
		bank.fixed();
		bank.saving();		
		bank.deposit();
		Bankinfo info = new Bankinfo();
		info.deposit();
		

	}

}
