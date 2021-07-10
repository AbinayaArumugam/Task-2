package com.assignment.task2;

public class Shapes {
	int area;
	int perimeter;
	Shapes(int side) {
		System.out.println("The Shape is Square");
		area = side * side;
		perimeter = 2*(side + side);
	}
	Shapes(int length,int breadth)  {
		System.out.println("The Shape is Rectangle");
		area = length * breadth;
		perimeter = 2*(length + breadth); 
	}
	Shapes(int length,int breadth,int height) {
		System.out.println("The Shape is Parallelogram");
		area = length * height;
		perimeter = 2*(length + breadth);
	}

}
