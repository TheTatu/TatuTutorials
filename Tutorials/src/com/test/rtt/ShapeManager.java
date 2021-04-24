package com.test.rtt;

public class ShapeManager {
	public static void main(String[] args) {
		Shape shape = new Shape();
		Triangle t = new Triangle();
		Circle c = new Circle();
		Square s = new Square();

//		shape.print();
//		t.print();
//		c.print();
//		s.print();

//		System.out.println("Testing RTT");
//		shape = c; // Inheritance is 'IS A ' relationship; Child -> Parent
//		shape.print();
//
		shape = s;
//
//		shape.getName();
//		shape.setName("AA");
//		shape.print();

		s.print();
		
		printShape(c); //t = c;
		printShape(t); // t = t;
		printShape(s); // t = s'

	}


	public static void printShape(Shape t) {
		System.out.println("I am starting to print");
		t.print();
		System.out.println("Finished printing");
	}

//	public static void printShape(Triangle t) {
//		System.out.println("I am starting to print");
//		t.print();
//		System.out.println("Finished printing");
//	}
//
//	public static void printShape(Square t) {
//		System.out.println("I am starting to print");
//		t.print();
//		System.out.println("Finished printing");
//	}

}
