package com.test.inheritence;

public class Parent {
	protected String name;
	protected int age;

	public Parent() {
		//default
	}

	/**
	 * Constructor with params.
	 * 
	 * @param name
	 * @param age
	 */
	public Parent(int age) {
		this.name = "Mayank";
		this.age = age;
	}

	/**
	 * Constructor with params.
	 * 
	 * @param name
	 * @param age
	 */
	public Parent(String name) {
		this.name = name;
		this.age = 30;
	}

	/**
	 * Constructor with params.
	 * 
	 * @param name
	 * @param age
	 */
	public Parent(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void print() {
		System.out.println(name + ":" + age);
	}
	
	protected void privateMethod() {
		System.out.println("I am private");
	}
}
