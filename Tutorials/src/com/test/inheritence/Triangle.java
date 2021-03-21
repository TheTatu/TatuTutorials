package com.test.inheritence;

public class Triangle extends Shape {
	private int base;
	private int height;

	public Triangle(String name, int base, int height) {
		super(name);

		this.base = base;
		this.height = height;
	}

	@Override
	public double area() {
		return 0.5 * base * height;
	}

	@Override
	public double getfactor() {
		return 0.4;
	}

}
