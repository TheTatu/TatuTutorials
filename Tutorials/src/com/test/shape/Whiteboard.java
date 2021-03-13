package com.test.shape;

/**
 * Application Class.
 * 
 * @author Yogi
 *
 */
public class Whiteboard {
	public static void main(String[] args) {
		/**
		 * t1 is a reference to a object created of type Triangle.
		 */
		Triangle t1 = new Triangle(10);

		/**
		 * t1 is a reference to a object created of type Triangle.
		 */
		Triangle t2 = new Triangle(10);

		t1.print();
		t2.print();
		
		System.out.println("Printing after height modifications");
		
		t1.setHeight(20);
		t1.print();
		
		System.out.println(Whiteboard.class.getCanonicalName());
	}
}
