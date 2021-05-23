package com.project;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int i, count, value;
		int num[] = new int[10];

		Scanner Scan = new Scanner(System.in);
		System.out.println("How many elements do you want to insert in the array?");
		count = Scan.nextInt();
		while (count > 10) {
			System.out.println("Element limit can not exceed 10");
			System.out.println("How many elements do you want to insert in the array?");
			count = Scan.nextInt();
		}
		System.out.println("Enter elements of Array:");

		for (i = 0; i < count; i++) {
			num[i] = Scan.nextInt();
		}
		System.out.println("Array Elements are:");

		for (i = 0; i < count; i++) {
			System.out.println(num[i]);
		}
		System.out.println("What do You want to do with this Array?");
		System.out.println(
				"1.Insert element at beginning\n2.Insert element at end\n3.Insert element at any position\n4.Delete beginning element\n5.Delete end element\n6.Delete element from any position\n7.Exit\n ");
		System.out.println("Enter Your Choice");
		int choice = Scan.nextInt();

		switch (choice) {
		case 1:
			if (count > 10) {

				System.out.println("Array is full...Insertion is not possible");

			} else {
				System.out.println("Enter Array Element for insertion in the beginning:");
				value = Scan.nextInt();
				for (i = count - 1; i >= 0; i--) {
					num[i + 1] = num[i];

				}
				num[0] = value;
				System.out.println("Insertion done Successfully");
				count++;
			}
			System.out.println("Array Elements are:");

			for (i = 0; i < count; i++) {
				System.out.println(num[i]);
			}
			break;
		case 2:
			if (count > 10) {

				System.out.println("Array is full...Insertion is not possible");

			} else {
				System.out.println("Enter Array Element for insertion at end:");
				value = Scan.nextInt();
				num[count] = value;
				count++;

				System.out.println("Array Elements are:");

				for (i = 0; i < count; i++) {
					System.out.println(num[i]);
				}
			}
			break;
		case 3:
			if (count > 10) {

				System.out.println("Array is full...Insertion is not possible");

			} else {
				System.out.println("Enter Array Element for insertion at any position:");
				value = Scan.nextInt();

				System.out.println("Enter Position");
				int position = Scan.nextInt();

				for (i = count - 1; i >= position - 1; i--) {
					num[i + 1] = num[i];

				}
				num[position - 1] = value;
				System.out.println("Insertion Done successfully");
				count++;

				System.out.println("Array Elements are:");

				for (i = 0; i < count; i++) {
					System.out.println(num[i]);
				}
			}
			break;
		case 4:
			for (i = 0; i < count - 1; i++) {
				num[i] = num[i + 1];
			}

			count--;

			System.out.println("Element deleted successfully from beginning");

			System.out.println("Array elements are:");
			for (i = 0; i < count; i++) {
				System.out.println(num[i]);
			}
			break;
		case 5:
			count--;
			System.out.println("Deletion Done at end");
			for (i = 0; i < count; i++) {
				System.out.println(num[i]);
			}
			break;
		case 6:
			System.out.println("Delete elements from any position:");
			System.out.println("Enter Position");
			int position = Scan.nextInt();

			for (i = position - 1; i < count - 1; i++) {
				num[i] = num[i + 1];
			}

			count--;

			System.out.println("Element deleted successfully...");

			System.out.println("Array elements:");
			for (i = 0; i < count; i++) {
				System.out.println(num[i]);
			}
			break;
		case 7:
			System.exit(0);

		}

	}
}
