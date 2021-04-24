package com.reusingclasses;

public class TestTwo extends Teacher {
	public static void main(String args[]) {
		Teacher obj = new Teacher();
		System.out.println(obj.collegeName);
		System.out.println(obj.designation);
		obj.Job();
	}
}