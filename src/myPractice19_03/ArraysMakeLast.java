package myPractice19_03;

import java.util.Arrays;

public class ArraysMakeLast {
	
	/*
	   Given an int array, return a new array with double the length, 
	   where its last element is the same as the original array, and all the other elements are 0. 
	   The original array will be length 1 or more. Note: by default, a new int array contains all 0's.

makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
makeLast([1, 2]) → [0, 0, 0, 2]
makeLast([3]) → [0, 3]
	 */

	public static void main(String[] args) {
		
		int arr[] = {4, 5, 6};
		
		System.out.println(Arrays.toString(makeLast(arr)));
	}
	
	public static int[] makeLast(int arr[]) {
		
		int brr[] = new int[arr.length*2];
		
		for (int i = 0; i < brr.length; i++) {
			if(i != brr.length-1) {
				continue;
			}
			brr[i] = arr[arr.length-1];
		}
		return brr;
	}
}
