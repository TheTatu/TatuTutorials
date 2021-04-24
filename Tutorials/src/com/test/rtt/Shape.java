package com.test.rtt;

public class Shape {
	private String name;

	/**
	 * Getter
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	public void print() {
		System.out.println("I am:" + this.name);
	}
}
