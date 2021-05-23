package com.javaLab;

import java.util.Scanner;

public class PatternFour {
	public static void main(String[] args) {
		int base, i, j;
		char alpha;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of lines");
		base = scan.nextInt();
		for (i = 0; i < base; i++) {
			alpha = 'A';
			for (j = 0; j <= i; j++) {
				System.out.print(alpha);
				alpha++;
			}
			System.out.println("");
		}

	}
}