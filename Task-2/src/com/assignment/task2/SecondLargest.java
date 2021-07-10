package com.assignment.task2;

import java.util.Arrays;

public class SecondLargest {
	public int findSecondLargest(int arr[], int arrLength) {
		Arrays.sort(arr);
		return arr[arrLength-2];
	}

}
