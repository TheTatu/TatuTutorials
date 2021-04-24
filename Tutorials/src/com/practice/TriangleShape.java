package com.practice;

import java.util.Scanner;

public class TriangleShape {
	public static void main(String[] args) {
		int base, i, j;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter base of the Trinagle");
		base=scan.nextInt();
		for(i=0;i<base;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("_________________________________");
		for(i=0;i<base;i++)
		{
			for(j=base;j>i;j--)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
