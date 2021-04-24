package com.project1;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		int count = 0;
		int i, num;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number");
		num = scan.nextInt();
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
	}
}
