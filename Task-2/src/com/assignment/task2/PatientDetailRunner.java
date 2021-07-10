package com.assignment.task2;

import java.util.Scanner;

public class PatientDetailRunner {

	public static void main(String[] args) {
	   Scanner in = new Scanner(System.in);
	   System.out.println("Enter Patient Name:");
	   String name = in.next();
	   System.out.println("Enter Aadhar No:");
	   String aadharNo = in.next();
	   System.out.println("Enter Patient Age:");
	   int age = in.nextInt();
	   System.out.println("Enter Place:");
	   String place = in.next();
	   System.out.println("Enter Contact No:");
	   String contactNo = in.next();
	   PatientDetail object = new PatientDetail();
	   object.setName(name);
	   object.setAadharNo(aadharNo);
	   object.setAge(age);
	   object.setPlace(place);
	   object.setContactNo(contactNo);
	   System.out.println("Name: " + object.getName() + "\nAadharNo: " + object.getAadharNo() +
			   "\nAge: "+ object.getAge() + "\nPlace: " + object.getPlace() + "\nContactNo: " + object.getContactNo());
	   System.out.println("Patient got First Dose of Vaccination");
	   in.close();
	   

	}

}
