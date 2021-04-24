package com.javaLab;

import java.util.Scanner;

public class PatternTwo {
	public static void main(String[] args) {
		int base, i, j;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of lines");
		base = scan.nextInt();
		for (i = 1; i <= base; i++) {
			for (j = i; j > 0; j--) {
				System.out.print(j);
			}
			System.out.println("");
		}

	}
}