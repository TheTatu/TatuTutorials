package com.test.shape;

public class Triangle {
	private int height;

	/**
	 * This is constructor used to instantiate Triangle.
	 * 
	 * @param height
	 */
	public Triangle(int height) {
		this.height = height;
	}

	public void print() {
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println("");
		}
	}

	public void setHeight(int height) {
		this.height = height;
	}
}
