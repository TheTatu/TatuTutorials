package com.thenewboston;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		int age;
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter Age");
		age = Scan.nextInt();

		switch (age) {
		case 1:
			System.out.println("You are " + age);
			break;
		case 2:
			System.out.println("You are " + age);
			break;
		default:
			System.out.println("You are retarded");
			break;

		}
	}
}
	