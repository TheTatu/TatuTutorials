package com.project;

import java.util.Scanner;

public class EndArray {
	public static void main(String[] args) {
		int i, count, value;
		int num[] = new int[10];

		Scanner scan = new Scanner(System.in);

		System.out.println("How many elements?");
		count = scan.nextInt();
		System.out.println("Enter elements of Array:");

		for (i = 0; i < count; i++) {
			num[i] = scan.nextInt();
		}

		System.out.println("Array Elements are:");

		for (i = 0; i < count; i++) {
			System.out.println(num[i]);
		}

		System.out.println("Insertion at end......");

		if (count == 10) {

			System.out.println("Array is full...Insertion is not possible");

		} else {
			System.out.println("Enter Array Element for insertion:");
			value = scan.nextInt();
			num[count] = value;
			count++;

			System.out.println("Array Elements are:");

			for (i = 0; i < count; i++) {
				System.out.println(num[i]);
			}

		}

	}

}
