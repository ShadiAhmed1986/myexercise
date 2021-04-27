package myPractice19_03;

import java.util.Arrays;

public class FrontPiece {
	
	/*
	   Given an int array of any length, return a new array of its first 2 elements. 
	   If the array is smaller than length 2, use whatever elements are present.

frontPiece([1, 2, 3]) → [1, 2]
frontPiece([1, 2]) → [1, 2]
frontPiece([1]) → [1]
	 */

	public static void main(String[] args) {
		
		int arr[] = {1,2,4,3};
		
		System.out.println(Arrays.toString(frontPiece(arr)));
	}
	
	public static int[] frontPiece(int arr []) {
		
		int brr[] = new int[2];
		
		for (int i = 0; i < 2; i++) {
			if(arr.length <= 2) {
				return arr;
			}else {
				brr[i] = arr[i];
			}
		}
		return brr;
		
	}

}
