package com.test.shape;

import com.test.inheritence.Circle;
import com.test.inheritence.Triangle;

public class InheritenceTest {
	public static void main(String[] args) {
		Triangle t = new Triangle("T1", 20, 10);
		System.out.println(t.area());
		t.getfactor();

		Circle c = new Circle("Circle", 10);
		System.out.println(c.area());
	}

}
