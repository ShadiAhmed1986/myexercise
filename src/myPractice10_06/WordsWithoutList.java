package myPractice10_06;

import java.util.ArrayList;
import java.util.List;

public class WordsWithoutList {
	
	/*
	 	
Given an array of strings, 
return a new List (e.g. an ArrayList) where all the strings of the given length are omitted. 
See wordsWithout() below which is more difficult because it uses arrays.

wordsWithoutList(["a", "bb", "b", "ccc"], 1) → ["bb", "ccc"]
wordsWithoutList(["a", "bb", "b", "ccc"], 3) → ["a", "bb", "b"]
wordsWithoutList(["a", "bb", "b", "ccc"], 4) → ["a", "bb", "b", "ccc"]
	 */

	public static void main(String[] args) {
		String arr[] = {"a", "bb", "b", "ccc"};
		int length = 4;
		
		System.out.println(wordsWithoutList(arr,length));

	}

	public static List<String> wordsWithoutList(String[] str, int len) {
		  List<String> myList = new ArrayList<>();
		  for (int i = 0; i < str.length; i++) {
			if(str[i].length()!=len) {
				myList.add(str[i]);
			}
		}
		 return myList; 
	}
}
