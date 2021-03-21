package com.test.inheritence;

public class Child extends Parent {
	private String address;

	public void show() {
		System.out.println(this.address + ":" + this.age + ":" + this.name);
	}
}
