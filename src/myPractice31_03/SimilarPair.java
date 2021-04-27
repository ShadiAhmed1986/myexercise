package myPractice31_03;

import java.util.Arrays;

public class SimilarPair {
	
	/*
	 We are organizing a horse race with horses having distinct strengths.
		 	The strength of the horses are represented by an array of integers.
		 	In order to make the race competitive, your program should find out
		 	the pair of horses with similar strengths:
		 	
	 For example: {3, 67, 9, 46, 55, 48}
	 Output#
	         46, 48

	 */
	
	public static void main(String[] args) {
		

		int arr[] = {3, 67, 9, 46, 55, 48, 1};
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		int min = Integer.MAX_VALUE;
		
		int minNumber = 0;
		int maxNumber = 0;
		for (int i = 1; i < arr.length; i++) {
			
			if(Math.abs(arr[i-1] - arr[i]) < min) {
				min = Math.abs(arr[i-1] - arr[i]);
				minNumber = arr[i-1];
				maxNumber = arr[i];
			}		
		}
		System.out.println("Smaller number : " + minNumber + "\nLarger number : " +  maxNumber);	
	}
}
