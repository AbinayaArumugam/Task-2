package com.assignment.task2;
import java.io.*;
import java.util.Scanner;
public class CreateAndReadTextFile {
	public void CreateFile() {
		try {
		File file = new File("Sample.txt");
		PrintWriter pw = new PrintWriter(file);
		pw.println("All is Well. Be happy & enjoy the moment");
		pw.close();
		} catch (IOException e)  {
			e.printStackTrace();
		}
	}

	public void ReadFile() {
		try {
			File file = new File("C:\\Users\\user\\Desktop\\Task2\\Task-2\\Sample.txt");
			Scanner scan = new Scanner(file);
			scan.useDelimiter("\\Z");
			System.out.println(scan.next());
		} 
		catch (Exception e)  {
			e.printStackTrace();
		}
	}
}
