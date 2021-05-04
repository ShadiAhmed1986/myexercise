package myPractice04_05;

import java.util.Arrays;

public class EbayIntQ {
	
	/*
	 	Put all zeros to end in an integer array
	 	{3, 0, 4, 2, 0} ==> {3, 4, 2, 0, 0}
	 	{0, 0, 1, 2, 0, 3} ==> {1, 2, 3, 0, 0, 0}
	 */

	public static void main(String[] args) {
		
		int arr [] = {0, 0, 1, 2, 0, 3};
		
		int newArr [] = new int[arr.length];
		
		int idx = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != 0) {
				newArr[i] = arr[i];
				idx++;
			}
		}
		System.out.println(Arrays.toString(newArr));
	}

}
