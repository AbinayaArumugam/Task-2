package com.assignment.task2;

import java.util.Arrays;

public class RearrangedArray {
	public int[] reArrange(int[] arr3, int arr3Length)  {
		Arrays.sort(arr3);
		int reArrangedArray[] = new int[arr3Length];
		int maxNumber = arr3Length-1;
		int minNumber = 0;
		boolean flag = true;
		for(int i=0;i<arr3Length;i++)  {
			if(flag)
				reArrangedArray[i] = arr3[maxNumber--];
			else
				reArrangedArray[i] = arr3[minNumber++];
			flag =!flag;
		}
		return reArrangedArray;
	}
}
