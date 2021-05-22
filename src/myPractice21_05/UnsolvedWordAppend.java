package myPractice21_05;

import java.util.HashMap;
import java.util.Map;

public class UnsolvedWordAppend {
	
	/*
	 	Loop over the given array of strings to build a result string like this: 
	 	when a string appears the 2nd, 4th, 6th, etc. time in the array, 
	 	append the string to the result. Return the empty string if no string appears a 2nd time.

wordAppend(["a", "b", "a"]) → "a"
wordAppend(["a", "b", "a", "c", "a", "d", "a"]) → "aa"
wordAppend(["a", "", "a"]) → "a"
	 */

	public static void main(String[] args) {
		String arr[] = {"a", "b", "a", "c", "a", "d", "a"};

		System.out.println(wordAppend(arr));
		
	}
	
	public static Map<String,Integer> wordAppend(String[] arr) {
		  String result = "";
		  
		  Map<String,Integer>map = new HashMap<>();
		  
		  for (int i = 0; i < arr.length; i++) {
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], null);
			}
			
		}
		  
		  return map;
	}

}
