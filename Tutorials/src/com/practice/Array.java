package com.practice;

import java.util.Scanner;

public class Array {
	public static void main(String args[]) {
		int[][] numbers = new int[3][3];

		Scanner Scan= new Scanner(System.in);
		int i;
		int j;
		int number;
		int num = 15;
		int count = 0;
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				numbers[i][j] = num;
			}
		}
		System.out.println("Enter the number you want to search in Array:");
		number = Scan.nextInt();
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				if (numbers[i][j] == number) {
					count++;
				}
			}
		}
		if (count == 0) {
			System.out.println("No, The number " + number + " is not present in the Array");
		}
		if (count >= 1) {
			System.out.println("Yes, The number " + number + " is present in the Array");
			System.out.println("The Number " + number + " is repeated " + count + " times");
		}
	}
}
