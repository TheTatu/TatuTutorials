package com.test.rtt;

public class Square extends Shape {
	public Square() {
		this.setName("Square");
	}

	@Override
	public void print() {
		System.out.println("I am special.");
	}
}
