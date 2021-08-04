package com.assignment.task2;

public class StringReverse {
	public String reverseString(String str) {
		char words[] = str.toCharArray();
		String reverse = "";
		for (int i=words.length-1;i>=0;i--)  {
			reverse += words[i];
		}
		return reverse;
	}


}
