package myPractice20_05;

import java.util.HashMap;
import java.util.Map;

public class WordCount {
	
	/*
	 	The classic word-count algorithm: given an array of strings, 
	 	return a Map<String, Integer> with a key for each different string, 
	 	with the value the number of times that string appears in the array.

wordCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
wordCount(["c", "b", "a"]) → {"a": 1, "b": 1, "c": 1}
wordCount(["c", "c", "c", "c"]) → {"c": 4}
	 */

	public static void main(String[] args) {
		String arr[] = {"a", "b", "a", "c", "b"};

		System.out.println(wordCount(arr));
		String ss = "shadi";
		System.out.println(ss.intern());
	}
	
	public static Map<String, Integer> wordCount(String[] str) {
		  
		Map<String,Integer> map = new HashMap<>();
		
		int counter = 1;
		for (int i = 0; i < str.length; i++) {
			if(!map.containsKey(str[i])) {
				map.put(str[i], counter);
			}else {
				map.put(str[i], map.get(str[i])+1);
			}
		}
		
		return map;
	}

}
