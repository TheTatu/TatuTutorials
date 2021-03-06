package com.tutorials;

public class MyClass {
	public static void main(String[] args) {
		YourClass object = new YourClass(); //Created -- i =10
		object.setI(100); // i=100
		int addedQuantity = object.add();
		
		System.out.println("Added:" + addedQuantity);
	}
}
