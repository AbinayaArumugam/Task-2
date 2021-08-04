package com.assignment.task2;

public class ShapesTestRunner {

	public static void main(String[] args) {
		Shapes cube = new Shapes(3);
		double volume;
		volume = cube.volume();
	System.out.println("Volume of cube is " + volume);
		Shapes shapeless= new Shapes();
		 volume = shapeless.volume();
		System.out.println("Volume is" + volume);
		Shapes cuboid= new Shapes(3,6,9);
		volume = cuboid.volume();
		System.out.println("Volume of cuboid is " + volume);
	}

}
