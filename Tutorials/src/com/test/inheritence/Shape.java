package com.test.inheritence;

public class Shape {
	private String name;
	
	public Shape(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	protected double getfactor() {
		return 0.5;
	}

	public double area() {
		return 0;
	}
}
