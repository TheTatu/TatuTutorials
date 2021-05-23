package com.project1;

import java.util.*;

public class EvenOdd {
	public static void main(String[] args) {

		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number");
		num = scan.nextInt();
		if (num % 2 == 0) {
			System.out.println(num + " is an even number.");
		} else {
			System.out.println(num + " is an odd number");
		}

	}
}