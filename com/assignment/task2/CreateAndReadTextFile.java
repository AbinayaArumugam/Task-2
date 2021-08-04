package com.assignment.task2;
import java.io.*;
import java.util.Scanner;
public class CreateAndReadTextFile {
	public void CreateFile() {
		try (PrintWriter pw = new PrintWriter("Sample.txt")){
		pw.println("All is Well. Be happy & enjoy the moment");
		} catch (IOException e)  {
			e.printStackTrace();
		}
	}

	public void ReadFile() {
		try (Scanner scan = new Scanner(new File("//home//inc1//IdeaProjects//Task-2//Sample.txt"))) {
			scan.useDelimiter("\\Z");
			System.out.println(scan.next());
		}
		catch (Exception e)  {
			e.printStackTrace();
		}
	}
}
