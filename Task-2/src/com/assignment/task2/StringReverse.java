package com.assignment.task2;

public class StringReverse {
	public String reverseString(String str) {
		char word[] = str.toCharArray();
		String reverse = "";
		for (int i=word.length-1;i>=0;i--)  {
			reverse += word[i];
		}
		return reverse;
	}


}
