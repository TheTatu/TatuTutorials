package com.practice;
import java.util.Scanner;

public class Headache {
	public static void main(String[] args) {
		int num,sum=0,i,j,count=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number :");
		
		num=scan.nextInt();
		for(i=2;i<=num;num++)
		{
			count=0;
			for(j=2;j<i;j++)
			{
				if(i%j==0)
				{
					count++;
					break;
				}
				
			}
			if(count==0)
			{
				System.out.println(j + " is a prime number");
				break;
			}
		}
	}
}