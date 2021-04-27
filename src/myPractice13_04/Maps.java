package myPractice13_04;

import java.util.HashMap;
import java.util.Map;

public class Maps {
	
	/*
	   Create a method which return the number of every character which is used in a String
	 	Example: Hellooo ==> H=1, e=1, l=2, o=3
	 */

	public static void main(String[] args) {
		String str = "Hellooo";

		Map<String, Integer> hm = countLetters(str);
		System.out.println(countLetters(str));
	}

	public static Map<String, Integer> countLetters(String str) {
		
		Map<String, Integer> counted = new HashMap<>();
		
		String arr [] = str.split("");
		
		for (String w : arr) {
			if(!counted.containsKey(w)) {
				counted.put(w, 1);
			}else {
				counted.put(w, counted.get(w)+1);
			}
		}
		
		return counted;
	}

	
}
