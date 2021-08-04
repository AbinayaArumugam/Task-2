package com.assignment.task2;

import java.util.Arrays;

public class SecondLargest {
	public int findSecondLargest(int arr[], int arrLength) {
		Arrays.sort(arr);
		int index = arrLength-1;
		while(arr[index]==arr[arrLength-1]) {
			index--;
		}
		return arr[index];
	}

}
