package myPractice31_03;

import java.util.Arrays;

public class BubbleSort {
	
	/*
	 * Bubble sort sorting algorithm
	 * Array -> {23,4,567,8,9,0}
	 * 		step-1 ->	{4,23,567,8,9,0}
	 * 		step-2 -> 	{4,23,567,8,9,0}
	 * 		step-3 -> 	{4,23,8,567,9,0}
	 * 		step-4 -> 	{4,23,8,9,567,0} 
	 * 		step-5 -> 	{4,23,8,9,0,567} 
	 * bubbleSort()
	 */

	public static void main(String[] args) {
		
		int arr[] = {4,23,567,8,9,0};
		
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length - i; j++) {
				if(arr[j-1] > arr[j]) {
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
					System.out.println(Arrays.toString(arr));
				}
			}
		}
		
	}

}
