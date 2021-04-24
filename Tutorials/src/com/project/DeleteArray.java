package com.project;

import java.util.Scanner;

public class DeleteArray {
	public static void main(String[] args) {
		int i, count;
		int num[]=new int[10];
		Scanner scan=new Scanner(System.in);
		
		System.out.println("How many elements?");	
		count=scan.nextInt();
		System.out.println("Enter elemets in Array");
		
		for(i=0;i<count;i++)
		{
			num[i]=scan.nextInt();
		}

		System.out.println("Array elements:");	
		
		for(i=0;i<count;i++)
		{
			System.out.println(num[i]);
		}

		System.out.println("Delete from end...");
		
		count--;
		System.out.println("Element deleted successfully...");

		for(i=0;i<count;i++)
		{
			System.out.println(num[i]);
		}
	}
}
