package myPractice07_05;

import java.util.Arrays;
import java.util.Scanner;

public class SortAnArray {
	
	/*
	  Take an integer array from user 
	  and sort them in ascending order(no sorting method please)

	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the length of the array");
		int length = scan.nextInt();
		
		int arr[] = new int[length];
		
		int i = 0;
		do {
			System.out.println("Enter an element");
			arr[i] = scan.nextInt();
			i++;	
		}while(i < length);
		
		System.out.println(Arrays.toString(arr));
	
		
	}

}
