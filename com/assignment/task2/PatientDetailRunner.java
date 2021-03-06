package com.assignment.task2;

import java.util.Scanner;

public class PatientDetailRunner {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Patient Name:");
		String name = in.next();
		System.out.println("Enter AadhaarNo:");
		String aadhaarNo = in.next();
		System.out.println("Enter Patient Age:");
		int age = sc.nextInt();
		System.out.println("Enter Place:");
		String place = in.next();
		System.out.println("Enter Contact No:");
		String contactNo = in.next();
		PatientDetail object = new PatientDetail();
		object.setName(name);
		object.setAadharNo(aadhaarNo);
		object.setAge(age);
		object.setPlace(place);
		object.setContactNo(contactNo);

		System.out.println("Patient detail: \n" + object);
		System.out.println("Patient got First Dose of Vaccination");
	}

}
