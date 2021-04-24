package com.practice;

import java.util.Scanner;

public class Bank {

	int accNumber;
	String customerName;
	int totalBal;
	Scanner scan = new Scanner(System.in);

	Bank() {
		System.out.println("Enter Account Number:");
		accNumber = scan.nextInt();
		System.out.println("Enter Customer Name:");
		customerName = scan.next();
		System.out.println("Enter Total Balance:");
		totalBal = scan.nextInt();
	}

	void deposit() {
		int amount;
		System.out.println("Enter Deposit Amount in account number "+accNumber);
		amount = scan.nextInt();

		totalBal = totalBal + amount;
		System.out.println("Amount Deposited");
	}

	void withdraw() {
		int amount;
		System.out.println("Enter withdraw amount in Account number "+accNumber);
		amount=scan.nextInt();
		if(amount>totalBal) {
			System.out.println("Not enough money in your Account");
		}
		else {
			totalBal=totalBal-amount;
			System.out.println("Amount withdrawn");
		}
	}
	void displayInfo() {
		System.out.println(" Customer Info:-");
		System.out.println("Account Number:- "+accNumber);
		System.out.println("Customer Name:-"+customerName);
		System.out.println("Available balance:-"+totalBal);
		
	}
}
