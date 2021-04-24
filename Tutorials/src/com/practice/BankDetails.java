package com.practice;

public class BankDetails {
	public static void main(String[] args) {
		Bank b1=new Bank();
		Bank b2=new Bank();
		
		b1.deposit();
		b1.withdraw();
		b1.displayInfo();
		
		b2.deposit();
		b2.withdraw();
		b2.displayInfo();
		
	}

}