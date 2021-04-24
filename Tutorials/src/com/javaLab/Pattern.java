package com.javaLab;

import java.util.Scanner;

public class Pattern {
	public static void main(String[] args) {
		int base, i, j;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of lines");
		base = scan.nextInt();
		for (i = 0; i < base; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print(i + 1);
			}
			System.out.println("");
		}

	}
}