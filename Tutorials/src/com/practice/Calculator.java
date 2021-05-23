package com.practice;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i, j;
		System.out.println("Enter a number:");
		i = scan.nextInt();
		System.out.println("Enter another number:");
		j = scan.nextInt();
		Calculate result = new Calculate();

		while (true) {
			System.out.println(
					"What do you want to do :\n1.Addition \n2.Subtraction \n3.Multiplication \n4.Division \n5.Exit");
			int choice = scan.nextInt();
			switch (choice) {

			case 1:
				int add = result.sum(i, j);
				System.out.println("The Sum of " + i + " and " + j + " is " + add);
				break;

			case 2:

				int sub = result.subtract(i, j);
				System.out.println("The Subtraction of " + i + " and " + j + " is " + sub);
				break;

			case 3:

				int multiply = result.multiply(i, j);
				System.out.println("The Multiplication of " + i + " and " + j + " is " + multiply);
				break;

			case 4:
				double divide = result.divide(i, j);
				System.out.println("The Division of " + i + " and " + j + " is " + divide);
				break;

			case 5:
				System.exit(0);

			default:
				System.out.println("Enter correct choice.");
			}
		}
	}
}