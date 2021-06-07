package myPractice07_06;

import java.util.Arrays;

public class WordsFront {
	
	/*
	 	Given an array of strings, 
	 	return a new array containing the first N strings. 
	 	N will be in the range 1..length.

wordsFront(["a", "b", "c", "d"], 1) → ["a"]
wordsFront(["a", "b", "c", "d"], 2) → ["a", "b"]
wordsFront(["a", "b", "c", "d"], 3) → ["a", "b", "c"]

	 */

	public static void main(String[] args) {
		
		String arr[] = {"a", "b", "c", "d"};
		int n = 3;
		
		System.out.println(Arrays.toString(wordsFront(arr,n)));
		
	}
	
	public static String [] wordsFront(String[] words, int n) {
		
		String newArr[]= new String[n];
		  
		for (int i = 0; i < n; i++) {
			newArr[i]=words[i];
		}
		
		return newArr;
	}

}
