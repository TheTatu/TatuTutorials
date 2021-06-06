package com.test.stat;

public class Player {
	private static int counter = 1;
	private static String prefix;

	private String name;

	static {
		System.out.println("Static block");
		prefix = "Player";
	}

	public Player() {
		this.name = prefix + counter;
		counter++;
		System.out.println("I am constructor");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name + counter;
	}

	public static void print() {
		System.out.println("Hi" + counter);
	}
}
