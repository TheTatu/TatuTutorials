package com.project1;

import java.util.Scanner;

public class Menu {
	public static void main(String args[]) {
		int i, j;
		System.out.println("Enter any Number:");
		Scanner scan = new Scanner(System.in);
		int num;
		num = scan.nextInt();
		System.out.println("Check If, Number is :");
		System.out.println("1.Even or Odd\n2.Positive or Negative\n3.Prime Number or Not\n4.Find out Factorial of "
				+ num + "\n5.Exit");
		System.out.println("Enter your choice:");
		j = scan.nextInt();

		switch (j) {
		case 1:
			if (num % 2 == 0) {
				System.out.println(num + " is an even number.");
			} else {
				System.out.println(num + " is an odd number.");
			}
			break;
		case 2:
			if (num > 1) {
				System.out.println(num + " is a positive number");

			} else {
				System.out.println(num + " is a negative number");
			}
			break;
		case 3:
			int count = 0;
			for (i = 2; i < num; i++) {
				if (num % i == 0) {
					count++;
					break;
				}
			}
			if (count == 0) {
				System.out.println(num + " is a Prime number");
			} else {
				System.out.println(num + " is not a Prime number");
			}
			break;
		case 4:
			int fact = 1;
			i = 1;

			while (i <= num) {
				fact = fact * i;
				i++;

			}
			System.out.println("Factorial of " + num + " is " + fact);
			break;
		case 5:
			System.exit(0);

		default:
			System.out.println("Please enter a valid number");

		}
	}
}
