package com.assignment.task2;

import java.util.Arrays;

public class SegregateArray {
	public void printSegregatedArray(int[] arr2, int arr2Length)  {
		Arrays.sort(arr2);
		System.out.println("Array after segregation:");
		for(int i=0;i<arr2Length;i++) 
		 System.out.print(arr2[i]+ " ");
	}

}
