package com.project1;

import java.util.*;

public class Area {
	public static void main(String[] args) {
		int Figure;
		double area;
		int l, b;
		int base, height;
		int a;
		int r;
		Scanner scan = new Scanner(System.in);
		System.out.println("1- Area of Circle");
		System.out.println("2- Area of Right Triangle");
		System.out.println("3- Area of Square");
		System.out.println("4- Area of Rectangle");
		System.out.print("Select your Figure=");
		Figure = scan.nextInt();
		switch (Figure) {
		case 1:
			System.out.print("Enter Radius = ");
			r = scan.nextInt();
			area = (r * r * 22) / 7;
			System.out.println("Area of Circle =" + area);
			break;
		case 2:
			System.out.print("Enter Base=");
			base = scan.nextInt();
			System.out.print("Enter Height=");
			height = scan.nextInt();
			area = (base * height) / 2;
			System.out.println("Area of Right Triangle=" + area);
			break;
		case 3:
			System.out.print("Enter Side =");
			a = scan.nextInt();
			area = a * a;
			System.out.println("Area of Square=" + area);
			break;
		case 4:
			System.out.print("Enter Length=");
			l = scan.nextInt();
			System.out.print("Enter Breadth=");
			b = scan.nextInt();
			area = l * b;
			System.out.println("Area of Rectangle=" + area);
			break;
		default:
			System.out.print("Enter a valid value.");
		}
	}
}
