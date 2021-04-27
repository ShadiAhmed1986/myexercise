package myPractice19_03;

import java.util.Arrays;

public class ReverseArray {
	
	/*
	   
Given an array of ints length 3, 
return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.

reverse3([1, 2, 3]) → [3, 2, 1]
reverse3([5, 11, 9]) → [9, 11, 5]
reverse3([7, 0, 0]) → [0, 0, 7]
	 */

	public static void main(String[] args) {

		int arr[] = {5, 11, 9};
		
		System.out.println(Arrays.toString(reverseArray(arr)));
	}

	public static int[] reverseArray(int nums[]) {
		
		int brr[] = new int[3];
		
		int b = 0;
		for (int i = nums.length-1; i >= 0; i--) {
			brr[b]= nums[i];
			b++;
		}
		return brr;
	}
}
