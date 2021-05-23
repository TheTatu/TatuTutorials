package com.project;

import java.util.Scanner;

public class Array {
	public static void main(String args[]) {

		int i, count, value;
		int num[] = new int[10];

		Scanner Scan = new Scanner(System.in);
		System.out.println("How many elements?");
		count = Scan.nextInt();
		System.out.println("Enter elements of Array:");

		for (i = 0; i < count; i++) {
			num[i] = Scan.nextInt();
		}
		System.out.println("Array Elements are:");

		for (i = 0; i < count; i++) {
			System.out.println(num[i]);
		}
		System.out.println("Insertion at Beginning");
		if (count == 10) {

			System.out.println("Array is full...Insertion is not possible");

		} else {
			System.out.println("Enter Array Element for insertion:");
			value = Scan.nextInt();
			for (i = count - 1; i >= 0; i--) {
				num[i + 1] = num[i];

			}
			num[0] = value;
			System.out.println("Insertion done Successfully");
			count++;
		}
		System.out.println("Array Elements are:");

		for (i = 0; i < 10; i++) {
			System.out.println(num[i]);
		}
	}
}