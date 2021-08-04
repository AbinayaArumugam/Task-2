package com.assignment.task2;

public class RainbowTestRunner {

	public static void main(String[] args) {
		Rainbow rainbow[] = Rainbow.values();
		for(Rainbow color : rainbow ) {
			System.out.println("The color code of " + color + " is: " + color.getNumber());
		}
	}

}
