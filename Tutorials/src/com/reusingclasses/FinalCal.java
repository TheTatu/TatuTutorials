package com.reusingclasses;

import java.util.Scanner;

public class FinalCal extends Calculation {
	public void multiplication(int x, int y) {
		z = x * y;
		System.out.println("The product of the given numbers:" + z);
	}

	public static void main(String args[]) {
		System.out.println("Enter Value of A:");
		Scanner Scan = new Scanner(System.in);
		int a, b;
		a = Scan.nextInt();
		System.out.println("Enter value of B:");
		b = Scan.nextInt();

		FinalCal Final = new FinalCal();
		Final.addition(a, b);
		Final.Subtraction(a, b);
		Final.multiplication(a, b);
	}
}
