package com.project;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		System.out.println("Linear Search Programme");

		int temp = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Size of array");
		int size = scan.nextInt();
		int[] array = new int[size];
		System.out.println("Enter Element in Array");
		for (int i = 0; i < size; i++) {
			array[i] = scan.nextInt();
		}
		System.out.println("Element are :");
		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("\nwhich element do you want to search");
		int search = scan.nextInt();
		for (int i = 0; i < size; i++) {
			if (array[i] == search) {
				System.out.printf("Element present at %d positiom", i+1);
				temp++;
				break;
			}
		}
		if (temp == 0) {
			System.out.println("Element Not found in list");
		}
	}
}
