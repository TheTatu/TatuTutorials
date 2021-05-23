package com.project;

import java.util.Scanner;

public class DeleteBeginning {
	public static void main(String[] args) {
		int i, count;
		int num[] = new int[10];
		Scanner scan = new Scanner(System.in);

		System.out.println("How many elements?");
		count = scan.nextInt();
		System.out.println("Enter elemets in Array");

		for (i = 0; i < count; i++) {
			num[i] = scan.nextInt();
		}

		System.out.println("Array elements:");

		for (i = 0; i < count; i++) {
			System.out.println(num[i]);
		}
		System.out.println("Delete from beginning...");
		for (i = 0; i < count - 1; i++) {
			num[i] = num[i + 1];
		}

		count--;

		System.out.println("Element deleted successfully...");

		System.out.println("Array elements:");
		for (i = 0; i < count; i++) {
			System.out.println(num[i]);
		}
	}
}
