package com.javaLab;

import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {
		System.out.println("Enter size of Matrix:");
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		while (size > 10) {
			System.out.println("Matrix size cannot be greater than 10");
			System.out.println("Enter size of matrix again:");
			size = scan.nextInt();
		}
		int odd = 0;
		int even = 0;
		int array[][] = new int[size][size];
		int arrayTwo[][] = new int[size][size];

		System.out.println("Enter elements in the matrix:");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				array[i][j] = scan.nextInt();
			}
		}
		System.out.println("Elements of the array are:");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if ((array[i][j] % 2 == 0) && (array[i][j] != 0)) {
					even++;
				}
				if ((array[i][j] % 2 != 0) && (array[i][j] != 0)) {

					odd++;
				}
			}
		}
		System.out.println("Even numbers are " + even);
		System.out.println("Odd numbers are " + odd);
	}
}