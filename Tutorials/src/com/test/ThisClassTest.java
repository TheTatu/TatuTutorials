package com.test;

public class ThisClassTest {
	public static void main(String[] args) {
		ThisClass o1 = new ThisClass("Yogi");
		ThisClass o2 = new ThisClass("Tatu");

		o1.print();
		o2.print();
		
		o1.print(2);
	}
}
