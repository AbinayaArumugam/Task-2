package com.assignment.task2;

public enum Rainbow {
		VIOLET(1), 
		INDIGO(2), 
		BLUE(3),
		GREEN(4),
		YELLOW(5),
		ORANGE(6),
		RED(7);
	private int number;
		Rainbow(int number) {
			this.number=number;
		}
		public int getNumber() {
			return this.number;
		}
	}


