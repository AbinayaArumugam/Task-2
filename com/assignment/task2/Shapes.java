package com.assignment.task2;

public class Shapes {
	public int area;
	public int perimeter;
	public double length, breadth, height;
	public Shapes(double len) {
		System.out.println("The Shape is Cube");
		length=breadth=height=len;
	}
	public Shapes()  {
		System.out.println("No Shape");
		length=breadth=height=0;
	}
	public Shapes(double len,double bre,double hei) {
		System.out.println("The Shape is Cuboid");
		length=len;
		breadth=bre;
		height=hei;

	}
	double volume() {
		return length*breadth*height;
	}
}
