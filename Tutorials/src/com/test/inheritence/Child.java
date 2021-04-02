package com.test.inheritence;

public class Child extends Parent {
	private String address;

	public void show() {
		System.out.println(this.address + ":" + this.age + ":" + this.name);
	}
	
	@Override
	public void print() {
		System.out.println("I am child");
	}

	public static void main(String[] args) {
		Child c = new Child();
		c.print();
	}
}
