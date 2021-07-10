package com.assignment.task2;

public class ShapesTestRunner {

	public static void main(String[] args) {
		Shapes square = new Shapes(5);
		System.out.println("Area is " + square.area + "\nPerimeter is " + square.perimeter);
		Shapes rectangle = new Shapes(12,6);
		System.out.println("Area is " + rectangle.area + "\nPerimeter is " + rectangle.perimeter);
		Shapes parallelogram = new Shapes(15,6,9);
		System.out.println("Area is " + parallelogram.area + "\nPerimeter is " + parallelogram.perimeter);
	}

}
