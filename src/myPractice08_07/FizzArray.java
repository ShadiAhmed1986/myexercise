package myPractice08_07;

import java.util.Arrays;
import java.util.Scanner;

public class FizzArray {
	
	/*
	 	
	Given a number n, create and return a new int array of length n, 
	containing the numbers 0, 1, 2, ... n-1. The given n may be 0, 
	in which case just return a length 0 array. 
	You do not need a separate if-statement for the length-0 case; 
	the for-loop should naturally execute 0 times in that case, so it just works. 
	The syntax to make a new int array is: new int[desired_length]
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the length of the Array");
		int length = scan.nextInt();

		System.out.println(Arrays.toString(createAnArray(length)));
	}
	
	public static int[] createAnArray(int length) {
		int arr[] = new int[length];
		
		for(int i=0; i < length; i++) {
			arr[i] = i;
		}		
		return arr;
	}

}
