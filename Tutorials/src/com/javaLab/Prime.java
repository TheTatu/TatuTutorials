package com.javaLab;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i, j, sum;
		System.out.println("Enter a number:");
		i = scan.nextInt();
		System.out.println("Enter another number:");
		j = scan.nextInt();
		sum = sumPrime(i, j);

		System.out.println("The sum of Prime numbers between " + i + " and " + j + " is " + sum);

	}

	public static int sumPrime(int i, int j) {
		int sum = 0, max, min, k, l, count = 0;
		if (i >= j) {
			max = i;
			min = j;
		} else {
			max = j;
			min = i;
		}
		for (k = min; k <= max; k++) {
			count = 0;
			for (l = 2; l < k ; l++) {
				if (k % l == 0) {
					count++;
					break;
				}
			}
			if (count == 0) {
				sum = sum + k;
			}
		}
		return sum;
	}

}
