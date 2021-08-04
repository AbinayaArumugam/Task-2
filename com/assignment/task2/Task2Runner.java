package com.assignment.task2;
import java.util.*;
public class Task2Runner {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the question no:");
		int question = in.nextInt();
		switch(question)  {
		case 1:
			System.out.println("Enter the array length:");
			int arrLength =in.nextInt();
			int[] arr = new int[arrLength];
			System.out.println("Enter the array element:");
			for(int i=0;i<arrLength;i++)
				arr[i]= in.nextInt();
			SecondLargest object1 = new SecondLargest();
			int output1 = object1.findSecondLargest(arr, arrLength);
			System.out.println("The Second Largest number is " + output1);
			break;
		case 2:
			System.out.println("Enter the array length:");
			int arr2Length =in.nextInt();
			int[] arr2 = new int[arr2Length];
			System.out.println("Enter the array element of 0s and 1s:");
			for(int i=0;i<arr2Length;i++)
				arr2[i]= in.nextInt();
			SegregateArray object2 = new SegregateArray();
			object2.printSegregatedArray(arr2,arr2Length);
			break;
		case 3:
			System.out.println("Enter the array length:");
			int arr3Length =in.nextInt();
			int[] arr3 = new int[arr3Length];
			System.out.println("Enter the array element:");
			for(int i=0;i<arr3Length;i++)
				arr3[i]= in.nextInt();
			RearrangedArray object3 = new RearrangedArray();
			int[] output3 = object3.reArrange(arr3,arr3Length);
			System.out.println(Arrays.toString(output3));
			break;
		case 4:
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the String:");
			String str = sc.nextLine();
			StringReverse object4 = new StringReverse();
			String output4 = object4.reverseString(str);
			System.out.println("String after reverse:");
			System.out.println(output4);
			break;
		case 5:
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the String:");
			String message = input.nextLine();
			ReverseMessage object5= new ReverseMessage();
			object5.reverse_word(message);
			break;
		case 6:
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Enter the ArrayLength:");
			int arr6Length = sc1.nextInt();
			String[] arr6 = new String[arr6Length];
			System.out.println("Enter the String:");
			for(int i=0;i<arr6Length;i++)
				arr6[i]=sc1.next();
			ArrayConversion object6 = new ArrayConversion();
			object6.convertToArrayList(arr6);
			break;
		default :
				System.out.println("Question not found");
		}
        in.close();
	}

}
