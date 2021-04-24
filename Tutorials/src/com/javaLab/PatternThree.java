package com.javaLab;

import java.util.Scanner;

public class PatternThree {
	public static void main(String[] args) {
		int base, i, j, k;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of lines");
		base = scan.nextInt();
		for (i = 1; i <= base; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(j);
			}
			if (i > 1) {
				for (k = i-1; k > 0; k--) {
					System.out.print(k);
				}
			}
			System.out.println("");

		}
	}
}