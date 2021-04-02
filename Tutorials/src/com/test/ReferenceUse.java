package com.test;

public class ReferenceUse {
	public static void main(String[] args) {
		Reference ref = new Reference(12, "AArav");
		replace(ref);
		System.out.println(ref.getName() + ":" + ref.getAge());
		
		int age = 100;
		rpl(age);
		System.out.println(age);
	}

	public static void replace(Reference rf) {
		rf.setName("Tatu");
		rf.setAge(100);
	}
	
	public static void rpl(int a) {
		a = 1000;
	}

}
