package myPractice19_03;

import java.util.Arrays;

public class RotateArrayLeft {
	
	/*
	   Given an array of ints length 3, 
	   return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.

rotateLeft3([1, 2, 3]) → [2, 3, 1]
rotateLeft3([5, 11, 9]) → [11, 9, 5]
rotateLeft3([7, 0, 0]) → [0, 0, 7]
	 */

	public static void main(String[] args) {
		
		int arr[] = {5, 11, 9};
		
		int brr[] = new int[3];
		for(int i = 1; i < arr.length; i++) {
			brr[i-1] = arr[i];
		}
		brr[arr.length-1] = arr[0];
		System.out.println(Arrays.toString(brr));
	}

}
