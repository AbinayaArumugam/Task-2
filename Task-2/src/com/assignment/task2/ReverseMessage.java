package com.assignment.task2;

public class ReverseMessage {
	public void reverse_word(String message)   {
		String[] words = message.split(" ");
		String reversedMessage = "";
		for( int i= words.length -1;i>=0;i--) {
			reversedMessage += words[i]+" ";
		}
		System.out.println("Reversed String:");
		System.out.println(reversedMessage.substring(0,reversedMessage.length() -1));
	}
}
